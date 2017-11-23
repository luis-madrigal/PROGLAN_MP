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
        
        ASSIGN("="),
        PLUSASSIGN("+="),
        SUBASSIGN("-="),
        MULTASSIGN("*="),
        DIVASSIGN("/="),
        MODASSIGN("%="),

        AND("&&"),
        OR("||"),
    	
    	INC("++"),
        DEC("--"),

    	NOT("!");
    	
    	protected String name;

    	OPERATOR(String token) {
            this.name = token;
        }

        @Override
        public String toString() {
            return this.name;
        }
        
        public static OPERATOR getEnum(String str) {
            for (OPERATOR o : OPERATOR.values()) {
                if (str.equalsIgnoreCase(o.name)) {
                    return o;
                }
            }
            return null;
        }
        
        public static OPERATOR getEnum(Object ob) {
        	String str = ob.toString();
            for (OPERATOR o : OPERATOR.values()) {
                if (str.equalsIgnoreCase(o.name)) {
                    return o;
                }
            }
            return null;
        }
        
        public static OPERATOR getOpOfAssign(OPERATOR op) {
        	String str = op.toString().substring(0, 1);
        	return OPERATOR.getEnum(str);
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
