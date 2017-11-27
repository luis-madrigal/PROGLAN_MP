package com.ide.styles;

import javax.swing.text.Segment;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

import com.utils.Tokens;

/**
 * Reference:
 * https://github.com/bobbylight/RSyntaxTextArea/wiki/Adding-Syntax-Highlighting-for-a-new-Language#UsingTMM
 * @author Candy
 *
 */
public class ManuScriptTokenMaker extends AbstractTokenMaker {

	@Override
	/**
	 * Returns a list of tokens representing the given text.
	 *
	 * @param text The text to break into tokens.
	 * @param startTokenType The token with which to start tokenizing.
	 * @param startOffset The offset at which the line of tokens begins.
	 * @return A linked list of tokens representing <code>text</code>.
	 */
	public Token getTokenList(Segment text, int startTokenType, int startOffset) {

	   resetTokenList();

	   char[] array = text.array;
	   int offset = text.offset;
	   int count = text.count;
	   int end = offset + count;

	   // Token starting offsets are always of the form:
	   // 'startOffset + (currentTokenStart-offset)', but since startOffset and
	   // offset are constant, tokens' starting positions become:
	   // 'newStartOffset+currentTokenStart'.
	   int newStartOffset = startOffset - offset;

	   int currentTokenStart = offset;
	   int currentTokenType  = startTokenType;
	   
	   for (int i=offset; i<end; i++) {

	      // char c = array[i];
	      char c = array[i];
	     
	      switch (currentTokenType) {

	         case Token.NULL:

	            currentTokenStart = i;   // Starting a new token here.
	       
		            switch (c) {
	
		               case ' ':
		               case '\t':
		                  currentTokenType = Token.WHITESPACE;
		                  break;
	
		               case '"':
		                  currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
		                  break;
		                  
		               case '\'':
			                  currentTokenType = Token.LITERAL_CHAR;
			                  break;
	
		               case '#':
		                  currentTokenType = Token.COMMENT_EOL;
		                  break;
	
		                
		               
		               case '[':
		            	   String line = "";
		            	   for(int k = i; k < end; k++) {
		            		   line += array[k];
		            	   }
		            	   System.out.println("LINE out "+line);
		            	 
		            	   
		            	   if(line.contains("]:")) {
		            		   currentTokenType = Token.COMMENT_EOL;
				               break;
		            	   }
		            	   
		            	   
		               case '*':
		            	   line = "";
		            	   for(int k = i; k < end; k++) {
		            		   line += array[k];
		            	   }
		            	 
		            	   
		            	   if(line.length() > 2 &&
		            			   line.substring(0, 3).contains("]*")) {
		            		   currentTokenType = Token.COMMENT_MULTILINE;
				               break;
		            	   }
		            	   
		               default:
		                  if (RSyntaxUtilities.isDigit(c)) {
		                     currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
		                     break;
		                  }
		                  else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
		                     currentTokenType = Token.IDENTIFIER;
		                     break;
		                  }
		                  
		                  // Anything not currently handled - mark as an identifier
		                  currentTokenType = Token.IDENTIFIER;
		                  break;
	
		            } // End of switch (c).
	            
	            break;

	         case Token.WHITESPACE:
	        
		            switch (c) {
	
		               case ' ':
		               case '\t':
		                  break;   // Still whitespace.
	
		               case '"':
		                  addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
		                  currentTokenStart = i;
		                  currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
		                  break;
		                  
		               case '\'':
			                  addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
			                  currentTokenStart = i;
			                  currentTokenType = Token.LITERAL_CHAR;
			                  break;
		
			                  
		               case '[':
		            	   String line = "";
		            	   for(int k = i; k < end; k++) {
		            		   line += array[k];
		            	   }
	
		            	  
		            	   if(line.contains("]:")) {
		            		   currentTokenType = Token.COMMENT_EOL;
				               break;
		            	   }
			                  
		               case '*':
		            	   line = "";
		            	   for(int k = i; k < end; k++) {
		            		   line += array[k];
		            	   }
	
		            	  
		            	   if(line.length() > 2 &&
		            			   line.substring(0, 3).contains("]*")) {
		            		   addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
				                  currentTokenStart = i;
				                  currentTokenType = Token.COMMENT_MULTILINE;
				                  break;
		            	   }
			                
	
		               default:   // Add the whitespace token and start anew.
	
		                  addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
		                  currentTokenStart = i;
	
		                  if (RSyntaxUtilities.isDigit(c)) {
		                     currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
		                     break;
		                  }
		                  else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
		                     currentTokenType = Token.IDENTIFIER;
		                     break;
		                  }
	
		                  // Anything not currently handled - mark as identifier
		                  currentTokenType = Token.IDENTIFIER;
	
		            } // End of switch (c).
	      		
	            break;

	         default: // Should never happen
	         case Token.IDENTIFIER:
	        	   	            	
		            		switch (c) {
			
				               case ' ':
				               case '\t':
				                  addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
				                  currentTokenStart = i;
				                  currentTokenType = Token.WHITESPACE;
				                  break;
			
				               case '"':
				                  addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
				                  currentTokenStart = i;
				                  currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
				                  break;
				                  
				               case '\'':
					                  addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
					                  currentTokenStart = i;
					                  currentTokenType = Token.LITERAL_CHAR;
					                  break;
					                  
				               case '*':
				            	   String line = "";
				            	   for(int k = i; k < end; k++) {
				            		   line += array[k];
				            	   }
			
				            	  
				            	   if(line.length() > 2 &&
				            			   line.substring(0, 3).contains("]*")) {
				            		   addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
						                  currentTokenStart = i;
						                  currentTokenType = Token.COMMENT_MULTILINE;
						                  break;
				            	   }					                 
			
				               default:
				                  if (RSyntaxUtilities.isLetterOrDigit(c) || c=='/' || c=='_') {
				                     break;   // Still an identifier of some type.
				                  }
				                  // Otherwise, we're still an identifier (?).
			
				            	} // End of switch (c).
		            		
	            break;

	         case Token.LITERAL_NUMBER_DECIMAL_INT:

	            switch (c) {

	               case ' ':
	               case '\t':
	                  addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
	                  currentTokenStart = i;
	                  currentTokenType = Token.WHITESPACE;
	                  break;

	               case '"':
	                  addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
	                  currentTokenStart = i;
	                  currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
	                  break;

	               case '\'':
		                  addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
		                  currentTokenStart = i;
		                  currentTokenType = Token.LITERAL_CHAR;
		                  break;

		               
	               case '[': // TODO [S]
	            	   String line = "";
	            	   for(int k = i; k < end; k++) {
	            		   line += array[k];
	            	   }

	            	  
	            	   if(line.length() > 2 &&
	            			   line.substring(0, 3).contains("]*")) {
	            		      addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
			                  currentTokenStart = i;
			                  currentTokenType = Token.COMMENT_MULTILINE;
			                  break;
	            	   }					                 
		            
		                  
	               default:

	                  if (RSyntaxUtilities.isDigit(c)) {
	                     break;   // Still a literal number.
	                  }

	                  // Otherwise, remember this was a number and start over.
	                  addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
	                  i--;
	                  currentTokenType = Token.NULL;

	            } // End of switch (c).

	            break;

	         case Token.COMMENT_EOL:
	            i = end - 1;
	            addToken(text, currentTokenStart,i, currentTokenType, newStartOffset+currentTokenStart);
	            // We need to set token type to null so at the bottom we don't add one more token.
	            currentTokenType = Token.NULL;
	            break;

	         case Token.LITERAL_STRING_DOUBLE_QUOTE:
	            if (c=='"') {
	               addToken(text, currentTokenStart,i, Token.LITERAL_STRING_DOUBLE_QUOTE, newStartOffset+currentTokenStart);
	               currentTokenType = Token.NULL;
	            }
	            break;
	         case Token.LITERAL_CHAR:
		            if (c=='\'') {
		               addToken(text, currentTokenStart,i, Token.LITERAL_CHAR, newStartOffset+currentTokenStart);
		               currentTokenType = Token.NULL;
		            }
		            break;
	         case Token.COMMENT_MULTILINE:
		            if (c==']') {
		            	 String line = "";
		            	 if(i-2 >= 0) {
		            		 for(int k = i-2; k < end; k++) {
			            		   line += array[k];
			            	   }
			            	   
		            	 }
		            	  
		            	   if(line.length() > 2 &&
		            			   line.substring(0, 3).contains("*[]")) {
		            		   System.out.println("SUBLINE "+line.substring(0, 3));
//		            		   addToken(segment, start, end, tokenType, newStartOffset);
		            		   addToken(text, currentTokenStart,i, Token.COMMENT_MULTILINE, newStartOffset+currentTokenStart);
				               currentTokenType = Token.NULL;

				               break;
		            	   }
		            }
//		            break;
	      } // End of switch (currentTokenType).

	   } // End of for (int i=offset; i<end; i++).

	   switch (currentTokenType) {

	      // Remember what token type to begin the next line with.
	      case Token.LITERAL_STRING_DOUBLE_QUOTE:
	         addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
	         break;
	         
	         // Remember what token type to begin the next line with.
	      case Token.LITERAL_CHAR:
	         addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
	         break;
	         
	      case Token.COMMENT_MULTILINE:
		         addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
		         break;

	      // Do nothing if everything was okay.
	      case Token.NULL:
	         addNullToken();
	         break;

	      // All other token types don't continue to the next line...
	      default:
	         addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
	         addNullToken();

	   }

	   // Return the first token in our linked list.
	   return firstToken;
	}
	
	/*
	 * Assign a token type to a String using tokenMap.put(<String>, <Token.TYPE>).
	 */
	@Override
	public TokenMap getWordsToHighlight() {
	   TokenMap tokenMap = new TokenMap();
	   String[] keywords = Tokens.KEYWORDS.trim().split("\\|");
	   String[] operators = Tokens.OPERATORS.trim().split("\\|");
	   String[] separators = Tokens.SEPARATORS.trim().split("\\|");
	   
	   String[] keywords_1 = Tokens.KEYWORDS_1.trim().split("\\|");
	   String[] keywords_2 = Tokens.KEYWORDS_2.trim().split("\\|");
	   String[] data_type = Tokens.DATA_TYPE.trim().split("\\|");
			
	   String token;
	   
	   for(int i = 0; i < keywords.length; i++) {
		   token = keywords[i].trim().replace("\\", "");
		   if(!token.isEmpty())
			   tokenMap.put(token, Token.RESERVED_WORD);
	   }
	   
	   for(int i = 0; i < operators.length; i++) {
		   token = operators[i].trim().replace("\\", "");
		   if(!token.isEmpty())
			   tokenMap.put(token, Token.OPERATOR);
	   }
	   
	   for(int i = 0; i < separators.length; i++) {
		   token = separators[i].trim().replace("\\", "");
		   if(!token.isEmpty())
			   tokenMap.put(token, Token.SEPARATOR);
	   }
	   
	   for(int i = 0; i < keywords_1.length; i++) {
		   token = keywords_1[i].trim().replace("\\", "");
		   if(!token.isEmpty())
			   tokenMap.put(token, Token.RESERVED_WORD);
	   }
	   
	   for(int i = 0; i < keywords_2.length; i++) {
		   token = keywords_2[i].trim().replace("\\", "");
		   if(!token.isEmpty())
			   tokenMap.put(token, Token.RESERVED_WORD_2);
	   }
	   
	   for(int i = 0; i < data_type.length; i++) {
		   token = data_type[i].trim().replace("\\", "");
		   if(!token.isEmpty())
			   tokenMap.put(token, Token.DATA_TYPE);
	   }
	   
	   
	   
	   return tokenMap;
	}
	
	@Override
	public void addToken(Segment segment, int start, int end, int tokenType, int startOffset) {
	   // This assumes all keywords, etc. were parsed as "identifiers."
	   if (tokenType==Token.IDENTIFIER) {
	      int value = wordsToHighlight.get(segment, start, end);
	      if (value != -1) {
	         tokenType = value;
	      }
	   }
	   super.addToken(segment, start, end, tokenType, startOffset);
	}

}
