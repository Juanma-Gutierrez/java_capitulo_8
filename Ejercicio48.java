/**
 * Exercise: 48
 *
 * @version: 11/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define la función concatena con la siguiente cabecera:
 * public static int[] concatena(int[] a, int[] b)
 * Esta función toma dos arrays como parámetros y devuelve un array que es el
 * resultado de concatenar ambos.
 * Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8,
 * 9, 0, 1, 2, 3 }.
 */

import arrays.MyArrays;

public class Ejercicio48 {
    public static void main(String[] args) {
        // Var declarations
        int[] listArrayA;
        int[] listArrayB;

        listArrayA = new int[10];
        listArrayB = new int[10];

        listArrayA = MyArrays.generaArrayInt(10, 0, 9);
        listArrayB = MyArrays.generaArrayInt(10, 0, 9);

        // Output data
        System.out.print("\nArray A: ");
        MyArrays.imprimeArray(listArrayA);
        System.out.print("\nArray B: ");
        MyArrays.imprimeArray(listArrayB);

        System.out.print("\nArrays concatenados: ");
        MyArrays.imprimeArray(MyArrays.concatena(listArrayA, listArrayB));
    }
}
