package outputDrivers;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import MainDriver.main;
import MicroserviceObject.counterClass;

import org.apache.poi.hssf.usermodel.HSSFRow;

public class WriteDataToExcel {

	// ensure table is filled with values before attempting to produce an excel file

	// create excel file
	public static void CreateFile2() {

		try {

			// set file's name and location
			String filename = main.getOutputPath() + "\\ExcellMicroData.xls" ;
			HSSFWorkbook workbook = new HSSFWorkbook();

			// create new spreadsheet
			HSSFSheet sheet = workbook.createSheet("FirstSheet");

			// assign headers
			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell(0).setCellValue("Architecture Name");
			rowhead.createCell(1).setCellValue("Microservice");
			rowhead.createCell(2).setCellValue("Functional Microservice");
			rowhead.createCell(3).setCellValue("Infustructure Microservice");
			rowhead.createCell(4).setCellValue("Container");
			rowhead.createCell(5).setCellValue("Infrastructure PatternComponent");
			rowhead.createCell(6).setCellValue("Server Component");
			rowhead.createCell(7).setCellValue("Client Component");
			rowhead.createCell(8).setCellValue("Service Dependancy");
			rowhead.createCell(9).setCellValue("Service Interface");
			rowhead.createCell(10).setCellValue("End Point");
			rowhead.createCell(11).setCellValue("Que Listner");
			rowhead.createCell(12).setCellValue("Service Operation");
			rowhead.createCell(13).setCellValue("Service Message");

			int loop = 1;

			// assign values to each row
			HSSFRow row = sheet.createRow((short) loop);
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

			loop++;

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
