package UMLtranslator;

import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.MicroservicesArchitecture;
import TempObject.EndPointObject;
import MicroserviceObject.DependencyencyClass;

import MicroserviceObject.MicroserviceObject;

public class DepdedancyViewDriver {
	static List<EndPointObject> MicroDepedancyView = new ArrayList<EndPointObject>();
	static List<String> Connections = new ArrayList<String>();
	static int Quecounter = 1;
	static int endPointCounter = 1;
	static int endPointCounter2 = 1;
	static int Quecounter2 = 1;
	

	public static String MicroserviceViewDriver(List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		StringBuilder sb = new StringBuilder();

		sb.append("@startuml");
		sb.append("\n");
		sb.append("skinparam linetype polyline");
		sb.append("\n");
		sb.append("skinparam linetype ortho");

		sb.append("\n");
	

		interfaceView(sb, microservicesArchitecturesTest);

		MicroserviceGetter(sb, microservicesArchitecturesTest);
		sb.append("\n");
		sb.append("@enduml");

		return sb.toString();
	}

	public static void interfaceView(StringBuilder sb, List<MicroservicesArchitecture> microservicesArchitectures) {
		for (MicroservicesArchitecture name : microservicesArchitectures) {

			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> m : test) {
					
				
				String currentMicroservice = m.get(0).getMicroserviceName();

					sb.append("\n");

					ArrayList<DependencyencyClass> D = m.get(0).getDepdendency();

					;
					sb.append("component ");
					sb.append(m.get(0).getMicroserviceNameWitUnderscore() + m.get(0).getColor());
					sb.append("{");

					DependencyencyClass(sb, D, m , currentMicroservice);
					sb.append("\n");

					sb.append("}\n");

				

			}
		}

	}

	public static void MicroserviceGetter(StringBuilder sb,
			List<MicroservicesArchitecture> microservicesArchitectures) {
		for (MicroservicesArchitecture name : microservicesArchitectures) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();
			for (List<MicroserviceObject> m : test) {

				String placeholder = m.get(0).getMicroserviceName();
				for (EndPointObject endPointObject : MicroDepedancyView) {
					if (endPointObject.getMicroName().equals(placeholder)) {
						sb.append("component ");
						sb.append(m.get(0).getMicroserviceNameWitUnderscore() + " <<" + m.get(0).getType() + ">> "
								+ m.get(0).getColor());
						sb.append("{");
						sb.append("\n");
						for (String endPoint : endPointObject.getEndPoints()) {
							sb.append("\n");
							sb.append(endPoint);
						}
						sb.append("\n");
						sb.append("}");
						sb.append("\n");

					}

				}

			}

		}
		MicroDepedancyView.clear();
		for (String s : Connections) {
			sb.append("\n");
			sb.append(s.toString());
			sb.append("\n");
		}
		Connections.clear();

	}

	public static void DependencyencyClass(StringBuilder sb, ArrayList<DependencyencyClass> D,
			List<MicroserviceObject> m, String currentMicroservice) {

		for (DependencyencyClass Depenndancy : D) {
			
			
			
			if (Depenndancy.getProviderName() != "" && Depenndancy.getProviderName() != null) {
				if (Depenndancy.getProviderDestination() != "" && Depenndancy.getProviderDestination() != null) {
					if (!Depenndancy.getProviderName().equals(currentMicroservice)) {
						getType(sb, Depenndancy, m);
					} else {
						if (Depenndancy.getProviderDestination().contains("QueueListener")) {
							sb.append("\n");
							sb.append("queue   " + Depenndancy.getProviderNameQueListner() + Quecounter);

							Quecounter++;
						} else {
							sb.append("\n");
							sb.append("portin " + Depenndancy.getProviderNameEndPoint() + endPointCounter);
							endPointCounter++;
						}
					}

				} else {
					EndPointObject placeholder = new EndPointObject();

					placeholder.setMicroName(Depenndancy.getProviderName());
					MicroDepedancyView.add(placeholder);
					Connections.add(m.get(0).getMicroserviceNameWitUnderscore() + "-[#e60e255]->"
							+ Depenndancy.getProviderNameWithNoCharecters());
				}

			}

		}

	}

	public static void getType(StringBuilder sb, DependencyencyClass Depenndancy, List<MicroserviceObject> m) {

		if (Depenndancy.getProviderDestination().contains("QueueListener")) {

			boolean contains = false;
			for (EndPointObject endPointObject : MicroDepedancyView) {

				if (endPointObject.getMicroName().equals(Depenndancy.getProviderName())) {
					contains = true;
					String endPointPlceholder = "queue   " + Depenndancy.getProviderNameQueListner() + Quecounter;
					endPointObject.setEndPoints(endPointPlceholder);
					Connections.add(m.get(0).getMicroserviceNameWitUnderscore() + "-[#e60e20]->"
							+ Depenndancy.getProviderNameQueListner() + Quecounter);
					Quecounter++;
					break;
				}

			}

			if (!contains) {
				EndPointObject placeholder = new EndPointObject();
				placeholder.setMicroName(Depenndancy.getProviderName());
				String endPointPlceholder = "queue   " + Depenndancy.getProviderNameQueListner() + Quecounter;
				placeholder.setEndPoints(endPointPlceholder);
				MicroDepedancyView.add(placeholder);
				Connections.add(m.get(0).getMicroserviceNameWitUnderscore() + "-[#e60e20]->"
						+ Depenndancy.getProviderNameQueListner() + Quecounter);
				Quecounter++;
			}

		} else {
			boolean contains = false;
			for (EndPointObject endPointObject : MicroDepedancyView) {
				if (endPointObject.getMicroName().equals(Depenndancy.getProviderName())) {
					contains = true;
					String endPointPlceholder = "portin " + Depenndancy.getProviderNameEndPoint() + endPointCounter;
					endPointObject.setEndPoints(endPointPlceholder);
					Connections.add(m.get(0).getMicroserviceNameWitUnderscore() + "-[#e60e20]->"
							+ Depenndancy.getProviderNameEndPoint() + endPointCounter);
					endPointCounter++;
					break;
				}

			}

			if (!contains) {
				EndPointObject placeholder = new EndPointObject();
				placeholder.setMicroName(Depenndancy.getProviderName());
				String endPointPlceholder = "portin " + Depenndancy.getProviderNameEndPoint() + endPointCounter;
				placeholder.setEndPoints(endPointPlceholder);
				MicroDepedancyView.add(placeholder);
				Connections.add(m.get(0).getMicroserviceNameWitUnderscore() + "-[#e60e20]->"
						+ Depenndancy.getProviderNameEndPoint() + endPointCounter);
				endPointCounter++;
			}

		}

	}

}
