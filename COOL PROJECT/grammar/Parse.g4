parser grammar Parse;

options {
	tokenVocab = Lex;
}
@header{
	import java.util.List;
}
program returns [AST.program value]
    : pb = programBlocks
    {
		$value = new AST.program($pb.value);
	}
    ;

programBlocks returns [ArrayList<AST.class_> value]
    @init
    {
    	$value = new ArrayList<AST.class_>();
    }
     /*classes*/
    : (c = classDefine SEMICOLON {$value.add($c.value); System.out.println("list size = " + $value.size());})+ # classes
   | EOF # eof
   ;

classDefine returns [AST.class_ value]
    /*class without inherit*/
    : CLASS TYPEID LBRACE (feature SEMICOLON)* RBRACE
    {
        $value = new AST.class_();
    }
    /*class with inherit*/
    | CLASS TYPEID INHERITS TYPEID LBRACE (feature SEMICOLON)* RBRACE
    {
        $value = new AST.class_();
    }
    ;

feature
   : OBJECTID LPAREN (formal (COMMA formal)*)* RPAREN COLON TYPEID LBRACE expression RBRACE # method
   | OBJECTID COLON TYPEID (ASSIGNMENT expression)? # property
   ;

formal
   : OBJECTID COLON TYPEID
   ;

/* method argument */
expression
   : expression (ATSYM TYPEID)? DOT OBJECTID LPAREN (expression (COMMA expression)*)* RPAREN # methodCall
   | OBJECTID LPAREN (expression (COMMA expression)*)* RPAREN # ownMethodCall
   | IF expression THEN expression ELSE expression FI # if
   | WHILE expression LOOP expression POOL # while
   | LBRACE (expression SEMICOLON) + RBRACE # block
   | LET OBJECTID COLON TYPEID (ASSIGNMENT expression)? (COMMA OBJECTID COLON TYPEID (ASSIGNMENT expression)?)* IN expression # letIn
   | CASE expression OF (OBJECTID COLON TYPEID CASE_ARROW expression SEMICOLON) + ESAC # case
   | NEW TYPEID # new
   | MINUS expression # negative
   | ISVOID expression # isvoid
   | expression MULTIPLY expression # multiply
   | expression DIVISION expression # division
   | expression ADD expression # add
   | expression MINUS expression # minus
   | expression LESS_THAN expression # lessThan
   | expression LESS_EQUAL expression # lessEqual
   | expression EQUAL expression # equal
   | NOT expression # boolNot
   | LPAREN expression RPAREN # parentheses
   | OBJECTID # id
   | INT # int
   | STRING # string
   | BOOL_CONST # TrueOrFlase
   | OBJECTID ASSIGNMENT expression # assignment
   ;