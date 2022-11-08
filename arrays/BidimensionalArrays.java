package arrays;

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
        resArray = new int[listArray[i].length];
        for (int j = 0; j < listArray[i].length; j++){
            resArray[j] = listArray[i][j];
        }
        return resArray;
    }
}