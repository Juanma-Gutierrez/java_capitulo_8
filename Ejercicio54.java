/**
 * Exercise: 54
 *
 * @version: 12/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea las funciones cuyas cabeceras se muestran a continuación, observa que
 * tienen el mismo nombre:
 * 
 * public static int ocurrencias(int digito, int n)
 * public static int ocurrencias(int digito, int[] a)
 * 
 * La función ocurrencias devuelve el número de veces que aparece un dígito
 * dentro de un número (primera función) o bien el número de veces que aparece
 * un dígito en una serie de números contenidos en un array (segunda función).
 * 
 * Ejemplos:
 * ocurrencias(8, 4672) devuelve 0
 * ocurrencias(5, 25153) devuelve 2
 * ocurrencias(2, 123456) devuelve 1
 * Si a = {714, 81, 9, 11} ocurrencias(1, a) devuelve 4
 * Si a = {42, 13, 12345, 4} ocurrencias(4, a) devuelve 3
 * Si a = {6, 66, 666} ocurrencias(6, a) devuelve 6
 */

import matematicas.General;
import arrays.MyArrays;

public class Ejercicio54 {
    public static void main(String[] args) {
        // Var declarations
        int[] listArray;
        int num;
        int dig;

        dig = 1;

        // Var init
        listArray = new int[10];
        listArray = MyArrays.generaArrayInt(10, 100, 999);
        num = (int) (Math.random() * (100000 - 99) + 1);
        System.out.println("Número generado:" + num);
        System.out.println("Array generado:");
        MyArrays.imprimeArray(listArray);

        System.out.println("Ocurrencias de " + dig + " en el número " + num + ": " + General.ocurrencias(dig, num));
        System.out
                .println("Ocurrencias de " + dig + " en el array: " + MyArrays.ocurrencias(dig, listArray));
    }
}
