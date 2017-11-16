/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr, Sam Harwell
 All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/**
 * TODO:
 *  - add pointer expressions
 */

/** A Java 1.7 grammar for ANTLR v4 derived from ANTLR v3 Java grammar.
 *  Uses ANTLR v4's left-recursive expression notation.
 *  It parses ECJ, Netbeans, JDK etc...
 *
 *  Sam Harwell cleaned this up significantly and updated to 1.7!
 *
 *  You can test with
 *
 *  $ antlr4 Java.g4
 *  $ javac *.java
 *  $ grun Java compilationUnit *.java
 */
grammar ManuScript;

// starting point for parsing a java file
compilationUnit
    :   /*packageDeclaration? importDeclaration**/ bodyDeclaration? EOF
    ;

bodyDeclaration
	:	(memberDeclaration)*
	;
//packageDeclaration
//    :   PACKAGE qualifiedName ';'
//    ;

//importDeclaration
//    :   IMPORT qualifiedName 'take everything'? ';'
//    ;

//typeDeclaration
//    :   classOrInterfaceModifier* classDeclaration
//    |   classOrInterfaceModifier* enumDeclaration
//    |   classOrInterfaceModifier* interfaceDeclaration
//    |   classOrInterfaceModifier* annotationTypeDeclaration
//    |   ';'
//    ;

//modifier
//    :   classOrInterfaceModifier
//    |   (   NATIVE
//        |   SYNCHRONIZED
//        |   TRANSIENT
//        )
//    ;
//
//classOrInterfaceModifier
//    :   /*annotation       // class or interface
//    |*/   (   PUBLIC     // class or interface
//        |   PROTECTED  // class or interface
//        |   PRIVATE    // class or interface
//        |   STATIC     // class or interface
//        |   ABSTRACT   // class or interface
//        |   FINAL      // class only -- does not apply to interfaces
//        |   STRICTFP   // class or interface
//        )
//    ;

variableModifier
    :   'final'
//    |   annotation
    ;

//classDeclaration
//    :   STARTING classOrInterfaceModifier? CLASS Identifier typeParameters?
//        ((EXTENDS) typeType)?
//        (IMPLEMENTS typeList)?
//        classBody
//    ;

//typeParameters
//    :   '<' typeParameter (',' typeParameter)* '>'
//    ;

//typeParameter
//    :   Identifier ((EXTENDS) typeBound)?
//    ;

typeBound
    :   typeType ('&' typeType)*
    ;

//enumDeclaration
//    :   ENUM Identifier ('implements' typeList)?
//        '{' enumConstants? ','? enumBodyDeclarations? '}'
//    ;
//
//enumConstants
//    :   enumConstant (',' enumConstant)*
//    ;
//
//enumConstant
//    :   /*annotation**/ Identifier arguments? classBody?
//    ;
//
//enumBodyDeclarations
//    :   ';' classBodyDeclaration*
//    ;
//
//interfaceDeclaration
//    :   INTERFACE Identifier typeParameters? ((EXTENDS) typeList)? interfaceBody
//    ;

typeList
    :   typeType (',' typeType)*
    ;

//classBody
//    :   '{' classBodyDeclaration* '}'
//    |	'{A}' classBodyDeclaration* '{Z}'
//    |   '{SCENE' Identifier? '}' classBodyDeclaration* '{END' Identifier? '}'
//    |   'SCENE' classBodyDeclaration* 'END'
//    ;

//interfaceBody
//    :   '{A}' interfaceBodyDeclaration* '{Z}'
//    |   '{SCENE' Identifier? '}' interfaceBodyDeclaration* '{END' Identifier? '}'
//    |   'SCENE' interfaceBodyDeclaration* 'END'
//    ;

//classBodyDeclaration
//    :   ';'
//    |   STATIC? block
//    |	structDefinition
//    |   modifier* memberDeclaration
//    ;

memberDeclaration
    :   methodDeclaration
//    |   genericMethodDeclaration
    |   fieldDeclaration
