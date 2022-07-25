package MicroserviceObject;

import java.util.ArrayList;

import PIM.MessageDestination;

public class MessagesObject {

	private ArrayList<ServiceMessagesObject> serviceMessages = new ArrayList<>();
	private ArrayList<ServiceOperationsObject> ServiceOperations = new ArrayList<>();
	private String operationName;
	private String operationDescription;
	private MessageDestination messageDestinations;
	
	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getOperationDescription() {
		return operationDescription;
	}

	public void setOperationDescription(String operationDescription) {
		this.operationDescription = operationDescription;
	}

	public MessagesObject(MessageDestination messageDestination) {
		this.messageDestinations = messageDestination;
	}

	public ArrayList<ServiceOperationsObject> getServiceOperations() {
		return ServiceOperations;
	}

	public void setServiceOperations(ServiceOperationsObject soo) {
		ServiceOperations.add(soo);
	}

	public void setServiceMessages(ServiceMessagesObject s) {
		serviceMessages.add(s);
	}

	public ArrayList<ServiceMessagesObject> getServiceMessages() {
		return serviceMessages;
	}
	
	public String getType() {
		
		return "Message Destination";
	};
	

	public String toString() {// overriding the toString() method
		return serviceMessages.toString();
	}
	
	
	






}
