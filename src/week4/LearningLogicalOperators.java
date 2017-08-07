package week4;

public class LearningLogicalOperators {

	public static void main(String[] args) {
		// NOT
		System.out.println("True: " + true);
		System.out.println("NOT True: " + !true);
		System.out.println("False: " + false);
		System.out.println("NOT False: " + !false);
		int a = 10;
		int b = 15;
		System.out.println("Is a NOT greater than b? " + !(a > b));
		// Example of NOT usage
		while(!(a >= b)) {
			System.out.println("a is NOT greater than or equal to b");
			a++;
		}
		System.out.println("a is now greater than b.");
		System.out.println();
		// AND
		System.out.println("True AND True: ");
		System.out.println(true && true);
		System.out.println("True AND False: ");
		System.out.println(true && false);
		System.out.println("False AND True: ");
		System.out.println(false && true);
		System.out.println("False AND False: ");
		System.out.println(false && false);
		int c = 5;
		int d = 10;
		int e = 15;
		System.out.println("Is d > c AND d > e?");
		System.out.println((d > c) && (d > e));
		if((d > c) && (d > e)) {
			System.out.println("d is greater than c,e");
		} else {
			System.out.println("d is less than c/e");
		}
		System.out.println();
		// OR
		System.out.println("True OR True: ");
		System.out.println(true || true);
		System.out.println("True OR False: ");
		System.out.println(true || false);
		System.out.println("False OR True: ");
		System.out.println(false || true);
		System.out.println("False OR False: ");
		System.out.println(false || false);
		int f = 20;
		int g = 80;
		int h = 40;
		System.out.println("Is f > g OR g > h? ");
		System.out.println((f > g) || (g > h));
		if((f > g) || (g > h)) { 
			System.out.println("Either f > g or g > h is true.");
		} else {
			System.out.println("Both is false.");
		}
		System.out.println();
		// Combining multiple logical operators
		System.out.println("c > a OR d <= b AND e <= g");
		System.out.println((c > a) || (d <= b) && (e <= g));
		System.out.println("c > a OR (d <= c AND e <= g)");
		System.out.println((c > a) || ((d <= c) && (e <= g)));
		System.out.println("(c > a OR a == b) OR (d <= c AND e <= g)");
		System.out.println(((c > a) || (a == b)) || ((d <= c) && (e <= g)));
	}
	
}
