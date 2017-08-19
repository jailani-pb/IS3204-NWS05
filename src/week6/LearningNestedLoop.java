package week6;

public class LearningNestedLoop {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(i + "." + j + " ");
				if(j%10 == 0) {
					System.out.println();
				}
				if((i+j) == 6) {
					break;
				}
			}
		}
	}
	
}
