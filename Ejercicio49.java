/**
 * Exercise: 49
 *
 * @version: 11/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que genere los n primeros términos de la sucesión look
 * and say. El primer término es 1. A continuación se va leyendo - un uno - por
 * tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc. Se
 * recomienda usar arrays para almacenar los dígitos porque los tipos int y long
 * son muy limitados en cuanto al número de dígitos. También puede resultar de
 * ayuda utilizar las funciones convierteArrayEnString y concatena definidas en
 * los ejercicios anteriores.
 *
 * Ejemplo 1:
 * ¿Cuántos términos de la sucesión look and say quiere calcular? 8
 * 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211
 *
 * Ejemplo 2:
 * ¿Cuántos términos de la sucesión look and say quiere calcular? 5
 * 1, 11, 21, 1211, 111221
 *
 * Ejemplo 3:
 * ¿Cuántos términos de la sucesión look and say quiere calcular? 12
 * 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, 31131211131221,
 * 13211311123113112211,
 * 11131221133112132113212221, 3113112221232112111312211312113211
 */

import java.util.Scanner;
import arrays.MyArrays;

public class Ejercicio49 {
    public static void main(String[] args) {
        // Var declarations
        String[] resArray;
        int size;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("¿Cuántos términos de la sucesión look and say quiere calcular? ");
        size = sc.nextInt();

        resArray = new String[size];
        resArray[0] = "1";

        for (int i = 1; i < size; i++)
            resArray[i] = MyArrays.repeticionesDelAnterior(resArray[i - 1]);

        for (int i = 0; i < resArray.length; i++)
            if (i == 0)
                System.out.print(resArray[i]);
            else
                System.out.print(", " + resArray[i]);

        // Close scanner
        sc.close();
    }
}
