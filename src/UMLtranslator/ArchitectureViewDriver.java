package UMLtranslator;

import java.util.List;

import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

public class ArchitectureViewDriver {

	public static void AddInfrastructurePatternPomponentObject(StringBuilder sb,
			List<MicroserviceObject> microserviceObject) {

		List<InfrastructurePatternPomponentObject> infrastructurePatternComponentObject = microserviceObject.get(0)
				.getComponents();

		for (InfrastructurePatternPomponentObject a : infrastructurePatternComponentObject) {

			sb.append("component ");
			sb.append(a.getCategory() + microserviceObject.get(0).getMicroserviceNameWithoutSpace() + "<<" + a.getType()
					+ ">> ");
			sb.append("\n");

		}

		sb.append("}\n");

	}

	private static void structureMthod(StringBuilder sb,
			List<MicroservicesArchitecture> microservicesArchitecturesTest) {

		for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> microserviceObject = name.getMicroservicesArchitectureObject();
			sb.append("\n");
			sb.append("frame ");
			sb.append(name.getArchitectureName());
			sb.append("{");
			for (List<MicroserviceObject> microservice : microserviceObject) {

				sb.append("\n");
				sb.append("folder ");
				sb.append(microservice.get(0).getContainer());
				sb.append("{");
				sb.append("\n");

				sb.append("component ");
				sb.append(microservice.get(0).getMicroserviceName() + "<<" + microservice.get(0).getType() + ">> "
						+ microservice.get(0).getColor());
				sb.append("{");
				sb.append("\n");

				sb.append("\n");
				sb.append("}\n");
				// AddInfrastructurePatternPomponentObject(sb, microservice);

				sb.append("}\n");

			}
			sb.append("}\n");

		}

	}

	public static String MicroserviceViewDriver(List<MicroservicesArchitecture> microservicesArchitectures) {
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml");
		sb.append("\n");
		sb.append("'top to bottom direction");
		sb.append("\n");
		sb.append("left to right direction");
		sb.append("\n");
		structureMthod(sb, microservicesArchitectures);
		sb.append("\n");
		sb.append("@enduml");

		System.out.print(sb);
		return sb.toString();
	}
}
