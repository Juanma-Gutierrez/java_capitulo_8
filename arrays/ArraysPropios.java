package arrays;

public class ArraysPropios {
    /**
     * generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
     * intervalo (mínimo y máximo) se indica como parámetro.
     *
     * @param n   Número de elementos aleatorios a crear
     * @param min Intervalo mínimo (incluido)
     * @param max Intervalo máximo (incluido)
     * @return    Array de enteros aleatorio
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
     * @return          El número más pequeño del array pasdo como parámetro
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
}
