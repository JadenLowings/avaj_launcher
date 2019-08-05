package avaj.packages;
// import avaj.packages.*;

public class AircraftFactory {

	public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
		
		WeatherTower 	weatherTower = new WeatherTower();
		Coordinates coordinates = new Coordinates(latitude, longitude, height);

		if (type.toLowerCase().equals("baloon")) {
			System.out.println("hey i am a Balloon");
			
			System.out.println(weatherTower.getWeather(coordinates));
			
			System.out.println("Stage two");
			return new Baloon(name, coordinates);
		}
		
		else if (type.toLowerCase().equals("jetplane")) {
			System.out.println("hey i am a Jetplane");
			System.out.println(weatherTower.getWeather(coordinates));

			System.out.println("Stage two");

			return new JetPlane(name, coordinates);
		}

		else if (type.toLowerCase().equals("helicopter")) {
			System.out.println("hey i am a Helicopter");
			System.out.println(weatherTower.getWeather(coordinates));

			System.out.println("Stage two");

			return new Helicopter(name, coordinates);
		}

		return null;
	}
}