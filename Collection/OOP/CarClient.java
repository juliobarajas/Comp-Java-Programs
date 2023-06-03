public class CarClient {
	public static void main(String[] args) {
		// Declare objects
		Car porscheCayman = new Car("Porsche", "Cayman GTS", "black", 80700);
		Car toyotaCorolla = new Car("Toyota", "Corolla", "red", 19500);

		// Display information
		porscheCayman.displayCarInfo();
		toyotaCorolla.displayCarInfo();

		// Paint cars
		porscheCayman.paint("blue"); 
		toyotaCorolla.paint("yellow");
		
		// Cars get stolen
		porscheCayman.travel(7500);
		toyotaCorolla.travel(5000);

		// Change price, lower car value
		porscheCayman.setPrice(72000);
		toyotaCorolla.setPrice(15000);

		// Display information again
		porscheCayman.displayCarInfo();
		toyotaCorolla.displayCarInfo(); 
	}
}