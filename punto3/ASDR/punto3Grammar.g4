grammar punto3Grammar; // gramática del punto1

punto3Grammar: s;

s:   a b c sprima;

sprima:   uno sprima
    |     /* epsilon */
    ;

a:   dos b c              
    |  /* epsilon */ 
    ;

b:   c tres 
    | /* epsilon */
    ;    



c:   cuatro b               
    |  /* epsilon */ 
    ;

cuatro: 'cuatro';
cinco: 'cinco';
seis: 'seis';
dos: 'dos';
tres: 'tres';
uno: 'uno';


WS : [ \t\r\n]+ -> skip ; 