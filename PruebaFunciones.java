/**
 * Exercise: 1-14
 *
 * @version: 02/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que puedes usar unas dentro de otras si es necesario. Observa bien lo que hace cada función ya que, si las implementas en el orden adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de implementar teniendo esPrimo.
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 *    6. voltea: Le da la vuelta a un número.
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
 * 14. juntaNumeros: Pega dos números para formar uno.
 */

import matematicas.General;
import java.util.Scanner;

public class PruebaFunciones {
    public static void main(String[] args) {
        // Var declarations
        int num1;
        int num2;
        int res;
        boolean resBoolean;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Var init
        num1 = 0;
        num2 = 0;
        res = 0;

        // Process

        // 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
        // capicúa y falso en caso contrario.
        System.out.println(
                "\n1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.");
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        resBoolean = matematicas.General.esCapicua(num1);
        System.out.println("El número " + num1 + (resBoolean ? " sí es capicúa" : " no es capicúa"));

        // 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
        // primo y falso en caso contrario.
        System.out.println(
                "\n2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.");
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        resBoolean = matematicas.General.esPrimo(num1);
        System.out.println("El número " + num1 + (resBoolean ? " es primo" : " no es primo"));

        // 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
        // como parámetro.
        System.out.println(
                "\n3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.");
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        res = matematicas.General.siguientePrimo(num1);
        System.out.println("El siguiente número primo a " + num1 + " es el " + res);

        // 4. potencia: Dada una base y un exponente devuelve la potencia.
        System.out.println(
                "\n4. potencia: Dada una base y un exponente devuelve la potencia.");
        System.out.print("Introduce la base: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el exponente: ");
        num2 = sc.nextInt();
        res = matematicas.General.potencia(num1, num2);
        System.out.println(num1 + " elevado a " + num2 + " es " + res);

        // 6. voltea: Le da la vuelta a un número.
        System.out.println("\n6. Voltear un número");
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        res = matematicas.General.voltea(num1);
        System.out.print("El número " + num1 + " volteado es: " + res);

        sc.close();
    }
}
