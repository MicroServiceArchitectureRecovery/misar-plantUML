package UMLtranslator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import MicroserviceObject.DependencyencyClass;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

public class DepdedancyViewDriver {
	private static final String ARROW = " -[#e60e20]-> ";

	public static String MicroserviceViewDriver(List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml\n");
		sb.append("left to right direction\n");
		sb.append("skinparam linetype ortho\n");
		sb.append("skinparam ArrowThickness 2\n");
		sb.append("skinparam ArrowColor #e60e20\n");
		sb.append("skinparam ArrowFontSize 12\n");
		sb.append("skinparam componentStyle rectangle\n");
		sb.append("skinparam shadowing false\n");
		sb.append("skinparam defaultFontName Arial\n");
		sb.append("skinparam nodesep 55\n");
		sb.append("skinparam ranksep 75\n\n");

		Map<String, MicroserviceObject> microservicesByAlias = buildMicroserviceMap(microservicesArchitecturesTest);
		Map<String, ConnectionDetail> connections = new LinkedHashMap<String, ConnectionDetail>();
		List<LegendDetail> externalDependencies = new ArrayList<LegendDetail>();
		List<LegendDetail> selfDependencies = new ArrayList<LegendDetail>();

		appendArchitectureComponents(sb, microservicesArchitecturesTest);

		for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
			for (List<MicroserviceObject> microserviceGroup : architecture.getMicroservicesArchitectureObject()) {
				MicroserviceObject source = microserviceGroup.get(0);
				String sourceAlias = toPlantUmlId(source.getMicroserviceName());

				for (DependencyencyClass dependency : source.getDepdendency()) {
					String providerName = safeText(dependency.getProviderName());

					if (providerName.isEmpty()) {
						continue;
					}

					String providerAlias = toPlantUmlId(providerName);
					String dependencyLabel = buildDependencyLabel(dependency);

					if (providerAlias.equals(sourceAlias)) {
						selfDependencies.add(new LegendDetail(source.getMicroserviceName(), source.getMicroserviceName(),
								dependencyLabel));
						continue;
					}

					if (microservicesByAlias.containsKey(providerAlias)) {
						String connectionKey = sourceAlias + "|" + providerAlias;

						if (!connections.containsKey(connectionKey)) {
							MicroserviceObject provider = microservicesByAlias.get(providerAlias);
							connections.put(connectionKey, new ConnectionDetail(sourceAlias, providerAlias,
									source.getMicroserviceName(), provider.getMicroserviceName()));
						}

						connections.get(connectionKey).addDependency(dependencyLabel);
					} else {
						externalDependencies.add(new LegendDetail(source.getMicroserviceName(), providerName,
								dependencyLabel));
					}
				}
			}
		}

		appendConnections(sb, connections);
		appendLegend(sb, connections, selfDependencies, externalDependencies);

		sb.append("\n@enduml");

