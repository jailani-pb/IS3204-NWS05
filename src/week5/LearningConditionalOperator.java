package week5;

import java.util.Scanner;

public class LearningConditionalOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int powerValue = scanner.nextInt();
//		if((powerValue >= 1) && (powerValue <= 10)) {
//			System.out.println(Math.pow(5, powerValue));
//		} else {
//			System.out.println("Invalid Input");
//		}
		
		System.out.println(
				((powerValue >= 1) && (powerValue <= 10)) ?
						Math.pow(5, powerValue) : "Invalid Input"
				);
		
		scanner.close();
	}
	
}
