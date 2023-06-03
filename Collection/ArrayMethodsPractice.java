import java.util.Scanner;

public class ArrayMethodsPractice{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numOfElements = 0;

		System.out.println("How many numbers would you like to enter? (must be at least 3): ");
		while (numOfElements < 3) {
			numOfElements = scnr.nextInt();
			if (numOfElements >= 3) {
				break;
			}
			System.out.print("Invalid value, must be at least 3. Please try again: ");
		}
		int[] x = new int[numOfElements];
		for (i = 0; i < x.length; i++) {
			System.out.print("Enter value for index" + i + ": ");
			x[i] = scnr.nextInt();
		} 
		//FIXME: need to call method correctly
		System.out.print("Average excluding two lowest values: ");
		System.out.println(averageWithDrop(x));
	}

	public static int range(int[] x) {		// Method for problem 1
		// Declare Variables. Set each equal to the first value in the array since it is the smallest and largest value when the loop starts.
		Integer.MIN_VALUE = x[0];
		Integer.MAX_VALUE = x[0];

		// Loop replaces largest and smallest values every time they are found
		for (int i = 0; i < x.length; i++) {
			if (x[i] > MAX_VALUE) {
				MAX_VALUE = x[i];
			} 
			if (x[i] < MIN_VALUE) {
				MIN_VALUE = x[i];
			}
		}
		// Return range
		return MAX_VALUE - MIN_VALUE; 
	}

	public static double averageWithDrop(int[] x) {		// Method for problem 2
		int firstSmallest = x[0];
		int secondSmallest = x[1];
		int sum = 0;
		int numLeftInArray = 0;
		double average = 0;

		// Loop searches for the two lowest numbers excluding the first two numbers in the Array since that is what the variables are initizalized with.
		for (int i = 0; i < x.length; i++) {
			if (x[i] < firstSmallest) {
				x[i] = 0;     
			}
			else if (x[i] < secondSmallest) {
				x[i] = 0;
			}
		}
		// If smallest values are still the first 2 values in the array, then those are the smallest values so exclude them from the average. 
		if (firstSmallest == x[0]) {
			x[0] = 0; 
		}
		if (secondSmallest == x[1]) {
			x[1] = 0;
		}
		// This loop adds up all the values, no matter how long the array is.
		for (i = 0; i < x.length; i++) {
			// Everytime this if statement runs numLeftInArray will keep track of how many actual numbers are in the array to divide by.
			if (x[i] > 0) {
			sum = sum + x[i];
			numLeftInArray = numLeftInArray + 1;
			}
		}
		// Divide to get the average excluding the two lowest numbers. The two lowest numbers were converted to 0 so exclude those.
		average = sum / numLeftInArray;
		return average;
	} 
}
