/**
 * Exercise: 38
 *
 * @version: 10/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public int[] filtraCapicuas(int x[]) // Devuelve un array con todos los números
                                     // capicúa que se encuentren en otro array
                                     // que se pasa como parámetro.
                                     // Obviamente el tamaño del array que se
                                     // devuelve será menor o igual al que se
                                     // pasa como parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números capicúa se
conservan; es decir, si en el array x el número 505 se repite 3 veces, en el
array devuelto también estará repetido 3 veces. Si no existe ningún número
capicúa en x, se devuelve un array con el número -1 como único elemento.
 */

import comp.jgutierr.arrays.MyArrays;

public class Ejercicio38 {
    public static void main(String[] args) {
        // Var declarations
        int[] listArray;

        // Process
        listArray = MyArrays.generaArrayInt(100, 100, 1000);
        System.out.println("\nEl array creado es el siguiente:");
        MyArrays.imprimeArray(listArray);
        System.out.println("\nLos capicúa encontrados en el array son:");
        MyArrays.imprimeArray(MyArrays.filtraCapicuas(listArray));
    }
}
