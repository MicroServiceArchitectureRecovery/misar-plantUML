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

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import CounterClass.counterClass;

public class main {
	private static MicroserviceObject microserviceObject;
	static List<MicroservicesArchitecture> microservicesArchitecturesTest = new ArrayList<MicroservicesArchitecture>();
	static String outPut = "";
	static String umldrawSourcePath = "";
	static String umldrawOutputPath = getDefaultOutputPath();
	static String selectedMicroservice = "";
	static String UmldrawOutput = "";
	private static boolean generate = false;
	
	private static String getDefaultOutputPath() {
	    Path documentsPath = Paths.get(System.getProperty("user.home"), "Documents");

	    if (Files.isDirectory(documentsPath)) {
	        return documentsPath.toString();
	    }

	    return System.getProperty("user.home");
	}
	
	public static String buildOutputFilePath(String fileName) {
	    return Paths.get(umldrawOutputPath, fileName).toString();
	}

	public static void setUmldraw(String input) {
		umldrawSourcePath = input;
	}

	public static String getUmldraw() {
		return umldrawSourcePath;
	}

	public static void setOutpath(String input) {
		if (input != null && !input.trim().isEmpty()) {
	        umldrawOutputPath = input;
	    }

	    System.out.println(umldrawOutputPath);
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
			
			microservicesArchitecturesTest.clear();
			counterClass.resetCounters(); // reset the counting upon introduction of a new PIM
			
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
			PNGdriver.imageGen(UmldrawOutput, buildDiagramName(outPut, "architecture-view"));
		}
	}

	public static void MicroservicesArchitectureViewDriverSVG() {

		if (generate == true) {
			
			UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);
			SVGdriver.SVGdriver(UmldrawOutput, buildDiagramName(outPut, "architecture-view"));
		}

	}

	public static void MicroservicesArchitectureViewDriverFile() {

		if (generate == true) {
			UmldrawOutput = ArchitectureViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			FileOutputDriver.FileOutput(UmldrawOutput, buildDiagramName(outPut, "architecture-view"));
		}

	}

	public static void DepdedancyViewDriverPNG() {
		if (generate == true) {
			UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			PNGdriver.imageGen(UmldrawOutput, buildDiagramName(outPut, "dependency-view"));
		}

	}

	public static void DepdedancyViewDriverSVG() {

		if (generate == true) {
			UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			SVGdriver.SVGdriver(UmldrawOutput, buildDiagramName(outPut, "dependency-view"));

		}

	}

	public static void DepdedancyViewDriverFile() {
		if (generate == true) {
			UmldrawOutput = DepdedancyViewDriver.MicroserviceViewDriver(microservicesArchitecturesTest);

			FileOutputDriver.FileOutput(UmldrawOutput, buildDiagramName(outPut, "dependency-view"));
		}

	}

	public static void MicroservoceViewPNG() {
		if (generate == true) {
			UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			PNGdriver.imageGen(UmldrawOutput, buildDiagramName(selectedMicroservice, "micro-dependency-view"));
		}

	}

	public static void MicroservoceViewSVG() {
		if (generate == true) {
			UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			SVGdriver.SVGdriver(UmldrawOutput, buildDiagramName(selectedMicroservice, "micro-dependency-view"));
		}

	}

	public static void MicroservoceViewFile() {
		if (generate == true) {
			UmldrawOutput = MicroserviceView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			FileOutputDriver.FileOutput(UmldrawOutput, buildDiagramName(selectedMicroservice, "micro-dependency-view"));
		}

	}

	public static void MicroDepedancyViewPNG() {

		if (generate == true) {
			UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			PNGdriver.imageGen(UmldrawOutput, buildDiagramName(selectedMicroservice, "micro-dependency-view"));
		}

	}

	public static void MicroDepedancyViewSVG() {
		if (generate == true) {
			UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest,
					selectedMicroservice);

			SVGdriver.SVGdriver(UmldrawOutput, buildDiagramName(selectedMicroservice, "micro-dependency-view"));
		}

	}

	public static void MicroDepedancyViewFile() {

		if (generate == true) {
			UmldrawOutput = MicroDepedancyView.MicroserviceViewDriver(microservicesArchitecturesTest,selectedMicroservice);
			FileOutputDriver.FileOutput(UmldrawOutput, buildDiagramName(selectedMicroservice, "micro-dependency-view"));
		}

	}

	public static void excellSheet() {
		if (generate == true) {
			WriteDataToExcel.CreateFile2(microservicesArchitecturesTest);
		}
	}

	public static void excellSheetMicroLvele() {
		if (generate == true) {
			microserviceWriteToExcell.CreateFile2(microservicesArchitecturesTest, selectedMicroservice);
		}

	}
	
	public static String getInputModelBaseName() {
	    if (umldrawSourcePath == null || umldrawSourcePath.trim().isEmpty()) {
	        return "MiSAR-Model";
	    }

	    Path inputPath = Paths.get(umldrawSourcePath);
	    String fileName = inputPath.getFileName().toString();

	    int dotIndex = fileName.lastIndexOf(".");
	    if (dotIndex > 0) {
	        fileName = fileName.substring(0, dotIndex);
	    }

	    return sanitiseFileName(fileName);
	}

	private static String sanitiseFileName(String fileName) {
	    return fileName.replaceAll("[\\\\/:*?\"<>|]", "_");
	}
	
	private static String buildDiagramName(String baseName, String viewName) {
		String safeBaseName = baseName == null || baseName.trim().isEmpty() ? "misar-model" : baseName.trim();
		String safeViewName = viewName == null || viewName.trim().isEmpty() ? "diagram" : viewName.trim();

		return safeBaseName + "-" + safeViewName;
	}

}
