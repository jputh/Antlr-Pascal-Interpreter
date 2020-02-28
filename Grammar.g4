grammar Grammar;

@header{
     import java.util.HashMap; 
     import java.lang.Math;
     import java.util.Scanner;
     }

@members { 
    Scanner io = new Scanner(System.in);
}

// Generate: antlr4 Calculator.g4
// Compile: javac Calculator*.java 
// Run: grun Calculator exp -tree test/input1.txt

start: 
    program EOF;

program:
    PROGRAM identifier ';' varBlock functionDecs block '.';

varBlock:
    //nothing
    | VAR varDecs
    ;

//variable declarations
varDecs:
    //nothing
    | varDec varDecs
    ;

//variable declaration
varDec:
    ID ':' type=(BOOLEAN | REAL) '=' expr ';'                    #initDec
    | ID ':' type=(BOOLEAN | REAL) ';'                           #normDec    
    ;

//function or procedure declarations
functionDecs:
    //nothing
    | funcOrProcDec functionDecs
    ;

//function declaration
funcOrProcDec:
    funcDec    
    | procDec
    ;

funcDec:
    FUNCTION ID LPAREN (formalParameterList)? RPAREN ':' type=(REAL | BOOLEAN) ';' varBlock block ';'
    ;

procDec:
    PROCEDURE ID LPAREN (formalParameterList)? RPAREN ';' varBlock block ';'
    ;

formalParameterList:
    paramGroup (';' paramGroup)*
    ;

paramGroup:
    variableList ':' variableType
    ;

variableList:
    identifier (',' identifier)*
    ;

variableType:
    REAL
    | BOOLEAN
    ;

functionCall:
    func_identifier LPAREN parameters RPAREN
;

procedureCall:
    func_identifier LPAREN parameters RPAREN ';'
;

parameters:
    //nothing
    | expr (',' expr)*
    ;



block:
    //nothing
    | BEGIN statements END
    ;

statements:
    // nothing 
    | statement statements
    ;

statement: 
    varAssign
    | procedureCall
    | loopType
    | ifStatement
    | caseStatement
    | readLn
    | writeLn
    | eval_break
    | eval_continue
    ;



varAssign:
    ID ':=' functionCall ';'                            #funcAssignment
    | ID ':=' expr ';'                                  #exprAssignment
    ;


readLn:
    'readln' LPAREN ID RPAREN ';' 
    ;

writeLn:
    'writeln' LPAREN ( line DELIM?)+ RPAREN ';'
    ;

//should return string
line:
    expr                                #exprLine
    | STRING_LITERAL                    #strLine
    
    ;




loopType:
    whileLoop
    | forLoop
    ;

whileLoop:
    WHILE LPAREN? expr RPAREN DO loopBlock
    ;

forLoop:
    FOR varForAssign TO element DO loopBlock
    ;
    
varForAssign:
    ID ':=' expr
    ;

loopBlock:
    BEGIN loopStatements END ';'
    ;

loopStatements:
    //nothing
    | loopStatement loopStatements
    ;
    
loopStatement:
    varDec
    | statement
    | eval_break
    | eval_continue
    ;

eval_break:
    BREAK ';'
    ;

eval_continue:
    CONTINUE ';'
    ;





ifStatement:
    IF condBlock (ELSE IF condBlock)* (ELSE stateBlock)?
    ;

condBlock:
    LPAREN? expr RPAREN? THEN stateBlock
    ;

stateBlock:
    block ';'
    | statement
    ;
    
caseStatement:
    CASE LPAREN? expr RPAREN? OF (caseBlock)+ END ';'
    ;

caseBlock:
    expr ':' statement
    ;

