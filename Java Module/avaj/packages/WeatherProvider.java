package packages;

public class		WeatherProvider {
	private static int n;
	private static int a;
	private String[] Weather = new String[]{"Sun", "Snow", "Rain", "Fog"};
	private static WeatherProvider weatherProvider = new WeatherProvider();
	
	// public void		setn(int i) {
	// 	this.n = i;
	// };
	
	// public int		getn() {
	// 	return n;
	// }

	// public void		setWeather() {
	// 	getn();
	// 	if (n == 1) {
	// 		a = 0;
	// 	}
	// 	if (n == 2){
	// 		a = 1;
	// 	}
	// 	if (n == 3) {
	// 		a = 2;
	// 	}
	// 	if (n == 4) {
	// 		a = 3;
	// 	}
	// };
	public String	getCurrentWeather(Coordinates coordinates) {
		int token = coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLongitude();
		return Weather[token % 4];
	}

	public static WeatherProvider getProvider() {
		return WeatherProvider.weatherProvider;
	}
};