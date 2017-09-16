package week9;

public class LearningMethodOverloading {

	public static void main(String[] args) {
		System.out.println(incrementBy10(21.3));
		System.out.println(incrementBy10(50));
		System.out.println(incrementBy10(10, 100));
	}
	
	public static int incrementBy10(int value) {
		value += 10;
		return value;
	}
	
	public static int incrementBy10(int x, int y) {
		x += y;
		x += 10;
		return x;
	}
	
	public static double incrementBy10(double value) {
		value += 10.0;
		return value;
	}
	
}
