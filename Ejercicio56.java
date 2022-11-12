/**
 * Exercise: 56
 *
 * @version: 12/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Implementa una función con nombre corteza que sea capaz de extraer la capa
 * exterior de un array bidimensional. Esta capa se extrae en forma de array de
 * una dimensión. La extracción de números comienza en la esquina superior
 * izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
 * tanto el código de la función como el código de prueba que la usa. La
 * cabecera de la función es la siguiente:
 *
 * public static int[] corteza(int[][] n)
 *
 * Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
 *
 * 45 92 14 20 25 78
 * 35 72 24 45 42 60
 * 32 42 64 23 41 39
 * 98 45 94 11 18 48
 *
 * El array unidimensional generado por corteza(a) sería el siguiente:
 * 45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35
 */

import arrays.MyArrays;
import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        // Var declarations
        int row;
        int col;
        int[][] listArray;
        int[] auxArray;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce el número de filas: ");
        row = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        col = sc.nextInt();
        listArray = new int[row][col];
        listArray = MyArrays.generaArrayInt(row, col, 10, 99);

        System.out.println("Array inicial:");
        MyArrays.imprimeArray(listArray);

        auxArray = MyArrays.corteza(listArray);
        System.out.println("\nResultado:");
        MyArrays.imprimeArray(auxArray);

        // Close scanner
        sc.close();
    }
}
