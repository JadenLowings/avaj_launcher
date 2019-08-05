package avaj.packages;
import java.util.HashMap;

// import avaj.packages.*;

public class JetPlane extends Aircraft implements Flyable {

	JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

    //  Class Functions
	private	WeatherTower weatherTower;
	
	public	void		updateConditions() {
		String currentWeather = weatherTower.getWeather(this.coordinates);

		HashMap<String, String> message = new HashMap<String, String>(){{
			put("SUN", "Nice and sunny today boss.");
			put("FOG", "Nice and sunny today boss.");
			put("RAIN", "Nice and sunny today boss.");
			put("SNOW", "Nice and sunny today boss.");
		}};

		if (currentWeather.equals("SUN")) {
			System.out.println("Stage 3");			
			this.coordinates = new Coordinates(
				coordinates.getHeight() + 4,
				coordinates.getLatitude() + 0,
				coordinates.getLongitude() + 2
			);
		}
		
		else if (currentWeather.equals("FOG"))
			this.coordinates = new Coordinates(
				coordinates.getHeight() - 3,
				coordinates.getLatitude() + 0,
				coordinates.getLongitude() + 0
		);
		else if (currentWeather.equals("RAIN"))
			this.coordinates = new Coordinates(
				coordinates.getHeight() - 5,
				coordinates.getLatitude() + 0,
				coordinates.getLongitude() + 0
		);
		else if (currentWeather.equals("SNOW"))
			this.coordinates = new Coordinates(
				coordinates.getHeight() - 15,
				coordinates.getLatitude() + 0,
				coordinates.getLongitude() + 0
		);
	}
	@Override
	public void registerTower(WeatherTower weatherTower) {

	}
}