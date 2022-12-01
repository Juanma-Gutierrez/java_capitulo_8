/**
 * Exercise: 37
 *
 * @version: 10/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
Crea una función con la siguiente cabecera:

public String convierteEnMorse(int n)

Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres. Por ejemplo, el 213 es el ..___ .____ ...__ en Morse. Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.

1 .____ 6 _....
2 ..___ 7 __...
3 ...__ 8 ___..
4 ...._ 9 ____.
5 ..... 0 _____
 */

import comp.jgutierr.matematicas.General;
import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        String morse;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Var init;
        morse = "";

        // Input data
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        // Process
        morse = General.convierteEnMorse(num);

        System.out.println("\nEl número " + num + " pasado a morse es el siguiente:");
        System.out.println(morse);

        // Close scanner
        sc.close();
    }

}
