package MicroserviceObject;

import PIM.ServiceMessage;

public class ServiceMessagesObject {

	private String messageType;
	private ServiceMessage mDestination;
	private static int count = 0;

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
	public static int getServiceMessagesObject() {
		return count;
	}

	public void setServiceMessagesObjectCount() {
		count++;
	}

}
