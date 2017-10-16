package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleWritingXMLFormatFile {

	static Scanner scanUserInput = new Scanner(System.in);
	static File file;
	static StringBuilder fileContent = new StringBuilder();
	
	public static void main(String[] args) {
		System.out.println("Input xml file location:");
		String userInput = scanUserInput.nextLine();
		file = new File(userInput);
		boolean isFileAvailable = false;
		while(!isFileAvailable) {
			if(file.exists()) {
				try {
					Scanner readFile = new Scanner(file);
					fileContent = new StringBuilder();
					while(readFile.hasNextLine()) {
						fileContent.append(readFile.nextLine());
					}
					Pattern filePattern = Pattern.compile(
							"^<a>(<b>(.+?)</b>)*</a>$");
					Matcher fileMatcher = filePattern.matcher(fileContent);
					if(fileMatcher.matches()) {
						isFileAvailable = true;
						System.out.println("Formatting is valid.");
						System.out.println(fileContent);
					} else {
						isFileAvailable = false;
						System.out.println("Formatting is invalid.");
						System.out.println(fileContent);
						System.out.println("Re-input xml file location");
						userInput = scanUserInput.nextLine();
						file = new File(userInput);
					}
					readFile.close();
				} catch (FileNotFoundException e) {
					System.out.println(file.getAbsolutePath() + 
							" file is not available.");
				}
			} else {
				System.out.println("File is not available.");
				System.out.println(file.getAbsolutePath());
				System.out.println("Do you want to create a new file?");
				System.out.println("yes/no");
				userInput = scanUserInput.nextLine();
				if(userInput.trim().equalsIgnoreCase("yes")) {
					try {
						PrintWriter writeFile = new PrintWriter(file);
						writeFile.println("<a>");
						writeFile.println("</a>");
						writeFile.close();
						isFileAvailable = true;
						fileContent = new StringBuilder("<a></a>");
					} catch (FileNotFoundException e) {
						isFileAvailable = false;
						System.out.println("Directory location is invalid.");
						System.out.println("Re-input xml file location.");
						userInput = scanUserInput.nextLine();
						file = new File(userInput);
					}
				} else {
					System.out.println("Re-input xml file location");
					userInput = scanUserInput.nextLine();
					file = new File(userInput);
				}
			}
		}
		Pattern dataPattern = Pattern.compile("<b>(.+?)</b>");
		while(true) {
			System.out.println("Type new data: (q to quit)");
			String newData = scanUserInput.nextLine();
			if(newData.trim().equalsIgnoreCase("q")) {
				System.out.println("Application is terminated");
				break;
			}
			Matcher dataMatcher = dataPattern.matcher(fileContent);
			boolean isDataExists = false;
			while(dataMatcher.find()) {
				if(dataMatcher.group(1).equals(newData)) {
					isDataExists = true;
					break;
				}
			}
			if(isDataExists) {
				System.out.println("Data already exists.");
			} else {
				StringBuilder newDataFile = new StringBuilder();
				newDataFile.append("<b>");
				newDataFile.append(newData);
				newDataFile.append("</b>");
				fileContent.insert(
						fileContent.lastIndexOf("</a>"), newDataFile);
				try {
					PrintWriter writeFile = new PrintWriter(file);
					writeFile.println(fileContent);
					writeFile.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}





