# **Punto 3**

>* Gramática original

$S \Rightarrow ABC$

$S \Rightarrow Suno$

$A \Rightarrow dosBC$

$A \Rightarrow \in$

$B \Rightarrow Ctres$

$B \Rightarrow \in$

$C \Rightarrow cuatroB$

$C \Rightarrow \in $

>* Gramática sin recursividad por la izquierda

$S \Rightarrow ABCS^\prime$

$S^\prime \Rightarrow unoS^\prime$

$S^\prime \Rightarrow \in$

$A \Rightarrow dosBC$

$A \Rightarrow \in$

$B \Rightarrow Ctres$

$B \Rightarrow \in$

$C \Rightarrow cuatroB$

$C \Rightarrow \in $

* Conjunto de primeros
     
    S  :  2, 4, 3, 1, Epsilon, 

    Sprima  :  1, Epsilon, 

    A  :  2, Epsilon, 

    B  :  4, 3, Epsilon, 

    C  :  4, Epsilon,  

* Conjunto de siguientes

    S  :  \$,

    Sprima  :  \$,

    A  :  4, 3, 1, $, 

    B  :  4, 1, $, 3, 

    C  :  1, $, 4, 3,

* Conjunto de producciones


$S \Rightarrow ABCS^\prime = [2,3,4,1] $

$S^\prime \Rightarrow unoS^\prime = [1] $

$S^\prime \Rightarrow \in = [ $ ] $

$A \Rightarrow dosBC = [2] $

$A \Rightarrow \in = [4,1,3,\$] $

$B \Rightarrow Ctres = [4,3] $

$B \Rightarrow \in = [4,3,1,\$] $

$C \Rightarrow cuatroB = [4] $

$C \Rightarrow \in  = [3,1,\$,4] $


* Determinar si la gramática es LL(1):
La gramática sí es LL(1) por que no tiene recursividad por la izquierda ni factores comunes por la izquierda. Tampoco se ha encontrado una cadena que genere más de dos árboles de derivación, por lo que no es ambigua.   
