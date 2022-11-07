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
                int num3;
                int res;
                boolean resBoolean;

                // Scanner class
                Scanner sc = new Scanner(System.in);

                // Var init
                num1 = 0;
                num2 = 0;
                num3 = 0;
                res = 0;

                // Process

                // 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
                // capicúa y falso en caso contrario.
                System.out.println(
                                "\n1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                resBoolean = General.esCapicua(num1);
                System.out.println("El número " + num1 + (resBoolean ? " sí es capicúa" : " no es capicúa"));

                // 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
                // primo y falso en caso contrario.
                System.out.println(
                                "\n2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                resBoolean = General.esPrimo(num1);
                System.out.println("El número " + num1 + (resBoolean ? " es primo" : " no es primo"));

                // 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
                // como parámetro.
                System.out.println(
                                "\n3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                res = General.siguientePrimo(num1);
                System.out.println("El siguiente número primo a " + num1 + " es el " + res);

                // 4. potencia: Dada una base y un exponente devuelve la potencia.
                System.out.println(
                                "\n4. potencia: Dada una base y un exponente devuelve la potencia.");
                System.out.print("Introduce la base: ");
                num1 = sc.nextInt();
                System.out.print("Introduce el exponente: ");
                num2 = sc.nextInt();
                res = (int) General.potencia(num1, num2);
                System.out.println(num1 + " elevado a " + num2 + " es " + res);

                // * 5. digitos: Cuenta el número de dígitos de un número entero.
                System.out.println("\n5. digitos: Cuenta el número de dígitos de un número entero.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                res = General.digitos(num1);
                System.out.println("El número " + num1 + " tiene " + res + " dígitos.");

                // 6. voltea: Le da la vuelta a un número.
                System.out.println("\n6. voltea: Le da la vuelta a un número.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                res = General.voltea(num1);
                System.out.println("El número " + num1 + " volteado es: " + res);

                // 7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
                // Se empieza contando por el 0 y de izquierda a derecha.
                System.out.println(
                                "\n7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce la posición (de 0 en adelante): ");
                num2 = sc.nextInt();
                res = General.digitoN(num1, num2);
                System.out.println("El dígito " + num2 + " de " + num1 + " es el " + res);

                // 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
                // dentro de un número entero. Si no se encuentra, devuelve -1.
                System.out.println(
                                "\n8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce un dígito: ");
                num2 = sc.nextInt();
                res = General.posicionDeDigito(num1, num2);
                System.out.println("La posición del dígito " + num2 + " en " + num1 + " es: " + res);

                // 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
                // derecha).
                System.out.println(
                                "\n9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce cuantos dígitos quieres eliminar: ");
                num2 = sc.nextInt();
                res = General.quitaPorDetras(num1, num2);
                System.out.println("Al número  " + num1 + ", si le quitas los " + num2 + " últimos dígitos, queda: "
                                + res);

                // 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
                // izquierda).
                System.out.println(
                                "\n10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce cuantos dígitos quieres eliminar: ");
                num2 = sc.nextInt();
                res = General.quitaPorDelante(num1, num2);
                System.out.println("Al número  " + num1 + ", si le quitas los " + num2 + " primeros dígitos, queda: "
                                + res);

                // 11. pegaPorDetras: Añade un dígito a un número por detrás.
                System.out.println(
                                "\n11. pegaPorDetras: Añade un dígito a un número por detrás.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce el nuevo número a añadir por detrás: ");
                num2 = sc.nextInt();
                res = General.pegaPorDetras(num1, num2);
                System.out.println("El número  " + num1 + ", con " + num2 + " por detrás, queda: " + res);

                // 12. pegaPorDelante: Añade un dígito a un número por delante.
                System.out.println(
                                "\n12. pegaPorDelante: Añade un dígito a un número por delante.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce el nuevo número a añadir por delante: ");
                num2 = sc.nextInt();
                res = General.pegaPorDelante(num1, num2);
                System.out.println("El número  " + num1 + ", con " + num2 + " por delante, queda: " + res);

                // 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
                // de un número y devuelve el trozo correspondiente.
                System.out.println(
                                "\n13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce la posición inicial: ");
                num2 = sc.nextInt();
                System.out.print("Introduce la posición final: ");
                num3 = sc.nextInt();
                res = General.trozoDeNumero(num1, num2, num3);
                System.out.println("El número  " + num1 + " queda troceado como: " + res);

                // 14. juntaNumeros: Pega dos números para formar uno.
                System.out.println(
                                "\n14. juntaNumeros: Pega dos números para formar uno.");
                System.out.print("Introduce un número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce el segundo número a añadir por detrás: ");
                num2 = sc.nextInt();
                res = General.juntaNumeros(num1, num2);
                System.out.println("El número  " + num1 + ", con " + num2 + " por detrás, queda: " + res);

                // Close Scanner
                sc.close();
        }
}
