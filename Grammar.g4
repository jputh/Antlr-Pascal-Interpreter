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
    PROGRAM ID ';' varBlock block '.';

varBlock:
    //nothing
    | VAR varDecs
    ;

//variable declarations
varDecs locals[ static HashMap<String,String> localMap = new HashMap<String, String>(); ]:
    //nothing
    | varDec varDecs
    ;

//variable declaration
varDec:
    ID ':' type=(BOOLEAN | REAL) '=' expr ';'                    #initDec
    | ID ':' type=(BOOLEAN | REAL) ';'                           #normDec    
    ;
        // $varDecs::localMap.put($ID.text, Boolean.toString($bExpr.b));
        // System.out.println("In table: " + $varDecs::localMap);
   
block:
    //nothing
    | BEGIN statements END
    ;

statements:
    // nothing 
    | statement statements
    ;

//could be conditionals/if-else
statement: 
    varAssign
    | ifStatement
    | readLn
    | writeLn
    ;

varAssign:
    ID ':=' expr ';'
    ;

readLn:
    'readln' LPAREN ID RPAREN ';' 
            // { if($statement::evaluate){ 
            //      String a = io.nextLine();
            //      $varDecs::localMap.put($ID.text, a); 
            //      //System.out.println("In table: " + $varDecs::localMap);
            //      } 
            //  }
    ;

writeLn:
    'writeln' LPAREN ( line DELIM?)+ RPAREN ';'
    //'writeln' LPAREN ( line { System.out.print($line.s); } ','?)+ RPAREN ';' {System.out.println();}
    ;

//should return string
line:
    expr                                #exprLine
    | STRING_LITERAL                    #strLine
    //{ $s = $STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length()-1); }
    ;

ifStatement:
    IF condBlock (ELSE IF condBlock)* (ELSE stateBlock)? ';'
    ;

condBlock:
    LPAREN? expr RPAREN? THEN stateBlock
    ;

stateBlock:
    block
    | statement
    ;
    
// caseStatement:
//     CASE LPAREN? b1=bExpr RPAREN? OF 
//         b2=bExpr ':'{
//             if($b1.b != $b2.b){
//                 $statement::evaluate = false;
//             }
//         }
//         statement END ';' { $statement::evaluate = true; }
//     | CASE LPAREN? b1=bExpr RPAREN? OF 
//         b2=bExpr ':'{
//             if($b1.b != $b2.b){
//                 $statement::evaluate = false;
//             }
//         }
//         BEGIN statements END';' END ';' { $statement::evaluate = true; }
//     ;


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
    | element                                               #elementExpr
    ;


element:
    LPAREN expr RPAREN                              #parElement
    | ID                                            #idElement
    | (TRUE | FALSE)                                #boolElement
    | NUM                                           #realElement
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

