/**
 * Exercise: 35
 *
 * @version: 10/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea una función con la siguiente cabecera:
 *
 * public static String convierteEnPalotes(int n)
 *
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | |
 * | | | | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en
 * un programa para comprobar que funciona bien. Desde la función no se debe
 * mostrar nada por pantalla, solo se debe usar print desde el programa
 * principal.
 */

import comp.jgutierr.matematicas.General;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        // Var init
        int num;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();

        // Process
        System.out.println("El número " + num + " pasado al sistema de palotes queda así:");
        System.out.println(General.convierteEnPalotes(num));

        // Close scanner
        sc.close();
    }
}
