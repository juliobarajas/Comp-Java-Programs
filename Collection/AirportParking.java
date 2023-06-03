import java.util.Scanner;

public class AirportParking {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare variables
		int numMinutes;
		int totalCharge = 0;
		int remainingMinutes; 
		int numDays;

		// Get user input
		System.out.print("Enter the number of minutes parked: ");
		numMinutes = scnr.nextInt();
		numDays = numMinutes / 1440;		
		remainingMinutes = numMinutes % 1440;

		// Start by checking if the user entered a negative value
		if(numMinutes < 0) {
			System.out.println("Error - negative value entered for minutes parked");
		}

		// Charge is free when the minutes parked is less than 30
		else if(numMinutes <= 30) {
			System.out.println("Charge: Free!");
		}
		else if(numMinutes > 30 && numMinutes <= 60) {
			totalCharge = totalCharge + 2; 
			System.out.println("Charge: $" + totalCharge);
		}
		
		// Embedded if statement to add $1 if any minutes are left over
		else if(numMinutes > 60 && numMinutes < 720) {
			if(numMinutes % 30 <= 30 && numMinutes % 30 > 0) {
				totalCharge = 1;
			} 
			numMinutes = numMinutes / 30;
			totalCharge = totalCharge + numMinutes;
			System.out.println("Charge: $" + totalCharge);
		}
		else if(numMinutes >= 720 && numMinutes <= 1440) {
			totalCharge = totalCharge + 24;
			System.out.println("Charge: $" + totalCharge);

		}

		// If no minutes are left over and the 24 hour maximum charge is reached in all days then run this
		else if (numMinutes > 1440 && remainingMinutes > 720 && remainingMinutes <= 1440) {
			totalCharge = (numDays * 24) + 24;
			System.out.println("Charge: $" + totalCharge);
		}

		// If minutes are left over and the car is parked for more than one day, run this
		else if (numMinutes > 1440 && remainingMinutes < 720) {
		numDays = numMinutes / 1440; //15
		totalCharge = numDays * 24; //360
			if(numMinutes % 30 <= 30 && numMinutes % 30 > 0) {
				totalCharge = totalCharge + 1;
			}
		numMinutes = numMinutes % 1440; //879
		numMinutes = numMinutes / 30;
		totalCharge = numMinutes + totalCharge;
		System.out.println("Charge: $" + totalCharge);

		}

	}
}