//    |   constructorDeclaration
//    |   genericConstructorDeclaration
//    |   interfaceDeclaration
////    |   annotationTypeDeclaration
//    |   classDeclaration
//    |   enumDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    :   /*methodModifier* */'ACT' Identifier 'starring' formalParameters ('[' ']')*
        (THROWS qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;

//methodModifier
//    :   PUBLIC
//    |   PROTECTED
//    |   PRIVATE
//    |   STATIC
//    |   ABSTRACT
//    |   FINAL
//    ;

//genericMethodDeclaration
//    :   typeParameters methodDeclaration
//    ;

//constructorDeclaration
//    :   constructorModifier* Identifier 'starring' formalParameters (THROWS qualifiedNameList)?
//        constructorBody
//    ;
//
//constructorModifier
//    :   PUBLIC
//    |   PROTECTED
//    |   PRIVATE
//    ;

//genericConstructorDeclaration
//    :   typeParameters constructorDeclaration
//    ;
 
fieldDeclaration
    :   /*fieldModifier**/FINAL? typeType variableDeclarators ';'
    ;

//fieldModifier
//    :   PUBLIC
//    |   PROTECTED
//    |   PRIVATE
//    |   STATIC
//    |   FINAL
//    ;

//interfaceBodyDeclaration
//    :   '{A}' modifier* interfaceMemberDeclaration '{Z}'
//    |   '{SCENE' Identifier? '}' modifier* interfaceMemberDeclaration '{END' Identifier? '}'
//    |   'SCENE' modifier* interfaceMemberDeclaration 'END'
//    |   '{' modifier* interfaceMemberDeclaration '}'
//    |   ';'
//    ;
//
//interfaceMemberDeclaration
//    :   constDeclaration
//    |   interfaceMethodDeclaration
//    |   genericInterfaceMethodDeclaration
//    |   interfaceDeclaration
////    |   annotationTypeDeclaration
//    |   classDeclaration
//    |   enumDeclaration
//    ;

constDeclaration
    :   typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    :   Identifier ('[' ']')* '=' variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest
//interfaceMethodDeclaration
//    :   typeType Identifier formalParameters ('[' ']')*
//        (THROWS qualifiedNameList)?
//        ';'
//    ;
//
//genericInterfaceMethodDeclaration
//    :   typeParameters interfaceMethodDeclaration
//    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

//enumConstantName
//    :   Identifier
//    ;

typeType
    :   pointerType ('[' ']')*
//    |	classOrInterfaceType ('[' ']')*
    |   primitiveType ('[' ']')*
    |   structType ('[' ']')*
    ;
    
pointerType
	:	(primitiveType | structType)'*';

structType
    :   STRUCT Identifier
    ;
//
//classOrInterfaceType
//    :   Identifier typeArguments? ('.' Identifier typeArguments? )*
//    ;

primitiveType
    :   BOOLEAN
    |   CHAR
    |	STRING
    |   BYTE
    |   SHORT
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    ;

structDefinition
    :   STRUCT Identifier '{A}' structDeclarationList '{Z}'
    |   STRUCT Identifier '{SCENE' Identifier? '}' structDeclarationList '{END' Identifier? '}'
    |   STRUCT Identifier 'SCENE' structDeclarationList 'END'
    |   STRUCT Identifier '{' structDeclarationList '}'
    ;

structDeclarationList
    :   structDeclaration*
    ;

structDeclaration
    :   qualifierSpecifierList structDeclaratorList ';'
    ;

qualifierSpecifierList
    :   qualifierList? typeType
    ;

qualifierList
    :   qualifier*
    ;

qualifier
    :   STATIC
    |   FINAL
    ;

structDeclaratorList
    :   structDeclarator*
    ;

structDeclarator
    :   structDeclaratorId
    ;

structDeclaratorId
    :   Identifier
    ;

typeDefinition
    :   'cast' typeType 'as' Identifier ';'
    |   'cast' structDefinition 'as' Identifier ';';

typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;

typeArgument
    :   typeType
    |   '?' ((EXTENDS | SUPER) typeType)?
    ;

qualifiedNameList
    :   qualifiedName (',' qualifiedName)*
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    :   variableModifier* typeType '...' variableDeclaratorId
    ;

methodBody
    :   block
    ;

//constructorBody
//    :   block
//    ;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;

// ANNOTATIONS

//annotation
//    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
//    ;
//
//annotationName : qualifiedName ;

//elementValuePairs
//    :   elementValuePair (',' elementValuePair)*
//    ;
//
//elementValuePair
//    :   Identifier '=' elementValue
//    ;
//
//elementValue
//    :   expression
////    |   annotation
//    |   elementValueArrayInitializer
//    ;
//
//elementValueArrayInitializer
//    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
//    ;

//annotationTypeDeclaration
//    :   '@' INTERFACE Identifier annotationTypeBody
//    ;
//
//annotationTypeBody
//    :   '{' (annotationTypeElementDeclaration)* '}'
//    ;
//
//annotationTypeElementDeclaration
//    :   modifier* annotationTypeElementRest
//    |   ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
//    ;
//
//annotationTypeElementRest
//    :   typeType annotationMethodOrConstantRest ';'
//    |   classDeclaration ';'?
//    |   interfaceDeclaration ';'?
//    |   enumDeclaration ';'?
//    |   annotationTypeDeclaration ';'?
//    ;
//
//annotationMethodOrConstantRest
//    :   annotationMethodRest
//    |   annotationConstantRest
//    ;
//
//annotationMethodRest
//    :   Identifier '(' ')' defaultValue?
//    ;
//
//annotationConstantRest
//    :   variableDeclarators
//    ;

//defaultValue
//    :   'default' elementValue
//    ;

// STATEMENTS / BLOCKS

block
    :   '{A}' blockStatement* '{Z}'
    |   '{SCENE' Identifier? '}' blockStatement* '{END' Identifier? '}'
    |   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
//    |   typeDeclaration
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   typeType variableDeclarators
    ;

statement
    :   block #blockStmt
//    |   ASSERT expression (':' expression)? ';'
    |   IF parExpression statement (ELSE statement)? #ifElseStmt
    |   FOR? '(' forControl ')' statement #forStmt
    |   'when' parExpression statement #whileStmt
    |   DO statement 'when' parExpression ';' #doWhileStmt
//    |   TRY block (catchClause+ finallyBlock? | finallyBlock)
//    |   TRY resourceSpecification block catchClause* finallyBlock?
    |   SWITCH parExpression ('{' | '{A}' | '{SCENE' Identifier? '}') switchBlockStatementGroup* switchLabel* ('}' | '{Z}' | '{END' Identifier? '}') #switchStmt
//    |   SYNCHRONIZED parExpression block
    |   RETURN expression? ';' #returnStmt
//    |   THROW expression ';'
    |   BREAK Identifier? ';' #breakStmt
//    |   CONTINUE Identifier? ';'
    |   ';' #semicolonStmt
    |   statementExpression ';' #exprStmt
//    |   Identifier ':' statement
    |	outputStatement ';' #outputStmt
    |	inputStatement ';' #inputStmt
    ;

//catchClause
//    :   CATCH '(' variableModifier* catchType Identifier ')' block
//    ;
//
//catchType
//    :   qualifiedName ('|' qualifiedName)*
//    ;
//
//finallyBlock
//    :   FINALLY block
//    ;
//
//resourceSpecification
//    :   '(' resources ';'? ')'
//    ;
//
//resources
//    :   resource (';' resource)*
//    ;
//
//resource
//    :   variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
//    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   CASE constantExpression ':'
//    |   CASE enumConstantName ':'
    |   DEFAULT ':'
    ;

forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   variableModifier* typeType variableDeclaratorId ':' expression
    ;

forUpdate
    :   expressionList
    ;

outputStatement
	:	PRINT expression
	;

inputStatement
	:	SCAN typeType? SCANTO variableDeclaratorId
	;

// EXPRESSIONS

parExpression
    :   '(' expression ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;

constantExpression
    :   expression
    ;

expression
    :   primary # primaryExpr
//    |   expression '.' Identifier
//    |   expression '.' THIS
//    |   expression '.' NEW nonWildcardTypeArguments? innerCreator
//    |   expression '.' SUPER superSuffix
//    |   expression '.' explicitGenericInvocation
    |   variableExpr '[' expression ']' # arrayExpr
    |   variableExpr '(' expressionList? ')' # functionExpr
    |   NEW creator #arrayInitExpr
//    |   '(' typeType ')' expression
    |   variableExpr ('++' | '--') # postIncDecExpr
    |   ('+'|'-'|'++'|'--') variableExpr # preIncDecSignExpr
    |   ('~'|'!') expression # negationExpr
    |   expression ('*'|'/'|'%') expression # multDivModExpr
    |   expression ('+'|'-') expression # addSubExpr
//    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression # comparisonExpr
//    |   expression INSTANCEOF typeType
    |   expression ('==' | '!=') expression # equalityExpr
//    |   expression '&' expression 
//    |   expression '^' expression
//    |   expression '|' expression
    |   expression '&&' expression # andExpr
    |   expression '||' expression # orExpr
    |   expression '?' expression ':' expression # oneLineIfExpr
    |   <assoc=right> equationExpr 
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
//        |   '&='
//        |   '|='
//        |   '^='
//        |   '>>='
//        |   '>>>='
//        |   '<<='
        |   '%='
        )
        expression # assignExpr
    ;
    
