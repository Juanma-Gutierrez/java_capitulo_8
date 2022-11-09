package arrays;

/**
 * Exercise:
 * 
 * @version: 07/11/2022 14:35
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos
 * dimensiones) de números enteros que contenga las siguientes funciones:
 * 
 * 1. **generaArrayBiInt**: Genera un array de tamaño n x m con números
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. **filaDeArrayBiInt**: Devuelve la fila i-ésima del array que se pasa como
 * parámetro.
 * 3. **columnaDeArrayBiInt**: Devuelve la columna j-ésima del array que se pasa
 * como parámetro.
 * 4. **coordenadasEnArrayBiInt**: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un array
 * bidimensional. Si el número no se encuentra en el array, la función devuelve
 * el array {-1, -1}.
 * 5. **esPuntoDeSilla**: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * 6. **diagonal**: Devuelve un array que contiene una de las diagonales del
 * array bidimensional que se pasa como parámetro. Se pasan como parámetros
 * fila, columna y dirección. La fila y la columna determinan el número que
 * marcará las dos posibles diagonales dentro del array. La dirección es una
 * cadena de caracteres que puede ser “nose” o “neso”. La cadena “nose” indica
 * que se elige la diagonal que va del noroeste hacia el sureste, mientras que
 * la cadena “neso” indica que se elige la diagonal que va del noreste hacia el
 * suroeste.
 */

/**
 * Exercise:
 * 
 * @version: 07/11/2022 14:35
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class BidimensionalArrays {
    /**
     * printBiArray: Imprime el array bidimensional introducido por parámetro
     *
     * @param listArray[][] Array a imprimir
     * @return
     */
    public static void printBiArray(int listArray[][]) {
        for (int i = 0; i < listArray.length; i++) {
            for (int j = 0; j < listArray[i].length; j++) {
                System.out.printf("%5d", listArray[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * generaArrayBiInt: Genera un array de tamaño n x m con números
     * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
     *
     * @param n   Tamaño del array
     * @param m   Tamaño del array
     * @param min Intervalo mínimo aleatorio
     * @param max Intervalo mínimo aleatorio
     * @return Array de números aleatorios de n x m
     */
    public static int[][] generaArrayBiInt(int n, int m, int min, int max) {
        // Var declarations
        int[][] listArray;
        // Var init
        listArray = new int[n][m];
        // Process
        for (int i = 0; i < n; i++)
            listArray[i] = MyArrays.generaArrayInt(m, min, max);
        return listArray;
    }

    /**
     * filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa
     * como parámetro.
     *
     * @param listArray Array bidimensional
     * @param i         Número de fila
     * @return Array con la fila i del array introducido
     */
    public static int[] filaDeArrayBiInt(int[][] listArray, int i) {
        // Var declarations
        int[] resArray;
        // Var init
        resArray = new int[listArray[i].length];
        // Process
        for (int j = 0; j < listArray[i].length; j++)
            resArray[j] = listArray[i][j];
        return resArray;
    }

    /**
     * columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
     * pasa como parámetro.
     *
     * @param listArray Array bidimensional
     * @param j         Número de columna
     * @return Array con los datos de la columna j del array introducido
     */
    public static int[] columnaDeArrayBiInt(int[][] listArray, int j) {
        // Var declarations
        int[] resArray;
        // Var init
        resArray = new int[listArray.length];
        // Process
        for (int i = 0; i < listArray.length; i++)
            resArray[i] = listArray[i][j];
        return resArray;
    }

    /**
     * coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos
     * elementos) de la primera ocurrencia de un número dentro de un array
     * bidimensional. Si el número no se encuentra en el array, la función devuelve
     * el array {-1, -1}.
     *
     * @param listArray Array bidimensional
     * @param num       Número a encontrar en el array
     * @return Array con los valores fila y columna de la posición del número en el
     *         array introducido.
     * @return {-1, -1} si no encuentra el valor en el array
     */
    public static int[] coordenadasEnArrayBiInt(int[][] listArray, int num) {
        // Var declarations
        int[] resArray;
        // Var init
        resArray = new int[2];
        // Process
        for (int i = 0; i < listArray.length; i++)
            for (int j = 0; j < listArray[i].length; j++)
                if (listArray[i][j] == num) {
                    resArray[0] = i;
                    resArray[1] = j;
                    return resArray;
                }
        resArray[0] = -1;
        resArray[1] = -1;
        return resArray;
    }
}