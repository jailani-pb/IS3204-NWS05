package week9;

import java.util.Scanner;

public class ExampleFindHighest {

	static Scanner scanner = new Scanner(System.in);
	static int firstNumber, secondNumber;
	
	public static void main(String[] args) {
		askInput();
		findAndPrintHighest();
		
		scanner.close();
	}
	
	public static void findAndPrintHighest() {
		String text = "The highest number of " + firstNumber + " and "
				+ secondNumber + " is ";
		if(firstNumber > secondNumber) {
			System.out.println(text + firstNumber);
		} else {
			System.out.println(text + secondNumber);
		}
	}
	
	public static void askInput() {
		System.out.println("Input two numbers to compare which is higher.");
		System.out.println("First Number:");
		firstNumber = scanner.nextInt();
		System.out.println("Second Number:");
		secondNumber = scanner.nextInt();
	}
	
}
