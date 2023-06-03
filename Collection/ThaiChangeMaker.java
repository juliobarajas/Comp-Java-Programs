import java.util.Scanner;

public class ThaiChangeMaker {
	public static void main(String[] args){ 
	Scanner scnr = new Scanner(System.in);

	int oneThousand; // 1000 baht bills
	int fiveHundred; // 500 baht bills
	int oneHundred; // 100 baht bills
	int fiftyBill;  // 50 baht bills
	int twentyBill; // 20 baht bills
	int tenCoins;   // 10 baht coins
	int fiveCoins; // 5 baht coins
	int twoCoins;  // 2 baht coins 
	int oneCoins;  // 1 baht coins


	System.out.print("Enter number of baht: "); 
	int numOfBaht = scnr.nextInt();

	// start with Long division. Then begin with mod and repeat long division until you get to the last coin amount
	oneThousand = numOfBaht / 1000;
	fiveHundred = numOfBaht % 1000 / 500;
	oneHundred = numOfBaht % 1000 % 500 / 100;
	fiftyBill = numOfBaht % 1000 % 500 %  100 / 50;
	twentyBill = numOfBaht % 1000 % 500 % 100 % 50 / 20;
	tenCoins = numOfBaht % 1000 % 500 % 100 % 50 % 20  / 10;
	fiveCoins = numOfBaht % 1000 % 500 % 100 % 50 % 20 % 10 / 5;
	twoCoins = numOfBaht % 1000 % 500 % 100 % 50 % 20 % 10 % 5 / 2;
	oneCoins = numOfBaht % 1000 % 500 % 100 % 50 % 20 % 10 % 5 % 2 / 1;

	System.out.println("1000 baht bills: " + oneThousand);
	System.out.println("500 baht bills: " + fiveHundred);
	System.out.println("100 baht bills: " + oneHundred);
	System.out.println("50 baht bills: " + fiftyBill);
	System.out.println("20 baht bills: " + twentyBill);
	System.out.println("10 baht coins: " + tenCoins); 
	System.out.println("5 baht coins: " + fiveCoins);
	System.out.println("2 baht coins: " + twoCoins);
	System.out.println("1 baht coins: " + oneCoins);





	 


	}
}
