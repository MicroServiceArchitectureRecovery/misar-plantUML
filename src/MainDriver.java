import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.ClientComponent;
import MicroserviceObject.EndPointMessages;
import MicroserviceObject.FunctionalMicroObject;
import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MessagesObject;
import MicroserviceObject.ServiceOperationsObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.QueListnerMessagesObject;
import MicroserviceObject.ServerComponentObject;
import MicroserviceObject.ServiceMessagesObject;
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
	private static MicroservicesArchitecture MicroservicesArchitecture;
	private static MicroserviceObject microserviceObject;
	private static InfrastructurePatternPomponentObject c;
	private static DependencyencyClass d;
	private static MessagesObject m;
	private static ServiceMessagesObject s;
	private static String name;
	private static ServiceOperationsObject ServiceOperationsObject;

	public static List<MicroservicesArchitecture> createMicroservicesArchitecture(MicroserviceArchitecture MA) {

		List<MicroservicesArchitecture> microservicesArchitecturesTest = new ArrayList<MicroservicesArchitecture>();

		microservicesArchitecturesTest.add(createMicroserviceObject(MA));

		return microservicesArchitecturesTest;

	}

	public static MicroservicesArchitecture createMicroserviceObject(MicroserviceArchitecture MA) {

		List<List<MicroserviceObject>> microserviceInfo = new ArrayList<List<MicroserviceObject>>();

		MicroservicesArchitecture = new MicroservicesArchitecture(MA.getArchitectureName());
		for (Microservice Microservice : MA.getMicroservices()) {

			List<MicroserviceObject> microserviceObjects = new ArrayList<MicroserviceObject>();
			// resetting the list to have every ms in its own arraylist

			microserviceObjects.add(getMiroservice(MA, Microservice));
			microserviceInfo.add(microserviceObjects);

		}
		MicroservicesArchitecture.setMicroservicesArchitectureObject(microserviceInfo);

		return MicroservicesArchitecture;
	}

	public static MicroserviceObject getMiroservice(MicroserviceArchitecture MA, Microservice microservice) {

		if (microservice instanceof FunctionalMicroservice) {

			microserviceObject = new FunctionalMicroObject(microservice.getMicroserviceName());
			buildArray(microservice);
			;

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
				microserviceObject.setComponent(c);

			}

			else if (IPC instanceof InfrastructureServerComponent) {

				c = new ServerComponentObject(IPC.getCategory());
				microserviceObject.setComponent(c);
				// System.out.println(microserviceObject.getComponents());

			} else {
				c = new InfrastructurePatternPomponentObject(IPC.getCategory());
				microserviceObject.setComponent(c);
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

		microserviceObject.setInterface(microservice.getInterface().getServerURL());
		return microserviceObject;
	}

	private static MicroserviceObject getDepenndancy(Microservice microservice) {

		for (ServiceDependency Depenndancy : microservice.getDependencies()) {

			d = new DependencyencyClass(Depenndancy);
			d.setProviderDestination(Depenndancy.getProviderDestination());
			d.setProviderName(Depenndancy.getProviderName());

			microserviceObject.setDepdendency(d);

		}

		return microserviceObject;
	}

	private static MicroserviceObject getMessages(Microservice microservice) {
		ServiceInterface Interface = microservice.getInterface();
		for (MessageDestination Destination : Interface.getDestinations()) {
			
			
			
		//	ServiceOperation serviceOperation = Destination.getOperation();
		//	String d = Destination.getOperation().toString();
			
			
			

			if (Destination instanceof Endpoint) {
	
				if (Destination instanceof ServiceOperation) {
					
					System.out.println(Destination.getOperation());
					
					
				}
				
			m = new EndPointMessages(Destination);
			
			//if (!serviceOperation.getOperationName().equals(null)) {
				
			//	ServiceOperationsObject = new ServiceOperationsObject(serviceOperation);
			//	ServiceOperationsObject.setOperationName(serviceOperation.getOperationName());
				
		//	}
			
				
				for (ServiceMessage SM : Destination.getMessages()) {

					m.setOperationDescription(name);
					if (!SM.getMessageType().isBlank()) {
						s = new ServiceMessagesObject(SM);
						s.setMessageType(SM.getMessageType());

						m.setServiceMessages(s);

					}
					microserviceObject.setMessages(m);
				}

			}

			if (Destination instanceof QueueListener) {

				m = new QueListnerMessagesObject(Destination);

				for (ServiceMessage SM : Destination.getMessages()) {
					if (!SM.equals(null))
						s = new ServiceMessagesObject(SM);
					s.setMessageType(SM.getMessageType());
					m.setServiceMessages(s);
					microserviceObject.setMessages(m);
				}

			}

		}

		return microserviceObject;
	}

}
