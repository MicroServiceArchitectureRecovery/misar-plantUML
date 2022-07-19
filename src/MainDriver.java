import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.ClientComponent;
import MicroserviceObject.EndPointMessages;
import MicroserviceObject.FunctionalMicroObject;
import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MessagesObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.QueListnerMessagesObject;
import MicroserviceObject.ServerComponentObject;
import MicroserviceObject.ServiceMessagesObject;
import MicroserviceObject.ServiceOperationsObject;
import MicroserviceObject.DependencyencyClass;
import MicroserviceObject.InfrastructureMicroObject;
import PIM.Container;
import PIM.Endpoint;
import PIM.FunctionalMicroservice;
import PIM.InfrastructureClientComponent;
import PIM.InfrastructureMicroservice;
import PIM.InfrastructurePatternComponent;
import PIM.InfrastructureServerComponent;
import PIM.MessageDestination;
import PIM.Microservice;
import PIM.MicroserviceArchitecture;
import PIM.QueueListener;
import PIM.ServiceDependency;
import PIM.ServiceInterface;
import PIM.ServiceMessage;
import PIM.ServiceOperation;

public class MainDriver {

	private static MicroserviceObject microserviceObject;
	private static InfrastructurePatternPomponentObject c;
	private static DependencyencyClass d;
	private static MessagesObject m;
	private static ServiceMessagesObject s;

	public static List<List<MicroserviceObject>> createMicroserviceObject(MicroserviceArchitecture MA) {

		List<List<MicroserviceObject>> microserviceInfo = new ArrayList<List<MicroserviceObject>>();

		for (Microservice Microservice : MA.getMicroservices()) {
			// resetting the list to have every ms in its own arraylist
			List<MicroserviceObject> microserviceObject = new ArrayList<MicroserviceObject>();
			microserviceObject.add(getMiroservice(MA, Microservice));
			microserviceInfo.add(microserviceObject);
		}

		return microserviceInfo;

	}

	public static MicroserviceObject getMiroservice(MicroserviceArchitecture MA, Microservice microservice) {

		if (microservice instanceof FunctionalMicroservice) {

			microserviceObject = new FunctionalMicroObject(microservice.getMicroserviceName());
			buildArray(microservice);;

		} else if (microservice instanceof InfrastructureMicroservice) {

			microserviceObject = new InfrastructureMicroObject(microservice.getMicroserviceName());
			buildArray(microservice);
		} else {

			microserviceObject = new MicroserviceObject(microservice.getMicroserviceName());
			buildArray(microservice);
		}

		return microserviceObject;

	}
	
	public static MicroserviceObject buildArray(Microservice microservice) {
		
		getContainer(microservice);
		getDepenndancy(microservice);
		getComponents(microservice);
		getInterface(microservice);
		getMessages(microservice);
		
		return microserviceObject;
		
	}

	private static MicroserviceObject getComponents(Microservice microservice) {

		for (InfrastructurePatternComponent IPC : microservice.getComponents()) {
			if (IPC instanceof InfrastructureClientComponent) {

				c = new ClientComponent(IPC.getCategory());
				microserviceObject.addComponent(c);

			}

			else if (IPC instanceof InfrastructureServerComponent) {

				c = new ServerComponentObject(IPC.getCategory());
				microserviceObject.addComponent(c);
				// System.out.println(microserviceObject.getComponents());

			} else {
				c = new InfrastructurePatternPomponentObject(IPC.getCategory());
				microserviceObject.addComponent(c);
				// System.out.println(microserviceObject.getComponents());
			}

		}
		return microserviceObject;

	}

	private static MicroserviceObject getContainer(Microservice microservice) {

		Container contain = microservice.getContainer();
		microserviceObject.addContainer(contain.getContainerName());
		return microserviceObject;

	}

	private static MicroserviceObject getInterface(Microservice microservice) {

		microserviceObject.addInterface(microservice.getInterface().getServerURL());
		return microserviceObject;
	}

	private static MicroserviceObject getDepenndancy(Microservice microservice) {

		for (ServiceDependency Depenndancy : microservice.getDependencies()) {

			String test = Depenndancy.getProviderDestination();
			// System.out.print(test);

			d = new DependencyencyClass(Depenndancy);
			d.setProviderDestination(Depenndancy.getProviderDestination());
			d.setProviderName(Depenndancy.getProviderName());

			microserviceObject.addDepdendency(d);

		}

		return microserviceObject;
	}

	private static MicroserviceObject getMessages(Microservice microservice) {
		ServiceInterface Interface = microservice.getInterface();
		for (MessageDestination Destination : Interface.getDestinations()) {
			if (Destination instanceof Endpoint) {
				m = new EndPointMessages(Destination);
				for (ServiceMessage SM : Destination.getMessages()) {
					if (!SM.getMessageType().isBlank()) {
						s = new ServiceMessagesObject(SM);
						s.setMessageType(SM.getMessageType());
				
						m.setServiceMessages(s);

					}
					microserviceObject.addMessages(m);
				}
			}

			if (Destination instanceof QueueListener) {

				m = new QueListnerMessagesObject(Destination);

				for (ServiceMessage SM : Destination.getMessages()) {
					if (!SM.equals(null))
						s = new ServiceMessagesObject(SM);
					s.setMessageType(SM.getMessageType());
					m.setServiceMessages(s);
					microserviceObject.addMessages(m);
				}

			}

		}
		return microserviceObject;
	}

}
