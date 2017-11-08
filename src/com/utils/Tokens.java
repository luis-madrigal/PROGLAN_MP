package com.utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokens {
	public static final String KEYWORDS = "asd|from|take|everything|take everything|The|script|universal|template|permanent|is a|is an|that can|static|hereditary|secret|starring|ignores|this|super|new|ACT|interface|if|else|switch|version|original|when|replay|rehearse|break|continue|give|ignore|audition|catch|finally|Say|Write|to|can act as|composition|cast|as|boolean|byte|short|int|long|char|float|double";
	public static final String OPERATORS = "=|>|<|!|~|\\?|:|==|<=|>=|!=|&&|\\|\\||\\+\\+|--|\\+|-|\\*|/|&|\\||^|%|\\+=|-=|\\*=|/=|&=|\\|=|^=|%=|<<=|>>=|>>>=";
	public static final String SEPARATORS = "\\(|\\)|\\{|\\}|[|]|;|,|\\.|\\{A\\}|\\{Z\\}|\\{SCENE\\}|\\{END\\}";
	
//	Original:
//	public static final String SEPARATORS = "\\(|\\)|\\{|\\}|[|]|;|,|\\.";
	
	
//	public static final String KEYWORDS = "from|take|everything|take everything|The|script|universal|template|permanent|is a|is an|that can|static|hereditary|secret|starring|ignores|this|super|new|ACT|interface|if|else|switch|version|original|when|replay|rehearse|break|continue|give|ignore|audition|catch|finally|Say|Write|to|can act as|composition|cast|as|boolean|byte|short|int|long|char|float|double";
//	public static final String OPERATORS = "=|>|<|!|~|\\?|:|==|<=|>=|!=|&&|\\|\\||\\+\\+|--|\\+|-|\\*|/|&|\\||^|%|\\+=|-=|\\*=|/=|&=|\\|=|^=|%=|<<=|>>=|>>>=";

	
	private static Pattern pattern;
	private static Matcher matcher;
	
	public static boolean match(String toMatch, String tokenType) {
//		pattern = Pattern.compile("'("+tokenType+")'");
//		matcher = pattern.matcher(toMatch);

		
		return Pattern.matches("'("+tokenType+")'", toMatch);
	}
}
