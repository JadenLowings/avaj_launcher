package avaj.packages;
// import	avaj.packages.*;
import	java.util.*;

public class		Tower {

	private		ArrayList<Flyable> observers = new ArrayList<>();

	//	Class Functions
	public void		register(Flyable flyable) {
		observers.add(flyable);
		OutputWriter.log("Tower says: " + flyable.getInformation() + " registered to Tower.");
	}

	public		void	unregister(Flyable flyable) {
		observers.remove(flyable);
		OutputWriter.log("Tower says: " + flyable.getInformation() + " has unregistered from Tower.");
	}
	
	protected	void	conditionsChanged() {
		for (int a = 0; a < observers.size(); a++)
        {
            observers.get(a).updateConditions();
        }
	}
}