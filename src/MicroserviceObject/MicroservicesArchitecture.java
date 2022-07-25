package MicroserviceObject;

import java.util.ArrayList;
import java.util.List;

public class MicroservicesArchitecture {
	private List<List<MicroserviceObject>> MicroservicesArchitectureObject = new ArrayList<>();
	private String architectureName;

	public String getArchitectureName() {
		return architectureName;
	}

	public MicroservicesArchitecture(String architectureName2) {
		// TODO Auto-generated constructor stub
		architectureName = architectureName2;
	}

	public List<List<MicroserviceObject>> getMicroservicesArchitectureObject() {
		return MicroservicesArchitectureObject;
	}

	public void setMicroservicesArchitectureObject(List<List<MicroserviceObject>> microserviceInfo) {
		// TODO Auto-generated method stub
		MicroservicesArchitectureObject = microserviceInfo;
	}

	public String toString() {// overriding the toString() method
		return architectureName;
	}

}
