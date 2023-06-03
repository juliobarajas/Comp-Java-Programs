import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare Variables
		int n;
		int f;
		int d;

		// User input
		System.out.print("Enter an integer: ");
		n = scnr.nextInt();
		d = n;  //Save the original value of n to d so the last if statement can be identified.
		
		// Find prime factors until f = n
		for (f = 2; f <= n; f++) { 
			if (n % f == 0) {
				System.out.println(f); 
				n = n / f;
				// Embedded loop keeps going as long as the remainder of n % f is equal to 0
				while (n % f == 0) {
					System.out.println(f);
					n = n / f;
				}
				
			}

		}
	}	
}