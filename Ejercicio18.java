/**
 * Exercise: 1
 *
 * @version: 04/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pase de decimal a binario.
 */

import comp.jgutierr.matematicas.General;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Var declarations
        String res;
        String numero;

        // Var init
        res = "";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número decimal: ");
        numero = sc.next();

        res = General.pasaDeDecimal(numero, 2);

        // Output results
        System.out.print("El número " + numero + " convertido de decimal a binario queda así: " + res);

        // Close scanner
        sc.close();
    }
}
