package MicroserviceObject;

import PIM.ServiceOperation;

public class ServiceOperationsObject {

	private String operationName;
	private String operationDescription;
	private ServiceOperation sOperation;

	public ServiceOperationsObject(ServiceOperation operations) {
		this.sOperation = operations;
	}

	public String getOperationDescription() {
		return operationDescription;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public void setOperationDescription(String operationDescription) {
		this.operationDescription = operationDescription;
	}
	// public String toString() {// overriding the toString() method
	/// return operationName + operationDescription ;
//	}

}
