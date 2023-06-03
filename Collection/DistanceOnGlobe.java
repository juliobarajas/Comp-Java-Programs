import java.util.Scanner;

public class DistanceOnGlobe {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double d; 						//Disance
		double r = 3958.8;				//Mean radius of earth
		double a;
		double earthLat;				//Starting point
		double earthLong;				//Starting point
		double earthLatTwo; 			//Ending point
		double earthLongTwo;			//Ending point

		// Ask for user input
		System.out.println("Enter lat/long of starting point (in degrees): ");
		System.out.println("Latitude: ");
		earthLat = scnr.nextDouble();
		System.out.println("Longitude: ");
		earthLong = scnr.nextDouble();
		System.out.println("Enter lat/long of ending point (in degrees): ");
		System.out.println("Latitude: ");
		earthLatTwo = scnr.nextDouble();
		System.out.println("Longitude: ");
		earthLongTwo = scnr.nextDouble();
		
		// Convert from degrees to radians
		earthLat = 	Math.toRadians(earthLat);			//earthLat * Math.PI / 180 
		earthLatTwo = Math.toRadians(earthLatTwo); 							
		earthLong = Math.toRadians(earthLong); 							
		earthLongTwo = Math.toRadians(earthLongTwo);							

		// Plug variables into equation to get variable "a" and then distance (variable  d)
		a = Math.pow(Math.sin((earthLatTwo - earthLat) / 2), 2) + Math.cos(earthLat) * Math.cos(earthLatTwo) * Math.pow(Math.sin((earthLongTwo - earthLong) / 2), 2);
		d = (2 * r) * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		// Output
		System.out.print("Distance is " + d);
		System.out.println(" mi.");



	}
} 
	