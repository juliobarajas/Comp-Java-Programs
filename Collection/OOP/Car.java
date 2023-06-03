public class Car {
	// Declare private variables
	private String carMake;
	private String carModel;
	private String carColor;
	private double carPrice;
	private double carMileage;

	// Constructor with no paramaters
	public Car() {
		carMileage = 0;
		carMake = "None";
		carColor = "None";
		carModel = "None";
		carPrice = 0.00;
	}

	// Constructor with parameters
	public Car(String carMake, String carModel, String carColor, double carPrice) {
		carMileage = 0;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carPrice = carPrice;
	}

	// Methods
	public void setPrice(double p) {
		carPrice = p;
	}
	public void paint(String c) {
		carColor = c;
	}
	public void displayCarInfo() {
		System.out.println("Car Make: " + carMake);
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Color: " + carColor);
		System.out.println("Car Mileage: " + carMileage);
		System.out.println("Car Price: $" + carPrice);
		System.out.println("");
	}
	public void travel(double distance) {
		System.out.println("The " + carModel + " is traveling " + distance +  " miles");
		carMileage += distance;
	}
}