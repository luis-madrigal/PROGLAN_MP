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
	
	public static Object postInc(Object x) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		
		if(xType.equals(LITERAL_TYPE.INT))
			return ExpressionEvaluator.postInc((Integer) x);
		if(xType.equals(LITERAL_TYPE.CHAR))
			return ExpressionEvaluator.postInc((Character) x);
		if(xType.equals(LITERAL_TYPE.FLOAT))
			return ExpressionEvaluator.postInc((Float) x);
		
		return null;
	}
	
	public static Object preInc(Object x) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		
		if(xType.equals(LITERAL_TYPE.INT))
			return ExpressionEvaluator.preInc((Integer) x);
		if(xType.equals(LITERAL_TYPE.CHAR))
			return ExpressionEvaluator.preInc((Character) x);
		if(xType.equals(LITERAL_TYPE.FLOAT))
			return ExpressionEvaluator.preInc((Float) x);
		
		return null;
	}
	
	public static Object postDec(Object x) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		
		if(xType.equals(LITERAL_TYPE.INT))
			return ExpressionEvaluator.postDec((Integer) x);
		if(xType.equals(LITERAL_TYPE.CHAR))
			return ExpressionEvaluator.postDec((Character) x);
		if(xType.equals(LITERAL_TYPE.FLOAT))
			return ExpressionEvaluator.postDec((Float) x);
		
		return null;
	}
	
	public static Object preDec(Object x) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		
		if(xType.equals(LITERAL_TYPE.INT))
			return ExpressionEvaluator.preDec((Integer) x);
		if(xType.equals(LITERAL_TYPE.CHAR))
			return ExpressionEvaluator.preDec((Character) x);
		if(xType.equals(LITERAL_TYPE.FLOAT))
			return ExpressionEvaluator.preDec((Float) x);
		
		return null;
	}
	
	public static Object negate(Object x) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		
		if(xType.equals(LITERAL_TYPE.INT))
			return ExpressionEvaluator.negate((Integer) x);
		if(xType.equals(LITERAL_TYPE.CHAR))
			return ExpressionEvaluator.negate((Character) x);
		if(xType.equals(LITERAL_TYPE.FLOAT))
			return ExpressionEvaluator.negate((Float) x);
		
		return null;
	}
	
	public static Object positive(Object x) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		
		if(xType.equals(LITERAL_TYPE.INT))
			return ExpressionEvaluator.positive((Integer) x);
		if(xType.equals(LITERAL_TYPE.CHAR))
			return ExpressionEvaluator.positive((Character) x);
		if(xType.equals(LITERAL_TYPE.FLOAT))
			return ExpressionEvaluator.positive((Float) x);
		
		return null;
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
	
	public static Boolean lessThan(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.lessThan((Integer) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.lessThan((Integer) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.lessThan((Integer) x, (Integer)y);
		}
		if(xType.equals(LITERAL_TYPE.CHAR)) {
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.lessThan((Character) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.lessThan((Character) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.lessThan((Character) x, (Character)y);
		}
		if(xType.equals(LITERAL_TYPE.FLOAT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.lessThan((Float) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.lessThan((Float) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.lessThan((Float) x, (Float)y);
		}
		return null;
	}
	
	public static Boolean lessThanOrEqual(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.lessThanOrEqual((Integer) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.lessThanOrEqual((Integer) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.lessThanOrEqual((Integer) x, (Integer)y);
		}
		if(xType.equals(LITERAL_TYPE.CHAR)) {
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.lessThanOrEqual((Character) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.lessThanOrEqual((Character) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.lessThanOrEqual((Character) x, (Character)y);
		}
		if(xType.equals(LITERAL_TYPE.FLOAT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.lessThanOrEqual((Float) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.lessThanOrEqual((Float) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.lessThanOrEqual((Float) x, (Float)y);
		}
		return null;
	}
	
	public static Boolean greaterThan(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.greaterThan((Integer) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.greaterThan((Integer) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.greaterThan((Integer) x, (Integer)y);
			
		}
		if(xType.equals(LITERAL_TYPE.CHAR)) {
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.greaterThan((Character) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.greaterThan((Character) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.greaterThan((Character) x, (Character)y);
		}
		if(xType.equals(LITERAL_TYPE.FLOAT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.greaterThan((Float) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.greaterThan((Float) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.greaterThan((Float) x, (Float)y);
		}
		return null;
	}
	
	public static Boolean greaterThanOrEqual(Object x, Object y) {
		LITERAL_TYPE xType = LiteralMatcher.instance().getLiteralType(x);
		LITERAL_TYPE yType = LiteralMatcher.instance().getLiteralType(y);
		
		if(xType.equals(LITERAL_TYPE.INT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.greaterThanOrEqual((Integer) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.greaterThanOrEqual((Integer) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.greaterThanOrEqual((Integer) x, (Integer)y);
		}
		if(xType.equals(LITERAL_TYPE.CHAR)) {
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.greaterThanOrEqual((Character) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.greaterThanOrEqual((Character) x, (Float)y);
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.greaterThanOrEqual((Character) x, (Character)y);
		}
		if(xType.equals(LITERAL_TYPE.FLOAT)) {
			if(yType.equals(LITERAL_TYPE.CHAR))
				return ExpressionEvaluator.greaterThanOrEqual((Float) x, (Character)y);
			if(yType.equals(LITERAL_TYPE.INT))
				return ExpressionEvaluator.greaterThanOrEqual((Float) x, (Integer)y);
			if(yType.equals(LITERAL_TYPE.FLOAT))
				return ExpressionEvaluator.greaterThanOrEqual((Float) x, (Float)y);
		}
		return null;
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
	
	public static Boolean lessThan(Integer x, Float y) {
		return x < y;
	}
	
	public static Boolean lessThan(Integer x, Character y) {
		return x < y;
	}
	
	public static Boolean lessThan(Float x, Character y) {
		return x < y;
	}
	
	public static Boolean lessThan(Float x, Integer y) {
		return x < y;
	}
	
	public static Boolean lessThan(Character x, Integer y) {
		return x < y;
	}
	
	public static Boolean lessThan(Character x, Float y) {
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
	
	public static Boolean lessThanOrEqual(Integer x, Float y) {
		return x < y;
	}
	
	public static Boolean lessThanOrEqual(Integer x, Character y) {
		return x < y;
	}
	
	public static Boolean lessThanOrEqual(Float x, Character y) {
		return x < y;
	}
	
	public static Boolean lessThanOrEqual(Float x, Integer y) {
		return x < y;
	}
	
	public static Boolean lessThanOrEqual(Character x, Integer y) {
		return x < y;
	}
	
	public static Boolean lessThanOrEqual(Character x, Float y) {
		return x < y;
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
	
	public static Boolean greaterThan(Integer x, Float y) {
		return x < y;
	}
	
	public static Boolean greaterThan(Integer x, Character y) {
		return x < y;
	}
	
	public static Boolean greaterThan(Float x, Character y) {
		return x < y;
	}
	
	public static Boolean greaterThan(Float x, Integer y) {
		return x < y;
	}
	
	public static Boolean greaterThan(Character x, Integer y) {
		return x < y;
	}
	
	public static Boolean greaterThan(Character x, Float y) {
		return x < y;
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
	
	public static Boolean greaterThanOrEqual(Integer x, Float y) {
		return x < y;
	}
	
	public static Boolean greaterThanOrEqual(Integer x, Character y) {
		return x < y;
	}
	
	public static Boolean greaterThanOrEqual(Float x, Character y) {
		return x < y;
	}
	
	public static Boolean greaterThanOrEqual(Float x, Integer y) {
		return x < y;
	}
	
	public static Boolean greaterThanOrEqual(Character x, Integer y) {
		return x < y;
	}
	
	public static Boolean greaterThanOrEqual(Character x, Float y) {
		return x < y;
	}
}
