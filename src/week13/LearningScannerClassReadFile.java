package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearningScannerClassReadFile {

	public static void main(String[] args) {
		File file = new File("/home/jailanihar/mynewfile.txt");
		try {
			Scanner readFile = new Scanner(file);
			while(readFile.hasNextLine()) {
				System.out.println(readFile.nextLine());
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File location is invalid.");
			System.out.println(file.getAbsolutePath());
		}
	}
	
}






