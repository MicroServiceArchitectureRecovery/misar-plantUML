package UMLtranslator;

import java.util.ArrayList;
import java.util.List;


import MicroserviceObject.EndPointMessages;
import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MessagesObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.QueListnerMessagesObject;
import MicroserviceObject.ServiceMessagesObject;
import MicroserviceObject.ServiceOperationsObject;


public class UmlDriver {

	public static String toPlantUmlFormatter(List<MicroservicesArchitecture> microservicesArchitecturesTest) {

		String name = "api-gateway";
		// String name = MicroservicesArchitecture.getArchitectureName();
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml");
		sb.append("'top to bottom direction");
		sb.append("left to right direction");
		sb.append("\n");

		structureMthod(sb, microservicesArchitecturesTest , name);
		sb.append("@enduml");

		System.out.print(sb);
		return sb.toString();

	}

	public static void AddInfrastructurePatternPomponentObject(StringBuilder sb,
			List<MicroserviceObject> microserviceObject) {

		List<InfrastructurePatternPomponentObject> infrastructurePatternComponentObject = microserviceObject.get(0)
				.getComponents();

		for (InfrastructurePatternPomponentObject a : infrastructurePatternComponentObject) {


			sb.append("component ");
			sb.append(a.getCategory() + "<<" + a.getType() + ">>");
			sb.append("\n");



		}

		AddMessagesObject(sb, microserviceObject);

		sb.append("}\n");

	}

	public static void AddMessagesObject(StringBuilder sb, List<MicroserviceObject> microserviceObject) {

		List<MessagesObject> messagesObject = microserviceObject.get(0).getMessages();

		for (MessagesObject mObject : messagesObject) {
			sb.append("\n");

			if (mObject instanceof EndPointMessages) {



				addOperations(sb, mObject);

				String endPoint = microserviceObject.get(0).getMicroserviceNameWithoutSpace();

				sb.append("port " + endPoint);

				sb.append("\n");
				sb.append(endPoint + "--" + microserviceObject.get(0).getMicroserviceNameWithoutSpace() + "component");
				addServiceMessges(sb, mObject, endPoint);


			}
			if (mObject instanceof QueListnerMessagesObject) {
				String que = microserviceObject.get(0).getMicroserviceNameWithoutSpace();
				sb.append("queue  " + microserviceObject.get(0).getMicroserviceNameWithoutSpace());

				sb.append("\n");
				sb.append(microserviceObject.get(0).getMicroserviceNameWithoutSpace() + "--"
						+ microserviceObject.get(0).getMicroserviceNameWithoutSpace() + "component");
				addServiceMessges(sb, mObject, que);
			}

			sb.append("\n");
			sb.append("\n");
		}

	}

	private static void addOperations(StringBuilder sb, MessagesObject mObject) {
		ArrayList<ServiceOperationsObject> so =  mObject.getServiceOperations();

		for (ServiceOperationsObject serviceOperationsObject : so) {

			sb.append("\n");
			sb.append(serviceOperationsObject.getOperationName());
			sb.append(serviceOperationsObject.getOperationDescription());
			sb.append("\n");


		}




	}

	public static void addServiceMessges(StringBuilder sb, MessagesObject mo, String name) {

		List<ServiceMessagesObject> serviceMessagesObject = mo.getServiceMessages();

		for (ServiceMessagesObject smo : serviceMessagesObject) {

			sb.append("\n");
			sb.append("note top of " + name + ": " + smo.getMessageType());

			sb.append("\n");
			sb.append("\n");
		}

	}

	private static void structureMthod(StringBuilder sb,
			List<MicroservicesArchitecture> microservicesArchitecturesTest, String nameTest ) {

		sb.append("frame ");

		for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();
			sb.append(name.getArchitectureName());
			sb.append("{");
			for (List<MicroserviceObject> m : test) {


				if (m.get(0).getMicroserviceName().equals(nameTest)) {
					sb.append("\n");
					sb.append("folder ");
					sb.append(m.get(0).getContainer());
					sb.append("{");
					sb.append("\n");
					sb.append("interface " + " \" " + m.get(0).getInterface() + " \" " + " as " + m.get(0).getMicroserviceNameWithoutSpace() + "component");
					sb.append("\n");
					sb.append(m.get(0).getMicroserviceNameWithoutSpace() + "component" + "---" + "["+ m.get(0).getMicroserviceName() + "<<" + m.get(0).getType() + ">>" + "]");

					sb.append("\n");
					sb.append("component ");
					sb.append(m.get(0).getMicroserviceName() + "<<" + m.get(0).getType() + ">>");
					sb.append("{");
					sb.append("\n");

					AddInfrastructurePatternPomponentObject(sb, m);

					sb.append("}\n");

				}


			}

		}

		sb.append("\n");

		sb.append("}\n");

	}

}
