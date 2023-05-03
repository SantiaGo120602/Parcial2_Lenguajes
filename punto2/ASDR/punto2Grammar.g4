grammar punto2Grammar; // gramática del punto1

punto2Grammar: s;

s:   b uno
    |   dos c
    | /* epsilon */
    ;

a:   b uno tres b c              
    |  dos c tres b c
    |  tres b c
    |  cuatro 
    |  /* epsilon */
    ;

b:   dos c tres b c cinco c seis bprima
    | tres b c cinco c seis bprima
    | cuatro cinco c seis bprima
    | bprima
    ;

c:  siete b
    |  /* epsilon */
    ;        

bprima:   uno tres b c cinco c seis bprima               
    |  /* epsilon */ 
    ;

uno: 'uno';
dos: 'dos';
tres: 'tres';
cuatro: 'cuatro';
cinco: 'cinco';
seis: 'seis';
siete: 'siete';


WS : [ \t\r\n]+ -> skip ; 