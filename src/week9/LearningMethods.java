package week9;

public class LearningMethods {

	public static void main(String[] args) {
		System.out.println(sumRangeValueAndProduceText(1, 10));
		System.out.println(sumRangeValueAndProduceText(20, 37));
		System.out.println(sumRangeValueAndProduceText(35, 49));
	}
	
	public static String 
		sumRangeValueAndProduceText(int lowerValue, int upperValue) {
		String text = "Sum from " + lowerValue + " to " + upperValue
				+ " is " + sumRangeValue(lowerValue, upperValue);
		return text;
	}
	
	public static int sumRangeValue(int lowerValue, int upperValue) {
		int sum = 0;
		for(int i = lowerValue; i <= upperValue; i++) {
			sum += i;
		}
		return sum;
	}
	
}






