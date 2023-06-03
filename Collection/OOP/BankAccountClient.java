public class BankAccountClient {
	public static void main(String[] args) {
		// Declare objects
		BankAccount poorCollegeStudent = new BankAccount("Poor College Student");
		BankAccount scroogeMcDuck = new BankAccount("Scrooge McDuck", 50000.00, false, 1.85); 

		// Call setters
		poorCollegeStudent.deposit(500);
		scroogeMcDuck.withdraw(8000);
		poorCollegeStudent.setInterestRate(1.60);
		scroogeMcDuck.setInterestRate(1.60);

		// Make payment
		poorCollegeStudent.payInterest();
		scroogeMcDuck.payInterest();

	}
}