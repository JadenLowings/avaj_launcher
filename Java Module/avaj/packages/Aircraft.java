package packages;


public class		Aircraft {

	protected 	long		ID;
	protected 	String		name;
	protected 	Coordinates	coordinates;
	private 	long		idCounter = 0;

	private		long 	nextID() {

		if (idCounter == 0) {
			idCounter = 1;
		}
		else {
			idCounter += 1;
		}
		return idCounter;
	}
	
	protected			Aircraft(String name, Coordinates coordinates) {

		this.ID = this.nextID();
		this.name = name;
		this.coordinates = coordinates;
	}

	public String		getInformation() {
		return this.type + '#' + this.name + '(' + this.ID + ")";
	}
	
}