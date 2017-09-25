package week11;

public class LearningReplacingString {

	public static void main(String[] args) {
		String message = "is3204 Programming Application";
		// Replace the first instance of a word.
		// word "is"
		String replaceString1 = message.replaceFirst("is", "NS");
		System.out.println(replaceString1);
		System.out.println(message);
		// word "r"
		String replaceString2 = message.replaceFirst("r", "|2");
		System.out.println(replaceString2);
		// Replace all instances of a word.
		// word "r"
		String replaceString3 = message.replace("r", "|2");
		System.out.println(replaceString3);
		// word "i"
		String replaceString4 = message.replaceAll("i", "I");
		System.out.println(replaceString4);
		// word " "
		String replaceString5 = message.replaceAll(" ", "");
		System.out.println(replaceString5);
	}
	
}


