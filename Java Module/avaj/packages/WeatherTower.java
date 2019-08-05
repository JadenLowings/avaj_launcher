package packages;

public class WeatherTower extends Tower {

	Tower help = new Tower();
	
	public String getWeather(Coordinates coordinates)
	{
		return WeatherProvider.getProvider().getCurrentWeather(coordinates);
	}

	public void changeWeather()
	{
		this.help.conditionsChanged();
	}
}