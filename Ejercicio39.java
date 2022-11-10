/**
 * Exercise: 39
 *
 * @version: 10/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
Crea una función con la siguiente cabecera:
    public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
 */

import matematicas.General;
import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        String words;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Var init;
        words = "";

        // Input data
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        // Process
        words = General.convierteEnPalabras(num);

        System.out.println("\nEl número " + num + " pasado a palabras es el siguiente:");
        System.out.println(words);

        // Close scanner
        sc.close();
    }

}
