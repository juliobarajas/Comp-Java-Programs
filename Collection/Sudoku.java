import java.util.Arrays;

public class Sudoku {
	public static void main(String[] args) {
		int[][] board = {	{5, 3, 4, 6, 7, 8, 9, 1, 2},
							{6, 7, 2, 1, 9, 5, 3, 4, 8},
							{1, 9, 8, 3, 4, 2, 5, 6, 7}, 
							{8, 5, 9, 7, 6, 1, 4, 2, 3},
							{4, 2, 6, 8, 5, 3, 7, 9, 1},
							{7, 1, 3, 9, 2, 4, 8, 5, 6},
							{9, 6, 1, 5, 3, 7, 2, 8, 4},
							{2, 8, 7, 4, 1, 9, 6, 3, 5},
							{3, 4, 5, 2, 8, 6, 1, 7, 9},	};

		System.out.print(isValidSolution(board));
	}
	public static boolean isValidSolution(int[][] board) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] testRows = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// If fillInToTest matches testRows then it has been filled up by the loop so one occurance of each number existed in the row
		int[] fillInToTest = new int[9];

		// Check for one occurance of each number from left to right 
		for (i = 0; i < board.length; i++) {
			for (j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					fillInToTest[0] = 1;
				}
				else if (board[i][j] == 2) {
					fillInToTest[1] = 2;
				}
				else if (board[i][j] == 3) {
					fillInToTest[2] = 3;
				}
				else if (board[i][j] == 4) {
					fillInToTest[3] = 4;  
				}
				else if (board[i][j] == 5) {
					fillInToTest[4] = 5;
				}
				else if (board[i][j] == 6) {
					fillInToTest[5] = 6;
				}
				else if (board[i][j] == 7) {
					fillInToTest[6] = 7;
				}
				else if (board[i][j] == 8) {
					fillInToTest[7] = 8;
				}
				else if (board[i][j] == 9) {
					fillInToTest[8] = 9;
				}
				// At the end of each row check if these conditions are true
				if (j == 8) {
					if (Arrays.equals(testRows, fillInToTest)) {
						for (k = 0; k < fillInToTest.length; k++) {
							fillInToTest[k] = 0; // Reset the array to test the next row
						}
					}
					else if (testRows != fillInToTest) {
						return false;
					}
				}
			}
		}

		// Check for one occurance of each number top to bottom
		for (j = 0; j < 9; j++) {
			for (i = 0; i < board.length; i++) {
				if (board[i][j] == 1) {
					fillInToTest[0] = 1;
				}
				else if (board[i][j] == 2) {
					fillInToTest[1] = 2;
				}
				else if (board[i][j] == 3) {
					fillInToTest[2] = 3;
				}
				else if (board[i][j] == 4) {
					fillInToTest[3] = 4;  
				}
				else if (board[i][j] == 5) {
					fillInToTest[4] = 5;
				}
				else if (board[i][j] == 6) {
					fillInToTest[5] = 6;
				}
				else if (board[i][j] == 7) {
					fillInToTest[6] = 7;
				}
				else if (board[i][j] == 8) {
					fillInToTest[7] = 8;
				}
				else if (board[i][j] == 9) {
					fillInToTest[8] = 9;
				}
				// At the end of each column check if these conditions are true
				if (i == 8) {
					if (Arrays.equals(testRows, fillInToTest)) {
						for (k = 0; k < fillInToTest.length; k++) {
							fillInToTest[k] = 0; // Reset the array to test the next row
						}
						if (i == 8 && j == 8) {
							return true; // return true when all above conditions are met 
						}
					}
					else if (testRows != fillInToTest) {
						return false;
					}
				}
			}
		}
		return false;
	}
}