package com.interpreter.modules;

public class ExpressionEvaluator {
	
	public static int add(int x, int y) {
		return x + y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	public static int modulo(int x, int y) {
		return x % y;
	}
	
	public static int postInc(int x) {
		return x++;
	}
	
	public static int postDec(int x) {
		return x--;
	}
	
	public static int preInc(int x) {
		return ++x;
	}
	
	public static int preDec(int x) {
		return  --x;
	}
	
	public static int negate(int x) {
		return -x;
	}
	
	public static int positive(int x) {
		return +x;
	}
	
	public static float add(float x, float y) {
		return x + y;
	}
	
	public static float subtract(float x, float y) {
		return x - y;
	}
	
	public static float multiply(float x, float y) {
		return x * y;
	}
	
	public static float divide(float x, float y) {
		return x / y;
	}
	
	public static float modulo(float x, float y) {
		return x % y;
	}
	
	public static float postInc(float x) {
		return x++;
	}
	
	public static float postDec(float x) {
		return x--;
	}
	
	public static float preInc(float x) {
		return ++x;
	}
	
	public static float preDec(float x) {
		return  --x;
	}
	
	public static float negate(float x) {
		return -x;
	}
	
	public static float positive(float x) {
		return +x;
	}
	
	public static int add(char x, char y) {
		return x + y;
	}
	
	public static int subtract(char x, char y) {
		return x - y;
	}
	
	public static int multiply(char x, char y) {
		return x * y;
	}
	
	public static int divide(char x, char y) {
		return x / y;
	}
	
	public static int modulo(char x, char y) {
		return x % y;
	}
	
	public static char postInc(char x) {
		return x++;
	}
	
	public static char postDec(char x) {
		return x--;
	}
	
	public static char preInc(char x) {
		return ++x;
	}
	
	public static char preDec(char x) {
		return  --x;
	}
	
	public static String concat(String x, String y) {
		return x + y;
	}
	
	public static String concat(String x, int y) {
		return x + y;
	}
	
	public static String concat(int x, String y) {
		return x + y;
	}
	
	public static String concat(String x, float y) {
		return x + y;
	}
	
	public static String concat(float x, String y) {
		return x + y;
	}
	
	public static String concat(String x, char y) {
		return x + y;
	}
	
	public static String concat(char x, String y) {
		return x + y;
	}
	
	public static int length(String x) {
		return x.length();
	}
	
	public static boolean negate(boolean x) {
		return !x;
	}
	
	public static boolean equal(boolean x, boolean y) {
		return x == y;
	}
	
	public static boolean notEqual(boolean x, boolean y) {
		return x != y;
	}
	
	public static boolean and(boolean x, boolean y) {
		return x && y;
	}
	
	public static boolean or(boolean x, boolean y) {
		return x || y;
	}
	
	public static boolean lessThan(int x, int y) {
		return x < y;
	}
	
	public static boolean lessThan(float x, float y) {
		return x < y;
	}
	
	public static boolean lessThan(char x, char y) {
		return x < y;
	}
	
	public static boolean lessThanOrEqual(int x, int y) {
		return x <= y;
	}
	
	public static boolean lessThanOrEqual(float x, float y) {
		return x <= y;
	}
	
	public static boolean lessThanOrEqual(char x, char y) {
		return x <= y;
	}
	
	public static boolean greaterThan(int x, int y) {
		return x > y;
	}
	
	public static boolean greaterThan(float x, float y) {
		return x > y;
	}
	
	public static boolean greaterThan(char x, char y) {
		return x > y;
	}
	
	public static boolean greaterThanOrEqual(int x, int y) {
		return x >= y;
	}
	
	public static boolean greaterThanOrEqual(float x, float y) {
		return x >= y;
	}
	
	public static boolean greaterThanOrEqual(char x, char y) {
		return x >= y;
	}
}
