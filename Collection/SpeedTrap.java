import java.util.Scanner;

public class SpeedTrap {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare Varaibales
		int numOfSloths = 0;
		int slothSpeed = 0;
		int speedLimit = 0;
		int infractions = 0;
		int misdemeanors = 0;
		int felonies = 0;
		int goodSloths = 0;
		int infractionRevenue = 0;
		int misdemeanorRevenue = 0;
		int felonyRevenue = 0;
		int totalRevenue = 0;

		System.out.print("How many sloths to enter data for?: ");
		while (numOfSloths <= 0) {
			numOfSloths = scnr.nextInt();
			if (numOfSloths <= 0) {
				System.out.print("Must enter at least 1 sloth. Try again: ");
			}
		}
		// While loops check for errors, for loop asks for user input for each sloth entered above.
		for (int i = 1; i <= numOfSloths; i++) {
			System.out.println("Sloth " + i + ":");
			System.out.print("Sloth's speed: "); 
			slothSpeed = scnr.nextInt();
			while (slothSpeed <= 0) {
				System.out.print("Sloth's speed must be positive. Try again: ");
				slothSpeed = scnr.nextInt();
			}
			System.out.print("Speed limit in sloth's area: ");
			speedLimit = scnr.nextInt();
			while (speedLimit <= 0) {
				System.out.print("Speed limit must be positive try again. Try again: ");
				speedLimit = scnr.nextInt();
			}
			System.out.println("");	
			// Calulate and keep track of revenue and charges
			if (slothSpeed - speedLimit <= 2 && slothSpeed - speedLimit > 0) {
				infractions ++;
				infractionRevenue += 10;
			}
			else if (slothSpeed - speedLimit >= 2 && slothSpeed - speedLimit < 5) {
				misdemeanors ++;
				misdemeanorRevenue += 20;
			}
			else if (slothSpeed - speedLimit >= 5) {
				felonies ++;
				felonyRevenue += 50;
			}
			else {
				goodSloths++;
			}
		}
		// Calculate total revenue and display
		System.out.println("Law-abiding Sloths: " + goodSloths + "(revenue = $0)");
		System.out.println("Infractions:  \t" +  infractions + "(revenue = $" + infractionRevenue + ")");
		System.out.println("Misdemeanors:  \t" + misdemeanors + "(revenue = $" + misdemeanorRevenue + ")");
		System.out.println("Felonies:  \t" + felonies + "(revenue = $" + felonyRevenue + ")");

		totalRevenue = infractionRevenue + misdemeanorRevenue + felonyRevenue;
		System.out.println("TOTAL ticket revenue = $" + totalRevenue);

	}
}