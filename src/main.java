import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.MicroserviceObject;
import PIM.MicroserviceArchitecture;
import PIM.RootPIM;

public class main {

	public static void main(String[] args) {
		// Loading the existing model
		EMFModelLoad loader = new EMFModelLoad();

		// Getting first element ( pim root )
		RootPIM root = loader.load();

		// ROOT IS USEDBTO ACCESS THE ROOT ELEMENT IN THE FILE AND TO GET THE ACCESS
		// INTO getArchitecture
		MicroserviceArchitecture mA = root.getArchitecture();

		List<List<MicroserviceObject>> microserviceInfo = new ArrayList<List<MicroserviceObject>>();

		microserviceInfo = MainDriver.createMicroserviceObject(mA);

		for (int i = 0; i < microserviceInfo.size(); i++) {
			
			
		
			//System.out.println(microserviceInfo);
		}
		
		for(List<MicroserviceObject> name : microserviceInfo)
		{
		    System.out.println(name.get(0).getComponents());
		}

	}
}