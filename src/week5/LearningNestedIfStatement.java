package week5;

import java.util.Scanner;

public class LearningNestedIfStatement {

	public static void main(String[] args) {
//		if(true) {
//			System.out.println("This is true.");
//			if(false) {
//				System.out.println("This is another true");
//			} else {
//				System.out.println("This time it is false");
//			}
//		} else {
//			System.out.println("This is false.");
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Main menu, please choose an option:");
		System.out.println("(1) List all schools in PB");
		int selectedOption = scanner.nextInt();
		
		if(selectedOption == 1) {
			System.out.println("List of schools in PB.");
			System.out.println("Please choose an option to show lecturers.");
			System.out.println("(1) School of ICT");
			System.out.println("(2) School of Business");
			selectedOption = scanner.nextInt();
			
			if(selectedOption == 1) {
				System.out.println("List of lecturers in SICT");
				System.out.println("-\tJailani");
				System.out.println("-\tAziz");
				System.out.println("-\tBahit");
			} else {
				if(selectedOption == 2) {
					System.out.println("List of lecturers in SBS");
					System.out.println("-\tKhairul");
				} else {
					System.out.println("Invalid option selected.");
				}
			}
			
		} else {
			System.out.println("Invalid option selected.");
		}
	}
	
}
