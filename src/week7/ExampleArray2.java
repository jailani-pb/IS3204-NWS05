package week7;

import java.util.Scanner;

public class ExampleArray2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of students details to key in:");
		String numberStudentInput = scanner.nextLine();
		try {
			int numberStudent = Integer.parseInt(numberStudentInput);
			String[] names = new String[numberStudent];
			String[] icnumbers = new String[numberStudent];
			
			// User to fill in student details
			for(int i = 0; i < names.length; i++) {
				System.out.println("Student " + i + " name:");
				names[i] = scanner.nextLine();
				System.out.println("Student " + i + " icnumber:");
				icnumbers[i] = scanner.nextLine();
			}
			
			// Print all student details.
			System.out.println("The following are students detail");
			for(int i = 0; i < names.length; i++) {
				System.out.println(names[i] + " - " + icnumbers[i]);
			}
			
		} catch(NumberFormatException e) {
			System.out.println("Invalid Input.");
		}
		
		scanner.close();
	}
	
}












