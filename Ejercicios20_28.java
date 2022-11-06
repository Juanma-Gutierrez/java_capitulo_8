/**
 * Exercise: 20-28
 *
 * @version: 06/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 1. **generaArrayInt**: Genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. **minimoArrayInt**: Devuelve el mínimo del array que se pasa como
 * parámetro.
 * 3. **maximoArrayInt**: Devuelve el máximo del array que se pasa como
 * parámetro.
 * 4. **mediaArrayInt**: Devuelve la media del array que se pasa como parámetro.
 * 5. **estaEnArrayInt**: Dice si un número está o no dentro de un array.
 * 6. **posicionEnArray**: Busca un número en un array y devuelve la posición
 * (el índice) en la que se encuentra.
 * 7. **volteaArrayInt**: Le da la vuelta a un array.
 * 8. **rotaDerechaArrayInt**: Rota n posiciones a la derecha los números de un
 * array.
 * 9. **rotaIzquierdaArrayInt**: Rota n posiciones a la izquierda los números de
 * un array.
 */

import arrays.ArraysPropios;
import java.util.Arrays;

public class Ejercicios20_28 {
    public static void main(String[] args) {
        // Var declarations
        int listArray[];
        int num;

        // Var init
        listArray = new int[42];

        // Ejercicio 20
        listArray = ArraysPropios.generaArrayInt(20, 1, 42);
        Arrays.sort(listArray);
        for (int n : listArray)
            System.out.printf("%-5d", n);

        // Ejercicio 21
        System.out.println("\nEl número generado más pequeño es el: " + ArraysPropios.minimoArrayInt(listArray));

        // Ejercicio 22
        System.out.println("\nEl número generado más grande es el: " + ArraysPropios.maximoArrayInt(listArray));
    }

}
