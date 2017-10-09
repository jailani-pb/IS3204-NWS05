package week13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearningPatternMatcherClasses {

	public static void main(String[] args) {
		String icno = "01-123456";
		String icnoRegex = "^0[01]-[0-9]{6}$";
		Pattern icnoPattern = Pattern.compile(icnoRegex);
		Matcher icnoMatcher = icnoPattern.matcher(icno);
		System.out.println(icnoMatcher.matches());
		String icno2 = "51-123456";
		Matcher icno2Matcher = icnoPattern.matcher(icno2);
		System.out.println(icno2Matcher.matches());
		String icno3 = "00-1234567";
		Matcher icno3Matcher = icnoPattern.matcher(icno3);
		System.out.println(icno3Matcher.matches());
		
		String sict = "SchoolOfInformationCommunicationAndTechnology";
		String sictRegex = "o";
		Pattern sictPattern = Pattern.compile(sictRegex);
		Matcher sictMatcher = sictPattern.matcher(sict);
		System.out.println(sictMatcher.matches());
		sictMatcher.reset();
		int count = 0;
		while(sictMatcher.find()) {
			count++;
			System.out.println("Occurence " + count +
					" : " + sictMatcher.start() + " to " +
					sictMatcher.end());
		}
		
		// "<h1>A</h1>" + "<h2>B</h2>"
		StringBuilder htmlText = new StringBuilder("<h1>A</h1>");
		htmlText.append("<h2>B</h2>");
		htmlText.append("<p>C</p>");
		htmlText.append("<p>D</p>");
		htmlText.append("<h2>E</h2>");
		htmlText.append("<p>F</p>");
		
		// () is groupings in regular expression
		// This is a greedy quantifier, .*
//		String h2Regex = "(<h2>.*</h2>)";
		// This is a reluctant quantifier, .*?
		String h2Regex = "(<h2>.*?</h2>)";
		Pattern h2Pattern = Pattern.compile(h2Regex);
		Matcher h2Matcher = h2Pattern.matcher(htmlText);
		while(h2Matcher.find()) {
			System.out.println("Occurence index : " + 
					h2Matcher.start() + " to " + h2Matcher.end());
			System.out.println(h2Matcher.group(1));
		}
		
		String h2Regex2 = "(<h2>)(.*?)(</h2>)";
		Pattern h2Pattern2 = Pattern.compile(h2Regex2);
		Matcher h2Matcher2 = h2Pattern2.matcher(htmlText);
		while(h2Matcher2.find()) {
			System.out.println(h2Matcher2.group(2));
		}
	}
	
}



