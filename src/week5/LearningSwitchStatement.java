package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningSwitchStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the day number of the week:");
		int dayNumber = scanner.nextInt();
		//		if(dayNumber == 1) {
		//			System.out.println("Monday");
		//		} else if(dayNumber == 2) {
		//			System.out.println("Tuesday");
		//		} else if(dayNumber == 3) {
		//			System.out.println("Wednesday");
		//		} else if(dayNumber == 4) {
		//			System.out.println("Thursday");
		//		} else if(dayNumber == 5) {
		//			System.out.println("Friday");
		//		} else if(dayNumber == 6) {
		//			System.out.println("Saturday");
		//		} else if(dayNumber == 7) {
		//			System.out.println("Sunday");
		//		} else {
		//			System.out.println("Invalid Input");
		//		}

		switch (dayNumber) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Invalid Input"); break;
		}

		// Exercise 1:
		// Implement a switch case statement that accepts user input.
		// The user input should be an int data type for the month number
		// of the year.
		// Based on the user input print the word of the month required.
		// Implement validation to check if the user input int data type.
		try {
			int monthNumber = scanner.nextInt();
			switch (monthNumber) {
				case 1: System.out.println("January"); break;
				case 2: System.out.println("February"); break;
				case 3: System.out.println("March"); break;
				case 4: System.out.println("April"); break;
				case 5: System.out.println("May"); break;
				case 6: System.out.println("June"); break;
				case 7: System.out.println("July"); break;
				case 8: System.out.println("August"); break;
				case 9: System.out.println("September"); break;
				case 10: System.out.println("October"); break;
				case 11: System.out.println("November"); break;
				case 12: System.out.println("December"); break;
				default: System.out.println("Invalid Input"); break;
			}
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}


		// Exercise 2:
		// Implement a switch case statement that accepts user input.
		// The user input should be an int data type for the power value
		// for number 5.
		// Example: If user input is 2, it should output the calculation
		// of 5^2 = 25.
		// The minimum power value user can input is 1.
		// The maximum power value user can input is until 10.
		// Less than or more than that should print invalid input.
		// Implement validation to check if the user input int data type.
		try {
			int powerValue = scanner.nextInt();
			// This exercise shows the inefficient way to write
			// this solution.
//			switch (powerValue) {
//				case 1: System.out.println(Math.pow(5, 1)); break;
//				case 2: System.out.println(Math.pow(5, 2)); break;
//				case 3: System.out.println(Math.pow(5, 3)); break;
//				case 4: System.out.println(Math.pow(5, 4)); break;
//				case 5: System.out.println(Math.pow(5, 5)); break;
//				case 6: System.out.println(Math.pow(5, 6)); break;
//				case 7: System.out.println(Math.pow(5, 7)); break;
//				case 8: System.out.println(Math.pow(5, 8)); break;
//				case 9: System.out.println(Math.pow(5, 9)); break;
//				case 10: System.out.println(Math.pow(5, 10)); break;
//				default: System.out.println("Invalid Input"); break;
//			}
			
			if((powerValue >= 1) && (powerValue <= 10)) {
				System.out.println(Math.pow(5, powerValue));
			} else {
				System.out.println("Invalid Input");
			}
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		
		
		scanner.close();
	}
}
