import java.util.Scanner;
public class Powers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare Variables
		int a;
		int b;
		int i;
		int result = 1;

		// Ask for user input
		System.out.print("Enter integer a: ");
		a = scnr.nextInt();
		System.out.print("\nEnter the power of integer a: ");
		b = scnr.nextInt();

		// i keeps track of result
		i = 1;	
		while (i <= b) {

			result = a * result;
			i++;
		}
		if(b == 0) {		// Anything to the 0 power is 1
				a = 1;
		}

		System.out.println(result);

	}
}
