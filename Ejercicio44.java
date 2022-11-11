/**
 * Exercise: 44
 *
 * @version: 11/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para pintar las líneas.

Ejemplo 1:
Introduzca la altura de la figura: 8
XXXXXXXX
 X     X
  X    X
   X   X
    X  X
     X X
      XX
       X

Ejemplo 2:
Introduzca la altura de la figura: 5
XXXXX
 X  X
  X X
   XX
    X
 */

import java.util.Scanner;
import matematicas.General;

public class Ejercicio44 {
    public static void main(String[] args) {
        // Var init
        int height;
        String charac;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la figura: ");
        height = sc.nextInt();
        System.out.print("Introduzca el carácter que quiere imprimir: ");
        charac = sc.nextLine();
        charac = sc.nextLine();

        // Process
        General.imprimeLinea(height, charac, false);
        System.out.println();
        for (int i = height - 1; i > 0; i--) {
            General.imprimeLinea(height - i, " ", false);
            General.imprimeLinea(i, charac, true);
            System.out.println();
        }

        // Close scanner
        sc.close();
    }
}
