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

	public void addMessages(MessagesObject m) {
		messages.add(m);

	}

	// private constructor, use builder only
	public MicroserviceObject(String name) {
		microserviceName = name;

	}

	public void addContainer(String string) {
		container = string;
	}

	public void addInterface(String string) {
		si = string;
	}

	public void addDepdendency(DependencyencyClass d) {
		dependencies.add(d);
	}

	public String getType() {
		// TODO Auto-generated method stub
		return "Microservice";
	};

	public void setMicroserviceName(String microserviceName) {
		this.microserviceName = microserviceName;
	}

	public String getMicroserviceName() {
		return microserviceName;
	}

	public void addComponent(InfrastructurePatternPomponentObject component) {
		components.add(component);
	}

	public List<InfrastructurePatternPomponentObject> getComponents() {
		return components;
	}

	public ArrayList<MessagesObject> getMessages() {
		return messages;
	}

	public List<InfrastructurePatternPomponentObject> getComponents(Class<?> type, String catagory) {
		return components.stream().filter(x -> type.isInstance(x)).filter(x -> x.getCategory().equals(catagory))
				.collect(Collectors.toList());
	}

	public String toString() {// overriding the toString() method
		return "microserviceName : " + microserviceName + "component : " + components + "   interface : " + si
				+ "   Container : " + container + " dependencies : " + dependencies + " Messages : " + messages;
	}

}
