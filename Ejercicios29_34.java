/**
 * Exercise: 29-34
 * 
 * @version: 08/11/2022 10:38
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Crea una biblioteca de funciones para arrays bidimensionales
* (de dos dimensiones) de números enteros que contenga las siguientes
* funciones:
* 1. **generaArrayBiInt**: Genera un array de tamaño n x m con números
* aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
* 2. **filaDeArrayBiInt**: Devuelve la fila i-ésima del array que se pasa
* como parámetro.
 * 3. **columnaDeArrayBiInt**: Devuelve la columna j-ésima del array que se
 * pasa como parámetro.
 * 4. **coordenadasEnArrayBiInt**: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un array
 * bidimensional. Si el número no se encuentra en el array, la función devuelve
 * el array {-1, -1}.
 * 5. **esPuntoDeSilla**: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * 6. **diagonal**: Devuelve un array que contiene una de las diagonales del
 * array bidimensional que se pasa como parámetro. Se pasan como parámetros
 * fila, columna y dirección. La fila y la columna determinan el número que
 * marcará las dos posibles diagonales dentro del array. La dirección es una
 * cadena de caracteres que puede ser “nose” o “neso”. La cadena “nose” indica
 * que se elige la diagonal que va del noroeste hacia el sureste, mientras que
 * la cadena “neso” indica que se elige la diagonal que va del noreste hacia el
 * suroeste.
 */

import arrays.BidimensionalArrays;
import arrays.MyArrays;

import java.util.Scanner;

public class Ejercicios29_34 {
    public static void main(String[] args) {
        // Var declarations
        int row;
        int col;
        int min;
        int max;
        int[][] listArray;
        int[] auxArray;

        // Var init;
        listArray = new int[0][0];
        auxArray = new int[0];
        row = 0;
        col = 0;
        min = 0;
        max = 42;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Ejercicio 29
        System.out.println("Ejercicio 20");
        System.out.print("Introduce el número de filas:");
        row = sc.nextInt();
        System.out.print("Introduce el número de columnas:");
        col = sc.nextInt();
        listArray = BidimensionalArrays.generaArrayBiInt(row, col, min, max);
        System.out.println("Array bidimensional de números aleatorios: ");
        BidimensionalArrays.printBiArray(listArray);

        // Ejercicio 30
        System.out.println("Ejercicio 30");
        System.out.print("Introduce el número de fila que quieres mostrar:");
        row = sc.nextInt();
        auxArray = BidimensionalArrays.filaDeArrayBiInt(listArray, row);
        System.out.println("La fila es: ");
        MyArrays.imprimeArray(auxArray);

        // Ejercicio 31
        System.out.println("Ejercicio 31");
        System.out.print("Introduce el número de columna que quieres mostrar:");
        col = sc.nextInt();
        auxArray = BidimensionalArrays.columnaDeArrayBiInt(listArray, col);
        System.out.println("La columna es: ");
        MyArrays.imprimeArray(auxArray);

        // Close scanner
        sc.close();
    }
}
