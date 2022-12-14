package comp.jgutierr.arrays;
/*
 * Lista de funciones de la biblioteca MyArrays:
 *
 * imprimeArray: []   Imprime un array de enterospor pantalla
 *               [][] Imprime un array bidimensional de enteros
 *                    Imprime un array de strings por pantalla
 * generaArrayInt: Genera un array de tamaño n con números aleatorios
 *                 Genera un array bidimensional de row x col con num aleatorios
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
 * filtraCapicuas: Devuelve un array con todos los números capicúa encontrados
     * en el array pasado
 * filtraCon7: Devuelve un array con todos los números que contienen el 7
 * convierteArrayEnString: toma un array de enteros y lo devuelve en una cadena
 * concatena: Concatena dos arrays introducidos y lo devuelve en un array
 * repeticionesDelAnterior: Devuelve las repeticiones de cada número pasado
 * mezcla: Mezcla dos arrays de forma alternativa par-impar
 * aleatorioDeArray: Selecciona un valor aleatorio del array pasado
 * nEsimo: Busca la posición n en un array bidimensional
 * ocurrencias: Devuelve en número de veces que aparece un dígito en los números de un array
 * sinRepetir: Imprime un array de strings sin los elementos repetidos
 * corteza: Entra un array bidimensional y devuelve los números externos del array
 */

