package week4;

public class LearningArithmetic {

	public static void main(String[] args) {
		// Unary +
		System.out.println(+5);
		// Unary -
		System.out.println(-5);
		// Addition
		System.out.println(5 + 2);
		// Subtraction
		System.out.println(5 - 2);
		// Multiplication
		System.out.println(5 * 2);
		// Division
		// int values will produce int result 5/2=2
		System.out.println(5 / 2);
		// double values will produce double result 5/2=2.5
		System.out.println((double) 5 / (double) 2);
		// Modulus
		System.out.println(5 % 2);
		System.out.println(8 % 3);
		// Example of modulus usage
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is an even number");
			} else {
				System.out.println(i + " is an odd number");
			}
		}
		
		// Example Arithmetic expressions
		System.out.println(3 + 4 * 4 + 5 * (4 + 3) - 1);
		
		// Exponent Operations
		// 2 to the power of 4
		System.out.println(Math.pow(2, 4));
		// 10 to the power of 5
		System.out.println(Math.pow(10, 5));
		// Squareroot of 16
		System.out.println(Math.sqrt(16));
		// Example: Pythagoras Theorem
		int a = 10;
		int b = 15;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println(c);
	}
	
}
