package UMLtranslator;

import java.util.List;

import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

public class CounterClass {

	public CounterClass() {
		// TODO Auto-generated constructor stub
	}

	public static StringBuilder getMicroservices(List<MicroservicesArchitecture> microservicesArchitecturesTest) {

		StringBuilder sb = new StringBuilder();

		for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> microserviceObject = name.getMicroservicesArchitectureObject();
			int counter = 1;

			for (List<MicroserviceObject> microservice : microserviceObject) {

				sb.append(counter + ": " + microservice.get(0).getMicroserviceName());

				sb.append("\n");

				counter++;
				// AddInfrastructurePatternPomponentObject(sb, microserv

			}
		}
		return sb;
	}

}
