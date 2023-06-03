public class LostSloth {
	public static void main(String[] args) {
		int[][] data = { {4, 4, 0, 9, 8},
						 {4, 6, 5, 5, 8},
						 {5, 5, 2, 3, 0},
						 {7, 1, 1, 0, 9} };
	 printData(data);
	 findPath(data, 0);

	}
	
	public static void printData(int[][] data) {    // Method for problem 1
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
				// At the end of each row start a new line
				if (j + 1 == data[i].length) {
					System.out.println("");
				}
			}
		} 
	}

	public static void findPath(int[][] data, int startRow) {    // Method for problem 2
		// Changes in elevation e is east, ne is northeast, se is southeast
		int eChange;
		int neChange;
		int seChange;

		for (int j = 0; j < data[startRow].length; j++) {
			if (startRow == 0) {
				eChange = data[startRow][j] - data[startRow][j];
				seChange = data[startRow + 1][j] - data[startRow][j];
				if (eChange > seChange) {
					System.out.print("0 ");
				}  
				else {
					System.out.print("1 ");
				}

			}
		}	
	}		
}