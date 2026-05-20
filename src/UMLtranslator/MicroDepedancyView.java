package UMLtranslator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import MicroserviceObject.DependencyencyClass;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

public class MicroDepedancyView {
	private static final String ARROW = "-[#e60e20]->";

	private static Map<String, List<String>> providerDependencyComponents = new LinkedHashMap<String, List<String>>();
	private static List<String> connections = new ArrayList<String>();
	private static List<String> externalDependencyLabels = new ArrayList<String>();
	private static int dependencyCounter = 1;

	public static String MicroserviceViewDriver(List<MicroservicesArchitecture> microservicesArchitecturesTest,
			String selectedMicroservice) {
		resetState();

		StringBuilder sb = new StringBuilder();
		Map<String, MicroserviceObject> microservicesByName = buildMicroserviceLookup(microservicesArchitecturesTest);
		MicroserviceObject selectedMicroserviceObject = findMicroservice(microservicesByName, selectedMicroservice);

		sb.append("@startuml");
		sb.append("\n");
		sb.append("skinparam linetype ortho");
		sb.append("\n");
		sb.append("skinparam ArrowThickness 2");
		sb.append("\n");
		sb.append("skinparam ArrowColor #e60e20");
		sb.append("\n");
		sb.append("skinparam ArrowFontSize 13");
		sb.append("\n");
		sb.append("skinparam componentStyle rectangle");
		sb.append("\n");

		if (selectedMicroserviceObject != null) {
			appendSelectedMicroserviceComponent(sb, selectedMicroserviceObject);
			collectDependencies(selectedMicroserviceObject, microservicesByName);
			appendProviderComponents(sb, microservicesByName);
			appendExternalDependencyNote(sb, selectedMicroserviceObject);
			appendConnections(sb);
		}

		sb.append("\n");
		sb.append("@enduml");

		return sb.toString();
	}

	private static void appendSelectedMicroserviceComponent(StringBuilder sb, MicroserviceObject microservice) {
		appendMicroserviceComponentStart(sb, microservice);
		sb.append("\n");
		sb.append("}");
		sb.append("\n");
	}

	private static void collectDependencies(MicroserviceObject selectedMicroservice,
			Map<String, MicroserviceObject> microservicesByName) {
		String sourceAlias = toPlantUmlId(selectedMicroservice.getMicroserviceName());

		for (DependencyencyClass dependency : selectedMicroservice.getDepdendency()) {
			String providerName = dependency.getProviderName();

			if (isBlank(providerName)) {
				continue;
			}

			MicroserviceObject providerMicroservice = findMicroservice(microservicesByName, providerName);
			String providerAlias = toPlantUmlId(providerName);
			String providerDestination = dependency.getProviderDestination();

			if (providerMicroservice == null) {
				addExternalDependencyLabel(dependency);
				continue;
			}

			if (isBlank(providerDestination)) {
				connections.add(sourceAlias + ARROW + providerAlias);
				continue;
			}

			String dependencyAlias = providerAlias + "_dependency_" + dependencyCounter++;
			String dependencyComponent = buildDependencyComponent(dependency, dependencyAlias);
			addProviderDependency(providerAlias, dependencyComponent);
			connections.add(sourceAlias + ARROW + providerAlias);
		}
	}

	private static void appendProviderComponents(StringBuilder sb, Map<String, MicroserviceObject> microservicesByName) {
		for (String providerAlias : providerDependencyComponents.keySet()) {
			MicroserviceObject providerMicroservice = microservicesByName.get(providerAlias);

			if (providerMicroservice == null) {
				continue;
			}

			appendMicroserviceComponentStart(sb, providerMicroservice);
			for (String dependencyComponent : providerDependencyComponents.get(providerAlias)) {
				sb.append("\n");
				sb.append(dependencyComponent);
			}
			sb.append("\n");
			sb.append("}");
			sb.append("\n");
		}
	}

	private static void appendExternalDependencyNote(StringBuilder sb, MicroserviceObject selectedMicroservice) {
		if (externalDependencyLabels.isEmpty()) {
			return;
		}

		sb.append("\n");
		sb.append("note right of ");
		sb.append(toPlantUmlId(selectedMicroservice.getMicroserviceName()));
		sb.append("\n");
		sb.append("External dependencies");

		for (String externalDependencyLabel : externalDependencyLabels) {
			sb.append("\n");
			sb.append("- ");
			sb.append(externalDependencyLabel);
		}

		sb.append("\n");
		sb.append("end note");
		sb.append("\n");
	}

