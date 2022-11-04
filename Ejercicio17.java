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
        int num;
        int lon;
        int res;

        // Var init
        res = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        System.out.print("Introduce un número en binario (únicamente puede tener unos y ceros): ");
        num = sc.nextInt();
        lon = General.digitos(num);
        for (int i = 0; i < lon; i++)
            res += General.digitoN(num, i) * General.potencia(2, lon - i - 1);

        // Output results
        System.out.print("El número " + num + " convertido de binario a decimal queda así: " + res);

        // Close scanner
        sc.close();
    }
}
