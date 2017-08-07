package week5;

import java.util.Scanner;

public class LearningIfElseStatement {

	public static void main(String[] args) {
//		if(true) {
//			System.out.println("This is true");
//		} else {
//			System.out.println("This is false");
//		}
		
//		int a = 20;
//		int b = 10;
//		int c = 15;
//		if((b >= a) && (b <= c)) {
//			System.out.println("b is between a and c.");
//		} else {
//			System.out.println("b is not between a and c.");
//		}
		
		// Exercise: User input an integer value
		// Check that input if it is divisible by 3.
		// If it is divisible by 3, print a certain message.
		// If it is not, print a certain message.
		// Hint: a number divisible by 3 should have
		// a remainder of 0.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number to check if divisible by 3:");
		int userInput = scanner.nextInt();
		if((userInput % 3) == 0) {
			System.out.println(userInput + " is divisible by 3.");
		} else {
			System.out.println(userInput + " is not divisible by 3, "
					+ "the remainder is " + (userInput % 3));
		}
	}
	
}


