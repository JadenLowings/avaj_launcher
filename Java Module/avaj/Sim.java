package avaj;
import java.io.*;
import java.util.*;
import avaj.packages.*;


public class		Sim {

	public static	PrintWriter			write;
	public static	Tower				tower = new Tower();
	public static	WeatherTower		weatherTower = new WeatherTower();
	public static	AircraftFactory		aircraftFactory = new AircraftFactory();
	public			WeatherProvider 	weatherProvider = WeatherProvider.getProvider();
	public static 	int 				cycles = 25;

	public static void	main(String[] args){
		
		// int lineNum = 1;
		String fname = args[0];
		// File simOutputFile = new File("simulation.txt");

		if (args.length <= 0) {
			System.out.println("No File Selected");
		}
		else {
			System.out.println("File name: " + args[0]);
		}
		
        try {
			OutputWriter.OutputFile("simulation.txt");
		}
		catch (IOException ErrorMsg){
			System.out.println("Error: " + ErrorMsg);
			return;
		}
		ArrayList<Flyable> flyables = new ArrayList<>();

		try {
			FileReader			stream = new FileReader(fname);
			BufferedReader 		reader = new BufferedReader(stream);
			String 				line = reader.readLine();
			String				WhileLine;
			String[] 			seperate;
			int					sim_Count = 0;
			
			try {
				sim_Count = Integer.parseInt(line);
			}
			catch(NumberFormatException NumberError){
				System.out.println("Sim Count error: " + NumberError);
			}

			while ((WhileLine = reader.readLine()) != null){

				seperate = WhileLine.split(" ");
				try {
					flyables.add(aircraftFactory.newAircraft(seperate[0], seperate[1],
					Integer.parseInt(seperate[2]),
					Integer.parseInt(seperate[3]),
					Integer.parseInt(seperate[4])));
				}
				catch(NumberFormatException nbr) {
					System.out.print("Error, line: " + WhileLine);
					return;
				}
			}
			for (Flyable flyable : flyables){
				flyable.registerTower(weatherTower);
			}
			for (int i = 0; i < sim_Count; i++) {
				weatherTower.changeWeather();
			}
			reader.close();
		}
		catch(IOException ErrorMain){
			System.out.println("Error: " + ErrorMain);
		}
	}
}