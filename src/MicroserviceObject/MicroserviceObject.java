package MicroserviceObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MicroserviceObject {
	private static int count = 0;
	private String microserviceName;
	private ArrayList<PatternComponentstObject> components = new ArrayList<>();
	private ArrayList<DependencyencyClass> dependencies = new ArrayList<>();
	private ArrayList<MessagesObject> messages = new ArrayList<>();
	private String serviceInterface;
	private String container;

	
	
	private int endPointCounter = 0;
	private int queuelistenersCounter = 0;
	private int messageCounter = 0;
	private int patternComponentstObjectCounter = 0;
	private int infrastructureServerCOmponentsCounter = 0;
	private int InfrastructureCLientComponentCounter = 0;
	private int serviceDependenciesCounter = 0;
	private int serviceInterfaceCounter = 0;
	private int serviceOpertionCounter = 0;

	
	public int getServiceOpertionCounter() {
		return serviceOpertionCounter;
	}

	public void seServiceOpertionCounter() {
		serviceOpertionCounter++;
	}
	
	public int getEndPointCounter() {
		return endPointCounter;
	}

	public void setEndPointCounter() {
		endPointCounter++;
	}

	public int getQueuelistenersCounter() {
		return queuelistenersCounter;
	}

	public void setQueuelistenersCounter() {
		queuelistenersCounter++;
	}

	public int getMessageCounter() {
		return messageCounter;
	}

	public void setMessageCounter() {
		messageCounter++;
	}



	public int getPatternComponentstObjectCounter() {
		return patternComponentstObjectCounter;
	}

	public void setPatternComponentstObjectCounter() {
		patternComponentstObjectCounter++;
	}

	public int getInfrastructureServerCOmponentsCounter() {
		return infrastructureServerCOmponentsCounter;
	}

	public void setInfrastructureServerCOmponentsCounter() {
		infrastructureServerCOmponentsCounter++;
	}

	public int getInfrastructureCLientComponentCounter() {
		return InfrastructureCLientComponentCounter;
	}

	public void setInfrastructureCLientComponentCounter() {
		InfrastructureCLientComponentCounter++;
	}

	public int getserviceInterfaceCounter() {
		return serviceInterfaceCounter;
	}

	public void setserviceInterfaceCounter() {
		serviceInterfaceCounter++;
	}

	public int getDependenciesCounter() {
		return serviceDependenciesCounter;
	}

	public void setDependenciesCounter() {
		serviceDependenciesCounter++;
	}

	// private constructor, use builder only
	public MicroserviceObject(String name) {
		microserviceName = name;

	}

	// Getting and setting the name of the Microservice
	public void setMicroserviceName(String microserviceName) {
		this.microserviceName = microserviceName;
	}

	public String getMicroserviceName() {
		return microserviceName;
	}

	public String getMicroserviceNameWithoutSpace() {
		return microserviceName.replaceAll("[^a-zA-Z0-9]", "");
	}

	public String getMicroserviceNameWitUnderscore() {
		return microserviceName.replaceAll("[^a-zA-Z0-9]", "_");
	}

	public void setComponent(PatternComponentstObject component) {
		components.add(component);
	}

	public List<PatternComponentstObject> getComponents() {
		return components;
	}

	public void setDepdendency(DependencyencyClass d) {
		dependencies.add(d);
	}

	public ArrayList<DependencyencyClass> getDepdendency() {
		return dependencies;
	}

	public void setMessages(MessagesObject m) {
		messages.add(m);

	}

	public ArrayList<MessagesObject> getMessages() {
		return messages;
	}

	public int getMessagesDestinionSize() {
		return messages.size();
	}

	public void addContainer(String string) {
		container = string;
	}

	public String getContainer() {
		return container;
	}

	public void setInterface(String string) {
		serviceInterface = string;
	}

	public String getInterface() {
		return serviceInterface;
	}

	public String getType() {

		return "Microservice";
	};

	public String getColor() {
		return "#E3664A";

	}

	public static int getMicroserviceObject() {
		return count;
	}

	public static void setMicroserviceObject() {
		count++;
	}

	public String toString() {// overriding the toString() method
		return "microserviceName : " + microserviceName + "component : " + components + "   interface : "
				+ serviceInterface + "   Container : " + container + " dependencies : " + dependencies + " Messages : "
				+ messages;
	}

}
