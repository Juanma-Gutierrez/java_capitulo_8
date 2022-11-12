/**
 * Exercise: 15
 *
 * @version: 04/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números primos que hay entre 1 y 1000.
 */

import matematicas.General;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Process
        for (int i = 1; i <= 1000; i++)
            if (General.esPrimo(i))
                if (i == 2)
                    System.out.print(i);
                else
                    System.out.print(", " + i);
    }
}
