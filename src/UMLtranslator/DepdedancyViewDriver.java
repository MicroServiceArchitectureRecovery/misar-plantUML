package UMLtranslator;

import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.QueListnerMessagesObject;
import MicroserviceObject.ServiceMessagesObject;
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
		sb.append("skinparam linetype polyline");
		sb.append("\n");
		sb.append("skinparam linetype ortho");

		sb.append("\n");
		interfaceView(sb, microservicesArchitecturesTest);
		sb.append("\n");
		sb.append("@enduml222");

		
		return sb.toString();
	}

	public static void interfaceView(StringBuilder sb, List<MicroservicesArchitecture> microservicesArchitectures) {
		for (MicroservicesArchitecture name : microservicesArchitectures) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> m : test) {

				sb.append("\n");

				sb.append("\n");
				/*
				 * sb.append("interface " + " \" " + m.get(0).getInterface() + " \" " + " as " +
				 * m.get(0).getMicroserviceNameWitUnderscore() + "Microservice");
				 */

				ArrayList<DependencyencyClass> D = m.get(0).getDepdendency();

				sb.append("\n");
				/*
				 * sb.append(m.get(0).getMicroserviceNameWitUnderscore() + "Microservice" +
				 * " --- " + m.get(0).getMicroserviceNameWitUnderscore());
				 */
				sb.append("\n");
				sb.append("component ");
				sb.append(m.get(0).getMicroserviceNameWitUnderscore() + m.get(0).getColor());
				sb.append("{");

				for (DependencyencyClass Depenndancy : D) {

					if (Depenndancy.getProviderName() != "" && Depenndancy.getProviderName() != null) {
						if (Depenndancy.getProviderDestination() != ""
								&& Depenndancy.getProviderDestination() != null) {
							sb.append("\n");

							if (Depenndancy.getProviderDestination().contains("QueueListener")) {

								if (Depenndancy.getProviderName().equals(m.get(0).getMicroserviceName())) {
									sb.append("queue   " + Depenndancy.getProviderNameQueListner() + Quecounter);
								}else if (Depenndancy.getProviderDestination().contains("Endpoint")) {
									sb.append("queue   " + Depenndancy.getProviderNameQueListner() + Quecounter);
									sb.append("\n");
									sb.append(Depenndancy.getProviderNameWithNoCharecters() + "-[#190ee6]->"
											+ Depenndancy.getProviderNameQueListner() + Quecounter);
								}


								Quecounter++;
							} else  {
								
								if (Depenndancy.getProviderName().equals(m.get(0).getMicroserviceName())) {
									sb.append("portin   " + Depenndancy.getProviderNameEndPoint() + endPointCounter);
								}else {
								sb.append("portin " + Depenndancy.getProviderNameEndPoint() + endPointCounter);
								sb.append("\n");
								sb.append(Depenndancy.getProviderNameWithNoCharecters() + "-[#e60e20]->"
										+ Depenndancy.getProviderNameEndPoint() + endPointCounter);
								}
								endPointCounter++;

							}

							sb.append("\n");

						}
					
						

					}

				}

				AddMessagesObject(sb, m);

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

				// String endPoint = microserviceObject.get(0).getMicroserviceNameWithoutSpace()
				// + endPointCounter2;

				for (ServiceMessagesObject ServiceMessagesObject : mObject.getServiceMessages()) {
						sb.append("\n");

					if (ServiceMessagesObject.getMessageType().equals("RESPONSE")) {
						
						sb.append("\n");

						sb.append("portout " + mObject.getType() + endPointCounter2 + " #F07C24");
					}

					else if (ServiceMessagesObject.getMessageType().equals("REQUEST")) {
						sb.append("\n");
						sb.append("portout " + mObject.getType() + endPointCounter2 + " #53f024");
					} else {
						sb.append("\n");
						sb.append("portout " + mObject.getType() + endPointCounter2 + " #24C4F0");
					}
					endPointCounter2++;

				}

				sb.append("\n");

				

			}
			if (mObject instanceof QueListnerMessagesObject) {

				for (ServiceMessagesObject ServiceMessagesObject : mObject.getServiceMessages()) {

					if (ServiceMessagesObject.getMessageType().equals("RESPONSE")) {
						sb.append("\n");
						sb.append("queue  " + microserviceObject.get(0).getMicroserviceNameWithoutSpace() + Quecounter2
								+ " #F07C24");
						
					}

						

					else if (ServiceMessagesObject.getMessageType().equals("REQUEST")) {
						sb.append("\n");
						sb.append("queue  " + microserviceObject.get(0).getMicroserviceNameWithoutSpace() + Quecounter2
								+ " #53f024");
					} else {
						sb.append("\n");
						sb.append("queue  " + microserviceObject.get(0).getMicroserviceNameWithoutSpace() + Quecounter2
								+ " #24C4F0");
					}

				}

				sb.append("\n");

				Quecounter2++;
			}

			sb.append("\n");
			sb.append("\n");
		}

	}
}
