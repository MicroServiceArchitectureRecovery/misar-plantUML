package MicroserviceObject;

public class counterClass {
	static int microserviceArtecetcture = 0;
	static int microserviceCount = 0;
	static int functionalMicroserviceCount = 0;
	static int infustructureMicroserviceCount = 0;
	static int containerCount = 0;
	static int infrastructurePatternComponentCount = 0;
	static int serverComponentCount = 0;
	static int clientComponentCount = 0;
	static int serviceDependancyCount = 0;
	static int serviceInterfaceCount = 0;
	static int endPointCount = 0;	
	static int queListnerCount = 0;	
	static int serviceOperation = 0;
	static int serviceMessage = 0;
	
	

	public counterClass() {

		// TODO Auto-generated constructor stub
	}

	public static void setmicroserviceArtecetcturecounter() {
		microserviceArtecetcture++;
	}

	public static int getmicroserviceArtecetcture() {
		return microserviceArtecetcture;
	}

	public static void setMicroservice() {
		microserviceCount++;
	}

	public static int getMicroservice() {
		return microserviceCount;
	}

	public static void setfunctionalMicroserviceCount() {
		functionalMicroserviceCount++;
	}

	public static int getfunctionalMicroserviceCount() {
		return functionalMicroserviceCount;
	}

	public static void setInfustructureMicroserviceCount() {
		infustructureMicroserviceCount++;
	}

	public static int getInfustructureMicroserviceCount() {
		return infustructureMicroserviceCount;
	}

	public static void setContainerCount() {
		containerCount++;
	}

	public static int getContainerCount() {
		return containerCount;
	}

	public static void setInfrastructurePatternComponentCount() {
		infrastructurePatternComponentCount++;
	}

	public static int getInfrastructurePatternComponentCount() {
		return infrastructurePatternComponentCount;
	}

	public static void setInfrastructeServerComponentCount() {
		serverComponentCount++;
	}

	public static int getInfrastructureServerComponentCount() {
		return serverComponentCount;
	}

	public static void setInfrastructeClientComponentCount() {
		clientComponentCount++;
	}

	public static int getInfrastructureClientComponentCount() {
		return clientComponentCount;
	}

	public static void setServiceDependancyCount() {
		serviceDependancyCount++;
	}

	public static int getServiceDependancyCount() {
		return serviceDependancyCount;
	}
	
	public static void setInterfaceCount() {
		serviceInterfaceCount++;
	}

	public static int getEndPointCounter() {
		return 
		endPointCount;
	}
	
	
	public static void setEndPointCounter() {
		endPointCount++;
	}

	public static int getInterfaceCount() {
		return serviceInterfaceCount;
	}
	public static void setQueListnerCount() {
		queListnerCount++;
	}

	public static int getQueListnerCount() {
		return queListnerCount;
	}
	
	public static void setServiceOperationCount() {
		serviceOperation++;
	}

	public static int getServiceOperationCount() {
		return serviceOperation;
	}
	
	public static void setServiceMessageCount() {
		serviceMessage++;
	}

	public static int getServiceMessageCount() {
		return serviceMessage;
	}
	
	
	
	
	
	

	public static void printAll() {
		System.out.println(microserviceArtecetcture + "\n" + "MicroserviceCount : " + microserviceCount + "\n" + "infustructureMicroserviceCount : " +infustructureMicroserviceCount
				+ "\n" + "functional MicroserviceCount : "  + functionalMicroserviceCount + "\n" + "container  : "  +containerCount + "\n" + " ipc : "  +
				+ infrastructurePatternComponentCount + "\n" + "service component : "  + serverComponentCount + "\n" + "client : "  + clientComponentCount + "\n" + "interface : "  +
				+ serviceInterfaceCount + "\n" + " depedancy: "  + serviceDependancyCount + "\n" + "fu service operations : "  + serviceOperation 
				+ "\n" +  "service message : "  +serviceMessage + "\n" + "que : "  + queListnerCount + "\n" + "end point : "  + endPointCount);
	}

}
