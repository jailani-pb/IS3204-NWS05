package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Example 1:
//		System.out.print("Please input a message: ");
//		String message = scanner.nextLine();
//		System.out.println("User has typed message: " + message);
//		System.out.print("Please input another message: ");
//		message = message + scanner.nextLine();
//		System.out.println("The two messages: " + message);
		
		// Example 2:
//		try {
//			System.out.println("Please input a whole number for x: ");
//			int x = scanner.nextInt();
//			System.out.println("Please input a whole number for y: ");
//			int y = scanner.nextInt();
//			System.out.println("The total for x + y = " + (x+y));
//		} catch (InputMismatchException e) {
//			System.out.println("You have typed the wrong value.");
//			System.out.println("Program has been terminated.");
//		}
		
		// Example 3:
		try {
			System.out.println("Welcome to Pythagoras Theorem Calculator.");
			System.out.println("Please type in for value a: ");
			double a = scanner.nextDouble();
			System.out.println("Please type in for value b: ");
			double b = scanner.nextDouble();
			double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			System.out.println("For a = " + a + " and b = " + b);
			System.out.println("The value of c = " + c);
		} catch (Exception e) {
			System.out.println("You have typed the wrong value.");
			System.out.println("Program has been terminated.");
		}
	}
	
}
