import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.DependencyencyClass;
import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MessagesObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import PIM.InfrastructurePatternCategory;
import PIM.MicroserviceArchitecture;
import PIM.RootPIM;
import UMLtranslator.UmlDriver;

public class main {
	private static MicroserviceObject microserviceObject;

	
	static String Umldraw = "./TrainTicket.PIM";
	
	public static void main(String[] args) {
		// Loading the existing model
		EMFModelLoad loader = new EMFModelLoad();

		// Getting first element ( pim root )
		RootPIM root = loader.load(Umldraw);

		// ROOT IS USEDBTO ACCESS THE ROOT ELEMENT IN THE FILE AND TO GET THE ACCESS
		// INTO getArchitecture
		MicroserviceArchitecture mA = root.getArchitecture();
		
	
		
	
		List<MicroservicesArchitecture> microservicesArchitecturesTest = new ArrayList<MicroservicesArchitecture>();

		microservicesArchitecturesTest = MainDriver.createMicroservicesArchitecture(mA);
		
		
		Umldraw = UmlDriver.toPlantUmlFormatter(microservicesArchitecturesTest);
		


//		for (MicroservicesArchitecture name: microservicesArchitecturesTest) {
//
//			System.out.println("getArchitectureName : " + name.getArchitectureName()); ;
//			List<List<MicroserviceObject>> test = name.getMicroservicesArchitectureObject();
//
//
//
//			for (List<MicroserviceObject> m : test) {
//
//				System.out.println("getMicroserviceName : " +
//						m.get(0).getMicroserviceName()); System.out.println("getType : " +
//								m.get(0).getType());
//
//						List<InfrastructurePatternPomponentObject> test1 = m.get(0).getComponents();
//						List<DependencyencyClass> test2 = m.get(0).getDepdendency();
//
//						for (InfrastructurePatternPomponentObject a : test1) {
//
//							System.out.println(a.getCategory()); System.out.println(a.getType());
//
//						}
//
//						for (DependencyencyClass d : test2) {
//
//						}
//
//
//			}
//
//
//
//
//
//		}
		 
	
		
	//	UmlDriver.toPlantUmlFormatter();
	}
}