		return sb.toString();
	}

	private static void appendArchitectureComponents(StringBuilder sb,
			List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
			sb.append("frame \"");
			sb.append(escapePlantUmlText(architecture.getArchitectureName()));
			sb.append("\" {\n");

			sb.append("package \"Functional Microservices\" {\n");
			for (List<MicroserviceObject> microserviceGroup : architecture.getMicroservicesArchitectureObject()) {
				MicroserviceObject microservice = microserviceGroup.get(0);

				if (isFunctionalMicroservice(microservice)) {
					appendMicroserviceComponent(sb, microservice);
				}
			}
			sb.append("}\n\n");

			sb.append("package \"Infrastructure Microservices\" {\n");
			for (List<MicroserviceObject> microserviceGroup : architecture.getMicroservicesArchitectureObject()) {
				MicroserviceObject microservice = microserviceGroup.get(0);

				if (isInfrastructureMicroservice(microservice)) {
					appendMicroserviceComponent(sb, microservice);
				}
			}
			sb.append("}\n\n");

			sb.append("package \"Other Microservices\" {\n");
			for (List<MicroserviceObject> microserviceGroup : architecture.getMicroservicesArchitectureObject()) {
				MicroserviceObject microservice = microserviceGroup.get(0);

				if (!isFunctionalMicroservice(microservice) && !isInfrastructureMicroservice(microservice)) {
					appendMicroserviceComponent(sb, microservice);
				}
			}
			sb.append("}\n");

			sb.append("}\n\n");
		}
	}

	private static void appendMicroserviceComponent(StringBuilder sb, MicroserviceObject microservice) {
		sb.append("component \"");
		sb.append(escapePlantUmlText(microservice.getMicroserviceName()));
		sb.append("\" as ");
		sb.append(toPlantUmlId(microservice.getMicroserviceName()));
		sb.append(" <<");
		sb.append(escapePlantUmlText(microservice.getType()));
		sb.append(">> ");
		sb.append(safeText(microservice.getColor()));
		sb.append("\n");
	}

	private static void appendConnections(StringBuilder sb, Map<String, ConnectionDetail> connections) {
		int edgeCounter = 1;

		for (ConnectionDetail connection : connections.values()) {
			connection.setEdgeId("D" + edgeCounter);

			sb.append(connection.getSourceAlias());
			sb.append(ARROW);
			sb.append(connection.getProviderAlias());
			sb.append(" : ");
			sb.append(connection.getEdgeId());
			sb.append("\n");

			edgeCounter++;
		}

		sb.append("\n");
	}

	private static void appendLegend(StringBuilder sb, Map<String, ConnectionDetail> connections,
			List<LegendDetail> selfDependencies, List<LegendDetail> externalDependencies) {
		if (connections.isEmpty() && selfDependencies.isEmpty() && externalDependencies.isEmpty()) {
			return;
		}

		sb.append("legend bottom\n");
		sb.append("|= ID |= Source |= Target |= Dependency / Endpoint details |\n");

		for (ConnectionDetail connection : connections.values()) {
			sb.append("| ");
			sb.append(connection.getEdgeId());
			sb.append(" | ");
			sb.append(escapeLegendText(connection.getSourceName()));
			sb.append(" | ");
			sb.append(escapeLegendText(connection.getProviderName()));
			sb.append(" | ");
			sb.append(escapeLegendText(connection.getDependencySummary()));
			sb.append(" |\n");
		}

		int selfCounter = 1;
		for (LegendDetail selfDependency : selfDependencies) {
			sb.append("| S");
			sb.append(selfCounter);
			sb.append(" | ");
			sb.append(escapeLegendText(selfDependency.getSourceName()));
			sb.append(" | Self / exposed dependency | ");
			sb.append(escapeLegendText(selfDependency.getDependencyLabel()));
			sb.append(" |\n");

			selfCounter++;
		}

		int externalCounter = 1;
		for (LegendDetail externalDependency : externalDependencies) {
			sb.append("| E");
			sb.append(externalCounter);
			sb.append(" | ");
			sb.append(escapeLegendText(externalDependency.getSourceName()));
			sb.append(" | ");
			sb.append(escapeLegendText(toDisplayName(externalDependency.getTargetName())));
			sb.append(" | ");
			sb.append(escapeLegendText(externalDependency.getDependencyLabel()));
			sb.append(" |\n");

			externalCounter++;
		}

		sb.append("endlegend\n");
	}

	private static Map<String, MicroserviceObject> buildMicroserviceMap(
			List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		Map<String, MicroserviceObject> microservicesByAlias = new LinkedHashMap<String, MicroserviceObject>();

		for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
			for (List<MicroserviceObject> microserviceGroup : architecture.getMicroservicesArchitectureObject()) {
				MicroserviceObject microservice = microserviceGroup.get(0);
				microservicesByAlias.put(toPlantUmlId(microservice.getMicroserviceName()), microservice);
			}
		}

		return microservicesByAlias;
	}

	private static String buildDependencyLabel(DependencyencyClass dependency) {
		String providerDestination = safeText(dependency.getProviderDestination());

		if (providerDestination.isEmpty()) {
			return "Dependency";
		}

		return formatProviderDestination(providerDestination);
	}

	private static String formatProviderDestination(String providerDestination) {
		String value = providerDestination.trim();

		if (value.startsWith("Endpoint[RequestURI:") && value.endsWith("]")) {
			String requestUri = value.substring("Endpoint[RequestURI:".length(), value.length() - 1);
			return "Endpoint: " + requestUri.trim();
		}

		if (value.startsWith("QueueListener[QueueName:") && value.endsWith("]")) {
			String queueName = value.substring("QueueListener[QueueName:".length(), value.length() - 1);
			return "Queue: " + queueName.trim();
		}

		return value;
	}

	private static boolean isFunctionalMicroservice(MicroserviceObject microservice) {
		return safeText(microservice.getType()).equals("FunctionalMicroservice");
	}

	private static boolean isInfrastructureMicroservice(MicroserviceObject microservice) {
		return safeText(microservice.getType()).equals("InfrastructureMicroservice");
	}

	private static String escapePlantUmlText(String value) {
		return safeText(value)
				.replace("\\", "\\\\")
				.replace("\"", "\\\"")
				.replace("\r", "")
				.replace("\n", "\\n");
	}

	private static String escapeLegendText(String value) {
		return safeText(value)
				.replace("|", "\\|")
				.replace("\r", "")
				.replace("\n", "\\n");
	}

	private static String toPlantUmlId(String value) {
		if (value == null || value.trim().isEmpty()) {
			return "unknown";
		}

		return value.trim().replaceAll("[^a-zA-Z0-9_]", "_");
	}

	private static String toDisplayName(String value) {
		return safeText(value).replace("_", " ").replace("-", " ");
	}

	private static String safeText(String value) {
		if (value == null) {
			return "";
		}

		return value.trim();
	}

	private static class ConnectionDetail {
		private final String sourceAlias;
		private final String providerAlias;
		private final String sourceName;
		private final String providerName;
		private final Set<String> dependencyLabels = new LinkedHashSet<String>();
		private String edgeId;

		private ConnectionDetail(String sourceAlias, String providerAlias, String sourceName, String providerName) {
			this.sourceAlias = sourceAlias;
			this.providerAlias = providerAlias;
			this.sourceName = sourceName;
			this.providerName = providerName;
		}

		private void addDependency(String dependencyLabel) {
			if (dependencyLabel != null && !dependencyLabel.trim().isEmpty()) {
				dependencyLabels.add(dependencyLabel.trim());
			}
		}

		private String getDependencySummary() {
			StringBuilder summary = new StringBuilder();

			for (String dependencyLabel : dependencyLabels) {
				if (summary.length() > 0) {
					summary.append("\\n");
				}

				summary.append(dependencyLabel);
			}

			return summary.toString();
		}

		private String getSourceAlias() {
			return sourceAlias;
		}

		private String getProviderAlias() {
			return providerAlias;
		}

		private String getSourceName() {
			return sourceName;
		}

		private String getProviderName() {
			return providerName;
		}

		private String getEdgeId() {
			return edgeId;
		}

		private void setEdgeId(String edgeId) {
			this.edgeId = edgeId;
		}
	}

	private static class LegendDetail {
		private final String sourceName;
		private final String targetName;
		private final String dependencyLabel;

		private LegendDetail(String sourceName, String targetName, String dependencyLabel) {
			this.sourceName = sourceName;
			this.targetName = targetName;
			this.dependencyLabel = dependencyLabel;
		}

		private String getSourceName() {
			return sourceName;
		}

		private String getTargetName() {
			return targetName;
		}

		private String getDependencyLabel() {
			return dependencyLabel;
		}
	}
}