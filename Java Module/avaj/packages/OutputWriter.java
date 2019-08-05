package packages;
import java.io.*;
import packages.*;

public class	OutputWriter{
	
	private static	Writer write = null;

	public static void	OutputFile(String Filename) {
		if (OutputWriter.write != null) {
			
			OutputWriter.write.close();
			OutputWriter.write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Filename)));
		}
	}

	public static void	log(String messages) {
		try {
			OutputWriter.write(messages + "\n");
			write.flush();
		}
		catch (IOException Error){
			System.out.println(Error + "Error info.");
			System.exit(1);
		}
	}
}