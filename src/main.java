import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import MicroserviceObject.InfrastructurePatternPomponentObject;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

import PIM.MicroserviceArchitecture;
import PIM.RootPIM;

import UMLtranslator.MicroservicesArchitectureViewDriver;

public class main {
	private static MicroserviceObject microserviceObject;

	static String Umldraw = "Text.PIM";

	static String UmldrawOutput = "";

	public static void setUmldraw(String input) {
		Umldraw = input;
	}

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

		// UmldrawOutput =
		// UmlDriver.toPlantUmlFormatter(microservicesArchitecturesTest);
		UmldrawOutput = MicroservicesArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);
		// UmldrawOutput =
		// DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);
		try {
			PNGdriver.imageGen(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
