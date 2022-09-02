package FileLoad;
import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.ClientComponent;
import MicroserviceObject.EndPointMessages;
import MicroserviceObject.FunctionalMicroObject;
import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MessagesObject;
import MicroserviceObject.ServiceOperationsObject;
import MicroserviceObject.counterClass;
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

public class MainDataLoadDriver {
	private static MicroservicesArchitecture microservicesArchitecture;
	private static MicroserviceObject microserviceObject;
	private static InfrastructurePatternPomponentObject infrastructurePatternPomponentObject;
	private static DependencyencyClass dependencyencyClass;
	private static MessagesObject messagesObject;
	private static ServiceMessagesObject serviceMessagesObject;
	private static ServiceOperationsObject serviceOperationsObject;

	public static List<MicroservicesArchitecture> createMicroservicesArchitecture(MicroserviceArchitecture MA) {

		List<MicroservicesArchitecture> microservicesArchitectures = new ArrayList<MicroservicesArchitecture>();

		microservicesArchitectures.add(createMicroserviceObject(MA));

		return microservicesArchitectures;

	}

	// createMicroserviceObject() - Gets Architecture Name and iterates through all
	// Microservices
	public static MicroservicesArchitecture createMicroserviceObject(MicroserviceArchitecture MA) {

		List<List<MicroserviceObject>> microserviceInfo = new ArrayList<List<MicroserviceObject>>();

		microservicesArchitecture = new MicroservicesArchitecture(MA.getArchitectureName());
		counterClass.setmicroserviceArtecetcturecounter();
		for (Microservice Microservice : MA.getMicroservices()) {

			List<MicroserviceObject> microserviceObjects = new ArrayList<MicroserviceObject>();
			// resetting the list to have every ms in its own arraylist

			microserviceObjects.add(miroserviceInstance(MA, Microservice));
			// All individual Microservices stored in microserviceInfo
			microserviceInfo.add(microserviceObjects);

		}
		microservicesArchitecture.setMicroservicesArchitectureObject(microserviceInfo);

		return microservicesArchitecture;
	}

	public static MicroserviceObject miroserviceInstance(MicroserviceArchitecture MA, Microservice microservice) {

		// using instanceof checking the instance of each Mircoservice

		if (microservice instanceof FunctionalMicroservice) {
			
			counterClass.setfunctionalMicroserviceCount();

			microserviceObject = new FunctionalMicroObject(microservice.getMicroserviceName());
			buildMicroserviceArray(microservice);
			;

		} else if (microservice instanceof InfrastructureMicroservice) {
			counterClass.setInfustructureMicroserviceCount();
			microserviceObject = new InfrastructureMicroObject(microservice.getMicroserviceName());
			buildMicroserviceArray(microservice);
		} else {
			counterClass.setMicroservice();
			microserviceObject = new MicroserviceObject(microservice.getMicroserviceName());
			buildMicroserviceArray(microservice);
		}

		return microserviceObject;

	}

	public static MicroserviceObject buildMicroserviceArray(Microservice microservice) {
		// This method allows to get data for each individual Microservice
		
		microserviceInterface(microservice);
		microserviceContainer(microservice);
		microserviceDepenndancy(microservice);
		microserviceComponents(microservice);		
		microserviceDestinationMessages(microservice);

		return microserviceObject;

	}

	private static MicroserviceObject microserviceComponents(Microservice microservice) {
		// using instanceof checking the instance of each InfrastructurePatternComponent
		for (InfrastructurePatternComponent patternComponent : microservice.getComponents()) {
			if (patternComponent instanceof InfrastructureClientComponent) {
				counterClass.setInfrastructeClientComponentCount();
				infrastructurePatternPomponentObject = new ClientComponent(patternComponent.getCategory());
				microserviceObject.setComponent(infrastructurePatternPomponentObject);

			}

			else if (patternComponent instanceof InfrastructureServerComponent) {
				counterClass.setInfrastructeServerComponentCount();
				infrastructurePatternPomponentObject = new ServerComponentObject(patternComponent.getCategory());
				microserviceObject.setComponent(infrastructurePatternPomponentObject);

			} else {
				counterClass.setInfrastructurePatternComponentCount();
				infrastructurePatternPomponentObject = new InfrastructurePatternPomponentObject(
						patternComponent.getCategory());
				microserviceObject.setComponent(infrastructurePatternPomponentObject);

			}

		}
		return microserviceObject;

	}

	private static MicroserviceObject microserviceContainer(Microservice microservice) {

		counterClass.setContainerCount();
		Container contain = microservice.getContainer();
		microserviceObject.addContainer(contain.getContainerName());
		return microserviceObject;

	}

	private static MicroserviceObject microserviceInterface(Microservice microservice) {
		
		if (!microservice.getInterface().getServerURL().isBlank()) {
		
		microserviceObject.setInterface(microservice.getInterface().getServerURL());
		System.out.println(microservice.getMicroserviceName());
		counterClass.setInterfaceCount();
	}
		return microserviceObject;
	}

	private static MicroserviceObject microserviceDepenndancy(Microservice microservice) {

		for (ServiceDependency Depenndancy : microservice.getDependencies()) {
			counterClass.setServiceDependancyCount();
			dependencyencyClass = new DependencyencyClass(Depenndancy);
			dependencyencyClass.setProviderDestination(Depenndancy.getProviderDestination());
			dependencyencyClass.setProviderName(Depenndancy.getProviderName());

			microserviceObject.setDepdendency(dependencyencyClass);

		}

		return microserviceObject;
	}

	private static MicroserviceObject microserviceDestinationMessages(Microservice microservice) {
		ServiceInterface Interface = microservice.getInterface();
		for (MessageDestination Destination : Interface.getDestinations()) {

			if (Destination instanceof Endpoint) {
				messagesObject = new EndPointMessages(Destination);
				counterClass.setEndPointCounter();
				ServiceOperation(Destination);

				for (ServiceMessage SM : Destination.getMessages()) {

					if (!SM.equals(null)) {
						counterClass.setServiceMessageCount();
						serviceMessagesObject = new ServiceMessagesObject(SM);
						serviceMessagesObject.setMessageType(SM.getMessageType());

						messagesObject.setServiceMessages(serviceMessagesObject);

					}
					microserviceObject.setMessages(messagesObject);
				}

			}

			if (Destination instanceof QueueListener) {

				counterClass.setQueListnerCount();
				ServiceOperation(Destination);

				messagesObject = new QueListnerMessagesObject(Destination);

				for (ServiceMessage SM : Destination.getMessages()) {
					if (!SM.equals(null))
					counterClass.setServiceMessageCount();
					serviceMessagesObject = new ServiceMessagesObject(SM);
					serviceMessagesObject.setMessageType(SM.getMessageType());
					messagesObject.setServiceMessages(serviceMessagesObject);
					microserviceObject.setMessages(messagesObject);
				}

			}

		}

		return microserviceObject;
	}

	private static MessagesObject ServiceOperation(MessageDestination destinationDestination) {
		ServiceOperation ServiceOperation = destinationDestination.getOperation();
		if (ServiceOperation != null) {
			counterClass.setServiceOperationCount();			
			serviceOperationsObject = new ServiceOperationsObject(ServiceOperation);
			serviceOperationsObject.setOperationName(ServiceOperation.getOperationName());
			serviceOperationsObject.setOperationDescription(ServiceOperation.getOperationDescription());
			messagesObject.setServiceOperations(serviceOperationsObject);

		}

		return messagesObject;

	}

}
