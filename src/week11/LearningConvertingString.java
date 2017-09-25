package week11;

import java.util.Scanner;

public class LearningConvertingString {

	public static void main(String[] args) {
		String text = "Programming Application";
		// Convert all text to upper case.
		String textUpperCase = text.toUpperCase();
		System.out.println(textUpperCase);
		// Convert all text to lower case.
		String textLowerCase = text.toLowerCase();
		System.out.println(textLowerCase);
		System.out.println(text);
		// Remove trailing spaces at front and back of string.
		String message = "  q u i t  ";
		String trimMessage = message.trim();
		System.out.println(trimMessage);
		System.out.println(message);
		
		// Exercise:
		// Implement scanner to ask for user input.
		// Convert the user input to lower case.
		// Remove any trailing spaces.
		// Print the output of the converted user input.
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String convertUserInput = userInput.trim().toLowerCase();
		System.out.println(convertUserInput);
		scanner.close();
	}
	
}


