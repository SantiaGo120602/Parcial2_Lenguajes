# Parcial2_Lenguajes

En este repositrio se encuentra implementado un analizador sintáctico descendente LL(*) para las gramáticas encontradas en los puntos 1 a 3. Así como sus conjuntos de siguientes, primeros y producción. En el punto 4 se encuentra descrita la gramática para un lenguaje de dominio específico que permite hacer las operaciones de CRUD sobre una base de datos. Finalmente, en el punto5 se implementa un compildor para el lenguaje descrito en el punto 4 usando antlr4 y visitor. En la misma carpeta se observan algunos scripts de prueba.

>**Prerequisitos**:
* antlr4 4.11.1
* java 11
* json-simple 1.1.1
* python 3
* antlr4-python3-runtime 4.11.1

>**Setup**: Ejecutar estos comandos:
```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH"
export CLASSPATH=".:/usr/local/lib/json-simple-1.1.1.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.11.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

>**Ejecución programa primeros-siguientes**:
```bash
python3 primeros_Segundos.py punto<1-3>/grammar<1-3>.txt
```

>**El programa eliminate.py** puede eliminar de forma automática la recursividad por la izquierda de una gramática ingresada. La gramática se debe especificar dentro del código.

>**Los conjuntos de predicción** se encontraron de forma manual.

>**Ejecución analizador sintáctico** (debe entrar a la carpeta donde se encuentre la gramática a analizar):
```bash
grun punto<1-3>Grammar s -tree -gui
```

Esto mostrará con una interfaz gráfica el árbol de sintaxis abstracta para la cadena de tokens que se ingrese por consola.

> **Cada punto tiene un README en su carpeta, salvo el punto 5**. Para ver la gramática creada para el punto 4 simplemente acceda al README de tal carpeta.

>**Para ejecutar el compilador del punto 5** con java se debe ingresar (Las ejecuciones se veran reflejados por consola o mirando directamente en la carpeta databases):
```bash
java Calc <script_a_ejecutar>.txt
```
En la carpeta de ejemplos se encuentrar algunos scripts que se pueden ejecutar usando el comando especificado arriba. También puede crear sus propios scrips
