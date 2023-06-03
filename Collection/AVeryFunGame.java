import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class AVeryFunGame {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// User input
		System.out.print("How many games would you like to play? ");
		int amountOfGames = scnr.nextInt();
	
		for (int i = 1; i <= amountOfGames; i++) {
			int j = 0;
			System.out.println("Game " + i + ":" );
			int[] piles = generatePiles();
			// Embedded loop decides when the game ends
			while (gameOver(piles) == false) {
				System.out.print("Turn " + j + ": ");  
				printArray(piles);
				System.out.println("");
				takeTurn(piles);
				j++;
			}
			System.out.print("Turn " + j + ": ");  
			printArray(piles);
			System.out.println("");
			System.out.println("");
		}
	}

	public static int[] generatePiles() {		// Method for problem 1
		Random rng = new Random();

		// Declare variable and array
		int numberOfPiles = 45;	
		int[] pileSizes = new int[45];

		for (int i = 0; i < pileSizes.length; i++) {
			if (numberOfPiles > 0) {
				pileSizes[i] = rng.nextInt(numberOfPiles) + 1; 
				numberOfPiles = numberOfPiles - pileSizes[i];
			}
			else { 
				pileSizes[i] = 0;
			}
		}

		return pileSizes;	
	}

	public static void printArray(int[] x) {		// Method for problem 2
		for (int i = 0; i < x.length; i++) {
			// Upon the first occurance of 0 within the array, end the loop.  
			if (x[i] == 0) {
				break;
			}
			System.out.print(x[i] + " ");
		}
	}

	public static void shiftLeft(int[] x, int index) {		// Method for problem 3
		for (int i = index; i < x.length; i++) {
			x[i] = x[i + 1];
			if (x[i] == 0) {
				break;
			}  
		}
	}

	public static void takeTurn(int[] piles) {		// Method for problem 4
		int sum = 0;

		for (int i = 0; i < piles.length; i++) {
			if (piles[i] == 1) {
				shiftLeft(piles,i);
				// If there is more than one occurance of 1 in a row.
				if (piles[i] == 1) {
					shiftLeft(piles,i);
				}
				if (piles[i] == 1) {
					shiftLeft(piles,i);
				}	
				if (piles[i] == 1) {
					shiftLeft(piles,i);
				}
				else if (piles[i] > 1) {
					piles[i] = piles[i] - 1;
					sum += piles[i];
				}
			}
			
			else if (piles[i] > 1) {
				piles[i] = piles[i] - 1;
				sum += piles[i];
			}
			if (piles[i] == 0) {
				piles[i] = 45 - sum;
				break;
			}
		}	

	}
	

	public static boolean gameOver(int[] piles) {		// Method for problem 5
		int count = 0;
		int[] endGame = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] compareToEndGame = new int[9];
		// Check only the first nine digits
		for (int i = 0; i < 9; i++) {
			if (piles[i] == 1) {
				compareToEndGame[0] = piles[i];
			}
			else if (piles[i] == 2) {
				compareToEndGame[1] = piles[i];
			}
			else if (piles[i] == 3) {
				compareToEndGame[2] = piles[i];
			}
			else if (piles[i] == 4) {
				compareToEndGame[3] = piles[i];
			}
			else if (piles[i] == 5) {
				compareToEndGame[4] = piles[i];
			}
			else if (piles[i] == 6) {
				compareToEndGame[5] = piles[i];
			}
			else if (piles[i] == 7) {
				compareToEndGame[6] = piles[i];
			}
			else if (piles[i] == 8) {
				compareToEndGame[7] = piles[i];
			}
			else if (piles[i] == 9) {
				compareToEndGame[8] = piles[i];
			}
		}
		// If both arrays match one occurance of each number existed in the first nine elements of the array.
		if (Arrays.equals(compareToEndGame, endGame)) {
			return true;
		}
		
		return false;
	}
	
}