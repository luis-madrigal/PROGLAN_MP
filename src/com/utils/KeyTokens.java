package com.utils;

import sun.rmi.runtime.Log;

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

    public enum LITERAL_TYPE{
        STRING("string"), INT("int"), FLOAT("float"), CHAR("char"), BOOL("boolean"), NULL("null"), VOID("void");
    	
    	protected String name;
    	
    	LITERAL_TYPE(String type) {
    		this.name = type;
		}
    }
}
