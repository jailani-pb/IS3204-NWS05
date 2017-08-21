package week7;

import java.util.Scanner;

public class ExampleArray1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] months = {"January", "February", "March", "April",
				"May", "June", "July", "August", "September",
				"October", "November", "December"};
		System.out.println("Input month number (1-12)");
		int monthNumber = scanner.nextInt();
		if((monthNumber >= 1) && (monthNumber <= 12)) {
			System.out.println(months[monthNumber-1]);
		} else {
			System.out.println("Invalid Input.");
		}
		
		scanner.close();
	}
	
}











