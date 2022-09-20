package outputDrivers;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import CounterClass.counterClass;
import MainDriver.main;
import MicroserviceObject.MicroserviceObject;
import MicroserviceObject.MicroservicesArchitecture;

public class microserviceWriteToExcell {

	public microserviceWriteToExcell() {
		// TODO Auto-generated constructor stub
	}
	public static void CreateFile2(List<MicroservicesArchitecture> microservicesArchitecturesTest, String selectedMicroservice) {

		try {

			// set file's name and location
			String filename = main.getOutputPath() + "\\ExcellMicroData.xls" ;
			HSSFWorkbook workbook = new HSSFWorkbook();

			// create new spreadsheet
			HSSFSheet sheet = workbook.createSheet("FirstSheet");

			// assign headers
			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell(0).setCellValue("Pattern Components");
			rowhead.createCell(1).setCellValue("Infrastructure Server COmponents");
			rowhead.createCell(2).setCellValue("Infrastructure CLient Component");
			rowhead.createCell(3).setCellValue("Service Interface");
			rowhead.createCell(4).setCellValue("End Point");
			rowhead.createCell(5).setCellValue("Queue listeners");
			rowhead.createCell(6).setCellValue("Message");
			rowhead.createCell(7).setCellValue("Service Depedency");
			rowhead.createCell(8).setCellValue("Service Operations");
	
			int loop = 1;

			for (MicroservicesArchitecture name : microservicesArchitecturesTest) {
				List<List<MicroserviceObject>> microserviceObject = name.getMicroservicesArchitectureObject();
				int counter = 1;

				for (List<MicroserviceObject> microservice : microserviceObject) {
					if (microservice.get(0).getMicroserviceName().equals(selectedMicroservice)){
					
					
					HSSFRow row = sheet.createRow((short) loop);
					row.createCell(0).setCellValue(microservice.get(0).getPatternComponentstObjectCounter());
					row.createCell(1).setCellValue(microservice.get(0).getInfrastructureServerCOmponentsCounter());
					row.createCell(2).setCellValue(microservice.get(0).getInfrastructureCLientComponentCounter());
					row.createCell(3).setCellValue(microservice.get(0).getserviceInterfaceCounter());
					row.createCell(4).setCellValue(microservice.get(0).getEndPointCounter());
					row.createCell(5).setCellValue(microservice.get(0).getQueuelistenersCounter());
					row.createCell(6).setCellValue(microservice.get(0).getMessageCounter());
					row.createCell(7).setCellValue(microservice.get(0).getDependenciesCounter());
					row.createCell(8).setCellValue(microservice.get(0).getServiceOpertionCounter());

					loop++;
					}

				}
			}
			
			// assign values to each row
	

			// loop through table fo metrics

			// output the stream and close the workbook
			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
			System.out.println("Your excel file has been generated!");
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + filename);

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
