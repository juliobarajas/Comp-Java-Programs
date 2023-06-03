import java.util.Scanner;

public class GovtAgeChecker {
	public static void main(String[] args) {
		Scanner fedParty = new Scanner(System.in);

		int age = 0; 

		while (age >= 0 && age <= 120) { 
		

		// Get user input for age
		System.out.println("How old are you? (enter anything negative or above 120 to exit)");
		age = fedParty.nextInt();

		// End loop if age is less than 0 or greater than 120
		if (age < 0 || age > 120) {
			break;
		}

		System.out.println("You are eligible to serve in these positions:");


		// All three of the if statements below get checked.

		if (age >= 25) {
			System.out.println("House"); 
		}

		if (age >= 30) {
			System.out.println("Senate");
		}

		if (age >= 35) {
			System.out.println("Presidency");
		}
		}
		// Output once the loop is broken
		System.out.println("Bye!");
	}
}
