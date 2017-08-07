package week4;

public class LearningRelationalOperators {

	public static void main(String[] args) {
		// Greater than
		System.out.println(10 > 2);
		System.out.println(10 > 15);
		System.out.println(10 > 10);
		// Less than
		System.out.println(10 < 2);
		System.out.println(10 < 15);
		System.out.println(10 < 10);
		// Greater than or equal to
		System.out.println(10 >= 2);
		System.out.println(10 >= 15);
		System.out.println(10 >= 10);
		// Less than or equal to
		System.out.println(10 <= 2);
		System.out.println(10 <= 15);
		System.out.println(10 <= 10);
		// Equal
		System.out.println(10 == 2);
		System.out.println(10 == 15);
		System.out.println(10 == 10);
		// Not equal to
		System.out.println(10 != 2);
		System.out.println(10 != 15);
		System.out.println(10 != 10);
		
		// Example 1
		int a = 15;
		if(a > 15) {
			System.out.println(a + " is greater than 15");
		} else {
			if(a == 15) {
				System.out.println(a + " is equal to 15");
			} else {
				System.out.println(a + " is less than 15");
			}
		}
		
		// Example 2
		while(a < 20) {
			System.out.println(a + " is less than 20.");
			a++;
		}
		System.out.println(a + " is now more than or equal to 20");
	}
	
}
