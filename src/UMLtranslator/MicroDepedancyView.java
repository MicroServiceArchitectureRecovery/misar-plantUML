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

public class MicroDepedancyView {
	static List<EndPointObject> MicroDepedancyView = new ArrayList<EndPointObject>();
	static int Quecounter = 0;
	static int endPointCounter = 0;
	static int endPointCounter2 = 0;
	static int Quecounter2 = 0;

	public static String MicroserviceViewDriver(List<MicroservicesArchitecture> microservicesArchitecturesTest , String selectedMicroservice) {
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml");
		sb.append("\n");
		sb.append("skinparam linetype polyline");
		sb.append("\n");
		sb.append("skinparam linetype ortho");

		sb.append("\n");
		interfaceView(sb, microservicesArchitecturesTest , selectedMicroservice);
		MicroserviceGetter(sb, microservicesArchitecturesTest);
		sb.append("\n");
		sb.append("@enduml");

		
		return sb.toString();
	}

	public static void interfaceView(StringBuilder sb, List<MicroservicesArchitecture> microservicesArchitectures, String selectedMicroservice) {
		for (MicroservicesArchitecture name : microservicesArchitectures) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> m : test) {
				if (m.get(0).getMicroserviceName().equals(selectedMicroservice) ) {

				sb.append("\n");

				sb.append("\n");
				/*
				 * sb.append("interface " + " \" " + m.get(0).getInterface() + " \" " + " as " +
				 * m.get(0).getMicroserviceNameWitUnderscore() + "Microservice");
				 */

				ArrayList<DependencyencyClass> D = m.get(0).getDepdendency();

				sb.append("\n");
		
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
								}else if (Depenndancy.getProviderDestination().contains("QueueListener")) {
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
									if(!MicroDepedancyView.get(0).getMicroName().equals(Depenndancy.getProviderName())) {
										EndPointObject placeholder = new EndPointObject();
										placeholder.setMicroName(Depenndancy.getProviderName());
										placeholder.setEndPoints("portin " + Depenndancy.getProviderNameEndPoint() + endPointCounter);
										MicroDepedancyView.add(placeholder);
									}
								
								sb.append("\n");
								sb.append(Depenndancy.getProviderNameWithNoCharecters() + "-[#e60e20]->"
										+ Depenndancy.getProviderNameEndPoint() + endPointCounter);
								}
								endPointCounter++;

							}

							sb.append("\n");

						}
						else {
							if(!MicroDepedancyView.contains(Depenndancy.getProviderName())) {
								MicroDepedancyView.add(Depenndancy.getProviderName().toString());
							}
							
						}

					}
					

				}

				//AddMessagesObject(sb, m);

				sb.append("\n");
				sb.append("}\n");

			}

		}
		}

	}


	public static void  MicroserviceGetter(StringBuilder sb, List<MicroservicesArchitecture> microservicesArchitectures) {
		
		for (MicroservicesArchitecture name : microservicesArchitectures) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> m : test) {
				for(int i = 0; i < MicroDepedancyView.size(); i++) {   
				    if (MicroDepedancyView.get(i).equals(m.get(0).getMicroserviceName())){
				    	sb.append("\n");
						
						
						sb.append("\n");

						sb.append("component ");
						sb.append(m.get(0).getMicroserviceNameWitUnderscore() + " <<" + m.get(0).getType() + ">> "
								+ m.get(0).getColor());
						sb.append("{");
						sb.append("\n");

						sb.append("\n");
						sb.append("}\n");
						// AddInfrastructurePatternPomponentObject(sb, microservice);

						

					}
						
				    }
				}
			
			MicroDepedancyView.clear();
	
		}
		
		
}
}
