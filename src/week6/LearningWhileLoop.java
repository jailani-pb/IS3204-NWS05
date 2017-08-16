package week6;

import java.util.Scanner;

public class LearningWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the number of time you want to print:");
		System.out.println("Value should be positive:");
		int userInput = scanner.nextInt();
//		int a = 1;
//		while(a <= userInput) {
//			System.out.println(a + ": Welcome to Java");
//			a++;
//		}
		
		int b = 1;
		boolean isContinue = true;
		while(isContinue) {
			System.out.println(b + ": Welcome to Java");
			b++;
			if(b > userInput) {
				isContinue = false;
			}
		}
		
		scanner.close();
	}
	
}






