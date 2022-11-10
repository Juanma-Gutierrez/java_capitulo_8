package arrays;

/*
 * Lista de funciones de la biblioteca BidimensionalArray:
 *
 * generaArrayBiInt: Crea un array de tamaño n x m con números aleatorios
 * filaDeArrayBiInt: Devuelve la fila i-ésima del array
 * columnaDeArrayBiInt: Devuelve la columna j-ésima del array
 * coordenadasEnArrayBiInt: Devuelve la fila y la columna de la primera ocurrencia de un número dentro de un array bidimensional.
 * esPuntoDeSilla: Dice si un número es o no punto de silla
 * diagonal: Devuelve un array que contiene una de las diagonales del
 * array bidimensional que se pasa como parámetro.
 */

/**
 * Exercise: Varios
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
        int[] empty;

        // Var init
        empty = new int[1];
        empty[0] = -1;
        resArray = new int[listArray[0].length];

        // error control
        if (i >= listArray.length)
            return empty;

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
        int[] empty;

        // Var init
        empty = new int[1];
        empty[0] = -1;
        resArray = new int[listArray.length];

        // error control
        if (j >= listArray.length)
            return empty;

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
     *         array introducido. {-1, -1} si no encuentra el valor en el array
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

    /**
     * esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
     * mínimo en su fila y máximo en su columna.
     *
     * @param listArray Array bidimensional
     * @param num       Número a encontrar en el array para saber si es punto de
     *                  silla
     * @return boolean true si es punto de silla, false si no lo es
     */
    public static boolean esPuntoDeSilla(int[][] listArray, int num) {
        // Var declarations
        int[] pos;
        int minRow;
        int maxCol;

        pos = coordenadasEnArrayBiInt(listArray, num);
        if (pos[0] != -1 && pos[1] != -1) {
            minRow = MyArrays.minimoArrayInt(filaDeArrayBiInt(listArray, pos[0]));
            maxCol = MyArrays.maximoArrayInt(columnaDeArrayBiInt(listArray, pos[1]));
            return (minRow == listArray[pos[0]][pos[1]] && maxCol == listArray[pos[0]][pos[1]]);
        }
        return false;
    }

    /**
     * diagonal: Devuelve un array que contiene una de las diagonales del
     * array bidimensional que se pasa como parámetro. Se pasan como parámetros
     * fila, columna y dirección. La fila y la columna determinan el número que
     * marcará las dos posibles diagonales dentro del array. La dirección es una
     * cadena de caracteres que puede ser “nose” o “neso”. La cadena “nose” indica
     * que se elige la diagonal que va del noroeste hacia el sureste, mientras que
     * la cadena “neso” indica que se elige la diagonal que va del noreste hacia el
     * suroeste.
     *
     * @param listArray Array bidimensional
     * @param row       Fila del array
     * @param col       Columna del array
     * @param dir       Dirección nose o neso
     * @return array con los elementos de la diagonal seleccionada
     */
    public static int[] diagonal(int[][] listArray, int row, int col, String dir) {
        // Var declarations
        int[] diagonal;
        int counter;
        int[] empty;

        // Var init
        empty = new int[1];
        empty[0] = -1;
        counter = 0;

        // Errors control
        if (!dir.equals("nose") && !dir.equals("neso"))
            return empty;
        if (row >= listArray.length || col >= listArray[0].length)
            return empty;

        // Process
        // Calculamos la longitud de la diagonal
        for (int i = 0; i < listArray.length; i++)
            for (int j = 0; j < listArray[0].length; j++) {
                if (dir.equals("nose")) {
                    if ((i - j) == (row - col))
                        counter++;
                } else if ((i + j) == (row + col))
                    counter++;
            }

        // Procesamos
        diagonal = new int[counter];
        counter = 0;
        for (int i = 0; i < listArray.length; i++)
            for (int j = 0; j < listArray[0].length; j++) {
                if (dir.equals("nose")) {
                    if ((i - j) == (row - col))
                        diagonal[counter++] = listArray[i][j];
                } else if ((j + i) == (row + col))
                    diagonal[counter++] = listArray[i][j];
            }
        return diagonal;
    }
}
