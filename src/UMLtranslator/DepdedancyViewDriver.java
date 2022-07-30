package UMLtranslator;

import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.MicroservicesArchitecture;
import PIM.ServiceDependency;
import MicroserviceObject.DependencyencyClass;
import MicroserviceObject.MicroserviceObject;

public class DepdedancyViewDriver {

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

	public static void interfaceView(StringBuilder sb,List<MicroservicesArchitecture> microservicesArchitectures) {
		for (MicroservicesArchitecture name : microservicesArchitectures) {
			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();
			sb.append("frame ");
			sb.append(name.getArchitectureName());
			sb.append("{");
			for (List<MicroserviceObject> m : test) {

				sb.append("\n");
				sb.append("folder ");
				sb.append(m.get(0).getContainer());
				sb.append("{");
				sb.append("\n");
				sb.append("interface " + " \" " + m.get(0).getInterface() + " \" " + " as " + m.get(0).getMicroserviceNameWithoutSpace() + "component");

				ArrayList<DependencyencyClass> D = m.get(0).getDepdendency();


				for (DependencyencyClass Depenndancy : D ) {

					if (Depenndancy.getProviderName() !="" && Depenndancy.getProviderName() !=null) {
						if (Depenndancy.getProviderDestination() !="" && Depenndancy.getProviderDestination() !=null) {
						sb.append("\n");
					//	sb.append("interface " + "\"" + Depenndancy.getProviderDestination() + "\"" + " as " + Depenndancy.getProviderDestinationWithNoCharecters() );

						sb.append("\n");
						sb.append(Depenndancy.getProviderNameWithNoCharecters()+ "---" + Depenndancy.getProviderDestinationWithNoCharecters());
						sb.append("\n");
							
						}
						
					}

				}



				sb.append("\n");
				sb.append(m.get(0).getMicroserviceNameWithoutSpace() + "component" + "---" + "["+ m.get(0).getMicroserviceName() + "<<" + m.get(0).getType() + ">>" + "]");

				sb.append("\n");
				sb.append("component ");
				sb.append(m.get(0).getMicroserviceName() + "<<" + m.get(0).getType() + ">>");
				sb.append("{");
				sb.append("\n");
				sb.append("}\n");
				sb.append("}\n");
			}

		}



	}
}
