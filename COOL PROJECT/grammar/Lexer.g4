lexer grammar Lexer;
SEMICOLON   : ';';
CASE_ARROW      : '=>';
LPAREN       : '(';
RPAREN       : ')';
COMMA     : ',';
ADD       : '+';
MINUS     : '-';
MULTIPLY     : '*';
DIVISION     : '/';
TILDE     : '~';
LESS_THAN       : '<';
LESS_EQUAL      : '<=';
EQUAL     : '=';
LBRACE       : '{';
RBRACE       : '}';
DOT       : '.';
ASSIGNMENT      : '<-';
ATSYM     : '@';
COLON     : ':';

//Keywords

CASE     : ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC     : ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
IF    : ('i'|'I')('f'|'F');
FI    : ('f'|'F')('i'|'I');
WHILE    : ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
THEN     : ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
ELSE     : ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
LOOP     : ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL     : ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
CLASS    : ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
IN    : ('i'|'I')('n'|'N');
INHERITS : ('i'|'I')('n'|'N')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
OF    : ('o'|'O')('f'|'F');
LET      : ('l'|'L')('e'|'E')('t'|'T');
NEW      : ('n'|'N')('e'|'E')('w'|'W');
ISVOID      : ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');
NOT      : ('n'|'N')('o'|'O')('t'|'T');

//ID's
fragment SYMBOL : '!';
fragment DIGIT : '0'..'9';
fragment LLETTER: 'a'..'z';
fragment ULETTER: 'A'..'Z';
fragment LETTER   : ('a'..'z'|'A'..'Z');
fragment TRUE  : 't'('r'|'R')('u'|'U')('e'|'E');
fragment FALSE : 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');
BOOL_CONST  : (TRUE|FALSE);
INT   : DIGIT+;

TYPEID      : ULETTER('_'|LETTER|DIGIT)*;
OBJECTID : LLETTER('_'|LETTER|DIGIT)*;
STRING       : '"' (~('"'))* '"'; //('"')('_'|LETTER|DIGIT|SYMBOL)*('"');
WS: [ \n\t\r]-> skip;
INVALID : . ;   //must be here
