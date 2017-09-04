package week8;

public class Example2DArray {

	public static void main(String[] args) {
		String[] columnHeader = {
				"Automaker A", "Automaker B", "Automaker C",
				"Automaker D", "Automaker E"
		};
		String[] rowHeader = {
				"2002", "2003", "2004", "2005"
		};
		double[][] matrix = {
				{4.5, 2.6, 2.25, 1.7, 1.35},
				{4.75, 2.8, 2.3, 1.85, 1.4},
				{4.9, 3.05, 2.4, 1.9, 1.45},
				{5.1, 3.2, 2.5, 2.0, 1.5}
		};
		
		// Print column header
		for(int i = 0; i < columnHeader.length; i++) {
			System.out.print("\t" + columnHeader[i]);
		}
		System.out.println();
		// Print row header and data
		for(int row = 0; row < matrix.length; row++) {
			// Print row header first
			System.out.print(rowHeader[row] + "\t");
			// Then data
			for(int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "\t\t");
			}
			System.out.println();
		}
	}
	
}
