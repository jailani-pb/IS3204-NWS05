package week6;

import java.util.Scanner;

public class WhileLoopExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		boolean stillCalculating = true;
		String userInput = "";
		while(stillCalculating) {
			System.out.println("Current Total = " + total);
			System.out.println("Please input value to add (type quit to terminate): ");
			userInput = scanner.nextLine();
			if(userInput.toLowerCase().equals("quit")) {
				System.out.println("Application Terminated. Final total = " + total);
				stillCalculating = false;
			} else {
				try {
					int convertUserInput = Integer.parseInt(userInput);
					total += convertUserInput;
				} catch (NumberFormatException e) {
					System.out.println("Input invalid. Value is not calculated to total.");
				}
			}
		}
		scanner.close();
	}
	
}
