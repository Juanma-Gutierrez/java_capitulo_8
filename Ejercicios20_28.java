/**
 * Exercise: 20-28
 *
 * @version: 06/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 1. **generaArrayInt**: Genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. **minimoArrayInt**: Devuelve el mínimo del array que se pasa como
 * parámetro.
 * 3. **maximoArrayInt**: Devuelve el máximo del array que se pasa como
 * parámetro.
 * 4. **mediaArrayInt**: Devuelve la media del array que se pasa como parámetro.
 * 5. **estaEnArrayInt**: Dice si un número está o no dentro de un array.
 * 6. **posicionEnArray**: Busca un número en un array y devuelve la posición
 * (el índice) en la que se encuentra.
 * 7. **volteaArrayInt**: Le da la vuelta a un array.
 * 8. **rotaDerechaArrayInt**: Rota n posiciones a la derecha los números de un
 * array.
 * 9. **rotaIzquierdaArrayInt**: Rota n posiciones a la izquierda los números de
 * un array.
 */

import comp.jgutierr.arrays.MyArrays;
import java.util.Scanner;

public class Ejercicios20_28 {
    public static void main(String[] args) {
        // Var declarations
        int listArray[];
        int num;
        int pos;

        // Var init
        listArray = new int[20];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Ejercicio 20
        listArray = MyArrays.generaArrayInt(20, 1, 42);
        System.out.println("Ejercicio 20");
        System.out.print("El array original: ");
        MyArrays.imprimeArray(listArray);

        // Ejercicio 21
        System.out.println("\nEjercicio 21");
        System.out.println("El número generado más pequeño es el: " + MyArrays.minimoArrayInt(listArray));

        // Ejercicio 22
        System.out.println("\nEjercicio 22");
        System.out.println("El número generado más grande es el: " + MyArrays.maximoArrayInt(listArray));

        // Ejercicio 23
        System.out.println("\nEjercicio 23");
        System.out.println("El promedio: " + MyArrays.mediaArrayInt(listArray));

        // Ejercicio 24
        System.out.println("\nEjercicio 24");
        System.out.print("Introduzca un número para comprobar si está en el array: ");
        num = sc.nextInt();
        System.out.println("El número " + num + (MyArrays.estaEnArrayInt(listArray, num) ? " sí" : " no")
                + " está en el array");

        // Ejercicio 25
        System.out.println("\nEjercicio 25");
        System.out.print("Introduzca un número para averiguar su posición en el array: ");
        num = sc.nextInt();
        pos = MyArrays.posicionEnArray(listArray, num);
        if (pos == -1)
            System.out.println("El número " + num + " no aparece en el array");
        else
            System.out.println("El número " + num + " está en la posición " + pos + " del array");

        // Ejercicio 26
        System.out.println("\nEjercicio 26");
        System.out.print("El array al revés es: ");
        MyArrays.imprimeArray(MyArrays.volteaArrayInt(listArray));

        // Ejercicio 27
        System.out.println("\nEjercicio 27");
        System.out.print("Introduzca cuántas posiciones quiere rotar hacia la derecha: ");
        num = sc.nextInt();
        System.out.print("El array rotado " + num + " elementos queda: ");
        MyArrays.imprimeArray(MyArrays.rotaDerechaArrayInt(listArray, num));

        // Ejercicio 28
        System.out.println("\nEjercicio 28");
        System.out.print("Introduzca cuántas posiciones quiere rotar hacia la izquierda: ");
        num = sc.nextInt();
        System.out.print("El array rotado " + num + " elementos queda: ");
        MyArrays.imprimeArray(MyArrays.rotaIzquierdaArrayInt(listArray, num));

        // Close scanner
        sc.close();
    }
}
