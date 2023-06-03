import java.util.Scanner;

public class NumberPronunciations {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n = 0;
	
		while (n >= 0) {
			System.out.print("Enter an integer to pronounce (any negative value to exit): ");
			n = scnr.nextInt();
			if (n < 0) {
				break;
			}
			System.out.println(numToStr(n));
		}

		System.out.println("Goodbye!");
	}
	
	public static String oneDigitToStr(int n) { // Problem 1 method
		// Declare return value
		String number = "";

		// Separate if statement for each number
		if (n == 0) {
			number = "zero ";
		}
		else if (n == 1) {
			number = "one ";
		}
		else if (n == 2) {
			number = "two ";
		}
		else if (n == 3) {
			number = "three ";
		}
		else if (n == 4) {
			number = "four ";
		}
		else if (n == 5) {
			number = "five ";
		}
		else if (n == 6) {
			number = "six ";
		}
		else if (n == 7) {
			number = "seven ";
		}
		else if (n == 8) {
			number = "eight ";
		}
		else if (n == 9) {
			number = "nine ";
		}
		return number;
	}
	
	public static String twoDigitToStr(int n) { 	// Problem 2 method
		
		// Declare variables
		int firstNumber = 0;
		int secondNumber = 0;
		String firstWord = "";
		String secondWord = "";
		
		if (n >= 0 && n <= 9) {
			firstWord = oneDigitToStr(n);
		}

		// Get single word numbers out of the way
		else if (n == 10) {
			firstWord = "ten ";
		}
		else if (n == 11) {
			firstWord = "eleven ";
		}
		else if (n == 12) {
			firstWord = "twelve ";
		}
		else if (n == 13) {
			firstWord = "thirteen ";
		}
		else if (n == 14) {
			firstWord = "fourteen ";
		}
		else if (n == 15) {
			firstWord = "fifteen ";
		}
		else if (n == 16) {
			firstWord = "sixteen ";
		}
		else if (n == 17) {
			firstWord = "seventeen ";
		}
		else if (n == 18) {
			firstWord = "eighteen ";
		}
		else if (n == 19) {
			firstWord = "nineteen ";
		}
		else {
		// If none of above options, separate the numbers
		secondNumber = n % 10;
		firstNumber = n / 10;
		

			if (firstNumber == 2) {
				firstWord = "twenty ";
			}
			else if (firstNumber == 3) {
				firstWord = "thirty ";
			}
			else if (firstNumber == 4) {
				firstWord = "forty ";
			}
			else if (firstNumber == 5) {
				firstWord = "fifty ";
			}
			else if (firstNumber == 6) {
				firstWord = "sixty ";
			}
			else if (firstNumber == 7) {
				firstWord = "seventy ";
			}
			else if (firstNumber == 8) {
				firstWord = "eighty ";
			}
			else if (firstNumber == 9) {
				firstWord = "ninety ";
			}
		}	
		// Get the second number 
		if (secondNumber > 0) {
			secondWord = oneDigitToStr(secondNumber);
		}
		else if (secondNumber == 0) {
			secondWord = "";
		}
		
		return firstWord + secondWord;
 	}

 	public static String threeDigitToStr(int n) {		// Problem 3 method
 		// Delcare variables
 		int firstNumber = 0;
 		int secondNumber = 0; 	// int variable secondNumber can hold the last 2 digits of the 3 digit number as well.
 		String firstPhrase = "";
 		String secondPhrase = "";

 		if (n >= 0 && n <= 9) {
 			firstPhrase = oneDigitToStr(n);
 		}
 		else if (n >= 10 && n <= 99) {
 			firstPhrase = twoDigitToStr(n);
 		}
 		else {
 			// Separate the number into two parts using mod 100. So secondNumber can hold the last two digits, or one digit if there is a 0 in the middle.
 			secondNumber = n % 100;
 			firstNumber = n / 100;  		// Varaible firstNumber will always hold just the first digit.
 			if (firstNumber == 1) {
 				firstPhrase = "one hundred ";
 			}
 			else if (firstNumber == 2) {
 				firstPhrase = "two hundred ";
 			}  
 			else if (firstNumber == 3) {
 				firstPhrase = "three hundred ";
 			}  
 			else if (firstNumber == 4) {
 				firstPhrase = "four hundred ";
 			}  
 			else if (firstNumber == 5) {
 				firstPhrase = "five hundred ";
 			} 
 			else if (firstNumber == 6) {
 				firstPhrase = "six hundred ";
 			}   
 			else if (firstNumber == 7) {
 				firstPhrase = "seven hundred ";
 			}  
 			else if (firstNumber == 8) {
 				firstPhrase = "eight hundred ";
 			}  
 			else if (firstNumber == 9) {
 				firstPhrase = "nine hundred ";
 			}  
			// If mod 100 gives 0 then its simply the first phrase only.
 			if (secondNumber == 0) {	
				secondPhrase = "";
			}
			// If result from mod 100 is one digit then call oneDigitToStr otherwise if it is two digits call twoDigitToStr.
			else if (secondNumber > 9) {
				secondPhrase = twoDigitToStr(secondNumber);
			}
			else if (secondNumber <= 9) {
				secondPhrase = oneDigitToStr(secondNumber);
			}
		}
		
		return firstPhrase + secondPhrase;
	}
	
	public static String numToStr(int n) {		// Problem 4 method
		// Declare Variables
		int firstNumbers = 0;    // In sets of 3 digit numbers
		int secondNumbers = 0;
		int thirdNumbers = 0;
		int fourthNumbers = 0;
		String firstPhrase = "";
		String secondPhrase = "";
		String thirdPhrase = "";
		String fourthPhrase = "";
		
		// Make sure method works for all other numbers
		if (n >= 0 && n <= 9) {
 			firstPhrase = oneDigitToStr(n);
 		}
 		else if (n >= 10 && n <= 99) {
 			firstPhrase = twoDigitToStr(n);
 		}
 		else if (n >= 100 && n <= 999) {
 			firstPhrase = threeDigitToStr(n);
 		}
 		else {
 			if (n / 1000 >= 0 && n / 1000 <= 9) { 		// Every if statement checks whether it is a billion, million, or thousand. This one checks for million
 				firstNumbers = n / 1000;
 				secondNumbers = n % 1000;
 				firstPhrase = oneDigitToStr(firstNumbers) + " thousand ";
 				if (secondNumbers != 0) {
 					secondPhrase = threeDigitToStr(secondNumbers);
 				}
			}
			else if (n / 1000000 <= 999) {		// Checks for million
				firstNumbers = n / 1000000;
				n = n % 1000000;
				secondNumbers = n / 1000;
				thirdNumbers = n % 1000;
				firstPhrase = threeDigitToStr(firstNumbers) + "million ";
				if (secondNumbers != 0) {
					secondPhrase = threeDigitToStr(secondNumbers) + "thousand ";
				}
				if (thirdNumbers != 0) {				
					thirdPhrase = threeDigitToStr(thirdNumbers);
				}	
			}
			else if (n / 1000000000 <= 999) {		// Checks for billion
				firstNumbers = n / 1000000000;
				firstPhrase = threeDigitToStr(firstNumbers) + " billion ";
				n = n % 1000000000;
				secondNumbers = n / 1000000;
				n = n % 1000000;
				thirdNumbers = n / 1000;
				fourthNumbers = n % 1000;
				if (secondNumbers != 0) {	
					secondPhrase = threeDigitToStr(secondNumbers) + "million ";
				}
				if (thirdNumbers != 0) {
					thirdPhrase = threeDigitToStr(thirdNumbers) + "thousand ";
				}
				if (fourthNumbers != 0) {
					fourthPhrase = threeDigitToStr(fourthNumbers);
				}
			}

		}
 		
 		return firstPhrase + secondPhrase + thirdPhrase + fourthPhrase;
	}
}
