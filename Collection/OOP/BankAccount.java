/*
This class represents a bank account.
*/

public class BankAccount {
	private String owner;				// Name of the owner of this account
	private double balance;				// How much money is in the account
	private boolean isChecking;			// true if this is a checking account, false if it's a savings account
	private double interestRate;		// Annual interest rate, expressed as a percentage

	// Getter methods
	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public boolean getIsChecking() {
		return isChecking;
	}

	public double getInterestRate() {
		return interestRate;
	}

	// Setter for interestRate.  Note that there are
	//  no setters for the other instance variables!
	//  The owner name and account type are set at
	//  account creation and can't be changed later.
	//  And the balance is modified via the deposit
	//  and withdraw methods below, rather than a setter.
	public void setInterestRate(double newRate) {
		interestRate = newRate;
		System.out.format("Changed interest rate on %s's account to %.3f%%\n", owner, interestRate);
	}

	// Default constructor
	public BankAccount(String owner) {
		this(owner, 0.0, true, 0.0);
	}

	// Constructor that allows setting values for instance variables
	public BankAccount(String owner, double initialDeposit, boolean isChecking, double interestRate) {
		String accountType = "savings";
		if (isChecking) {
			accountType = "checking";
		}
		// This constructor's parameters share the same names as BankAccount's instance variables.
		// To distinguish the parameters from the instance variables, we put this. in front of
		//  the instance variable names.
		this.owner = owner;
		this.balance = initialDeposit;
		this.isChecking = isChecking;
		setInterestRate(interestRate);

		System.out.format("Created a new %s account for %s with an initial deposit of $%.2f and interest rate of %.3f%%.\n", accountType, owner, initialDeposit, interestRate);

		// For an initial deposit of $25000 or more, the bank pays a bonus $200 to the account
		if (initialDeposit >= 25000) {
			balance += 200;
			System.out.format("Initial deposit of $%.2f has earned a bonus of $200!\n", initialDeposit);
		}
	}

	// Deposits the specified amount into the account
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Can't deposit negative amount.  No changes to account made.");
		}
		else {
			balance += amount;
			System.out.format("Deposited $%.2f into %s's account, new balance is $%.2f\n", amount, owner, balance);
		}
	}

	// Withdraws the specified amount from the account
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Can't withdraw negative amount.  No changes to account made.");
		}
		else if (amount > balance) {
			System.out.println("Insufficient funds.  No changes to account made.");
		}
		else {
			balance -= amount;
			System.out.format("Withdrew $%.2f from %s's account, new balance is $%.2f\n", amount, owner, balance);
		}
	}

	// Makes one annual interest payment to the account, based on
	//  the current balance and interestRate
	public void payInterest() {
		double interest = interestRate/100*balance;
		balance += interest;
		System.out.format("Made interest payment of $%.2f to %s's account, new balance is $%.2f\n", interest, owner, balance);
	}
}
