package MicroserviceObject;

import PIM.ServiceDependency;

public class DependencyencyClass {

	private String providerName;
	private String providerDestination;
	private ServiceDependency serviceseDendency;

	public DependencyencyClass(ServiceDependency servicedependency) {
		this.serviceseDendency = servicedependency;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerNameInput) {
		this.providerName = providerNameInput;
	}

	public String getProviderDestination() {
		return providerDestination;
	}

	public void setProviderDestination(String providerDestinationInput) {
		this.providerDestination = providerDestinationInput;
	}

	public String toString() {// overriding the toString() method
		return providerName + " SPACE " + providerDestination;
	}

	public String getProviderDestinationWithNoCharecters() {
		return providerDestination.replaceAll("[^a-zA-Z0-9]", "_");
	}

	public String getProviderNameWithNoCharecters() {
		return providerName.replaceAll("[^a-zA-Z0-9]", "_");
	}

	public String getProviderNameQueListner() {
		return "QueListners";
	}

	public String getProviderNameEndPoint() {
		return "p";
	}

}
