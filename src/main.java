import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import PIM.MicroserviceArchitecture;
import PIM.RootPIM;
import UMLtranslator.CounterClass;
import UMLtranslator.MicroservicesArchitectureViewDriver;

public class main {
	private static MicroserviceObject microserviceObject;
	static List<MicroservicesArchitecture> microservicesArchitecturesTest = new ArrayList<MicroservicesArchitecture>();
	static String Umldraw = "";

	static String UmldrawOutput = "";

	public static void setUmldraw(String input) {
		Umldraw = input;
	}

	public static void main(String[] args) {
		// Loading the existing model
		EMFModelLoad loader = new EMFModelLoad();

		if (!Umldraw.equals("")) {
			RootPIM root = loader.load(Umldraw);
			MicroserviceArchitecture mA = root.getArchitecture();
			microservicesArchitecturesTest = MainDriver.createMicroservicesArchitecture(mA);

		}

	}
	public static StringBuilder getMicroservices()  {
		return CounterClass.getMicroservices(microservicesArchitecturesTest);

	}
	
	

	public static void MicroservicesArchitectureViewDriver() throws IOException {
		UmldrawOutput = MicroservicesArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		try {
			SVGdriver.SVGdriver(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void DepdedancyViewDriver() throws IOException {
		UmldrawOutput = MicroservicesArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		try {
			PNGdriver.imageGen(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
