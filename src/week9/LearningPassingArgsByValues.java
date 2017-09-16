package week9;

public class LearningPassingArgsByValues {

	static int y = 10;
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println("This is x:");
		System.out.println(incrementBy10(x));
		System.out.println(x);
		System.out.println("This is y:");
		System.out.println(incrementYBy20());
		System.out.println(y);
	}
	
	public static int incrementYBy20() {
		y += 20;
		return y;
	}
	
	public static int incrementBy10(int value) {
		value += 10;
		return value;
	}
	
	
}
