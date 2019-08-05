package packages;
import java.util.*;
import avaj.*;
import packages.*;

// public class Balloon extends Aircraft implements Flyable {

// 	Balloon(String name, Coordinates coordinates) {
// 		super(name, coordinates);
// 	}

//     //  Class Functions
// 	private		WeatherTower weatherTower;

// 	public		void	updateConditions() {
// 		String currentWeather = weatherTower.getWeather(this.coordinates);

// 		HashMap<String, String> message = new HashMap<String, String>(){{
// 			put("SUN", "Nice and sunny today boss.");
// 			put("FOG", "Nice and sunny today boss.");
// 			put("RAIN", "Nice and sunny today boss.");
// 			put("SNOW", "Nice and sunny today boss.");
// 		}};

// 		if (currentWeather.equals("SUN")) {
// 			System.out.println("Stage 3");
// 			this.coordinates = new Coordinates(
// 				coordinates.getHeight() + 4,
// 				coordinates.getLatitude() + 0,
// 				coordinates.getLongitude() + 2
// 				);
// 			}
		
// 		else if (currentWeather.equals("FOG")) {
// 			System.out.println("Stage 3");			
// 			this.coordinates = new Coordinates(
// 				coordinates.getHeight() - 3,
// 				coordinates.getLatitude() + 0,
// 				coordinates.getLongitude() + 0
// 			);
// 		}

// 		else if (currentWeather.equals("RAIN")) {
// 			System.out.println("Stage 3");			
// 			this.coordinates = new Coordinates(
// 				coordinates.getHeight() - 5,
// 				coordinates.getLatitude() + 0,
// 				coordinates.getLongitude() + 0
// 			);
// 		}

// 		else if (currentWeather.equals("SNOW")) {
// 			System.out.println("Stage 3");			
// 			this.coordinates = new Coordinates(
// 				coordinates.getHeight() - 15,
// 				coordinates.getLatitude() + 0,
// 				coordinates.getLongitude() + 0
// 			);
// 		}

// 		Sim.write.println("Baloon#" + this.name + "(" + this.ID + "): " + message.get(currentWeather));
//         if (this.coordinates.getHeight() == 0)
//         {
//             Sim.write.println("Baloon#" + this.name + "(" + this.ID + "): landing.");
// 			this.weatherTower.unregister(this);
//             Sim.write.println("Tower says: Baloon#" + this.name + "(" + this.ID + ")" + " unregistered from weather tower.");
//         }
// 	}
// 	@Override
// 	public void registerTower(WeatherTower weatherTower) {
// 		this.weatherTower = weatherTower;
//         this.weatherTower.register(this);
//         Sim.write.println("Tower says: Baloon#" + this.name + "(" + this.ID + ")" + " registered to weather tower.");
// 	}
// }

public class Baloon extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions()
    {
        String weather = weatherTower.getWeather(this.coordinates);
        HashMap<String, String> messages = new HashMap<String, String>() {{
            put("SUN", "Let's enjoy the good weather and take some pics.");
            put("RAIN", "Damn you rain! You messed up my baloon.");
            put("FOG", "'the fuck ! I am blind!!");
            put("SNOW", "It's snowing. We're gonna crash.");
        }};

        if (weather.equals("SUN"))
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 2,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 4
            );
        else if (weather.equals("RAIN"))
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 5
            );
        else if (weather.equals("FOG"))
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 3
            );
        else if (weather.equals("SNOW"))
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 15
            );

        Sim.write.println("Baloon#" + this.name + "(" + this.ID + "): " + messages.get(weather));
        if (this.coordinates.getHeight() == 0)
        {
            Sim.write.println("Baloon#" + this.name + "(" + this.ID + "): landing.");
            this.weatherTower.unregister(this);
            Sim.write.println("Tower says: Baloon#" + this.name + "(" + this.ID + ")" + " unregistered from weather tower.");
        }
}

    public void registerTower(WeatherTower weatherTower)
    {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        Sim.write.println("Tower says: Baloon#" + this.name + "(" + this.ID + ")" + " registered to weather tower.");
    }
}