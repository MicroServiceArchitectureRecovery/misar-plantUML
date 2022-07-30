import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import net.sourceforge.plantuml.SourceStringReader;

public class PNGdriver {

	public static void imageGen(String source) throws IOException {
		OutputStream png = new FileOutputStream("C:\\Users\\Anti coding club\\Desktop\\output.png");

		SourceStringReader reader = new SourceStringReader(source);
		// Write the first image to "png"
		String desc = reader.outputImage(png).getDescription();
		// Return a null string if no generation
		File file = new File("C:\\Users\\Anti coding club\\Desktop\\output.png");
		Desktop.getDesktop().open(file);
	}

}
