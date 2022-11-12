/**
 * Exercise: 53
 *
 * @version: 12/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Implementa una función con nombre nEsimo que busque el número que hay dentro
 * de un array bidimensional en la posición n-ésima contando de izquierda a
 * derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
 * es el 0. Si la posición donde se busca no existe en el array, la función debe
 * devolver -1. Se debe entregar tanto el código de la función como el código de
 * prueba que la usa. La cabecera de la función es la siguiente:
 * 
 * public static int nEsimo(int[][] n, int posicion)
 * Si el array a es el que se muestra a continuación:
 * 
 * 35 72 24 45 42 60
 * 32 42 64 23 41 39
 * 98 45 94 11 18 48
 * 12 34 56 78 90 12
 * nEsimo(a, 0) devuelve 35
 * nEsimo(a, 2) devuelve 24
 * nEsimo(a, 5) devuelve 60
 * nEsimo(a, 6) devuelve 32
 * nEsimo(a, 21) devuelve 78
 * nEsimo(a, 23) devuelve 12
 * nEsimo(a, 24) devuelve -1
 * nEsimo(a, 100) devuelve -1
 */

import arrays.MyArrays;

public class Ejercicio53 {
    public static void main(String[] args) {
        // Var declarations
        int[][] listArray;
        int pos;

        // Var init
        listArray = new int[5][5];
        pos = 5;

        for (int i = 0; i < listArray.length; i++)
            listArray[i] = MyArrays.generaArrayInt(listArray[i].length, 100, 999);

        System.out.println("Array generado:");
        MyArrays.imprimeArray(listArray);

        System.out.print(MyArrays.nEsimo(listArray, pos));
    }
}
