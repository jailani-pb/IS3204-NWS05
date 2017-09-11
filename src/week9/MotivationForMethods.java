package week9;

public class MotivationForMethods {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum from 1 to 10 is " + sum);
		
		sum = 0;
		for(int i = 20; i <= 37; i++) {
			sum += i;
		}
		System.out.println("Sum from 20 to 37 is " + sum);
		
		sum = 0;
		for(int i = 35; i <= 49; i++) {
			sum += i;
		}
		System.out.println("Sum from 35 to 49 is " + sum);
		
		// Repetitive code is tedious to read and modify.
		// This is why we need to implement methods.
	}
	
}


