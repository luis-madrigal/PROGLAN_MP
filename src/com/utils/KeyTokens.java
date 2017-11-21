package com.utils;

public class KeyTokens {

    //Binary Operators
    public static class BIN {
        public enum Arithmetic {
            ADD("+"),
            SUB("-"),
            MULT("*"),
            DIV("/");

            protected String token;

            Arithmetic(String token) {
                this.token = token;
            }

            @Override
            public String toString() {
                return this.token;
            }
        }

        public enum Logical {
            LESS("<"),
            LEQ("<="),
            GREATER(">"),
            GEQ(">="),
            EQUAL("=="),
            NEQUAL("!="),

            AND("&&"),
            OR("||");

            protected String token;

            Logical(String token) {
                this.token = token;
            }

            @Override
            public String toString() {
                return this.token;
            }
        }
    }
    
    public enum OPERATOR {
    	ADD("+"),
        SUB("-"),
        MULT("*"),
        DIV("/"),
    	LESS("<"),
        LEQ("<="),
        GREATER(">"),
        GEQ(">="),
        EQUAL("=="),
        NEQUAL("!="),

        AND("&&"),
        OR("||"),
    	
    	INC("++"),
        DEC("--"),

    	NOT("!");
    	
    	protected String token;

    	OPERATOR(String token) {
            this.token = token;
        }

        @Override
        public String toString() {
            return this.token;
        }
        
        public static OPERATOR toEnum(String s) {//TODO: inefficient
        	for(int i = 0; i < values().length; i++) {
        		if(s.equals(values()[i]))
        			return values()[i];
        	}
        	return null;
        }
        
        public static OPERATOR toEnum(Object ob) {//TODO: inefficient
        	String s = ob.toString();
        	for(int i = 0; i < values().length; i++) {
        		if(s.equals(values()[i]))
        			return values()[i];
        	}
        	return null;
        }
    }

    public static class UNARY {
        public enum Arithmetic_U {
            INC("++"),
            DEC("--");

            protected String token;

            Arithmetic_U(String token) {
                this.token = token;
            }

            @Override
            public String toString() {
                return this.token;
            }
        }

        public enum Logical_U {
            NOT("!");

            protected String token;

            Logical_U(String token) {
                this.token = token;
            }

            @Override
            public String toString() {
                return this.token;
            }
        }
    }

    public enum TERMINAL_TYPE{
        VARIABLE, LITERAL;
    }

    public enum LITERAL_TYPE{//TODO: better implementation
        STRING("string"), INT("int"), FLOAT("float"), CHAR("char"), BOOLEAN("boolean"), NULL("null"), VOID("void");
    
    	protected String name;

    	LITERAL_TYPE(String type) {
    		this.name = type;
		}
 
        public static LITERAL_TYPE getEnum(String str) {
            for (LITERAL_TYPE l : LITERAL_TYPE.values()) {
                if (str.equalsIgnoreCase(l.name)) {
                    return l;
                }
            }
            return null;
        }

    }
}
