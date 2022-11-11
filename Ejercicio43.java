/**
 * Exercise: 43
 *
 * @version: 11/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
Realiza un programa que pinte un triángulo relleno tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para pintar las líneas.

```
Ejemplo 1:
Introduzca la altura de la figura: 8
---
XXXXXXXX
 XXXXXXX
  XXXXXX
   XXXXX
    XXXX
     XXX
      XX
       X

Ejemplo 2:
Introduzca la altura de la figura: 5
XXXXX
 XXXX
  XXX
   XX
    X
```
 */

import java.util.Scanner;
import matematicas.General;

public class Ejercicio43 {
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
        for (int i = height; i > 0; i--) {
            General.imprimeLinea(height - i, " ", false);
            General.imprimeLinea(i, charac, false);
            System.out.println();
        }

        // Close scanner
        sc.close();
    }
}
