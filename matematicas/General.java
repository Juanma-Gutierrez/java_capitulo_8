package matematicas;

public class General {
    /**
     * voltea: le da la vuelta a un número
     *
     * @param int x
     * @return int res
     */
    public static int voltea(int x) {
        // Var declarations
        int res;
        // Var init
        res = 0;
        // Process
        do {
            res *= 10;
            res += x % 10;
            x /= 10;
        } while (x > 0);
        return res;
    }

    /**
     * esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
     * capicúa y falso en caso contrario.
     *
     * @param int x
     * @return boolean
     */
    public static boolean esCapicua(int x) {
        // Var declaration
        int num;
        // Var init
        num = voltea(x);
        // Process
        return (num == x);
    }

    /**
     * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo
     * y falso en caso contrario.
     *
     * @param int x
     * @return boolean prime
     */
    public static boolean esPrimo(int x) {
        // Var declaration
        boolean prime;
        // Var init
        prime = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                prime = false;
        }
        return prime;
    }

    /**
     * siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
     * como parámetro.
     *
     * @param int x
     * @return int x
     */
    public static int siguientePrimo(int x) {
        // Var declaration
        boolean nextPrime;
        // Process
        do {
            nextPrime = esPrimo(++x);
        } while (nextPrime != true);
        return x;
    }

    /**
     * potencia: Dada una base y un exponente devuelve la potencia.
     *
     * @param int base
     * @param int exp
     * @return int res
     */
    public static int potencia(int base, int exp) {
        // Var declarations
        int res;
        // Var init
        res = 1;
        for (int i = 0; i < exp; i++)
            res *= base;
        return res;
    }
}