	private static void appendConnections(StringBuilder sb) {
		for (String connection : connections) {
			sb.append("\n");
			sb.append(connection);
			sb.append("\n");
		}
	}

	private static void appendMicroserviceComponentStart(StringBuilder sb, MicroserviceObject microservice) {
		sb.append("\n");
		sb.append("component \"");
		sb.append(escapePlantUmlLabel(microservice.getMicroserviceName()));
		sb.append("\" as ");
		sb.append(toPlantUmlId(microservice.getMicroserviceName()));
		sb.append(" <<");
		sb.append(microservice.getType());
		sb.append(">> ");
		sb.append(microservice.getColor());
		sb.append(" {");
	}

	private static String buildDependencyComponent(DependencyencyClass dependency, String dependencyAlias) {
		String label = normaliseDisplayName(dependency.getProviderName()) + "\\n" + normaliseDisplayName(dependency.getProviderDestination());
		String type = isQueueDependency(dependency) ? "QueueDependency" : "ServiceDependency";

		return "component \"" + escapePlantUmlLabel(label) + "\" as " + dependencyAlias + " <<" + type + ">>";
	}

	private static void addProviderDependency(String providerAlias, String dependencyComponent) {
		if (!providerDependencyComponents.containsKey(providerAlias)) {
			providerDependencyComponents.put(providerAlias, new ArrayList<String>());
		}

		providerDependencyComponents.get(providerAlias).add(dependencyComponent);
	}

	private static void addExternalDependencyLabel(DependencyencyClass dependency) {
		String label = normaliseDisplayName(dependency.getProviderName());

		if (!isBlank(dependency.getProviderDestination())) {
			label = label + " - " + normaliseDisplayName(dependency.getProviderDestination());
		}

		externalDependencyLabels.add(label);
	}

	private static Map<String, MicroserviceObject> buildMicroserviceLookup(
			List<MicroservicesArchitecture> microservicesArchitectures) {
		Map<String, MicroserviceObject> microservicesByName = new LinkedHashMap<String, MicroserviceObject>();

		for (MicroservicesArchitecture architecture : microservicesArchitectures) {
			List<List<MicroserviceObject>> microserviceGroups = architecture.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> microserviceGroup : microserviceGroups) {
				MicroserviceObject microservice = microserviceGroup.get(0);
				microservicesByName.put(microservice.getMicroserviceName(), microservice);
				microservicesByName.put(toPlantUmlId(microservice.getMicroserviceName()), microservice);
			}
		}

		return microservicesByName;
	}

	private static MicroserviceObject findMicroservice(Map<String, MicroserviceObject> microservicesByName,
			String microserviceName) {
		if (isBlank(microserviceName)) {
			return null;
		}

		MicroserviceObject microservice = microservicesByName.get(microserviceName);

		if (microservice != null) {
			return microservice;
		}

		return microservicesByName.get(toPlantUmlId(microserviceName));
	}

	private static boolean isQueueDependency(DependencyencyClass dependency) {
		return !isBlank(dependency.getProviderDestination()) && dependency.getProviderDestination().contains("QueueListener");
	}

	private static String normaliseDisplayName(String value) {
		if (isBlank(value)) {
			return "Unknown";
		}

		return value.trim().replace("_", " ");
	}

	private static String escapePlantUmlLabel(String value) {
		if (value == null) {
			return "";
		}

		return value.replace("\"", "\\\"").replace("\r", "").replace("\n", "\\n");
	}

	private static String toPlantUmlId(String value) {
		if (isBlank(value)) {
			return "unknown";
		}

		String safeValue = value.trim().replaceAll("[^a-zA-Z0-9_]", "_");

		if (safeValue.matches("^[0-9].*")) {
			return "id_" + safeValue;
		}

		return safeValue;
	}

	private static boolean isBlank(String value) {
		return value == null || value.trim().isEmpty();
	}

	private static void resetState() {
		providerDependencyComponents.clear();
		connections.clear();
		externalDependencyLabels.clear();
		dependencyCounter = 1;
	}
}