/**
 * Exercise: Varios
 *
 * @version: 10/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import comp.jgutierr.matematicas.General;

public class MyArrays {
    /**
     * imprimeArray: Imprime un array de enteros por pantalla
     *
     * @param listArray Array de números enteros
     * @return Sin return, únicamente impresión en pantalla
     */
    public static void imprimeArray(int[] listArray) {
        for (int i = 0; i < listArray.length; i++)
            System.out.print(listArray[i] + " ");
        System.out.println();
    }

    /**
     * imprimeArray: Imprime un array de strings por pantalla
     *
     * @param listArray Array de números enteros
     * @return Sin return, únicamente impresión en pantalla
     */
    public static void imprimeArray(String[] listArray) {
        for (int i = 0; i < listArray.length; i++)
            System.out.print(listArray[i] + " ");
        System.out.println();
    }

    /**
     * imprimeArray: Imprime un array bidimensional de enteros por pantalla
     *
     * @param listArray Array bidimensional de números enteros
     * @return Sin return, únicamente impresión en pantalla
     */
    public static void imprimeArray(int[][] listArray) {
        for (int i = 0; i < listArray.length; i++) {
            for (int j = 0; j < listArray[0].length; j++)
                System.out.print(listArray[i][j] + " ");
            System.out.println();
        }
    }

    /**
     * generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
     * intervalo (mínimo y máximo) se indica como parámetro.
     *
     * @param n   Número de elementos aleatorios a crear
     * @param min Intervalo mínimo (incluido)
     * @param max Intervalo máximo (incluido)
     * @return Array generado
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
     * generaArrayInt: Genera un array bidimensional de tamaño n con números
     * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
     *
     * @param row Número de filas a crear
     * @param col Número de columnas a crear
     * @param min Intervalo mínimo (incluido)
     * @param max Intervalo máximo (incluido)
     * @return Array generado
     */
    public static int[][] generaArrayInt(int row, int col, int min, int max) {
        // Var declarations
        int[][] arrayInt;

        // Var init
        arrayInt = new int[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arrayInt[i][j] = (int) (Math.random() * (max - min + 1) + min);
        return arrayInt;
    }

    /**
     * minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
     *
     * @param listArray Array de números enteros
     * @return Número mínimo
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
     * @return Número máximo
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
     * @return Media del array
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
     * @return booleano indicando si está o no en el array
     */
    public static boolean estaEnArrayInt(int[] listArray, int num) {
        // Process
        for (int n : listArray)
            if (n == num)
                return true;
        return false;
    }

    /**
     * posicionEnArray: Busca un número en un array y devuelve la posición (el
     * índice) en la que se encuentra.
     *
     * @param listArray Array de números enteros
     * @param num       Número int a buscar en el array
     * @return Posición en el array
     */
    public static int posicionEnArray(int[] listArray, int num) {
        // Var declarations
        int count;
        // Var init
        count = 0;
        for (int n : listArray)
            if (n == num)
                return count;
            else
                count++;
        return -1;
    }

    /**
     * volteaArrayInt: Le da la vuelta a un array
     *
     * @param listArray Array de números enteros
     * @return Array dado la vuelta
     */
    public static int[] volteaArrayInt(int[] listArray) {
        // Var declarations
        int[] reverseArray;
        int count;

        // Process
        count = listArray.length;
        reverseArray = listArray.clone();
        for (int i = 0; i < count; i++)
            reverseArray[count - i - 1] = listArray[i];
        return reverseArray;
    }

    /**
     * rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
     *
     * @param listArray Array de números enteros
     * @param n         Número de posiciones a rotar hacia la derecha
     * @return Array rotado n posiciones a la derecha
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
     * @return Array rotado n posiciones a la izquierda
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
     * @param x Array de números enteros
     * @return Array con los primos encontrados en el array pasado
     */
    public static int[] filtraPrimos(int x[]) {
        // Var declarations
        int[] res;
        int count;

        // Var init
        count = 0;

        // Comprobar el número de primos que se encuentran en el array
        for (int i = 0; i < x.length; i++)
            if (General.esPrimo(x[i]))
                count++;

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

    /**
     * filtraCapicuas: Devuelve un array con todos los números capicúa encontrados
     * en el array pasado
     *
     * @param x Array a comprobar
     * @return Array con los capicúa encontrados
     */
    public static int[] filtraCapicuas(int x[]) {
        // Var declarations
        int[] res;
        int count;

        // Var init
        count = 0;

        // Comprobar el número de capicúas que se encuentran en el array
        for (int i = 0; i < x.length; i++)
            if (General.esCapicua(x[i]))
                count++;

        if (count > 0) {
            res = new int[count];
            count = 0;
            // Introducir en res los capicúa encontrados
            for (int i = 0; i < x.length; i++) {
                if (General.esCapicua(x[i]))
                    res[count++] = x[i];
            }
        } else {
            res = new int[1];
            res[0] = -1;
        }
        return res;
    }

    /**
     * filtraCon7: Devuelve un array con todos los números que contienen el 7 (por
     * ej. 7, 27, 782) que se encuentren en otro array que se pasa como parámetro.
     * El tamaño del array que se devuelve será menor o igual al que se pasa como
     * parámetro.
     *
     * @param x Array de números enteros
     * @return Array con los números que tienen 7 encontrados en el array inicial
     */

    public static int[] filtraCon7(int x[]) {
        // Var declarations
        int[] res;
        int count;

        // Var init
        count = 0;

        // Comprobar la cantidad de números con 7 que se encuentran en el array
        for (int i = 0; i < x.length; i++)
            if (General.posicionDeDigito(x[i], 7) != -1)
                count++;

        if (count > 0) {
            res = new int[count];
            count = 0;
            // Introducir en res los números con 7 encontrados
            for (int i = 0; i < x.length; i++) {
                if (General.posicionDeDigito(x[i], 7) != -1) {
                    res[count++] = x[i];
                }
            }
        } else {
            res = new int[1];
            res[0] = -1;
        }
        return res;
    }

    /**
     * convierteArrayEnString: toma un array de enteros y lo devuelve en una cadena
     * de caracteres
     *
     * @param listArray Array de números enteros
     * @return String con el array convertido en cadena de caracteres
     */
    public static String convierteArrayEnString(int[] a) {
        // Var declarations
        String res;
        res = "";
        for (int i = 0; i < a.length; i++)
            res += a[i];
        return res;
    }

    /**
     * concatena: Concatena dos arrays introducidos y devuelve un array con el
     * resultado
     *
     * @param array1 Primer array
     * @param array2 Segundo array
     * @return array con la concatenación de array1+array2
     */
    public static int[] concatena(int[] a, int[] b) {
        // Var declarations
        int[] res;

        // Var init
        res = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++)
            res[i] = a[i];
        for (int i = a.length; i < (a.length + b.length); i++)
            res[i] = b[i - a.length];
        return res;
    }

    /**
     * repeticionesDelAnterior: Lock and say: devuelve las repeticiones de cada
     * número pasado
     *
     * @param num Número para comprobar
     * @return String con la nueva numeración
     */
    public static String repeticionesDelAnterior(String num) {
        // Var declaration
        String res;
        int count;
        String digit;

        // Var init
        res = "";
        count = 0;
        digit = num.substring(0, 1);

        for (int i = 0; i < num.length(); i++)
            if (num.substring(i, i + 1).equals(digit))
                count++;
            else {
                res += count + digit;
                digit = num.substring(i, i + 1);
                count = 1;
            }

        // Last digits
        res += count + digit;
        return res;
    }

    /**
     * mezcla: Mezcla dos arrays de forma alterna
     *
     * @param a Primer array
     * @param b Primer array
     * @return Array nuevo con la mezcla realizada
     */
    public static int[] mezcla(int[] a, int[] b) {
        // Var declarations
        int[] res;
        int countA;
        int countB;
        boolean odd;

        // Var init
        countA = 0;
        countB = 0;
        res = new int[a.length + b.length];
        odd = true;

        for (int i = 0; i < res.length; i++) {
            if (odd) {
                if (countA < a.length) {
                    res[i] = a[countA++];
                    if (countB < b.length)
                        odd = false;
                }
            } else {
                if (countB < b.length) {
                    res[i] = b[countB++];
                    if (countA < a.length)
                        odd = true;
                }
            }
        }
        return res;
    }

    /**
     * aleatorioDeArray: Devuelve un número del array aleatoriamente
     *
     * @param a Array de números enteros
     * @return Número entero aleatorio
     */
    public static int aleatorioDeArray(int[] a) {
        return (a[(int) (Math.random() * (a.length))]);
    }

    /**
     * nEsimo: Busca la posición n en un array bidimensional como si estuviera
     * leyendo el array. Si n no está dentro del array, debe devolver -1.
     *
     * @param n        Array de números
     * @param posicion Posición a buscar
     * @return Entero con el resultado de la búsqueda
     */
    public static int nEsimo(int[][] n, int posicion) {
        // Var declarations
        int count;

        // Var init
        count = 0;

        // Process
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (count == posicion)
                    return n[i][j];
                count++;
            }
        }
        return -1;
    }

    /**
     * ocurrencias: Devuelve en número de veces que aparece un dígito en un número
     *
     * @param digito Dígito a buscar en el número
     * @param n      Número a
     * @return Número de ocurrencias, 0 si no hay ninguna
     */
    public static int ocurrencias(int digito, int[] a) {
        // Var init
        int counter;
        int digitoN;
        int size;
        counter = 0;
        // Process
        for (int i = 0; i < a.length; i++) {
            size = General.digitos(a[i]);
            for (int j = 0; j < size; j++) {
                digitoN = General.digitoN(a[i], j);
                if (digito == digitoN)
                    counter++;
            }
        }
        return counter;
    }

    /**
     * sinRepetir: Imprime un array de strings sin los elementos repetidos
     * Se distinguen mayúsculas de minúsculas, por tanto “hola” es distinto de
     * “Hola”. Por ejemplo, si el array a contiene los valores {“casa”, “coche”,
     * “sol”, “mesa”, “mesa”, “coche”, “ordenador”, “sol”, “CASA”}, la sentencia
     * sinRepetir(a) devolvería el array {“casa”, “coche”, “sol”, “mesa”,
     * “ordenador”, “CASA”}
     *
     * @param s Array de strings a elimiar las repeticiones
     * @return array de strings sin repeticiones
     */
    public static String[] sinRepetir(String[] s) {
        // Var declarations
        boolean rep;
        String[] res;
        int counter;

        // Var init
        counter = 0;

        for (int i = 0; i < s.length; i++) {
            rep = false;
            for (int j = 0; j < i; j++)
                if (s[i].equals(s[j]) && i != j)
                    rep = true;
            if (!rep)
                counter++;
        }

        res = new String[counter];
        counter = 0;

        for (int i = 0; i < s.length; i++) {
            rep = false;
            for (int j = 0; j < i; j++)
                if (s[i].equals(s[j]) && i != j)
                    rep = true;
            if (!rep)
                res[counter++] = s[i];
        }
        return res;
    }

    /**
     * corteza: Entra un array bidimensional y devuelve los números externos del
     * array
     *
     * @param n Array bidimensional con números enteros
     * @return Array con los números de la corteza
     */
    public static int[] corteza(int[][] n) {
        // Var declarations
        int size;
        int[] resArray;
        int counter;

        size = (n.length * 2) + ((n[0].length - 2) * 2);
        resArray = new int[size];
        counter = 0;

        // Top row
        for (int j = 0; j < n[0].length; j++)
            resArray[counter++] = n[0][j];
        // Right column
        for (int i = 1; i < n.length; i++)
            resArray[counter++] = n[i][n[0].length - 1];
        // Bottom row
        for (int j = n[0].length - 2; j >= 0; j--)
            resArray[counter++] = n[n.length - 1][j];
        // Left column
        for (int i = n.length - 2; i > 0; i--)
            resArray[counter++] = n[i][0];
        return resArray;
    }
}
