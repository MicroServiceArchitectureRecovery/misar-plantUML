package MainDriver;
import java.util.ArrayList;
import java.util.List;
import FileLoad.EMFModelLoad;
import FileLoad.MainDataLoadDriver;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import PIM.MicroserviceArchitecture;
import PIM.RootPIM;
import UMLtranslator.CounterClass;
import UMLtranslator.DepdedancyViewDriver;
import UMLtranslator.MicroDepedancyView;
import UMLtranslator.MicroserviceView;
import UMLtranslator.ArchitectureViewDriver;
import outputDrivers.FileOutputDriver;
import outputDrivers.PNGdriver;
import outputDrivers.SVGdriver;
import outputDrivers.WriteDataToExcel;
import outputDrivers.microserviceWriteToExcell;

public class main {
	private static MicroserviceObject microserviceObject;
	static List<MicroservicesArchitecture> microservicesArchitecturesTest = new ArrayList<MicroservicesArchitecture>();
	static String outPut = "";
	static String umldrawSourcePath = "";
	static String umldrawOutputPath = "C:\\Users\\Public\\Documents";
	static String selectedMicroservice = "";
	static String UmldrawOutput = "";
	private static boolean generate = false;

	public static void setUmldraw(String input) {
		umldrawSourcePath = input;
	}

	public static String getUmldraw() {
		return umldrawSourcePath;
	}

	public static void setOutpath(String input) {
		umldrawOutputPath = input;
		System.out.print(umldrawOutputPath);
	}

	public static String getOutputPath() {
		return umldrawOutputPath;
	}

	public static void setMicroservice(String input) {

		selectedMicroservice = input;
	}

	public static String getMicroservice() {
		return selectedMicroservice;
	}

	public static void main(String[] args) {
		// Loading the existing model
		EMFModelLoad loader = new EMFModelLoad();

		if (!umldrawSourcePath.equals("")) {
			generate = true;
			RootPIM root = loader.load(umldrawSourcePath);
			MicroserviceArchitecture mA = root.getArchitecture();
			
			outPut= mA.getArchitectureName();

			microservicesArchitecturesTest = MainDataLoadDriver.createMicroservicesArchitecture(mA);

		}

	}

	public static StringBuilder getMicroservices() {
		return CounterClass.getMicroservices(microservicesArchitecturesTest);

	}

	public static String[] getMicroserviceData() {

		ArrayList<String> boxItems = new ArrayList<String>();
		int n = 0;
		for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> microserviceObject = name.getMicroservicesArchitectureObject();
			for (List<MicroserviceObject> microservice : microserviceObject) {

				boxItems.add(microservice.get(0).getMicroserviceName());
				n++;

			}
		}
		
		
		;
		String[] temp = new String[boxItems.size()];

		for (int i = 0; i < boxItems.size(); i++) {
			
			if (i == 0) {
				selectedMicroservice =  boxItems.get(i);
			}

			temp[i] = boxItems.get(i);

		}
		return temp;

	}

	public static void MicroservicesArchitectureViewDriverPNG() {

		if (generate == true) {
			UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);
			PNGdriver.imageGen(UmldrawOutput, outPut);
		}
	}

	public static void MicroservicesArchitectureViewDriverSVG() {

		if (generate == true) {
			
			UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);
			SVGdriver.SVGdriver(UmldrawOutput, outPut);
		}

	}

	public static void MicroservicesArchitectureViewDriverFile() {

		if (generate == true) {
			UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			FileOutputDriver.FileOutput(UmldrawOutput, outPut);
		}

	}

	public static void DepdedancyViewDriverPNG() {
		if (generate == true) {
			UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			PNGdriver.imageGen(UmldrawOutput, outPut);
		}

	}

	public static void DepdedancyViewDriverSVG() {

		if (generate == true) {
			UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			SVGdriver.SVGdriver(UmldrawOutput, outPut);

		}

	}

	public static void DepdedancyViewDriverFile() {
		if (generate == true) {
			UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			FileOutputDriver.FileOutput(UmldrawOutput, outPut);
		}

	}

	public static void MicroservoceViewPNG() {
		if (generate == true) {
			UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			PNGdriver.imageGen(UmldrawOutput, outPut);
		}

	}

	public static void MicroservoceViewSVG() {
		if (generate == true) {
			UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			SVGdriver.SVGdriver(UmldrawOutput, selectedMicroservice);
		}

	}

	public static void MicroservoceViewFile() {
		if (generate == true) {
			UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			FileOutputDriver.FileOutput(UmldrawOutput, selectedMicroservice);
		}

	}

	public static void MicroDepedancyViewPNG() {

		if (generate == true) {
			UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			PNGdriver.imageGen(UmldrawOutput, selectedMicroservice);
		}

	}

	public static void MicroDepedancyViewSVG() {
		if (generate == true) {
			UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			SVGdriver.SVGdriver(UmldrawOutput, selectedMicroservice);
		}

	}

	public static void MicroDepedancyViewFile() {

		if (generate == true) {
			UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest,selectedMicroservice);
			FileOutputDriver.FileOutput(UmldrawOutput, selectedMicroservice);
		}

	}

	public static void excellSheet() {
		if (generate == true) {
			WriteDataToExcel.CreateFile2();
		} 

	}

	public static void excellSheetMicroLvele() {
		if (generate == true) {
			microserviceWriteToExcell.CreateFile2(microservicesArchitecturesTest, selectedMicroservice);
		}

	}

}
