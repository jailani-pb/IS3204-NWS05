package week3;

public class LearningTypeCasting {

	public static void main(String[] args) {
		// Typecasting from small to big data type.
		byte exampleByte = 100;
		short byteToShort = exampleByte;
		System.out.println(byteToShort);
		int shortToInt = byteToShort;
		System.out.println(shortToInt);
		long intToLong = shortToInt;
		System.out.println(intToLong);
		
		// Typecasting from big to small data type.
		double exampleDouble = 3.123456789012345678901234567890d;
		System.out.println(exampleDouble);
		float doubleToFloat = (float) exampleDouble;
		System.out.println(doubleToFloat);
		
		long exampleLong = 9000000000000000L;
		System.out.println(exampleLong);
		int longToInt = (int) exampleLong;
		System.out.println(longToInt);
		short intToShort = (short) longToInt;
		System.out.println(intToShort);
		byte shortToByte = (byte) intToShort;
		System.out.println(shortToByte);
		System.out.println(exampleLong);
		System.out.println(longToInt);
		System.out.println(intToShort);
	}
	
}
