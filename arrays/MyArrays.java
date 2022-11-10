package arrays;
/*
 * Lista de funciones de la biblioteca MyArrays:
 *
 * imprimeArrayInt: Imprime un array por pantalla
 * generaArrayInt: Genera un array de tamaño n con números aleatorios
 * minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro
 * maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro
 * mediaArrayInt: Devuelve la media del array que se pasa como parámetro
 * estaEnArrayInt: Dice si un número está o no dentro de un array
 * posicionEnArray: Busca un número en un array y devuelve la posición
 * volteaArrayInt: Le da la vuelta a un array
 * rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array
 * rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un
 * array
 * filtraPrimos: Devuelve un array con los primos del array pasado por parámetro
 */

/**
 * Exercise: Varios
 *
 * @version: 10/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import matematicas.General;

public class MyArrays {
    /**
     * imprimeArrayInt: Imprime un array por pantalla
     *
     * @param listArray Array de números enteros
     * @return
     */
    public static void imprimeArray(int[] listArray) {
        for (int i = 0; i < listArray.length; i++)
            System.out.print(listArray[i] + " ");
        System.out.println();
    }

    /**
     * generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
     * intervalo (mínimo y máximo) se indica como parámetro.
     *
     * @param n   Número de elementos aleatorios a crear
     * @param min Intervalo mínimo (incluido)
     * @param max Intervalo máximo (incluido)
     * @return Array de enteros aleatorio
     */
    public static int[] generaArrayInt(int n, int min, int max) {
        // Var declarations
        int[] arrayInt;

        // Var init
        arrayInt = new int[n];

        for (int i = 0; i < n; i++)
            arrayInt[i] = (int) (Math.random() * (max - min + 1) + min);
        return arrayInt;
    }

    /**
     * minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
     *
     * @param listArray Array de números enteros
     * @return El número más pequeño del array pasado como parámetro
     */
    public static int minimoArrayInt(int[] listArray) {
        // Var declarations
        int min;

        // Var init
        min = Integer.MAX_VALUE;

        // Process
        for (int n : listArray)
            if (n < min)
                min = n;
        return min;
    }

    /**
     * maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
     *
     * @param listArray Array de números enteros
     * @return El número más alto del array pasado como parámetro
     */
    public static int maximoArrayInt(int[] listArray) {
        // Var declarations
        int max;

        // Var init
        max = Integer.MIN_VALUE;

        // Process
        for (int n : listArray)
            if (n > max)
                max = n;
        return max;
    }

    /**
     * mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
     *
     * @param listArray Array de números enteros
     * @return float El promedio de los números del array pasado como parámetro
     */
    public static float mediaArrayInt(int[] listArray) {
        // Var declarations
        int count;
        int sum;

        // Var init
        count = 0;
        sum = 0;

        // Process
        for (int n : listArray) {
            sum += n;
            count++;
        }
        return (float) sum / count;
    }

    /**
     * estaEnArrayInt: Dice si un número está o no dentro de un array.
     *
     * @param listArray Array de números enteros
     * @param num       Número int a buscar en el array
     * @return boolean true si está en el array, false si no está en el array
     */
    public static boolean estaEnArrayInt(int[] listArray, int num) {
        // Process
        for (int n : listArray) {
            if (n == num)
                return true;
        }
        return false;
    }

    /**
     * posicionEnArray: Busca un número en un array y devuelve la posición (el
     * índice) en la que se encuentra.
     *
     * @param listArray Array de números enteros
     * @param num       Número int a buscar en el array
     * @return int Posición en la que se encuentra el elemento buscado
     */
    public static int posicionEnArray(int[] listArray, int num) {
        // Var declarations
        int count;
        // Var init
        count = 0;
        for (int n : listArray) {
            if (n == num)
                return count;
            else
                count++;
        }
        return -1;
    }

    /**
     * volteaArrayInt: Le da la vuelta a un array
     *
     * @param listArray Array de números enteros
     * @return reverseArray Array invertido
     */
    public static int[] volteaArrayInt(int[] listArray) {
        // Var declarations
        int[] reverseArray;
        int count;

        // Process
        count = listArray.length;
        reverseArray = listArray.clone();
        for (int i = 0; i < count; i++) {
            reverseArray[count - i - 1] = listArray[i];
        }
        return reverseArray;
    }

    /**
     * rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
     *
     * @param listArray Array de números enteros
     * @param n         Número de posiciones a rotar hacia la derecha
     * @return Array rotado
     */
    public static int[] rotaDerechaArrayInt(int[] listArray, int n) {
        // Var declarations
        int[] auxArray;

        // Var init
        auxArray = listArray.clone();

        // Process
        // Move to the right
        for (int i = n; i < listArray.length; i++)
            auxArray[i] = listArray[i - n];
        // Move to pos 0
        for (int i = 0; i < n; i++)
            auxArray[i] = listArray[listArray.length - n + i];
        return auxArray;
    }

    /**
     * rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un
     * array.
     *
     * @param listArray Array de números enteros
     * @param n         Número de posiciones a rotar hacia la izquierda
     * @return Array rotado
     */
    public static int[] rotaIzquierdaArrayInt(int[] listArray, int n) {
        // Var declarations
        int[] auxArray;

        // Var init
        auxArray = listArray.clone();

        // Process
        // Move to pos 0
        for (int i = n; i < listArray.length; i++)
            auxArray[i - n] = listArray[i];
        // Move to the left
        for (int i = 0; i < n; i++)
            auxArray[listArray.length - n + i] = listArray[i];
        return auxArray;
    }

    /**
     * filtraPrimos: Devuelve un array con los números primos del array que se ha
     * pasado por parámetro
     *
     * @param int x[] Array de números enteros
     * @return array con los primos encontrados en el array pasado por parámetro
     */
    public static int[] filtraPrimos(int x[]) {
        // Var declarations
        int[] res;
        int count;

        // Var init
        count = 0;

        // Comprobar el número de primos que se encuentran en el array
        for (int i = 0; i < x.length; i++) {
            if (General.esPrimo(x[i]))
                count++;
        }
        if (count > 0) {
            res = new int[count];
            count = 0;

            // Introducir en res los primos encontrados
            for (int i = 0; i < x.length; i++) {
                if (General.esPrimo(x[i]))
                    res[count++] = x[i];
            }
        } else {
            res = new int[1];
            res[0] = -1;
        }
        return res;
    }
}