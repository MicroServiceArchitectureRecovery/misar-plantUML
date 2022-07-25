package UMLtranslator;

import java.util.List;

import MicroserviceObject.DependencyencyClass;
import MicroserviceObject.EndPointMessages;
import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MessagesObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.QueListnerMessagesObject;
import MicroserviceObject.ServiceMessagesObject;
import PIM.MicroserviceArchitecture;

public class UmlDriver {

	public static String toPlantUmlFormatter(List<MicroservicesArchitecture> microservicesArchitecturesTest) {

		// String name = MicroservicesArchitecture.getArchitectureName();
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml");
		sb.append("\n");

		UMLStructure.structureMthod(sb);
		sb.append("\n");
		structureMthod(sb, microservicesArchitecturesTest);
		sb.append("@enduml");

		System.out.print(sb);
		return sb.toString();

	}

	public static void AddInfrastructurePatternPomponentObject(StringBuilder sb,
			List<MicroserviceObject> microserviceObject) {

		List<InfrastructurePatternPomponentObject> infrastructurePatternComponentObject = microserviceObject.get(0)
				.getComponents();

		for (InfrastructurePatternPomponentObject a : infrastructurePatternComponentObject) {

			if (!a.equals(null)) {
				sb.append("component ");
				sb.append(a.getCategory() + "<<" + a.getType() + ">>");
				sb.append("\n");

			}

		}

		AddMessagesObject(sb, microserviceObject);

		sb.append("}\n");

	}

	public static void AddMessagesObject(StringBuilder sb, List<MicroserviceObject> microserviceObject) {

		List<MessagesObject> messagesObject = microserviceObject.get(0).getMessages();

		for (MessagesObject mObject : messagesObject) {
			sb.append("\n");

			if (mObject instanceof EndPointMessages) {
				String endPoint = mObject.getType() + microserviceObject.get(0).getMicroserviceNameWithoutSpace();

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
			List<MicroservicesArchitecture> microservicesArchitecturesTest) {

		sb.append("frame ");

		for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();
			sb.append(name.getArchitectureName());
			sb.append("{");
			for (List<MicroserviceObject> m : test) {

				sb.append("\n");
				sb.append("folder ");
				sb.append(m.get(0).getContainer());
				sb.append("{");
				sb.append("\n");
				sb.append("interface " + " \" " + m.get(0).getInterface() + " \" " + " as "
						+ m.get(0).getMicroserviceNameWithoutSpace() + "component");
				sb.append("\n");
				sb.append(m.get(0).getMicroserviceNameWithoutSpace() + "component" + "---" + "["
						+ m.get(0).getMicroserviceName() + "<<" + m.get(0).getType() + ">>" + "]");

				sb.append("\n");
				sb.append("component ");
				sb.append(m.get(0).getMicroserviceName() + "<<" + m.get(0).getType() + ">>");
				sb.append("{");
				sb.append("\n");

				AddInfrastructurePatternPomponentObject(sb, m);

				sb.append("}\n");
			}

		}

		sb.append("\n");

		sb.append("}\n");

	}

}
