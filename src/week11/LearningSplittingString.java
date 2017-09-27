package week11;

import java.util.Scanner;

public class LearningSplittingString {

	public static void main(String[] args) {
		String message = "IS3204 Programming Java Application";
		String[] splitMessage = message.split(" ");
		System.out.println(message);
		for(String m : splitMessage) {
			System.out.println(m);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("List down emails separated by semicolon");
		String userInput = scanner.nextLine();
		while(true) {
			boolean isValidInput = true;
			String[] splitInput = userInput.split(";");
			for(String input : splitInput) {
				if(input.trim().indexOf("@") == -1) {
					System.out.println(input + " is invalid.");
					isValidInput = false;
					break;
				} else {
					if(input.trim().indexOf("@") !=
							input.trim().lastIndexOf("@")) {
						System.out.println(input + " is invalid.");
						isValidInput = false;
						break;
					} else {
						input = input.trim().replace(" ", "");
						System.out.println(input);
					}
				}
			}
			
			if(isValidInput) {
				System.out.println("All emails were valid.");
				break;
			} else {
				System.out.println("Some emails were invalid");
				System.out.println("List down emails separated by semicolon");
				userInput = scanner.nextLine();
			}
		}
		
		scanner.close();
	}
	
}

