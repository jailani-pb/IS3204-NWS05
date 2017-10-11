package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class LearningFileWriterClass {

	public static void main(String[] args) {
		// For windows 
		// "C:\\Users\\pcname\\Desktop\\filename"
		File file = new File("/home/jailanihar/mynewfile.txt");
		try {
			PrintWriter writeFile = new PrintWriter
					(new FileWriter(file, true));
			//								^^
			// true if you want to modify the file.
			// false if you want to override the file.
			writeFile.println("IS3204");
			writeFile.println("Programming");
			writeFile.println("Application");
			Date now = new Date();
			writeFile.println(now);
			writeFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File location is invalid.");
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Unable to write file.");
			System.out.println(file.getAbsolutePath());
		}
	}
	
}
