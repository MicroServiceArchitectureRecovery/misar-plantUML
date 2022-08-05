package MicroserviceObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MicroserviceObject {
	private String microserviceName;
	private ArrayList<InfrastructurePatternPomponentObject> components = new ArrayList<>();
	private ArrayList<DependencyencyClass> dependencies = new ArrayList<>();
	private ArrayList<MessagesObject> messages = new ArrayList<>();
	private String si;
	private String container;

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

	public void setComponent(InfrastructurePatternPomponentObject component) {
		components.add(component);
	}

	public List<InfrastructurePatternPomponentObject> getComponents() {
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
		si = string;
	}

	public String getInterface() {
		return si;
	}

	public String getType() {

		return "Microservice";
	};

	public String getColor() {
		return "#E3664A";

	}

	public String toString() {// overriding the toString() method
		return "microserviceName : " + microserviceName + "component : " + components + "   interface : " + si
				+ "   Container : " + container + " dependencies : " + dependencies + " Messages : " + messages;
	}

}
