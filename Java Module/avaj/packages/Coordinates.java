package avaj.packages;

public class	Coordinates {
	
	private int	longitude;
	private int latitude;
	private int height;

	// Get Functions
	public	int getLongitude() {
		return this.longitude;
	};

	public	int getLatitude() {
		return this.latitude;
	};

	public	int getHeight() {
		return this.height;
	};

	// // Set Functions
	// public	void setLongitude(int n) {
	// 	this.longitude = n;
	// }

	// public	void setLatitude(int n) {
	// 	this.latitude = n;
	// }

	// public	void setHeight(int n) {
	// 	this.height = n;
	// }

	public Coordinates (int latitude, int longitude, int height) {
		
		if (longitude < 0) {
			longitude = 0;
		}
		else if (latitude < 0) {
			latitude = 0;
		}
		else if (height < 0) {
			height = 0;
		}
		else if (height > 100) {
			height = 100;
		}
		
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}
}