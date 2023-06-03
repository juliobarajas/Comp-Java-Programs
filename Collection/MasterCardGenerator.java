import java.util.Scanner;
import java.util.Random;

public class MasterCardGenerator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rng = new Random();

		// Declare Variables. Modified digits keep the original digits from being lost within the loop.
		int amountOfNumbers;
		int firstDigits;
		int digitOne;
		int digitTwo;
		int digitThree;
		int digitFour;
		int digitFive;
		int digitSix;
		int digitSeven;
		int digitEight;
		int digitNine;
		int digitTen;
		int digitEleven;
		int digitTwelve;
		int digitThirteen;
		int digitFourteen;
		int digitFifteen;
		int digitSixteen;
		int sumOfDigits;
		int i;
		int modifiedSeven = 0;
		int modifiedEight = 0;
		int modifiedNine = 0;
		int modifiedTen = 0;
		int modifiedEleven = 0;
		int modifiedTwelve = 0;
		int modifiedThirteen = 0;
		int modifiedFourteen = 0;
		int modifiedFifteen = 0;
		int modifiedSixteen = 0;
		int modifiedDigits = 0;




		// Ask for user input
		System.out.print("How many MasterCard numbers would you like to generate? ");
		amountOfNumbers = scnr.nextInt();
		System.out.println("Here you go, have fun:");

		// Loop that generates random numbers and finds digit sixteen	
		for (i = 0; i < amountOfNumbers; i++ ) {
			firstDigits = rng.nextInt(50000) + 222100; //Generates randomly first 6 digits of masterCard number somewhere between 222100 and 272099
			digitSeven = rng.nextInt(10);              // Generates randomly digits 0-9 for the next 9 digits
			digitEight = rng.nextInt(10);
			digitNine = rng.nextInt(10);
			digitTen = rng.nextInt(10);
			digitEleven = rng.nextInt(10);
			digitTwelve = rng.nextInt(10);
			digitThirteen = rng.nextInt(10);
			digitFourteen = rng.nextInt(10);
			digitFifteen = rng.nextInt(10);

			// Seperate the first six digits generated into seperate variables
			digitSix = firstDigits % 10;
			modifiedDigits = firstDigits / 10;
			digitFive = modifiedDigits % 10;
			modifiedDigits = modifiedDigits / 10;
			digitFour = modifiedDigits % 10;
			modifiedDigits = modifiedDigits / 10;
			digitThree = modifiedDigits % 10;
			modifiedDigits = modifiedDigits / 10;
			digitTwo = modifiedDigits % 10;
			modifiedDigits = modifiedDigits / 10;
			digitOne = modifiedDigits % 10;

			// Double every other digit starting from the right
			modifiedFifteen = digitFifteen * 2;
			modifiedThirteen = digitThirteen * 2;
			modifiedEleven = digitEleven * 2;
			modifiedNine = digitNine * 2;
			modifiedSeven = digitSeven * 2;
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
			if (modifiedSeven > 9) {
				modifiedSeven = modifiedSeven - 9;
			}
			if (modifiedNine > 9) {
				modifiedNine = modifiedNine - 9;
			}
			if (modifiedEleven > 9) {
				modifiedEleven = modifiedEleven - 9;
			}
			if (modifiedThirteen > 9) {
				modifiedThirteen = modifiedThirteen - 9;
			}
			if (modifiedFifteen > 9) {
				modifiedFifteen = modifiedFifteen - 9;
			}

			// Add up the modified Digits then do mod ten. From that answer subtract it from 10 to get the number that will make the credit card number divisible by 10
			sumOfDigits = digitOne + digitTwo + digitThree + digitFour + digitFive + digitSix + modifiedSeven + digitEight + modifiedNine + digitTen + modifiedEleven + digitTwelve + modifiedThirteen + digitFourteen + modifiedFifteen;
			digitSixteen = sumOfDigits % 10;
			
			// In case mod 10 doesn't give an output of zero
			if (digitSixteen != 0) {
				digitSixteen = 10 - digitSixteen ;
			}

			// Combine the original digits with the new found digit sixteen and output
			System.out.println(firstDigits + "" + digitSeven + "" + digitEight + "" + digitNine + "" + digitTen + "" + digitEleven + "" + digitTwelve + "" + digitThirteen + "" + digitFourteen + "" + digitFifteen + "" + digitSixteen);
		}
	}	
}