package outputDrivers;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

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

			HSSFSheet categorySheet = workbook.createSheet("Pattern Categories");

			HSSFRow categoryHeader = categorySheet.createRow((short) 0);
			categoryHeader.createCell(0).setCellValue("Microservice");
			categoryHeader.createCell(1).setCellValue("Component Type");
			categoryHeader.createCell(2).setCellValue("Category");
			categoryHeader.createCell(3).setCellValue("Count");

			int rowIndex = 1;

			for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
				List<List<MicroserviceObject>> microservices = architecture.getMicroservicesArchitectureObject();

				for (List<MicroserviceObject> microserviceGroup : microservices) {
					MicroserviceObject microservice = microserviceGroup.get(0);

					Map<String, Integer> categoryCounts = getPatternCategoryCounts(microservice);

					for (Map.Entry<String, Integer> entry : categoryCounts.entrySet()) {
						String[] parts = entry.getKey().split("\\|", 2);

						HSSFRow categoryRow = categorySheet.createRow((short) rowIndex);
						categoryRow.createCell(0).setCellValue(microservice.getMicroserviceName());
						categoryRow.createCell(1).setCellValue(parts[0]);
						categoryRow.createCell(2).setCellValue(parts[1]);
						categoryRow.createCell(3).setCellValue(entry.getValue());

						rowIndex++;
					}
				}
			}
			
			HSSFSheet summarySheet = workbook.createSheet("Category Summary");

			HSSFRow summaryHeader = summarySheet.createRow((short) 0);
			summaryHeader.createCell(0).setCellValue("Component Type");
			summaryHeader.createCell(1).setCellValue("Category");
			summaryHeader.createCell(2).setCellValue("Total Count");

			Map<String, Integer> totalCategoryCounts = getTotalPatternCategoryCounts(microservicesArchitecturesTest);

			int summaryRowIndex = 1;

			for (Map.Entry<String, Integer> entry : totalCategoryCounts.entrySet()) {
				String[] parts = entry.getKey().split("\\|", 2);

				HSSFRow summaryRow = summarySheet.createRow((short) summaryRowIndex);
				summaryRow.createCell(0).setCellValue(parts[0]);
				summaryRow.createCell(1).setCellValue(parts[1]);
				summaryRow.createCell(2).setCellValue(entry.getValue());

				summaryRowIndex++;
			}

			for (int i = 0; i <= 2; i++) {
				summarySheet.autoSizeColumn(i);
			}

			for (int i = 0; i <= 3; i++) {
				categorySheet.autoSizeColumn(i);
			}

			for (int i = 0; i <= 13; i++) {
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
	
	private static Map<String, Integer> getPatternCategoryCounts(MicroserviceObject microservice) {
		Map<String, Integer> categoryCounts = new LinkedHashMap<String, Integer>();

		for (PatternComponentstObject component : microservice.getComponents()) {
			String componentType = component.getType();
			String category = component.getCategoryLabel();

			String key = componentType + "|" + category;
			Integer count = categoryCounts.get(key);

			if (count == null) {
				categoryCounts.put(key, 1);
			 } else {
				categoryCounts.put(key, count + 1);
			}
		}

		return categoryCounts;
	}
	
	private static Map<String, Integer> getTotalPatternCategoryCounts(
			List<MicroservicesArchitecture> microservicesArchitecturesTest) {
		Map<String, Integer> totalCategoryCounts = new LinkedHashMap<String, Integer>();

		for (MicroservicesArchitecture architecture : microservicesArchitecturesTest) {
			List<List<MicroserviceObject>> microservices = architecture.getMicroservicesArchitectureObject();

			for (List<MicroserviceObject> microserviceGroup : microservices) {
				MicroserviceObject microservice = microserviceGroup.get(0);
				Map<String, Integer> microserviceCategoryCounts = getPatternCategoryCounts(microservice);

				for (Map.Entry<String, Integer> entry : microserviceCategoryCounts.entrySet()) {
					Integer currentCount = totalCategoryCounts.get(entry.getKey());

					if (currentCount == null) {
						totalCategoryCounts.put(entry.getKey(), entry.getValue());
					} else {
						totalCategoryCounts.put(entry.getKey(), currentCount + entry.getValue());
					}
				}
			}
		}

		return totalCategoryCounts;
	}
}