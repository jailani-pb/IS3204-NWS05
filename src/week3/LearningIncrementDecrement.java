package week3;

public class LearningIncrementDecrement {

	public static void main(String[] args) {
		int x = 3;
		System.out.println(x);
//		x = x + 1;
		x++;
		System.out.println(x);
//		x = x - 1;
		x--;
		System.out.println(x);
		x--;
		System.out.println(x);
		// Example using increment.
		for(int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
		}
		
		int y = 3;
		int z = 3;
		// PreIncrement
		System.out.println("y = " + (++y));
		System.out.println(y);
		// PostIncrement
		System.out.println("z = " + (z++));
		System.out.println(z);
		
		int a = 3;
		int b = 3;
		// PreDecrement
		System.out.println("a = " + (--a));
		System.out.println(a);
		// PostDecrement
		System.out.println("b = " + (b--));
		System.out.println(b);
	}
	
}
