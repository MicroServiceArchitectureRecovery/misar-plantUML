package outputDrivers;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import MainDriver.main;
import net.sourceforge.plantuml.SourceStringReader;

public class PNGdriver {

	public static void imageGen(String source , String output) {

		try {
			OutputStream png = new FileOutputStream(main.getOutputPath() + "\\"+output+".png");

			SourceStringReader reader = new SourceStringReader(source);
			// Write the first image to "png"
			String desc = reader.outputImage(png).getDescription();
			// Return a null string if no generation
			File file = new File(main.getOutputPath() + "\\"+output+".png");
			Desktop.getDesktop().open(file);
		} catch (Exception e) {

		}
	}

}
