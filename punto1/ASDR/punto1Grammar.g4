grammar punto1Grammar; // gramática del punto1

punto1Grammar: s;

s:   a b b
    |   d e
    ;

a:   dos b tres              
    |  /* epsilon */ 
    ;

b:   /* epsilon */ bprima;    

bprima:   cuatro c cinco bprima               
    |  /* epsilon */ 
    ;

c:   seis a b               
    |  /* epsilon */ 
    ;

d:   uno a e
    |  b
    ;    

e:   tres;

cuatro: 'cuatro';
cinco: 'cinco';
seis: 'seis';
dos: 'dos';
tres: 'tres';
uno: 'uno';


WS : [ \t\r\n]+ -> skip ; 