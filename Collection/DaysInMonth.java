import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare Variables
		int monthNum;
		int yearNum;

		// Ask for user input
		System.out.print("Enter month (1-12):");
		monthNum = scnr.nextInt();
		System.out.print("\nEnter year (1000-3000):");
		yearNum = scnr.nextInt();

		// If any of these are true then the month or year is out of bounds
		if (yearNum < 1000 || yearNum > 3000 || monthNum < 1 || monthNum > 12) {
			System.out.println("Error - month and/or year out of bounds.");
		}

		 // These else if statements determine whether or not February is a leap year
		else if (yearNum % 400 == 0 && monthNum == 2) {
			System.out.println(monthNum + "/" + yearNum + " contains 29 days.");
		}
		else if (yearNum % 100 == 0 && monthNum == 2) {
			System.out.println(monthNum + "/" + yearNum + " contains 28 days.");
		}
		else if (yearNum % 4 == 0 && monthNum == 2) {
			System.out.println(monthNum + "/" + yearNum + " contains 29 days.");
		}
		
		// If neither statements above are true then output regular month and day for that year
		else if(monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
			System.out.println(monthNum + "/" + yearNum + " contains 30 days.");
		}
		else {
			System.out.println(monthNum + "/" + yearNum + " contains 31 days.");

		}

	}
}