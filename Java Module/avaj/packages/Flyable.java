package avaj.packages;
import avaj.packages.WeatherTower;

public interface Flyable {
	void	updateConditions();
	void	registerTower(WeatherTower weatherTower);
	String	getInformation();
}