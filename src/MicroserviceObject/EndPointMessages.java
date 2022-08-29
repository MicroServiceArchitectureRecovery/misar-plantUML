package MicroserviceObject;

import PIM.MessageDestination;

public class EndPointMessages extends MessagesObject {

	public EndPointMessages(MessageDestination messageDestination) {
		super(messageDestination);
		
	}

	public String getType() {
		
		return "Ep";
	};

}
