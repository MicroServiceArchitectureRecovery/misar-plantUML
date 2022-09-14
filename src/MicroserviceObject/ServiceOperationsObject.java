package MicroserviceObject;

import PIM.ServiceOperation;

public class ServiceOperationsObject {

	private String operationName;
	private String operationDescription;
	private ServiceOperation sOperation;
	private static int count = 0;

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
	 public String toString() {// overriding the toString() method
	 return operationName.toString() + operationDescription.toString() ;
	}
	 public static int getServiceOperationsObjectCount() {
			return count;
		}

		public void setServiceOperationsObjectCount() {
			count++;
		}

}
