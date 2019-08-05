// package avaj.packages;
// import java.io.*;

// public class FileRead {
// 	private String 		type;
	
// 	AircraftFactory	aircraftFactory = new AircraftFactory();
// 	WeatherTower	weatherTower = new WeatherTower();
	
// 	// // Set Functions
// 	// public void		setAircraft(String ty) {
// 	// 	this.aircraft[0] = ty;
// 	// }

// 	// // Get Functions
// 	// public String	getAircaft(int a) {
// 	// 	return aircraft[a];
// 	// }
// 	public void		read(String[] args) {
// 		try {

// 			BufferedReader reader = new BufferedReader(new FileReader(args[0]));
// 			String line = reader.readLine();
// 			int sim = Integer.parseInt(line.split(" ")[0]);
// 			String[] seperate;
// 			// String a = seperate[0];
// 			while ((line = reader.readLine()) != null){
				
// 				seperate = line.split(" ");
// 				try {
// 					aircraftFactory.newAircraft(
// 									seperate[0],
// 									seperate[1],
// 									Integer.parseInt(seperate[2]),
// 									Integer.parseInt(seperate[3]),
// 									Integer.parseInt(seperate[4])
// 							).registerTower(weatherTower);
// 					}
// 				catch(NumberFormatException nbr) {
// 					System.out.print("File not found");
// 				}
// 			}
// 		}
// 		catch(IOException Error) {
// 			System.out.println("Something is Wrong.");
// 		};
// 	}
// }