variableExpr
	:	Identifier
	|	'*'Identifier
	;
	
equationExpr
	:	Identifier
	|	'*'Identifier
	|	variableExpr '[' expression ']'
	;

primary
    :   '(' expression ')'
//    |   THIS
//    |   SUPER
    |   literal
    |   Identifier
    |	'*'Identifier
//    |	'&'Identifier
//    |   typeType '.' 'class'
//    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments)
    ;

creator
    :   createdName (arrayCreatorRest)
    ;

createdName
    :   primitiveType 
    | 	pointerType
    ;
//
//innerCreator
//    :   Identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
//    ;

arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

//classCreatorRest
//    :   arguments classBody?
//    ;

//explicitGenericInvocation
//    :   nonWildcardTypeArguments explicitGenericInvocationSuffix
//    ;
//
//nonWildcardTypeArguments
//    :   '<' typeList '>'
//    ;
//
//typeArgumentsOrDiamond
//    :   '<' '>'
//    |   typeArguments
//    ;
//
//nonWildcardTypeArgumentsOrDiamond
//    :   '<' '>'
//    |   nonWildcardTypeArguments
//    ;
//
//superSuffix
//    :   arguments
//    |   '.' Identifier arguments?
//    ;

//explicitGenericInvocationSuffix
//    :   SUPER superSuffix
//    |   Identifier arguments
//    ;

