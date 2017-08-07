package week4;

public class LearningString {

	public static void main(String[] args) {
		// This is the preferred way to initialise a String variable.
		String firstName = "Jailani";
		// This is NOT the preferred way.
		String lastName = new String("Jailani");
		// Compare two String variables
		System.out.println(firstName == lastName);
		System.out.println(firstName.equals(lastName));
		
		// Combining String values
		// Any non string will be converted into a string
		System.out.println(firstName + " bin " + lastName + " " + 111111);
		System.out.println(firstName.concat(" ").concat(lastName));
		System.out.println(firstName.concat(" " + lastName));
	}
	
}
