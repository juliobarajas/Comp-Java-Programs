import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare variables
		int n; 
		int changingValue = 1;
		int i;
		long result = 1;
		long resultTwo = 1;

		// User input
		System.out.print("Enter the value of n!: ");
		n = scnr.nextInt();

		i = 1;
		while (i < n) {
			changingValue = n - i;
			result = n * changingValue;
			result = result * changingValue;


			

			i++;

		}
		System.out.println(result);
	}
}