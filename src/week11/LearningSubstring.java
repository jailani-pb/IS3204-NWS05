package week11;

public class LearningSubstring {

	public static void main(String[] args) {
		String message = "Welcome To Java";
		// Obtaining substring with specific begin and end index
		String subMessage1 = message.substring(0, 11);
		System.out.println(subMessage1);
		System.out.println(message);
		String subMessage2 = message.substring(8, 10);
		System.out.println(subMessage2);
		
		// Obtaining substring with specific begin until end of string
		String subMessage3 = message.substring(8);
		System.out.println(subMessage3);
		String subMessage4 = message.substring(15);
		System.out.println(subMessage4);
		
		// Exercise:
		// Create a new String with value "Programming Application"
		// Obtain and print substring with value "Programming"
		// Obtain and print substring with value "Application"
		String text = "Programming Application";
		String subText1 = text.substring(0, 11);
		String subText2 = text.substring(12);
		System.out.println(subText1);
		System.out.println(subText2);
	}
	
}






