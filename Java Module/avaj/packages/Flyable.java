package packages;

public interface Flyable {
	void	updateConditions();
	void	registerTower(WeatherTower weatherTower);
	String	getInformation();
}