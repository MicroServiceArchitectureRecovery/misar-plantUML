package UMLtranslator;

import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.QueListnerMessagesObject;
import PIM.ServiceDependency;
import MicroserviceObject.DependencyencyClass;
import MicroserviceObject.EndPointMessages;
import MicroserviceObject.MessagesObject;
import MicroserviceObject.MicroserviceObject;

public class DepdedancyViewDriver {
	static int Quecounter = 0;
	static int endPointCounter = 0;
	static int endPointCounter2 = 0;
	static int Quecounter2 = 0;

	public static String MicroserviceViewDriver(List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml");
		sb.append("\n");
		sb.append("'top to bottom direction");
		sb.append("\n");
		sb.append("left to right direction");
		sb.append("\n");
		interfaceView(sb, microservicesArchitecturesTest);
		sb.append("\n");
		sb.append("@enduml");

		System.out.print(sb);
		return sb.toString();
	}

	public static void interfaceView(StringBuilder sb, List<MicroservicesArchitecture> microservicesArchitectures) {
		for (MicroservicesArchitecture name : microservicesArchitectures) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> m : test) {

				sb.append("\n");

				sb.append("\n");
				sb.append("interface " + " \" " + m.get(0).getInterface() + " \" " + " as "
						+ m.get(0).getMicroserviceNameWitUnderscore() + "Microservice");

				ArrayList<DependencyencyClass> D = m.get(0).getDepdendency();

				sb.append("\n");
				sb.append(m.get(0).getMicroserviceNameWitUnderscore() + "Microservice" + " --- "
						+ m.get(0).getMicroserviceNameWitUnderscore());

				sb.append("\n");
				sb.append("component ");
				sb.append(m.get(0).getMicroserviceNameWitUnderscore());
				sb.append("{");

				for (DependencyencyClass Depenndancy : D) {

					if (Depenndancy.getProviderName() != "" && Depenndancy.getProviderName() != null) {
						if (Depenndancy.getProviderDestination() != ""
								&& Depenndancy.getProviderDestination() != null) {
							sb.append("\n");

							if (Depenndancy.getProviderDestination().contains("QueueListener")) {
								sb.append(Depenndancy.getProviderNameWithNoCharecters() + "---"
										+ Depenndancy.getProviderNameQueListner() + Quecounter);
								Quecounter++;
							} else if (Depenndancy.getProviderDestination().contains("Endpoint")) {
								sb.append(Depenndancy.getProviderNameWithNoCharecters() + "---"
										+ Depenndancy.getProviderNameEndPoint() + endPointCounter);
								endPointCounter++;

							}

							sb.append("\n");

						}

					}

				}

			//	AddMessagesObject(sb, m);

				sb.append("\n");
				sb.append("}\n");

			}

		}

	}

	public static void AddMessagesObject(StringBuilder sb, List<MicroserviceObject> microserviceObject) {

		List<MessagesObject> messagesObject = microserviceObject.get(0).getMessages();

		for (MessagesObject mObject : messagesObject) {
			sb.append("\n");

			if (mObject instanceof EndPointMessages) {

				String endPoint = microserviceObject.get(0).getMicroserviceNameWithoutSpace() + endPointCounter2;

				sb.append("port " + endPoint);

				sb.append("\n");
				sb.append(endPoint + "--" + microserviceObject.get(0).getMicroserviceNameWitUnderscore()
						+ "Microservice");
				endPointCounter2++;

			}
			if (mObject instanceof QueListnerMessagesObject) {

				sb.append("queue  " + microserviceObject.get(0).getMicroserviceNameWithoutSpace() + Quecounter2);

				sb.append("\n");
				sb.append(microserviceObject.get(0).getMicroserviceNameWithoutSpace() + Quecounter2 + "--"
						+ microserviceObject.get(0).getMicroserviceNameWitUnderscore() + "Microservice");
				Quecounter2++;
			}

			sb.append("\n");
			sb.append("\n");
		}

	}
}
