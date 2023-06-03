import java.util.Scanner;

public class MethodsPractice {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Delcare variables. Same names to avoid confusion.
		double initial;
		double rate;
		double extra;
		int years;
		int yearsToContribute;

		// Get user input to call the method
		System.out.print("Enter initial amount of money: ");
		initial = scnr.nextInt();
		System.out.print("Enter interest rate: ");
		rate = scnr.nextInt();
		System.out.print("Enter extra money you plan to deposit every year: ");
		extra = scnr.nextInt();
		System.out.print("Enter amount of years you plan to save: ");
		years = scnr.nextInt();
		System.out.print("Enter amount of years you plan to deposit extra money: ");
		yearsToContribute = scnr.nextInt();

		// Call the method and output
		System.out.println(retirementBalance(initial, rate, extra, years, yearsToContribute));
	}
	public static void planParty(int f, int c, int p) {			// Problem 1 Method
		// Declare Variables
		int totalCans;
		int totalPacks;

		// Count yourself as well
		f = f + 1;
		
		// Number of people times number of cans per person outputs the total cans needed
		totalCans = f * c;  

		// The total cans divided by the number of cans per pack outputs number of packs needed to be bought
		totalPacks = totalCans / p;

		// Round up if there is a remainder
		if (totalCans % p != 0) {
			totalPacks = totalPacks + 1;
		}

		// Output
		System.out.print(totalPacks);

	}
	public static double retirementBalance (double initial, double rate, double extra, int years, int yearsToContribute) {     // Problem 2 Method
		// Declare variables
		double yearStart;
		double interest;
		double yearEnd = 0;
		int i;

		// Prepare for loop
		yearStart = initial;

		// Loop for the amount of years the user input
		for (i = 1; i <= years; i++) {
			interest = yearStart * rate / 100;
			yearEnd = yearStart + interest;
			
			// If statement in case user inputs amount of years they want to deposit extra money
			if(i <= yearsToContribute) {
				yearEnd = yearEnd + extra;
			}
			// reset and start again
			yearStart = yearEnd;
		 }
		return yearEnd;	
	}
}