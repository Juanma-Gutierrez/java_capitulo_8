/**
 * Exercise: 50
 *
 * @version: 11/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define la función mezcla con la siguiente cabecera:
 * public static int[] mezcla(int[] a, int[] b)
 * Esta función toma dos arrays como parámetros y devuelve un array que es el
 * resultado de mezclar los números de ambos de forma alterna, se coge un número
 * de a, luego de b, luego de a, etc. Los arrays a y b pueden tener longitudes
 * diferentes; por tanto, si se terminan los números de un array se terminan de
 * coger todos los que quedan del otro.
 * Ejemplos:
 * Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
 * Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
 * Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
 * Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
 */

import java.util.Scanner;
import arrays.MyArrays;

public class Ejercicio50 {
    public static void main(String[] args) {
        // Var declarations
        int[] listArrayEven;
        int[] listArrayOdd;
        int[] res;
        int size;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce el tamaño del primer array: ");
        size = sc.nextInt();
        listArrayEven = new int[size];
        listArrayEven = MyArrays.generaArrayInt(size, 0, 50);
        System.out.println("\nPrimer array: ");
        MyArrays.imprimeArray(listArrayEven);

        System.out.print("Introduce el tamaño del segundo array: ");
        size = sc.nextInt();
        listArrayOdd = new int[size];
        listArrayOdd = MyArrays.generaArrayInt(size, 0, 50);
        System.out.println("\nSegundo array: ");
        MyArrays.imprimeArray(listArrayOdd);

        res = new int[listArrayEven.length + listArrayOdd.length];
        res = MyArrays.mezcla(listArrayEven, listArrayOdd);

        System.out.println("\nArray resultado: ");
        MyArrays.imprimeArray(res);

        // Close scanner
        sc.close();
    }
}
