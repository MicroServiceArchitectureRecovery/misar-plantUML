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

import CounterClass.counterClass;
import MainDriver.main;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;
import MicroserviceObject.PatternComponentstObject;

public class WriteDataToExcel {

	public static void CreateFile2(List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		try {
			String filename = main.buildOutputFilePath(main.getInputModelBaseName() + ".xls");
			HSSFWorkbook workbook = new HSSFWorkbook();

			HSSFSheet sheet = workbook.createSheet("Architecture Metrics");

			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell(0).setCellValue("Architecture Name");
			rowhead.createCell(1).setCellValue("Microservice");
			rowhead.createCell(2).setCellValue("Functional Microservice");
			rowhead.createCell(3).setCellValue("Infrastructure Microservice");
			rowhead.createCell(4).setCellValue("Container");
			rowhead.createCell(5).setCellValue("Infrastructure Pattern Component");
			rowhead.createCell(6).setCellValue("Server Component");
			rowhead.createCell(7).setCellValue("Client Component");
			rowhead.createCell(8).setCellValue("Service Dependency");
			rowhead.createCell(9).setCellValue("Service Interface");
			rowhead.createCell(10).setCellValue("End Point");
			rowhead.createCell(11).setCellValue("Queue Listener");
			rowhead.createCell(12).setCellValue("Service Operation");
			rowhead.createCell(13).setCellValue("Service Message");
			rowhead.createCell(14).setCellValue("Infrastructure Pattern Categories");

			HSSFRow row = sheet.createRow((short) 1);
			row.createCell(0).setCellValue(counterClass.getmicroserviceArtecetcture());
			row.createCell(1).setCellValue(counterClass.getMicroservice());
			row.createCell(2).setCellValue(counterClass.getfunctionalMicroserviceCount());
			row.createCell(3).setCellValue(counterClass.getInfustructureMicroserviceCount());
			row.createCell(4).setCellValue(counterClass.getContainerCount());
			row.createCell(5).setCellValue(counterClass.getInfrastructurePatternComponentCount());
			row.createCell(6).setCellValue(counterClass.getInfrastructureServerComponentCount());
			row.createCell(7).setCellValue(counterClass.getInfrastructureClientComponentCount());
			row.createCell(8).setCellValue(counterClass.getServiceDependancyCount());
			row.createCell(9).setCellValue(counterClass.getInterfaceCount());
			row.createCell(10).setCellValue(counterClass.getEndPointCounter());
			row.createCell(11).setCellValue(counterClass.getQueListnerCount());
			row.createCell(12).setCellValue(counterClass.getServiceOperationCount());
			row.createCell(13).setCellValue(counterClass.getServiceMessageCount());
			row.createCell(14).setCellValue(getArchitecturePatternCategories(microservicesArchitecturesTest));

			HSSFSheet categorySheet = workbook.createSheet("Pattern Categories");
			HSSFRow categoryHeader = categorySheet.createRow((short) 0);
			categoryHeader.createCell(0).setCellValue("Microservice");
			categoryHeader.createCell(1).setCellValue("Infrastructure Pattern Categories");

			int categoryRowIndex = 1;

			for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
				List<List<MicroserviceObject>> microservices = architecture.getMicroservicesArchitectureObject();

				for (List<MicroserviceObject> microserviceGroup : microservices) {
					MicroserviceObject microservice = microserviceGroup.get(0);

					HSSFRow categoryRow = categorySheet.createRow((short) categoryRowIndex);
					categoryRow.createCell(0).setCellValue(microservice.getMicroserviceName());
					categoryRow.createCell(1).setCellValue(getMicroservicePatternCategories(microservice));

					categoryRowIndex++;
				}
			}

			for (int i = 0; i <= 14; i++) {
				sheet.autoSizeColumn(i);
			}

			categorySheet.autoSizeColumn(0);
			categorySheet.autoSizeColumn(1);

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

	private static String getArchitecturePatternCategories(List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		Set<String> categories = new LinkedHashSet<String>();

		for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> microservices = architecture.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> microserviceGroup : microservices) {
				categories.addAll(getMicroservicePatternCategorySet(microserviceGroup.get(0)));
			}
		}

		return joinCategories(categories);
	}

	private static String getMicroservicePatternCategories(MicroserviceObject microservice) {
		return joinCategories(getMicroservicePatternCategorySet(microservice));
	}

	private static Set<String> getMicroservicePatternCategorySet(MicroserviceObject microservice) {
		Set<String> categories = new LinkedHashSet<String>();

		for (PatternComponentstObject component : microservice.getComponents()) {
			categories.add(component.getCategoryLabel());
		}

		return categories;
	}

	private static String joinCategories(Set<String> categories) {
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