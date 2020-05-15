# L2 - Virtual Matrix

Elaborar una serie de métodos para manejar información en un array unidimensional como si fuera bidimensional.

## Statement

A continuación, las instrucciones del laboratorio:

1. Hacer una función que permita "crear" esta "matriz" o tabla `createMatrix()`. Esta retornaría un array unidimensional.
2. Hacer una función que permita editar o escribir en la tabla, `writeInMatrix()`.
3. Hacer una fución que permita obtener el valor de un elemento de la matriz. `readMatrixPosition()`

Esta es la definición de las 3 funciones mencionadas anteriormente en pseudocódigo:

```
int[] createMatrix(rows: int, columns: int);
void writeInMatrix(arr: int[], rows: int, columns: int, x: int, y: int, value: int);
int readMatrixPosition(arr: int[], rows: int, columns: int, x: int, y: int);
```