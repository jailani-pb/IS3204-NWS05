package week6;

import java.util.Scanner;

public class LearningForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input number: ");
		int userInput = scanner.nextInt();
		for(int i = 0; i < userInput; i++) {
			System.out.println(i + ": Welcome to Java");
		}
		
		int j;
		for(j = 0; j < userInput; j++) {
			System.out.println(j + ": Programming Application");
		}
		
		int a = 0;
		while(a < userInput) {
			System.out.println(a + ": IS3204");
			a++;
		}
		
		scanner.close();
	}
	
}