arguments
    :   '(' expressionList? ')' 
    ;

// LEXER

// §3.9 Keywords

ABSTRACT      : 'template';
ASSERT        : 'assert'; //not used
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'version';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'script';
CONST         : 'const'; //not used
CONTINUE      : 'continue';
DEFAULT       : 'original';
DO            : 'rehearse';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum'; //not used
EXTENDS       : 'is a' | 'is an';
FINAL         : 'permanent';
FINALLY       : 'finally';
FLOAT         : 'float';
FOR           : 'replay';
IF            : 'if';
GOTO          : 'goto'; //not used
IMPLEMENTS    : 'that can';
IMPORT        : 'take';
INSTANCEOF    : 'can act as';
INT           : 'int';
INTERFACE     : 'interface';
LONG          : 'long';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'from';
PRINT		  : 'Say';
PRIVATE       : 'secret';
PROTECTED     : 'hereditary';
PUBLIC        : 'universal';
RETURN        : 'give';
SCAN		  : 'Write';
SCANTO		  : 'to';
SHORT         : 'short';
STARTING	  : 'The';
STATIC        : 'static';
STRICTFP      : 'strictfp';
STRING		  : 'string';
STRUCT		  : 'composition';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'ignore';
THROWS        : 'ignores';
TRANSIENT     : 'transient';
TRY           : 'audition';
VOID          : 'void';
WHILE         : 'when';

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\\r\n]
    ;
// §3.10.5 String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// §3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

// §3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

// §3.12 Operators

//OPERATOR		: ASSIGN | GT | LT | BANG | TILDE | QUESTION | COLON | EQUAL | LE | GE | NOTEQUAL | 
//					AND | OR | INC | DEC | ADD | SUB | MUL | DIV | BITAND | BITOR | CARET | MOD | ADD_ASSIGN
//					SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | MOD_ASSIGN | LSHIFT_ASSIGN
//					RSHIFT_ASSIGN | URSHIFT_ASSIGN;

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '[]*' .*? '*[]' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '['Identifier']:' ~[\r\n]* -> channel(HIDDEN)
    ;