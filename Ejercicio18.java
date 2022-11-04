/**
 * Exercise: 1
 *
 * @version: 04/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pase de binario a decimal.
 */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int aux;
        String[] base = { "0", "1" };
        String res;
        int resInt;

        // Var init
        res = "";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();
        aux = num;

        while (aux > 0) {
            res = base[aux % 2] + res;
            aux = (int) aux / 2;
        }
        resInt = Integer.parseInt(res);

        // Output results
        System.out.print("El número " + num + " convertido de decimal a binario queda así: " + resInt);

        // Close scanner
        sc.close();
    }
}
