package week12;

public class LearningRegexBoundaryMatcher {

	public static void main(String[] args) {
		String message = "IS3204 Programming Application IS3204";
		System.out.println(message);
		System.out.println(message.replaceAll("IS3204", "YYY"));
		// Boundary matcher for beginning of the line.
		System.out.println(message.replaceAll("^IS3204", "YYY"));
		// Boundary matcher for end of line
		System.out.println(message.replaceAll("IS3204$", "YYY"));
		// Boundary matcher for word boundary
		System.out.println(message.replaceAll("\\b", "X"));
		// Boundary matcher for non-word boundary
		System.out.println(message.replaceAll("\\B", "X"));
	}
	
}


