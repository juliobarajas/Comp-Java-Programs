import java.util.Scanner;
	
	public class Collatz {
		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);

			// Declare Variables
			int n;
			int i; 
			int result = 0;

			// Ask for userInput
			System.out.print("Enter starting value (must be a positive integer):");
			n = scnr.nextInt();

			// Loop until n is equal to 1
			for (i = 1; n >= 1; i++) { 
				System.out.println(n);
				
				// Break loop once n is equal to 1 to keep it from repeating for infinity
				if (n == 1) {
					break;
				}
				// Otherwise keep going
				else if (n % 2 == 0 ) { 
					n = n / 2;
				}
				else if (n % 2 != 0) {
					n = (3 * n) + 1;
				}
			}
			
			// Output
			System.out.print("Number of terms: " + i);

		}
	}