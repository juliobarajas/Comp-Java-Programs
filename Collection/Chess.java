public class Chess {
	public static void main(String[] args) {
		/*String[][] board = {	{"bN", "bN", "bB",  "",  "", "bR", "bK",  ""},
								{"bP", "bP",   "",  "","bP", "bP", "bB","bP"},
								{  "",   "", "bP","bP",  "", "bN", "bP",  ""},
								{"bQ",   "",   "",  "",  "",   "",   "",  ""},
		TEST					{  "",   "", "wP","wP",  "",   "",   "",  ""},
								{  "",   "", "wN",  "",  "", "wN", "wP",  ""},
								{"wP", "wP",   "",  "","wP", "wP", "wB","wP"},
							    {"wR",   "", "wB","wQ",  "", "wR", "wK", "" }	};

		System.out.println(countQueenThreats(board, 'w')); */ 
	}
 
	public static int countQueenThreats(String[][] board, char color) {
		// Declare variables
		int queenRow = 0;
		int queenColumn = 0;
		int numOfThreats = 0;
		int i = 0;
		int j = 0;

		// Loop and if statements search for position of the queen piece depending on the color given
		for (i = 0; i < board.length; i++) {
			for (j = 0; j < board[i].length; j++) {
				if (color == 'w') {
					if (board[i][j].contains("wQ")) {
						queenRow = i;
						queenColumn = j;
						break;
					}
				}
				else if (color == 'b') {
					if (board[i][j].contains("bQ")) {
						queenRow = i;
						queenColumn = j;
						break;
					}
				}
			}
		}
		// Check right side of queen position
		for (j = queenColumn + 1; j < board[queenRow].length; j++) {
			if (color == 'w') {
				if (board[queenRow][j].contains("b")) {
					numOfThreats++;
					break;
				}
				// Let's queen notice there is a piece of the same color blocking it's way
				else if (board[queenRow][j].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[queenRow][j].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[queenRow][j].contains("b")) {
					break;
				}
			}
		}
		// Check left side of queen position
		for (j = queenColumn - 1; j >= 0; j--) {
			if (color == 'w') {
				if (board[queenRow][j].contains("b")) {
					numOfThreats++;
					break;
				}
				else if (board[queenRow][j].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[queenRow][j].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[queenRow][j].contains("b")) {
					break;
				}
			}
		}
		
		// Check below queen postion
		for (i = queenRow + 1; i < board.length; i++) {
			if (color == 'w') {
				if (board[i][queenColumn].contains("b")) {
					numOfThreats++;
					break;
				}
				else if (board[i][queenColumn].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[i][queenColumn].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[i][queenColumn].contains("b")) {
					break;
				}
			}
		}
		// Check above queen position
		for (i = queenRow - 1; i >= 0; i--) {
			if (color == 'w') {
				if (board[i][queenColumn].contains("b")) {
					numOfThreats++;
					break;
				}
				else if (board[i][queenColumn].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[i][queenColumn].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[i][queenColumn].contains("b")) {
					break;
				}
			}
		}
		// Check diagonally to the right below queen position 
		for (i = queenRow + 1, j = queenColumn + 1; i < board.length && j < board[i].length; i++, j++) {  // one loop iterates i and j at the same time
			if (color == 'w') {
				if (board[i][j].contains("b")) {
					numOfThreats++;
					break;
				}	
				else if (board[i][j].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[i][j].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[i][j].contains("b")) {
					break;
				}
			}
		}
		// Check diagonally to the left above queen position
		for (i = queenRow - 1, j = queenColumn - 1; i >= 0 && j >= 0; i--, j--) {
			if (color == 'w') {
				if (board[i][j].contains("b")) {
					numOfThreats++;
					break;
				}	
				else if (board[i][j].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[i][j].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[i][j].contains("b")) {
					break;
				}
			}	
		}
		// Check diagonally to the right above queen position
		for (i = queenRow - 1, j = queenColumn + 1; i >= 0 && j < board[i].length; i--, j++) {
			if (color == 'w') {
				if (board[i][j].contains("b")) {
					numOfThreats++;
					break;
				}	
				else if (board[i][j].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[i][j].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[i][j].contains("b")) {
					break;
				}
			}
		}
		// Check diagonally to the left below queen position
		for (i = queenRow + 1, j = queenColumn - 1; i < board.length && j >= 0; i++, j--) {
			if (color == 'w') {
				if (board[i][j].contains("b")) {
					numOfThreats++;
					break;
				}	
				else if (board[i][j].contains("w")) {
					break;
				}
			}
			else if (color == 'b') {
				if (board[i][j].contains("w")) {
					numOfThreats++;
					break;
				}
				else if (board[i][j].contains("b")) {
					break;
				}
			}
		}
		// Return the result of each loop checking each direction for opposite color pieces.
		return numOfThreats; 
	}
}