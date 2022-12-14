/**
 * Exercise: 16
 *
 * @version: 04/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números capicúa que hay entre 1 y 99999.
 */

import comp.jgutierr.matematicas.General;

public class Ejercicio16 {
    public static void main(String[] args) {
        for (int i = 1; i < 100000; i++)
            if (General.esCapicua(i))
                if (i == 1)
                    System.out.print(i);
                else
                    System.out.print(", " + i);
    }
}
