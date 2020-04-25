grammar MathExpr;
 
options {
  language=Java;
  output=AST;
  backtrack=true;
}
 

tokens {
  RETURN = 'return' ;
  IF     = 'if'     ;
  ELSE   = 'else'   ;
  DO 	 = 'do'		;
  WHILE  = 'while'  ;

  PROGRAM           ;
  TYPE              ;
  ARGS_DECL         ;
  FUNC_DECL         ;
  ARGS              ;
  CALL              ;
  BLOCK             ;
  INDEX             ;
}
 
fragment DIGIT:
  '0'..'9'
;
 
fragment LETTER:
  'a'..'z' | 'A'..'Z' | '_'
;
 
NUMBER:
  DIGIT+ ('.' DIGIT+)?
;
 
STRING:
  '"' ('\\"' | '\\\\' | ~'"')* '"'
;
 
IDENT:
  LETTER (LETTER | DIGIT)*
;
 
type0:
  IDENT ('[' ']')*
;
type:
  type0  ->  TYPE[$type0.text]
;

term:
  NUMBER
| STRING
| lvalue
| funcCall
| '('! logic ')'!
;
 
args:
  (rvalue (',' rvalue)*)?  ->  ^(ARGS rvalue*)
;
funcCall:
  IDENT '(' args ')'  ->  ^(CALL IDENT args)
;

arrayIndex0:
  '['  ->  INDEX["[]"]
;
lvalue:  
  IDENT (arrayIndex0^ rvalue ']'!)*
| IDENT
| type IDENT
;
 
rvalue:
  logic | mod
;
 
mult:
  term (( '*' | '/' )^ term)*
;
 
add:
  mult (('+' | '-')^ mult)*
;

mod:
   IDENT '%'^ NUMBER
;
 
logic:
  add (('==' | '!=' | '>' | '<' | '>=' | '<=')^ add)?
; 
 
expr:
  lvalue '='^ rvalue ';'!
| funcCall ';'!
| RETURN^ rvalue ';'!
| IF^ '('! rvalue ')'! expr (ELSE! expr)?
| WHILE^ '('! rvalue ')'! expr
| DO^ expr WHILE '('! rvalue ')'!
| '{'! exprList '}'!
;
 
exprList:
  (expr ';'*)*  ->  ^(BLOCK expr*)
;

argDecl:
  type IDENT^
;
argsDecl:
  (argDecl (',' argDecl)*)?  ->  ^(ARGS_DECL argDecl*)
;

funcDecl:
  type IDENT '(' argsDecl ')' '{' exprList '}' ';'*
    ->  ^(FUNC_DECL IDENT type argsDecl exprList)
;

WS:
  (' ' | '\t' | '\f' | '\r' | '\n')+ { $channel=HIDDEN; }
;

decl:
  funcDecl
;
 
declList:
  decl*
;
 
program:
  declList
;
 
start:
  program
  EOF
    ->  ^(PROGRAM program)
;
