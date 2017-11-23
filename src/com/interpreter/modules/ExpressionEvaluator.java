package com.interpreter.modules;

import com.interpreter.matchers.LiteralMatcher;
import com.utils.KeyTokens.LITERAL_TYPE;

public class ExpressionEvaluator {
	
	public static Object add(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.add((Integer)x, (Integer)y);
		}
		
		if(xType.equals(LITERAL_TYPE.CHAR) && yType.equals(LITERAL_TYPE.CHAR)) {
			return ExpressionEvaluator.add((Character)x, (Character)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.add((Float)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.add((Integer)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.add((Float)x, (Integer)y);
		}
		
		return ExpressionEvaluator.concat(x.toString(), y.toString());
	}
	
	public static Object subtract(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.subtract((Integer)x, (Integer)y);
		}
		
		if(xType.equals(LITERAL_TYPE.CHAR) && yType.equals(LITERAL_TYPE.CHAR)) {
			return ExpressionEvaluator.subtract((Character)x, (Character)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.subtract((Float)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.subtract((Integer)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.subtract((Float)x, (Integer)y);
		}
		
		return null;
	}
	
	public static Object multiply(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.multiply((Integer)x, (Integer)y);
		}
		
		if(xType.equals(LITERAL_TYPE.CHAR) && yType.equals(LITERAL_TYPE.CHAR)) {
			return ExpressionEvaluator.multiply((Character)x, (Character)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.multiply((Float)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.multiply((Integer)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.multiply((Float)x, (Integer)y);
		}
		
		return null;
	}
	
	public static Object divide(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.divide((Integer)x, (Integer)y);
		}
		
		if(xType.equals(LITERAL_TYPE.CHAR) && yType.equals(LITERAL_TYPE.CHAR)) {
			return ExpressionEvaluator.divide((Character)x, (Character)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.divide((Float)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.divide((Integer)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.divide((Float)x, (Integer)y);
		}
		
		return null;
	}
	
	public static Object modulo(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.modulo((Integer)x, (Integer)y);
		}
		
		if(xType.equals(LITERAL_TYPE.CHAR) && yType.equals(LITERAL_TYPE.CHAR)) {
			return ExpressionEvaluator.modulo((Character)x, (Character)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.modulo((Float)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.INT) && yType.equals(LITERAL_TYPE.FLOAT)) {
			return ExpressionEvaluator.modulo((Integer)x, (Float)y);
		}
		
		if(xType.equals(LITERAL_TYPE.FLOAT) && yType.equals(LITERAL_TYPE.INT)) {
			return ExpressionEvaluator.modulo((Float)x, (Integer)y);
		}
		
		return null;
	}
	
	public static Integer add(Integer x, Integer y) {
		return x + y;
	}
	
	public static Float add(Float x, Integer y) {
		return x + y;
	}
	
	public static Float add(Integer x, Float y) {
		return x + y;
	}

	public static Integer subtract(Integer x, Integer y) {
		return x - y;
	}
	
	public static Float subtract(Float x, Integer y) {
		return x - y;
	}
	
	public static Float subtract(Integer x, Float y) {
		return x - y;
	}
	
	public static Integer multiply(Integer x, Integer y) {
		return x * y;
	}
	
	public static Float multiply(Float x, Integer y) {
		return x * y;
	}
	
	public static Float multiply(Integer x, Float y) {
		return x * y;
	}
	
	public static Integer divide(Integer x, Integer y) {
		return x / y;
	}
	
	public static Float divide(Float x, Integer y) {
		return x / y;
	}
	
	public static Float divide(Integer x, Float y) {
		return x / y;
	}
	
	public static Integer modulo(Integer x, Integer y) {
		return x % y;
	}
	
	public static Float modulo(Float x, Integer y) {
		return x % y;
	}
	
	public static Float modulo(Integer x, Float y) {
		return x % y;
	}
	
	public static Integer postInc(Integer x) {
		return x++;
	}
	
	public static Integer postDec(Integer x) {
		return x--;
	}
	
	public static Integer preInc(Integer x) {
		return ++x;
	}
	
	public static Integer preDec(Integer x) {
		return  --x;
	}
	
	public static Integer negate(Integer x) {
		return -x;
	}
	
	public static Integer positive(Integer x) {
		return +x;
	}
	
	public static Float add(Float x, Float y) {
		return x + y;
	}
	
	public static Float subtract(Float x, Float y) {
		return x - y;
	}
	
	public static Float multiply(Float x, Float y) {
		return x * y;
	}
	
	public static Float divide(Float x, Float y) {
		return x / y;
	}
	
	public static Float modulo(Float x, Float y) {
		return x % y;
	}
	
	public static Float postInc(Float x) {
		return x++;
	}
	
	public static Float postDec(Float x) {
		return x--;
	}
	
	public static Float preInc(Float x) {
		return ++x;
	}
	
	public static Float preDec(Float x) {
		return  --x;
	}
	
	public static Float negate(Float x) {
		return -x;
	}
	
	public static Float positive(Float x) {
		return +x;
	}
	
	public static Integer add(Character x, Character y) {
		return x + y;
	}
	
	public static Integer subtract(Character x, Character y) {
		return x - y;
	}
	
	public static Integer multiply(Character x, Character y) {
		return x * y;
	}
	
	public static Integer divide(Character x, Character y) {
		return x / y;
	}
	
	public static Integer modulo(Character x, Character y) {
		return x % y;
	}
	
	public static Character postInc(Character x) {
		return x++;
	}
	
	public static Character postDec(Character x) {
		return x--;
	}
	
	public static Character preInc(Character x) {
		return ++x;
	}
	
	public static Character preDec(Character x) {
		return  --x;
	}
	
	public static String concat(String x, String y) {
		return x + y;
	}
	
//	public static String concat(String x, Integer y) {
//		return x + y;
//	}
//	
//	public static String concat(Integer x, String y) {
//		return x + y;
//	}
//	
//	public static String concat(String x, Float y) {
//		return x + y;
//	}
//	
//	public static String concat(Float x, String y) {
//		return x + y;
//	}
//	
//	public static String concat(String x, Character y) {
//		return x + y;
//	}
//	
//	public static String concat(Character x, String y) {
//		return x + y;
//	}
	
	public static Integer length(String x) {
		return x.length();
	}
	
	public static Boolean negate(Boolean x) {
		return !x;
	}
	
	public static Boolean equal(Boolean x, Boolean y) {
		return x == y;
	}
	
	public static Boolean notEqual(Boolean x, Boolean y) {
		return x != y;
	}
	
	public static Boolean and(Boolean x, Boolean y) {
		return x && y;
	}
	
	public static Boolean or(Boolean x, Boolean y) {
		return x || y;
	}
	
	public static Boolean lessThan(Integer x, Integer y) {
		return x < y;
	}
	
	public static Boolean lessThan(Float x, Float y) {
		return x < y;
	}
	
	public static Boolean lessThan(Character x, Character y) {
		return x < y;
	}
	
	public static Boolean lessThanOrEqual(Integer x, Integer y) {
		return x <= y;
	}
	
	public static Boolean lessThanOrEqual(Float x, Float y) {
		return x <= y;
	}
	
	public static Boolean lessThanOrEqual(Character x, Character y) {
		return x <= y;
	}
	
	public static Boolean greaterThan(Integer x, Integer y) {
		return x > y;
	}
	
	public static Boolean greaterThan(Float x, Float y) {
		return x > y;
	}
	
	public static Boolean greaterThan(Character x, Character y) {
		return x > y;
	}
	
	public static Boolean greaterThanOrEqual(Integer x, Integer y) {
		return x >= y;
	}
	
	public static Boolean greaterThanOrEqual(Float x, Float y) {
		return x >= y;
	}
	
	public static Boolean greaterThanOrEqual(Character x, Character y) {
		return x >= y;
	}
}
