package UMLtranslator;



import java.util.List;

import MainDriver.main;
import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

public class MicroserviceView {

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

		

	}

	private static void structureMthod(StringBuilder sb,
		List<MicroservicesArchitecture> microservicesArchitecturesTest, String selectedMicroservice) {

		for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> microserviceObject = name.getMicroservicesArchitectureObject();
			sb.append("\n");
			sb.append("frame ");
			sb.append(name.getArchitectureName());
			sb.append("{");
			for (List<MicroserviceObject> microservice : microserviceObject) {
				
			if (microservice.get(0).getMicroserviceName().equals(selectedMicroservice))	{
				
				sb.append("\n");
				
				sb.append("interface " + " \" " + microservice.get(0).getInterface() + " \" " + " as " +
				microservice.get(0).getMicroserviceNameWitUnderscore() + "Microservice");
				 

				

				sb.append("\n");
				
				 sb.append(microservice.get(0).getMicroserviceNameWitUnderscore() + "Microservice" +
				 " --- " + microservice.get(0).getMicroserviceNameWitUnderscore());
				 

				sb.append("\n");
				sb.append("folder ");
				sb.append(microservice.get(0).getContainer());
				sb.append("{");
				sb.append("\n");

				sb.append("component ");
				sb.append(microservice.get(0).getMicroserviceNameWitUnderscore() + " <<" + microservice.get(0).getType() + ">> "
						+ microservice.get(0).getColor());
				sb.append("{");
				sb.append("\n");

				sb.append("\n");
				
				 AddInfrastructurePatternPomponentObject(sb, microservice);

				sb.append("}\n");
				break;
			}
			
			
		}
			
		}sb.append("}\n");
	}

	public static String MicroserviceViewDriver(List<MicroservicesArchitecture> microservicesArchitectures, String selectedMicroservice) {
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml");
		sb.append("\n");
		sb.append("'top to bottom direction");
		sb.append("\n");
		sb.append("left to right direction");
		sb.append("\n");
		structureMthod(sb, microservicesArchitectures , selectedMicroservice);
		sb.append("\n");
		sb.append("@enduml");

		System.out.print(sb);
		return sb.toString();
	}
}
