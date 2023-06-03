import java.util.Scanner;

public class ISBNChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare Vairables
		long bookISBN;
		long xOne;
		long xTwo;
		long xThree;
		long xFour;
		long xFive;
		long xSix;
		long xSeven;
		long xEight;
		long xNine;
		long xTen;
		long xEleven;
		long xTwelve;
		long xThirteen; 

		// Ask for ISBN number
		System.out.println("Enter 13-digit ISBN:");
		bookISBN = scnr.nextLong();

		// Assign each digit of ISBN Number into an x 
		xThirteen = bookISBN % 10;       // Gives us last digit of ISBN  		
		bookISBN = bookISBN / 10;       // Removes last digit and keeps all numbers before it       
		xTwelve = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xEleven = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xTen = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xNine = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xEight = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xSeven = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xSix = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xFive = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xFour = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xThree = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xTwo = bookISBN % 10; 
		bookISBN = bookISBN / 10;
		xOne = bookISBN % 10; 
		
		// Make sure check digit thirteen is correct. The sum of all digits must be multiple of 10
		bookISBN = (xOne + 3 * xTwo + xThree + 3 * xFour + xFive + 3 * xSix + xSeven + 3 * xEight + xNine + 3 * xTen + xEleven + 3 * xTwelve + xThirteen) % 10;

		// If sum of numbers is multiple of 10 it will equal 0 so number is valid, if not it is invalid
		if(bookISBN == 0) {
			System.out.println("Number is valid!");
		}
		else {
			System.out.println("Number is invalid!");
		}
	}
}