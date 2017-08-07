package week3;

public class ExerciseVariable {

	public static void main(String[] args) {
		float firstStudentMark;
		float secondStudentMark;
		float thirdStudentMark;
		byte firstStudentAge;
		byte secondStudentAge;
		byte thirdStudentAge;
		firstStudentMark = 50.159488f;
		secondStudentMark = 79.1123009f;
		thirdStudentMark = 40f;
		firstStudentAge = 20;
		secondStudentAge = 10;
		thirdStudentAge = 23;
//		System.out.printf("The first student aged "
//				+ "%d achieved %.2f "
//				+ "for this module.%n", firstStudentAge, firstStudentMark);
//		System.out.printf("The second student aged "
//				+ "%d achieved %.2f "
//				+ "for this module.%n", secondStudentAge, secondStudentMark);
//		System.out.printf("The third student aged "
//				+ "%d achieved %.2f "
//				+ "for this module.%n", thirdStudentAge, thirdStudentMark);
		
		String formatString = "The %s student aged "
				+ "%d achieved %.2f "
				+ "for this module.%n";
		System.out.printf(formatString, "first", firstStudentAge,
				firstStudentMark);
		System.out.printf(formatString, "second", secondStudentAge,
				secondStudentMark);
		System.out.printf(formatString, "third", thirdStudentAge,
				thirdStudentMark);
		
		
		System.out.printf(formatString, "first", firstStudentAge,
				firstStudentMark);
		System.out.printf(formatString, "second", secondStudentAge,
				secondStudentMark);
		System.out.printf(formatString, "third", thirdStudentAge,
				thirdStudentMark);
	}
	
}

