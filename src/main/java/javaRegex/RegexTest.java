package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	 
	public static void main(String[] args) {
		Pattern pattern =Pattern.compile("");
		Matcher matcher = pattern.matcher("");
		while (matcher.find()) {
		    	matcher.group(0);
		}
	}
	
	
	

}
