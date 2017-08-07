package week4;

import javax.swing.JOptionPane;

public class LearningInputDialog {

	public static void main(String[] args) {
		// This is Input Dialog example
//		String message = 
//				JOptionPane.showInputDialog("Please input any text:");
//		JOptionPane.showMessageDialog(null, message);
//		System.out.println("The message typed is " + message);
		
		// This is Confirm Dialog example
//		int message = JOptionPane.showConfirmDialog(null, "Are you sure?");
//		System.out.println(message);
		
		try {
			String x = JOptionPane.showInputDialog("Please input value x:");
			String y = JOptionPane.showInputDialog("Please input value y:");
			int xInt = Integer.parseInt(x);
			int yInt = Integer.parseInt(y);
			System.out.println(x + y);
			System.out.println(xInt + yInt);
		} catch (Exception e) {
			System.out.println("You have input an invalid value.");
		}
	}
	
}
