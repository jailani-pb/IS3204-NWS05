package week6;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = "";
		while(!message.toLowerCase().equals("quit")) {
			System.out.println("Please input a message (type quit to stop): ");
			message = scanner.nextLine();
			if(message.toLowerCase().equals("quit")) {
				System.out.println("The application has been terminated.");
			} else {
				System.out.println("Message: " + message);
			}
		}
		
		scanner.close();
	}
	
}
