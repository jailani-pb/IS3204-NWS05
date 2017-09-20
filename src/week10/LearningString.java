package week10;

public class LearningString {

	public static void main(String[] args) {
		// This is to simulate interned strings
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		// If you use == to compare strings.
		// it will try to compare its reference (memory location)
		
		// s1 and s2 referenced to different String object
		System.out.println("s1 == s2? " + (s1 == s2));
		// s1 and s3 referenced to the same String object
		// s1 and s3 is interned string object.
		System.out.println("s1 == s3? " + (s1 == s3));
		// s2 and s3 referenced to different String object
		System.out.println("s2 == s3? " + (s2 == s3));
		
	}
	
}





