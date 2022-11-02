package matematicas;

public class General {

    /**
     * esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
     * capicúa y falso en caso contrario.
     *
     * @param int x
     * @return boolean
     */
    public static boolean esCapicua(int x) {
        // Process
        return (x == voltea(x));
    }

    /**
     * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo
     * y falso en caso contrario.
     *
     * @param int x
     * @return boolean
     */
    public static boolean esPrimo(int x) {
        // Process
        if (x < 2)
            return false;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
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
        } while (!nextPrime);
        return x;
    }

    /**
     * potencia: Dada una base y un exponente devuelve la potencia.
     *
     * @param int base
     * @param int exp
     * @return int res
     */
    public static double potencia(int base, int exp) {
        // Var declarations
        int res;
        // Var init
        res = 1;
        // Process
        if (exp == 0)
            return 1;
        for (int i = 0; i < exp; i++)
            res *= base;
        return res;
    }

    /**
     * digitos: Cuenta el número de dígitos de un número entero.
     *
     * @param int x
     * @return int res
     */
    public static int digitos(int x) {
        // Var declarations
        int res;
        // Var init
        res = 0;
        // Process
        do {
            x /= 10;
            res++;
        } while (x > 0);
        return res;
    }

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
     * digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
     * empieza contando por el 0 y de izquierda a derecha.
     *
     * @param int x
     * @param int n
     * @return res
     */
    public static int digitoN(int x, int n) {
        // Var declarations
        int res;
        // Var init
        res = 0;
        // Process
        x = voltea(x);
        for (int i = 0; i < n; i++) {
            x /= 10;
        }
        res = x % 10;
        return res;
    }

    /**
     * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
     * dentro de un número entero. Si no se encuentra, devuelve -1.
     *
     * @param int x
     * @param int dig
     * @return int res
     */
    public static int posicionDeDigito(int x, int dig) {
        // Var declaration
        int res;
        // Var init
        res = 0;
        // Process
        x = voltea(x);
        do {
            if (x % 10 == dig)
                return res;
            x /= 10;
            res++;
        } while (x > 0);
        return -1;
    }

    /**
     * quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
     *
     * @param int x
     * @param int n
     * @return int res
     */
    public static int quitaPorDetras(int x, int n) {
        // Var declarations
        int res;
        // Process
        res = x / potencia(10, n);
        return res;
    }

    /**
     * quitaPorDelante: Le quita a un número n dígitos por detrás (por la derecha).
     *
     * @param int x
     * @param int n
     * @return int res
     */
    public static int quitaPorDelante(int x, int n) {
        // Var declarations
        int res;
        // Process
        x = voltea(x);
        res = x / potencia(10, n);
        return voltea(res);
    }

    /**
     * pegaPorDetras: Añade un dígito a un número por detrás.
     *
     * @param int x
     * @param int n
     * @return int x
     */
    public static int pegaPorDetras(int x, int n) {
        // Process
        n = voltea(n);
        while (n > 0) {
            x *= 10;
            x += n % 10;
            n /= 10;
        }
        return x;
    }

    /**
     * pegaPorDelantes: Añade un dígito a un número por delante.
     *
     * @param int x
     * @param int n
     * @return int x
     */
    public static int pegaPorDelante(int x, int n) {
        // Process
        x = voltea(x);
        n = voltea(n);
        while (n > 0) {
            x *= 10;
            x += n % 10;
            n /= 10;
        }
        x = voltea(x);
        return x;
    }

    /**
     * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
     * de un número y devuelve el trozo correspondiente.
     *
     * @param int x
     * @param int nInit
     * @param int nEnd
     * @return int res
     */
    public static int trozoDeNumero(int x, int nInit, int nEnd) {
        // Var declarations
        // Var init
        // Process
        for (int i = 0; i < nEnd; i++)
            x /= 10;
        x = voltea(x);
        for (int i = 0; i < nInit; i++)
            x /= 10;
        x = voltea(x);
        return x;
    }

    /**
     * pegaPorDetras: Añade un dígito a un número por detrás.
     *
     * @param int x
     * @param int n
     * @return int x & n
     */
    public static int juntaNumeros(int x, int n) {
        // Process
        return pegaPorDetras(x, n);
    }
}
