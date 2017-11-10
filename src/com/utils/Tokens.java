package com.utils;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Tokens {
	public static final String KEYWORDS = "from|take|everything|take everything|The|script|universal|template|permanent|is a|is an|that can|static|hereditary|secret|starring|ignores|this|super|new|ACT|interface|if|else|switch|version|original|when|replay|rehearse|break|continue|give|ignore|audition|catch|finally|Say|Write|to|can act as|composition|cast|as|boolean|byte|short|int|long|char|float|double|string";
	public static final String OPERATORS = "=|>|<|!|~|\\?|:|==|<=|>=|!=|&&|\\|\\||\\+\\+|--|\\+|-|\\*|/|&|\\||^|%|\\+=|-=|\\*=|/=|&=|\\|=|^=|%=|<<=|>>=|>>>=";
	public static final String SEPARATORS = "\\(|\\)|\\{|\\}|[|]|;|,|\\.|\\{A\\}|\\{Z\\}|\\{SCENE\\}|\\{END\\}";
	
	@SuppressWarnings("serial")
	public static final ArrayList<String> COMPOUND_KEYWORDS_START = new ArrayList<String>() {{
																		add("take");
																		add("is");
																		add("that");
																		add("can");
																	}};
																	
																	
	@SuppressWarnings("serial")
	public static final ArrayList<String> COMPOUND_KEYWORDS = new ArrayList<String>() {{
																	add("take everything");
																	add("is a");
																	add("is an");
																	add("that can");
																	add("can act as");
																}};
	
//	Original:
//	public static final String SEPARATORS = "\\(|\\)|\\{|\\}|[|]|;|,|\\.";
	
	
//	public static final String KEYWORDS = "from|take|everything|take everything|The|script|universal|template|permanent|is a|is an|that can|static|hereditary|secret|starring|ignores|this|super|new|ACT|interface|if|else|switch|version|original|when|replay|rehearse|break|continue|give|ignore|audition|catch|finally|Say|Write|to|can act as|composition|cast|as|boolean|byte|short|int|long|char|float|double";
//	public static final String OPERATORS = "=|>|<|!|~|\\?|:|==|<=|>=|!=|&&|\\|\\||\\+\\+|--|\\+|-|\\*|/|&|\\||^|%|\\+=|-=|\\*=|/=|&=|\\|=|^=|%=|<<=|>>=|>>>=";

	
//	private static Pattern pattern;
//	private static Matcher matcher;
	
	public static boolean match(String toMatch, String tokenType) {
//		pattern = Pattern.compile("'("+tokenType+")'");
//		matcher = pattern.matcher(toMatch);

		
		return Pattern.matches("'("+tokenType+")'", toMatch);
//		System.out.println(tokenType);
//		return toMatch.equalsIgnoreCase("'("+tokenType+")'");
	}
}
