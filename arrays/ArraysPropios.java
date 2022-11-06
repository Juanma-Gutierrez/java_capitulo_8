package arrays;

public class ArraysPropios {
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
     * @return El número más pequeño del array pasdo como parámetro
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
}
