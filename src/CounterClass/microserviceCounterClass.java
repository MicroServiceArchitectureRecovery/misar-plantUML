package CounterClass;

import java.util.List;

import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

public class microserviceCounterClass {

	public static StringBuilder getMicroservices(List<MicroservicesArchitecture> microservicesArchitecturesTest) {

		StringBuilder sb = new StringBuilder();

		for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> microserviceObject = name.getMicroservicesArchitectureObject();
			int counter = 1;

			for (List<MicroserviceObject> microservice : microserviceObject) {

				microservice.get(0).getEndPointCounter();

			}
		}
		return sb;
	}
}
