package outputDrivers;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import MainDriver.main;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.PatternComponentstObject;

public class microserviceWriteToExcell {

	public microserviceWriteToExcell() {
	}

	public static void CreateFile2(List<MicroservicesArchitecture> microservicesArchitecturesTest,
			String selectedMicroservice) {
		try {
			String filename = main.buildOutputFilePath(
					main.getInputModelBaseName() + "-" + selectedMicroservice + ".xls"
			);

			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Microservice Metrics");

			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell(0).setCellValue("Pattern Components");
			rowhead.createCell(1).setCellValue("Infrastructure Server Components");
			rowhead.createCell(2).setCellValue("Infrastructure Client Component");
			rowhead.createCell(3).setCellValue("Service Interface");
			rowhead.createCell(4).setCellValue("End Point");
			rowhead.createCell(5).setCellValue("Queue Listeners");
			rowhead.createCell(6).setCellValue("Message");
			rowhead.createCell(7).setCellValue("Service Dependency");
			rowhead.createCell(8).setCellValue("Service Operations");
			rowhead.createCell(9).setCellValue("Infrastructure Pattern Categories");

			int loop = 1;

			for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
				List<List<MicroserviceObject>> microserviceObject = architecture.getMicroservicesArchitectureObject();

				for (List<MicroserviceObject> microserviceGroup : microserviceObject) {
					MicroserviceObject microservice = microserviceGroup.get(0);

					if (microservice.getMicroserviceName().equals(selectedMicroservice)) {
						HSSFRow row = sheet.createRow((short) loop);
						row.createCell(0).setCellValue(microservice.getPatternComponentstObjectCounter());
						row.createCell(1).setCellValue(microservice.getInfrastructureServerCOmponentsCounter());
						row.createCell(2).setCellValue(microservice.getInfrastructureCLientComponentCounter());
						row.createCell(3).setCellValue(microservice.getserviceInterfaceCounter());
						row.createCell(4).setCellValue(microservice.getEndPointCounter());
						row.createCell(5).setCellValue(microservice.getQueuelistenersCounter());
						row.createCell(6).setCellValue(microservice.getMessageCounter());
						row.createCell(7).setCellValue(microservice.getDependenciesCounter());
						row.createCell(8).setCellValue(microservice.getServiceOpertionCounter());
						row.createCell(9).setCellValue(getMicroservicePatternCategories(microservice));

						loop++;
					}
				}
			}

			for (int i = 0; i <= 9; i++) {
				sheet.autoSizeColumn(i);
			}

			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();

			System.out.println("Your excel file has been generated!");

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(new File(filename));
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	private static String getMicroservicePatternCategories(MicroserviceObject microservice) {
		Set<String> categories = new LinkedHashSet<String>();

		for (PatternComponentstObject component : microservice.getComponents()) {
			categories.add(component.getCategoryLabel());
		}

		if (categories.isEmpty()) {
			return "None";
		}

		StringBuilder result = new StringBuilder();

		for (String category : categories) {
			if (result.length() > 0) {
				result.append(", ");
			}

			result.append(category);
		}

		return result.toString();
	}
}