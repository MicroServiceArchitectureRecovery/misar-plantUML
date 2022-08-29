package outputDrivers;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputDriver {


	public static  void FileOutput(String UmldrawOutput) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("C:\\Users\\Anti coding club\\Desktop\\output.txt"));
			writer.append(UmldrawOutput);
			writer.close();

			File fileFind = new File("C:\\Users\\Anti coding club\\Desktop\\output.txt");
			Desktop.getDesktop().open(fileFind);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}