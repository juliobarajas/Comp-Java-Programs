import java.util.Scanner;

public class MonthlyPayments {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);

	double p; // initial amount of loan
	double monthlyPayment; 
	double r; // monthly interest rate as decimal
	int n; // number of months to make payments
	double interestRate; 
	int numYears;
	double totalPaid;
	double interestPaid;


	System.out.println("Please enter the following information: ");
	System.out.println("Initial amount of loan: ");
	p = scnr.nextDouble();
	System.out.println("Annual interest rate (in %): ");
	interestRate = scnr.nextDouble();
	System.out.println("Number of years: ");
	numYears = scnr.nextInt(); 

	r = interestRate / 100 / 12; 
	n = numYears * 12;
	monthlyPayment = p * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
	totalPaid =  monthlyPayment * n; 
	interestPaid = ((monthlyPayment * n) - p);

	System.out.println("Monthly payment: $" + monthlyPayment);
	System.out.println("Total paid: $" + totalPaid);
	System.out.println("Interest paid: $" + interestPaid);








	}
}
