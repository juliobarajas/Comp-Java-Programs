import java.util.Scanner;

public class TuitionCalculator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare Variables
		int totalHours;
		int sciEngineeringHours;
		int finalTotal;

		// Ask for user input
		System.out.println("How many total hours are you taking?");
		totalHours = scnr.nextInt();
		System.out.println("How many of those hours are from engineering/science classes?");
		sciEngineeringHours = scnr.nextInt();


		System.out.println("Summary of Charges:");
		System.out.println("--------------------");

		// Math
		// If total hours are less than 12 this will execute
		int extraHours = totalHours - 12;
	   if (totalHours <= 12) { 
		System.out.print("($400 per credit hour up to 12) * (" + totalHours); 
		System.out.print(" credit hour(s))");
		finalTotal = 400 * totalHours; 
		System.out.println(" = $" + finalTotal);
	}

		// If total hours are greater than 12 this will execute
	    else  {
	 		System.out.print("($400 per credit hour up to 12) * (12 credit hour(s))"); 
	 		totalHours = 400 * 12;
	 		System.out.println(" = $" + totalHours);
			System.out.print("($60 per credit hour beyond 12) * (" + extraHours); 
			System.out.print(" credit hour(s))");
			extraHours = 60 * extraHours; 
			System.out.println(" = $" + extraHours);
			finalTotal = totalHours + extraHours;
	 	}

	 	// If science / enginnering hours exist this will execute
		 if (sciEngineeringHours > 0) {
		 	System.out.print("($25 per eng./sci. credit hour) * (" + sciEngineeringHours); 
		 	System.out.print(" credit hour(s))");
		 	sciEngineeringHours = 25 * sciEngineeringHours; 
		 	System.out.println(" = $" + sciEngineeringHours);
		 	finalTotal = finalTotal + sciEngineeringHours;
		 }
		
		// Output
		System.out.println("Total = $" + finalTotal);
		





	}
}