expr:
    type=(SQRT | LN | EXP | SIN | COS) LPAREN expr RPAREN   #equationExpr
    | SUBT expr                                             #unaryExpr
    | NOT expr                                              #notExpr
    | lEx=expr op=(MULT | DIV | MOD) rEx=expr               #multExpr
    | lEx=expr op=(ADD | SUBT) rEx=expr                     #addExpr
    | lEx=expr op=(LTE | GTE | LT | GT) rEx=expr            #compareExpr
    | lEx=expr op=(EQ | NEQ) rEx=expr                       #equalityExpr
    | lEx=expr AND rEx=expr                                 #andExpr
    | lEx=expr OR rEx=expr                                  #orExpr
    | functionCall                                          #functCallExpr
    | element                                               #elementExpr
    ;

func_identifier:
    ID
    ;

element:
    LPAREN expr RPAREN                              #parElement
    | ID                                            #idElement
    | (TRUE | FALSE)                                #boolElement
    | NUM                                           #realElement
    ;

//Might?? cause some issues. Idk though


identifier:
    ID
    ;


fragment A
   : ('a' | 'A')
   ;

fragment B
   : ('b' | 'B')
   ;

fragment C
   : ('c' | 'C')
   ;

fragment D
   : ('d' | 'D')
   ;

fragment E
   : ('e' | 'E')
   ;

fragment F
   : ('f' | 'F')
   ;

fragment G
   : ('g' | 'G')
   ;

fragment H
   : ('h' | 'H')
   ;

fragment I
   : ('i' | 'I')
   ;

fragment J
   : ('j' | 'J')
   ;

fragment K
   : ('k' | 'K')
   ;

fragment L
   : ('l' | 'L')
   ;

fragment M
   : ('m' | 'M')
   ;

fragment N
   : ('n' | 'N')
   ;

fragment O
   : ('o' | 'O')
   ;

fragment P
   : ('p' | 'P')
   ;

fragment Q
   : ('q' | 'Q')
   ;

fragment R
   : ('r' | 'R')
   ;

fragment S
   : ('s' | 'S')
   ;

fragment T
   : ('t' | 'T')
   ;

fragment U
   : ('u' | 'U')
   ;

fragment V
   : ('v' | 'V')
   ;

fragment W
   : ('w' | 'W')
   ;

fragment X
   : ('x' | 'X')
   ;

fragment Y
   : ('y' | 'Y')
   ;

fragment Z
   : ('z' | 'Z')
   ;



PROGRAM:
    P R O G R A M
    ;

VAR:
    V A R
    ;

FUNCTION:
    F U N C T I O N
    ;

PROCEDURE:
    P R O C E D U R E
    ;

TRUE:
    T R U E
    ;

FALSE:
    F A L S E
    ;

BOOLEAN:
    B O O L E A N
    ;

AND:
    A N D
    ;

OR:
    O R
    ;

NOT:
    N O T
    ;

MOD:
    M O D
    ;

SQRT:           //square root function
    S Q R T
    ;

LN:             //natural log function
    L N
    ;

EXP:            //exponent function
    E X P
    ;

SIN:            //sine funciton
    S I N
    ;

COS:            //cosine function
    C O S
    ;

REAL:
    R E A L
    ;

FOR:
    F O R
    ;

WHILE:
    W H I L E
    ;

DO:
    D O
    ;

TO:
    T O
    ;

BREAK:
    B R E A K
    ;

CONTINUE:
    C O N T I N U E
    ;

IF:
    I F
    ;

THEN:
    T H E N
    ;

ELSE:
    E L S E
    ;

CASE:
    C A S E
    ;

OF:
    O F
    ;

BEGIN:
    B E G I N
    ;

END:
    E N D
    ;

LPAREN:
    '('
    ;

RPAREN:
    ')'
    ;

MULT: '*';
DIV: '/';
ADD: '+';
SUBT: '-';
EQ: '=';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
NEQ: '<>';
DELIM: ',';

ID: ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')* ;
STRING_LITERAL: '\'' ('\'\'' | ~ ('\''))* '\'';
NUM: ('0'..'9')+ | ('0'..'9')+'.'('0'..'9')+;
WS : [ \t\r\n]+ -> skip ;
COMMENT_1
   : '{*' .*? '*}' -> skip
   ;
COMMENT_2
   : '{' .*? '}' -> skip
   ;

