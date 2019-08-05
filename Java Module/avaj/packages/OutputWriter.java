package avaj.packages;
import java.io.*;
// import avaj.packages.*;

public class	OutputWriter{
	
	private static	Writer writer = null;

	public static void	OutputFile(String Filename) throws IOException {
		if (OutputWriter.writer != null) {
			
			OutputWriter.writer.close();
			OutputWriter.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Filename)));
		}
	}

	public static void	log(String messages) {
		try {
			OutputWriter.writer.write(messages + "\n");
			writer.flush();
		}
		catch (IOException Error){
			System.out.println(Error + "Error info.");
			System.exit(1);
		}
	}
}