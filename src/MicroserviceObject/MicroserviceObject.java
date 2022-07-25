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
	
	//Getting and setting the name of the Microservice
	public void setMicroserviceName(String microserviceName) {
		this.microserviceName = microserviceName;
	}

	public String getMicroserviceName() {
		return microserviceName;
	}
	
	public String getMicroserviceNameWithoutSpace() {
		return microserviceName.replaceAll("[^a-zA-Z0-9]","");
	}
	
	public void setComponent(InfrastructurePatternPomponentObject component) {
		components.add(component);
	}

	public List<InfrastructurePatternPomponentObject> getComponents() {
		return components;
	}

	/*
	 * public List<InfrastructurePatternPomponentObject> getComponents(Class<?>
	 * type, String catagory) { return components.stream().filter(x ->
	 * type.isInstance(x)).filter(x -> x.getCategory().equals(catagory))
	 * .collect(Collectors.toList()); }
	 */
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
	





	public String toString() {// overriding the toString() method
		return "microserviceName : " + microserviceName + "component : " + components + "   interface : " + si
				+ "   Container : " + container + " dependencies : " + dependencies + " Messages : " + messages;
	}

}
