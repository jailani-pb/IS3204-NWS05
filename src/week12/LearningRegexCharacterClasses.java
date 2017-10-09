package week12;

public class LearningRegexCharacterClasses {

	public static void main(String[] args) {
		String message = "IS3204ProgrammingApplication";
		System.out.println(message);
		// Replace the letter a to X
		System.out.println(message.replaceAll("a", "X"));
		// . means any letter in Regex
		System.out.println(message.replaceAll(".", "X"));
		// Replace a, i or o to X
		System.out.println(message.replaceAll("[aio]", "X"));
		// Replace all letters except a, i or o to X
		System.out.println(message.replaceAll("[^aio]", "X"));
		// Replace all letters a to z in to X
		System.out.println(message.replaceAll("[a-z]", "X"));
		// Replace all letters a to z or A to Z in to X
		System.out.println(message.replaceAll("[a-zA-Z]", "X"));
		// Replace all letters a to z or A to Z or 0 to 9
		// in to X
		System.out.println(message.replaceAll("[a-zA-Z0-9]", "X"));
		// Replace all letters e to m in to X
		System.out.println(message.replaceAll("[e-m]", "X"));
		// Replace all letters H to Q in to X
		System.out.println(message.replaceAll("[H-Q]", "X"));
		// Replace all letters 3 to 6 in to X
		System.out.println(message.replaceAll("[3-6]", "X"));
		// Replace all letters a to k except for c and g
		// in to X
		System.out.println(message.replaceAll("[a-k&&[^cg]]", "X"));
		System.out.println(message.replaceAll("[abd-fh-k]", "X"));
		// Replace all letters a to z except for m to p
		// in to X
		System.out.println(message.replaceAll("[a-z&&[^m-p]]", "X"));
		System.out.println(message.replaceAll("[a-lq-z]", "X"));
	}
	
}



