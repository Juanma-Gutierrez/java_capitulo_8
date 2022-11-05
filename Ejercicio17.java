/**
 * Exercise: 17
 *
 * @version: 04/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pase de binario a decimal.
 */

import matematicas.General;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Var declarations
        String num;
        int res;

        // Var init
        res = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        System.out.print("Por favor, introduzca un número binario: ");
        num = sc.next();

        res = General.pasaADecimal(num, 2);

        // Output results
        System.out.print("El número " + num + " convertido de binario a decimal queda así: " + res);

        // Close scanner
        sc.close();
    }
}
