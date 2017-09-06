package week8;

public class LearningMultiDimensionalArray {

	public static void main(String[] args) {
		// Three Dimensional Array
		int[][][] threeDimension = {
				{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
				{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
				{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
		};
		
		for(int x = 0; x < threeDimension.length; x++) {
			for(int y = 0; y < threeDimension[x].length; y++) {
				for(int z = 0; z < threeDimension[x][y].length; z++) {
					System.out.println(threeDimension[x][y][z]);
				}
			}
		}
	}
	
}
