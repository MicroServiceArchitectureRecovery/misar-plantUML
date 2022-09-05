package MainDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import FileLoad.EMFModelLoad;
import FileLoad.MainDataLoadDriver;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.counterClass;
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

public class main {
	private static MicroserviceObject microserviceObject;
	static List<MicroservicesArchitecture> microservicesArchitecturesTest = new ArrayList<MicroservicesArchitecture>();
	static String umldrawSourcePath = "";
	static String umldrawOutputPath = "";
	static String selectedMicroservice = "";

	static String UmldrawOutput = "";

	public static void setUmldraw(String input) {
		umldrawSourcePath = input;
	}
	public static String getUmldraw() {
		return umldrawSourcePath ;
	}

	public static void setOutpath(String input) {
		umldrawOutputPath = input;
		System.out.print(umldrawOutputPath);
	}
	public static String getOutputPath() {
		return umldrawOutputPath ;
	}
	public static void setMicroservice(String input) {
		selectedMicroservice = input;
		System.out.print(selectedMicroservice);
	}

	public static String getMicroservice() {
		return selectedMicroservice;
	}

	public static void main(String[] args) {
		// Loading the existing model
		EMFModelLoad loader = new EMFModelLoad();

		if (!umldrawSourcePath.equals("")) {
			RootPIM root = loader.load(umldrawSourcePath);
			MicroserviceArchitecture mA = root.getArchitecture();

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

			temp[i] = boxItems.get(i);
			// System.out.println(temp[i]);
		}

		;
		return temp;

	}

	public static void MicroservicesArchitectureViewDriverPNG() throws IOException {
		UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		try {
			PNGdriver.imageGen(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void MicroservicesArchitectureViewDriverSVG() throws IOException {
		UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		try {
			SVGdriver.SVGdriver(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void MicroservicesArchitectureViewDriverFile() {
		UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		FileOutputDriver.FileOutput(UmldrawOutput);
	}

	public static void DepdedancyViewDriverPNG() throws IOException {
		UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		try {
			PNGdriver.imageGen(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void DepdedancyViewDriverSVG() throws IOException {
		UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		try {
			SVGdriver.SVGdriver(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void DepdedancyViewDriverFile() {
		UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

		FileOutputDriver.FileOutput(UmldrawOutput);
	}

	public static void MicroservoceViewPNG() {

		UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest, selectedMicroservice);
		try {
			PNGdriver.imageGen(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void MicroservoceViewSVG() {

		UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest, selectedMicroservice);
		try {
			SVGdriver.SVGdriver(UmldrawOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void MicroservoceViewFile() {

		UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest, selectedMicroservice);
		
	}

	

	public static void excellSheet() {
		UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest, selectedMicroservice);
		FileOutputDriver.FileOutput(UmldrawOutput);
	}

}
