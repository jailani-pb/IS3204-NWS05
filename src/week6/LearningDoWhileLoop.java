package week6;

public class LearningDoWhileLoop {

	public static void main(String[] args) {
		int a = 100;
		do {
			System.out.println(a + ": Welcome to Java");
			a++;
		} while(a < 10);
		
		while(a < 10) {
			System.out.println(a + ": Programming Application");
			a++;
		}
	}
	
}
