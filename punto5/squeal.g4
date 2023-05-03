grammar squeal; // gramática del punto1

parse_prog: statement EOF;

statement :  ((create_statement  
            | read_statement  
            | update_statement
            | delete_statement
            | drop_statement
            | insert_statement)
            SEMICOLON)*
            ;

create_statement : CREATE TABLE table_name LEFT_PAR columndef (COMA columndef)* RIGHT_PAR # create_state
                ;

insert_statement :  INSERT INTO table_name LEFT_PAR ( column_name (COMA column_name)* ) RIGHT_PAR
                VALUES LEFT_PAR (term (COMA term)*) RIGHT_PAR # insert_state
                ;  

read_statement : READ (DISTINCT | ALL)? read_expression FROM table_name WHERE expression # read_state
                ;

update_statement : UPDATE table_name SET
                (column_name '=' (INT | DOUBLE | STRING | BOOL) (COMA column_name '=' (INT | DOUBLE | STRING | BOOL))*)
                WHERE expression # update_state
                ;

delete_statement : DELETE FROM table_name (WHERE expression)? #delete_state;

drop_statement : DROP TABLE table_name #drop_state;

read_expression : ('*' | (column_name (AS alias)? (COMA column_name (AS alias)?)* ) )
                ;

columndef : column_name data_type ((NOT)? NULL)? (PRIMARY_KEY)?
                ;

data_type : ('int' | 'double' | ('varchar' LEFT_PAR INT RIGHT_PAR) | 'date' | BOOL);                 

column_name : NAME;

table_name : NAME;



expression : and_condition (OR and_condition)*;

and_condition : condition (AND condition);

condition: ((LEFT_PAR expression RIGHT_PAR)
        |(NOT expression)|
        (operand ((IS (NOT)? NULL) | ((NOT)? BETWEEN operand AND operand)
        |((NOT)? LIKE operand) | ((NOT)? IN (operand (COMA operand)*))
        | (compare operand))));

operand : summand;

summand : factor (('+' | '-') factor)*;

factor : term (('*' | '/') term)*;

term : ((DOUBLE) | (INT) | (STRING) | (BOOL) | (NULL) | (column_name) | (LEFT_PAR operand RIGHT_PAR));

compare : ('<=' | '>=' | '<' | '>' | '=' | '!=');

alias : NAME;

STRING
 : '"' (~["\r\n] | '""')* '"'
 | '\'' (~["\r\n] | '""')* '\''
 ;

INSERT : 'INSERT';
INTO : 'INTO';
VALUES : 'VALUES';
READ : 'READ';
UPDATE : 'UPDATE';
SET : 'SET';
DISTINCT : 'DISTINCT';
COMA : ',';
BOOL : ('True' | 'False');
OR : 'OR';
AND : 'AND';
AS : 'AS';
QUOTE : '\'';
FROM : 'FROM';
WHERE : 'WHERE';
DELETE : 'DELETE';
DROP : 'DROP';
ALL : 'ALL';
IS : 'IS';
NOT : 'NOT';
NULL : 'NULL';
BETWEEN : 'BETWEEN';
LIKE : 'LIKE';
IN : 'IN';
PRIMARY_KEY : 'PRIMARY KEY' ;
LEFT_PAR : '(' ;
RIGHT_PAR : ')' ;
SEMICOLON : ';' ;
TABLE : 'TABLE' ;
CREATE : 'CREATE' ;
NAME : ALPHA ( ALPHA | DIGIT )* ;
DIGIT : [0-9];
DOUBLE : ('-')? DIGIT+ ([.] DIGIT+)? ;
INT : ('-')? DIGIT+;
ALPHA : [a-zA-Z_];
WS : [ \t\r\n]+ -> skip;
OTHER : . ;