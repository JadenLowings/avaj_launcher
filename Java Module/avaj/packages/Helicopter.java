// package packages;

// public class Helicopter {
// 	private String	message;
// 	private String	name;

//     //  Set Functions
// 	public void		setName(String nme) {
// 		this.name = nme;
// 	}

//     public void		setMessage(String msg) {
//         this.message = msg;
//     }
//     //  Class Functions
//     public void		updateConditions() {

//         WeatherProvider change = new WeatherProvider();
//         int i;
//         i = change.getn();

//         if (i == 0) {
//             String SunMessage = "It's So hot up here, how's about a little rain.";

//             setMessage(SunMessage);
//         }
//         if (i == 1) {
//             String SnowMessage = "My butt is gonna freeze off up here!";

//             setMessage(SnowMessage);
//         }
//         if (i == 2) {
//             String RainMessage = "Aw Damn, I had to ask for raind didn't I.";

//             setMessage(RainMessage);
//         }
//         if (i == 3) {
//             String FogMessage = "Is it safe to fly when you can't see?";

//             setMessage(FogMessage);
//         }
// 	}
// }

package packages;
import java.util.HashMap;

import packages.*;

public class Helicopter extends Aircraft implements Flyable {

	Helicopter(String name, Coordinates coordinates) {
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

		if (currentWeather.equals("SUN"))
		this.coordinates = new Coordinates(
			coordinates.getHeight() + 4,
			coordinates.getLatitude() + 0,
			coordinates.getLongitude() + 2
		);
		
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