# **Punto dos**

>* Gramática original

$S \Rightarrow Buno$

$S \Rightarrow dosC$

$S \Rightarrow \in $

$A \Rightarrow StresBC$

$A \Rightarrow cuatro$

$A \Rightarrow \in $

$B \Rightarrow AcincoCseis$

$B \Rightarrow \in $

$C \Rightarrow sieteB$

$C \Rightarrow \in  $

>* Gramática sin recursividad por la   izquierda

$S \Rightarrow Buno$

$S \Rightarrow dosC$

$S \Rightarrow \in $

$A \Rightarrow BunotresBC$

$A \Rightarrow dosCtresBC$

$A \Rightarrow \in tresBC$

$A \Rightarrow cuatro$

$A \Rightarrow \in $

$B \Rightarrow dosCtresBCcincoCseis B^\prime$

$B \Rightarrow \in tresBCcincoCseis B^\prime$

$B \Rightarrow cuatrocincoCseis B^\prime$

$B \Rightarrow \in cincoCseis B^\prime$

$B \Rightarrow \in B^\prime$

$C \Rightarrow sieteB$

$C \Rightarrow \in $

$B^\prime \Rightarrow unotresBCcincoCseis B^\prime$

$B^\prime \Rightarrow \in $

* Conjunto de primeros

    S  :  2, 3, 4, 5, 1, Epsilon, 

    A  :  2, 3, 4, 5, 1, Epsilon, 

    B  :  2, 3, 4, 5, 1, Epsilon, 

    C  :  7, Epsilon, 

    Bprima  :  1, Epsilon, 

* Conjunto de siguientes

    S  :  $, 

    A  :  ,

    B  :  1, 7, 5, $, 3, 6, 

    C  :  $, 3, 5, 6, 

    Bprima  :  1, 7, 5, $, 3, 6,  

* Conjunto de producciones


$S \Rightarrow Buno = [3,4,5,1] $

$S \Rightarrow dosC = [2] $

$S \Rightarrow \in = [$] $

$A \Rightarrow BunotresBC = [2,3,4,5,1] $

$A \Rightarrow dosCtresBC = [2] $

$A \Rightarrow \in tresBC = [3] $

$A \Rightarrow cuatro = [4] $

$A \Rightarrow \in  = [] $

$B \Rightarrow dosCtresBCcincoCseis B^\prime = [2] $

$B \Rightarrow \in tresBCcincoCseis B^\prime = [3] $


$B \Rightarrow cuatrocincoCseis B^\prime = [4] $

$B \Rightarrow \in cincoCseis B^\prime = [5] $

$B \Rightarrow \in B^\prime = [1] $

$C \Rightarrow sieteB = [7] $

$C \Rightarrow \in  = [5,6,\$,3] $

$B^\prime \Rightarrow unotresBCcincoCseis B^\prime = [1] $

$B^\prime \Rightarrow \in = [2,3,4,5,1,7,\$,6,] $

* Determinar si la gramática es LL(uno):

La gramática sí es LL(uno) por que no tiene recursividad por la izquierda ni factores comunes por la izquierda. Tampoco se ha encontrado una cadena que genere más de dos árboles de derivación, por lo que no es ambigua.
