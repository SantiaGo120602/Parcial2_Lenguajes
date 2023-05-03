#**Punto 1**

>* Gramática original

$S \Rightarrow ABC$

$S \Rightarrow DE$

$A \Rightarrow dosBtres$

$A \Rightarrow \in$

$B \Rightarrow BcuatroCcinco$

$B \Rightarrow \in$

$C \Rightarrow seisAB$

$C \Rightarrow \in $

$D \Rightarrow unoAE $

$D \Rightarrow B $

$E \Rightarrow tres $

>* Gramática sin recursividad por la izquierda

$S \Rightarrow ABC$

$S \Rightarrow DE$

$A \Rightarrow dosBtres$

$A \Rightarrow \in$

$B \Rightarrow \in B^\prime$

$B^\prime \Rightarrow cuatroCcincoB^\prime$

$B^\prime \Rightarrow \in$

$C \Rightarrow seisAB$

$C \Rightarrow \in $

$D \Rightarrow unoAE $

$D \Rightarrow B $

$E \Rightarrow tres $

* Conjunto de primeros
     

    A  :  2, Epsilon, 

    B  :  4, Epsilon, 

    Bprima  :  4, Epsilon, 

    C  :  6, Epsilon, 

    D  :  1, 4, Epsilon, 

    E  :  3, 

* Conjunto de siguientes

    S  :  \$, 

    A  :  4, 6, \$, 5, 3, 

    B  :  6, \$, 3, 5, 

    Bprima  :  6, \$, 3, 5, 

    C  :  \$, 5, 

    D  :  3, 

    E  :  \$, 3,

* Conjunto de producciones

$S \Rightarrow ABC = [2, 4, 6]$

$S \Rightarrow DE = [1, 4, 3]$

$A \Rightarrow dosBtres = [2]$

$A \Rightarrow \in = [3, 4, 6, 5, \$ ]$

$B \Rightarrow \in B^\prime = [3, 6, 5, \$, 4 ]$

$B^\prime \Rightarrow cuatroCcinco B^\prime = [4]$

$B^\prime \Rightarrow \in = [3, 6, 5, \$ ]$ 

$C \Rightarrow seisAB = [6]$

$C \Rightarrow \in $

$D \Rightarrow unoAE = [1]$

$D \Rightarrow B = [4]$

$E \Rightarrow tres = [3]$


* Determinar si la gramática es LL(1):

La gramática sí es LL(1) por que no tiene recursividad por la izquierda ni factores comunes por la izquierda. Tampoco se ha encontrado una cadena que genere más de dos árboles de derivación, por lo que no es ambigua.
