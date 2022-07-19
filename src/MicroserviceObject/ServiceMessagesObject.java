package MicroserviceObject;

import PIM.ServiceMessage;

public class ServiceMessagesObject {

	private String messageType;
	private ServiceMessage mDestination;

	public ServiceMessagesObject(ServiceMessage sM) {
		this.mDestination = sM;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageTypeInput) {
		messageType = messageTypeInput;
	}

	public String toString() {// overriding the toString() method
		return messageType;
	}

}
