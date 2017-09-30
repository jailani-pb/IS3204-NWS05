package week11;

import java.util.Scanner;

public class ExampleAccountManagement {

	// Exercise: Edit this class
	// 1) Implement usernames array to store user's username:
	//		abcde@pb.edu.bn, the username will be abcde
	// 2) Check for invalid email. Eg. @aku@pb.edu.bn is invalid.
	// 3) Remove any trailing spaces.
	// 4) Remove any spaces in between email address before
	// 		storing into emails array.
	// 5) Remove any spaces in between username before storing
	// 		into usernames array.
	
	static String[] usernames = new String[5];
	static String[] emails = new String[5];
	static String[] passwords = new String[5];
	static Scanner scanner = new Scanner(System.in);
	static int numberRegistered = 0;
	
	public static void main(String[] args) {
		printMainMenu();
		String userInput = scanner.nextLine();
		while(!userInput.equalsIgnoreCase("q")) {
			try {
				int optionChosen = Integer.parseInt(userInput);
				
				if(optionChosen == 1) {
					if(numberRegistered >= 4) {
						System.out.println("Cannot register. Full.");
					} else {
						register();
					}
				} else if(optionChosen == 2) {
					login();
				} else {
					System.out.println("Option Invalid");
				}
				
			} catch (Exception e) {
				System.out.println("Option Invalid.");
			}

			printMainMenu();
			userInput = scanner.nextLine();
		}
		
		scanner.close();
	}
	
	public static void printMainMenu() {
		System.out.println("Account Management:");
		System.out.println("(1) Register");
		System.out.println("(2) Login");
		System.out.println("Type q to quit.");
	}
	
	public static void register() {
		System.out.println("Please register using pb email:");
		String email = "";
		while(true) {
			System.out.println("Email Address:");
			email = scanner.nextLine();
			if(email.toLowerCase().endsWith("@pb.edu.bn")) {
				if(email.indexOf("@") == email.lastIndexOf("@")) {
					email = email.trim().replace(" ", "");
					break;
				} else {
					System.out.println("Invalid email.");
				}
			} else {
				System.out.println("Must be pb email.");
			}
		}
		String password = "";
		while(true) {
			System.out.println("Password:");
			password = scanner.nextLine();
			System.out.println("Confirm Password:");
			String confirmPassword = scanner.nextLine();
			if(password.equals(confirmPassword)) {
				break;
			} else {
				System.out.println("Password and Confirm Password not matched.");
			}
		}
		System.out.println("Registration Complete.");
		usernames[numberRegistered] = email.substring(0, email.indexOf("@pb.edu.bn"));
		emails[numberRegistered] = email;
		passwords[numberRegistered] = password;
		numberRegistered++;
	}
	
	public static void login() {
		System.out.println("Login:");
		System.out.println("Email Address or Username:");
		String email = scanner.nextLine();
		System.out.println("Password:");
		String password = scanner.nextLine();
		for(int i = 0; i < 5; i++) {
			if(email.equalsIgnoreCase(emails[i])
					&& password.equals(passwords[i])) {
				System.out.println("You are logged in");
				return;
			}
			if(email.equals(usernames[i])
					&& password.equals(passwords[i])) {
				System.out.println("You are logged in");
				return;
			}
		}
		System.out.println("Invalid email and password.");
	}

}








