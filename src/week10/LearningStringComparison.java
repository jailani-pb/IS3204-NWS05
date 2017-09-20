package week10;

public class LearningStringComparison {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "java";
		// Compare two strings if the content is the same.
		// Check letters case as well.
		System.out.println("s1 equals to s2? " + s1.equals(s2));
		System.out.println("s1 equals to s3? " + s1.equals(s3));
		System.out.println("s2 equals to s3? " + s2.equals(s3));
		// Ignore letters case
		System.out.println("s1 equals to s3? (ignoring case)");
		System.out.println(s1.equalsIgnoreCase(s3));
		// Check if a string starts with a word
		System.out.println("s1 starts with J?");
		System.out.println(s1.startsWith("J"));
		System.out.println("s1 starts with Hello?");
		System.out.println(s1.startsWith("Hello"));
		System.out.println("s1 starts with Ja");
		System.out.println(s1.startsWith("Ja"));
		// Check if a string ends with a word
		System.out.println("s1 ends with a?");
		System.out.println(s1.endsWith("a"));
		System.out.println("s1 ends with va?");
		System.out.println(s1.endsWith("va"));
		System.out.println("s1 ends with A?");
		System.out.println(s1.endsWith("A"));
	}
	
}





