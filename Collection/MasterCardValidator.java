import java.util.Scanner;

	public class MasterCardValidator {
		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);


			// Declare Variables 
			long cardNumber;
			long cardDigit = 0;
			long i;
			long digitOne;
			long digitTwo;
			long digitThree;
			long digitFour;
			long digitFive;
			long digitSix;
			long digitSeven;
			long digitEight;
			long digitNine;
			long digitTen;
			long digitEleven;
			long digitTwelve;
			long digitThirteen;
			long digitFourteen;
			long digitFifteen;
			long digitSixteen;

			// Ask for user input
			System.out.print("Enter your 16 digit credit card number: ");
			cardNumber = scnr.nextLong();

			// Seperate the numbers and assign them to variables
			digitSixteen = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitFifteen = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitFourteen = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitThirteen = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitTwelve = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitEleven = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitTen = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitNine = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitEight = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitSeven = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitSix = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitFive = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitFour = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitThree = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitTwo = cardNumber % 10;
			cardNumber = cardNumber / 10;
			digitOne = cardNumber % 10;

			// Double the every other digit starting from the next to last digit
			digitFifteen = digitFifteen * 2;
			digitThirteen = digitThirteen * 2;
			digitEleven = digitEleven * 2;
			digitNine = digitNine * 2;
			digitSeven = digitSeven * 2;
			digitFive = digitFive * 2;
			digitThree = digitThree * 2;
			digitOne = digitOne * 2;

			// Seperate If statements to subtract 9 from doubled values greater than 9
			if (digitOne > 9) {
				digitOne = digitOne - 9;
			}
			if (digitThree > 9) {
				digitThree = digitThree - 9;
			}
			if (digitFive > 9) {
				digitFive = digitFive - 9;
			}
			if (digitSeven > 9) {
				digitSeven = digitSeven - 9;
			}
			if (digitNine > 9) {
				digitNine = digitNine - 9;
			}
			if (digitEleven > 9) {
				digitEleven = digitEleven - 9;
			}
			if (digitThirteen > 9) {
				digitThirteen = digitThirteen - 9;
			}
			if (digitFifteen > 9) {
				digitFifteen = digitFifteen - 9;
			}

			// Add up all digits
			cardNumber = digitOne + digitTwo + digitThree + digitFour + digitFive + digitSix + digitSeven + digitEight + digitNine + digitTen + digitEleven + digitTwelve + digitThirteen + digitFourteen + digitFifteen + digitSixteen;
			// Output if divisible by 10 it is valid
			if (cardNumber % 10 != 0) {
				System.out.println("Invalid MasterCard Number");
			}

			else if (cardNumber % 10 == 0) {
				System.out.println ("Valid MasterCard Number");
			}
			
		}
	}