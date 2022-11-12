/**
 * Exercise: 1
 *
 * @version: 04/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Une y amplía los dos programas anteriores de tal forma que se permita convertir un número entre cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.
 */

import matematicas.General;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Var declarations
        String num;
        int baseInit;
        int baseEnd;
        int res;
        String resString;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        do {
            System.out.println("Por favor, Introduzca la base inicial:");
            System.out.println("2: Binario");
            System.out.println("8: Octal");
            System.out.println("10: Decimal");
            System.out.println("16: Hexadecimal");
            baseInit = sc.nextInt();
        } while (baseInit != 2 && baseInit != 8 && baseInit != 10 && baseInit != 16);
        System.out.print("Ahora introduzca un número en dicha base: ");
        num = sc.next();

        do {
            System.out.println("¿A qué base quieres convertirlo:");
            System.out.println("2: Binario");
            System.out.println("8: Octal");
            System.out.println("10: Decimal");
            System.out.println("16: Hexadecimal");
            baseEnd = sc.nextInt();
        } while (baseEnd != 2 && baseEnd != 8 && baseEnd != 10 && baseEnd != 16);

        // Process
        // original base to decimal
        res = General.pasaADecimal(num, baseInit);
        // decimal to finish base
        resString = General.pasaDeDecimal(String.valueOf(res), baseEnd);

        // Output results
        System.out.print("El número " + num + " convertido de base " + baseInit + " a base " + baseEnd + " queda así: "
                + resString);

        // Close scanner
        sc.close();
    }
}
