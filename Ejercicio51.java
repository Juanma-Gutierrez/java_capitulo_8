/**
 * Exercise: 51
 *
 * @version: 12/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que rellene un array con 10 números aleatorios
 * comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla.
 * A continuación, el programa indicará para cada uno de ellos si es un número
 * primo y/o un capicúa de la forma que muestra el ejemplo.
 * 
 * Ejemplos:
 * Array generado:
 * 19 22 57 11 3 52 32 46 2 14
 * El 19 es primo y no es capicúa.
 * El 22 no es primo y es capicúa.
 * El 57 no es primo y no es capicúa.
 * El 11 es primo y es capicúa.
 * El 3 es primo y es capicúa.
 * El 52 no es primo y no es capicúa.
 * El 32 no es primo y no es capicúa.
 * El 46 no es primo y no es capicúa.
 * El 2 es primo y es capicúa.
 * 14 no es primo y no es capicúa.
 */

import comp.jgutierr.arrays.MyArrays;
import comp.jgutierr.matematicas.General;

public class Ejercicio51 {
    public static void main(String[] args) {
        // Var declarations
        boolean capicua;
        boolean prime;
        int[] listArray;

        listArray = new int[10];
        listArray = MyArrays.generaArrayInt(10, 2, 100);

        System.out.println("Array generado:");
        MyArrays.imprimeArray(listArray);

        for (int n : listArray) {
            capicua = General.esCapicua(n);
            prime = General.esPrimo(n);
            System.out
                    .println("El " + n + (prime ? "" : " no") + " es primo y " + (capicua ? "" : "no ") + "es capicúa");
        }
    }
}
