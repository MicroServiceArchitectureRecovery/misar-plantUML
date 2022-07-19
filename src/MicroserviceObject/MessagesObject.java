package MicroserviceObject;

import java.util.ArrayList;

import PIM.MessageDestination;

public class MessagesObject {

	private ArrayList<ServiceMessagesObject> serviceMessages = new ArrayList<>();
	private ArrayList<ServiceOperationsObject> ServiceOperations = new ArrayList<>();
	private MessageDestination messageDestinations;

	public MessagesObject(MessageDestination messageDestination) {
		this.messageDestinations = messageDestination;
	}

	public void setServiceMessages(ServiceMessagesObject s) {
		serviceMessages.add(s);
	}

	public ArrayList<ServiceMessagesObject> getServiceMessages() {
		return serviceMessages;
	}

	public String toString() {// overriding the toString() method
		return serviceMessages.toString();
	}
	
	
	






}
