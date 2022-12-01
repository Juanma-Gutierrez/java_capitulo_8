/**
 * Exercise: 47
 *
 * @version: 11/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define la función convierteArrayEnString con la siguiente cabecera:
 * public static String convierteArrayEnString(int[] a)
 * Esta función toma como parámetro un array que contiene números y devuelve una
 * cadena de caracteres con esos números.
 * Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 },
 * convierteArrayEnString(a)
 * devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
 * “62501”.
 */
import java.util.Scanner;
import comp.jgutierr.arrays.MyArrays;

public class Ejercicio47 {
    public static void main(String[] args) {
        // Var declarations
        int[] listArray;
        int size;
        String res;

        // Var init
        res = "";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce el tamaño del array: ");
        size = sc.nextInt();
        listArray = new int[size];
        listArray = MyArrays.generaArrayInt(size, 0, 9);

        // Process
        System.out.print("Array aleatorio generado:");
        MyArrays.imprimeArray(listArray);
        res = MyArrays.convierteArrayEnString(listArray);
        System.out.print("El string del array introducido es: " + res);

        // Close scanner
        sc.close();
    }
}
