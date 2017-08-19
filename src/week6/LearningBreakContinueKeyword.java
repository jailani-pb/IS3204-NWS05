package week6;

import java.util.Scanner;

public class LearningBreakContinueKeyword {

	public static void main(String[] args) {
//		int sum = 90;
//		int number = 0;
//		
//		while(number < 20) {
//			sum += number;
//			System.out.println(sum);
//			if(sum >= 100) {
//				break;
//			}
//			number++;
//		}
		
		Scanner scanner = new Scanner(System.in);
		String message = "";
		while(true) {
			System.out.println("Please write message (or quit to stop):");
			message = scanner.nextLine();
			if(message.toLowerCase().equals("quit")) {
				System.out.println("Application has been terminated.");
				break;
			} else {
				if(message.toLowerCase().equals("jailani")) {
					continue;
				}
				System.out.println("Message: " + message);
			}
		}
		
		scanner.close();
	}
	
}
