public class StatsAnalyzer {
	public static void main(String[] args) {
		/*TEST	int[][] scores ={{20, 27, 16, 23, 20, 27, 18},
							 { 8, 18, 14, 17,  9, 12,  0},
							 {34, 19, 25, 22, 19, 25, 31},
							 {17,  8, 11, 34, 15,  0,  9},
							 { 2,  0,  3,  0, 10,  2,  4}};
		
		System.out.print(call method);*/
	}

	public static int playerTotalPoints(int[][] scores, int p) {		// Method for problem 1
		int sum = 0;

		for (int i = p; i <= p; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
		}
		return sum;
	}

	public static double playerAvgPoints(int[][] scores, int p) {		// Method for problem 2
		// Variable keeps track of number of scores in the row to divide by
		int numOfScores = 0;

		for (int i = p; i <= p; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				numOfScores++; // 1 is added everytime the loop iterates
			}
		}
		// Return the average 
		return playerTotalPoints(scores, p) / numOfScores; 
	}

	public static int bestPlayerInGame(int[][] scores, int g) {			// Method for problem 3
		int maxScore = 0;	// Keeps track of highest scores
		int bestPlayer = 0; // Once found, set bestplayer equal to the index maxScore was found at

		for (int i = 0; i < scores.length; i++) {
			for(int j = g; j <= g; j++) {
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j];
					bestPlayer = i;
				}
			}
		}
		return bestPlayer; 
	}

	public static int teamPointsInGame(int[][] scores, int g) {			// Method for problem 4
		int sumOfGame = 0;	

		// Loop adds all numbers in the same column
		for (int i = 0; i < scores.length; i++) {
			for(int j = g; j <= g; j++) {
				sumOfGame += scores[i][j];
			}
		}
		return sumOfGame;
	}

	public static int teamBestGame(int[][] scores) {					// Method for problem 5
		int j = 0;
		int bestGameScore = teamPointsInGame(scores, j);
		int bestGame = 0;

		for (int i = 0; i < scores.length; i++) {
			for (j = 0; j < scores[i].length; j++) {
				if (teamPointsInGame(scores, j) > bestGameScore); {
					bestGameScore = teamPointsInGame(scores,j);
					bestGame = j; 
				}
			}
		}
		return bestGame;
	}

	public static int lowestScoringPlayer(int[][] scores) {				// Method for problem 6
		int i = 0;
		int minPlayerScore = playerTotalPoints(scores, i);
		int worstPlayer = 0;

		// One loop is needed to go through rows since method playerTotalPoints already goes through the columns
		for (i = 0; i < scores.length; i++) {
			if (playerTotalPoints(scores, i) < minPlayerScore) {
					worstPlayer = i;
				}
		}
		return worstPlayer;
	}				
}