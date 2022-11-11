/**
 * Exercise: 45
 *
 * @version: 11/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Podemos suponer que el usuario introduce una altura mayor o igual a 3.

Ejemplo 1:
Introduzca la altura de la figura: 8
X              X
XX            XX
XXX          XXX
XXXX        XXXX
XXXXX      XXXXX
XXXXXX    XXXXXX
XXXXXXX  XXXXXXX
XXXXXXXXXXXXXXXX

Ejemplo 2:
Introduzca la altura de la figura: 5
X        X
XX      XX
XXX    XXX
XXXX  XXXX
XXXXXXXXXX

Ejemplo 3:
Introduzca la altura de la figura: 3
X    X
XX  XX
XXXXXX
 */

import java.util.Scanner;
import matematicas.General;

public class Ejercicio45 {
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
        for (int i = 0; i < height; i--) {
            General.imprimeLinea(i, charac, true);
            General.imprimeLinea(height - i, " ", false);
            General.imprimeLinea(height - i, " ", false);
            General.imprimeLinea(i, charac, true);
            System.out.println();
        }

        // Close scanner
        sc.close();
    }
}
