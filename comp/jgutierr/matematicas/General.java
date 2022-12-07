package comp.jgutierr.matematicas;

/*
 * Lista de funciones de la biblioteca General:
 *
 * esCapicua: Devuelve verdadero si el número que se pasa es capicúa
 * esPrimo: Devuelve verdadero si el número pasado es primo
 * siguientePrimo: Devuelve el menor primo que es mayor al número pasado
 * potencia: Dada una base y un exponente devuelve la potencia.
 * digitos: Cuenta el número de dígitos de un número entero
 * voltea: le da la vuelta a un número
 * digitoN: Devuelve el dígito que está en la posición n de un número entero
 * posicionDeDigito: Da la posición de la 1ª ocurrencia de un dígito dentro de un número entero
 * quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha)
 * quitaPorDelante: Le quita a un número n dígitos por detrás (por la derecha)
 * pegaPorDetras: Añade un dígito a un número por detrás
 * pegaPorDelantes: Añade un dígito a un número por delante
 * trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente
 * juntaNumeros: Pega dos números para formar uno
 * pasaADecimal: Pasa un número de cualquier base a decimal
 * pasaDeDecimal: Pasa un número de decimal a otra base
 * convierteEnPalotes: Convierte en a base Palotes el número pasado
 * convierteEnMorse: Convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres
 * convierteEnPalabras: Convierte los dígitos del número n en palabras
 * imprimeLinea: Imprime una línea con los caracteres indicados, rellena o bordes en función del parámetro de entrada
 * ocurrencias: Devuelve en número de veces que aparece un dígito en un número
  */

/**
 * Exercise: Varios
 *
 * @version: 07/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class General {

    /**
     * esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
     * capicúa y falso en caso contrario.
     *
     * @param x Número a comprobar si es capicúa
     * @return boolean
     */
    public static boolean esCapicua(long x) {
        // Process
        return (x == voltea(x));
    }

    /**
     * esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
     * capicúa y falso en caso contrario.
     *
     * @param x Número a comprobar si es capicúa
     * @return boolean
     */
    public static boolean esCapicua(int x) {
        // Process
        return (esCapicua((long) x));
    }

    /**
     * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo
     * y falso en caso contrario.
     *
     * @param x Número a comprobar
     * @return Booleano indicando si es primo
     */
    public static boolean esPrimo(long x) {
        // Process
        if (x < 2)
            return false;
        for (int i = 2; i <= x / 2; i++)
            if (x % i == 0)
                return false;
        return true;
    }

    /**
     * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo
     * y falso en caso contrario.
     *
     * @param x Número a comprobar
     * @return Booleano indicando si es primo
     */
    public static boolean esPrimo(int x) {
        return esPrimo((long) x);
    }

    /**
     * siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
     * como parámetro.
     *
     * @param x Número a comprobar
     * @return Siguiente número primo encontrado
     */
    public static long siguientePrimo(long x) {
        // Var declaration
        boolean nextPrime;
        // Process
        do {
            nextPrime = esPrimo(++x);
        } while (!nextPrime);
        return x;
    }

    /**
     * siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
     * como parámetro.
     *
     * @param x Número a comprobar
     * @return Siguiente número primo encontrado
     */
    public static int siguientePrimo(int x) {
        return (int) siguientePrimo((long) x);
    }

    /**
     * potencia: Dada una base y un exponente devuelve la potencia.
     *
     * @param base Base
     * @param exp  Exponente
     * @return Potencia de base por exponente
     */
    public static double potencia(double base, int exp) {
        // Var declarations
        double res;
        // Var init
        res = 1;
        // Process
        if (exp == 0)
            return 1;
        // Negatives
        if (exp < 0)
            return 1 / potencia(base, -exp);
        // Positives
        for (int i = 0; i < exp; i++)
            res *= base;
        return res;
    }

    /**
     * potencia: Dada una base y un exponente devuelve la potencia.
     *
     * @param base Base
     * @param exp  Exponente
     * @return Potencia de base por exponente
     */
    public static double potencia(int base, int exp) {
        return (int) potencia((long) base, (int) exp);
    }

    /**
     * digitos: Cuenta el número de dígitos de un número entero.
     *
     * @param x Número inicial
     * @return Número de dígitos del número pasado
     */
    public static int digitos(long x) {
        // Var declarations
        int res;
        // Var init
        res = 0;
        // Process
        // Zero
        if (x == 0)
            return 1;
        // Negative
        if (x < 0)
            x = -x;
        // Positive
        do {
            x /= 10;
            res++;
        } while (x > 0);
        return res;
    }

    /**
     * digitos: Cuenta el número de dígitos de un número entero.
     *
     * @param x Número inicial
     * @return Número de dígitos del número pasado
     */
    public static int digitos(int x) {
        return (int) (digitos((long) x));
    }

    /**
     * voltea: le da la vuelta a un número
     *
     * @param x Número inicial
     * @return Número volteado
     */
    public static long voltea(long x) {
        // Var declarations
        long res;
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
     * voltea: le da la vuelta a un número
     *
     * @param x Número inicial
     * @return Número volteado
     */
    public static int voltea(int x) {
        return (int) voltea((long) x);
    }

    /**
     * digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
     * empieza contando por el 0 y de izquierda a derecha.
     *
     * @param x Número inicial
     * @param n Posición
     * @return Dígito en la posición n
     */
    public static int digitoN(long x, int n) {
        // Var declarations
        int res;
        // Var init
        res = 0;
        // Process
        if (n < 0 || n >= digitos(x))
            return -1;
        x = x / (int) potencia(10, digitos(x) - n - 1);
        res = (int) x % 10;
        return res;
    }

    /**
     * digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
     * empieza contando por el 0 y de izquierda a derecha.
     *
     * @param x Número inicial
     * @param n Posición
     * @return Dígito en la posición n
     */
    public static int digitoN(int x, int n) {
        return digitoN((long) x, (int) n);
    }

    /**
     * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
     * dentro de un número entero. Si no se encuentra, devuelve -1.
     *
     * @param x   Número inicial
     * @param dig Dígito a buscar
     * @return Posición del dígito dig
     */
    public static long posicionDeDigito(long x, long dig) {
        // Var declaration
        int longitud = digitos(x);
        do {
            int pot = (int) potencia(10, longitud);
            int num = (int) (x / pot);
            if (num % 10 == dig)
                return digitos(x) - longitud - 1;
            longitud--;
        } while (longitud > 0);
        return -1;
    }

    /**
     * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
     * dentro de un número entero. Si no se encuentra, devuelve -1.
     *
     * @param x   Número inicial
     * @param dig Dígito a buscar
     * @return Posición del dígito dig
     */
    public static int posicionDeDigito(int x, int dig) {
        return (int) (posicionDeDigito((long) x, (long) dig));
    }

    /**
     * quitaPorDetras: Le quita a un número n dígitos por detrás
     *
     * @param x Número inicial
     * @param n Número de dígitos a quitar
     * @return Número recortado por detrás
     */
    public static long quitaPorDetras(long x, int n) {
        return (long) (x / potencia(10, n));
    }

    /**
     * quitaPorDetras: Le quita a un número n dígitos por detrás
     *
     * @param x Número inicial
     * @param n Número de dígitos a quitar
     * @return Número recortado por detrás
     */
    public static int quitaPorDetras(int x, int n) {
        return (int) (quitaPorDetras((long) x, n));
    }

    /**
     * quitaPorDelante: Le quita a un número n dígitos por delante
     *
     * @param x Número inicial
     * @param n Cantidad de números a cortar por delante
     * @return Número recortado por delante
     */
    public static long quitaPorDelante(long x, int n) {
        return (long) (x % potencia(10, digitos(x) - n));
    }

    /**
     * quitaPorDelante: Le quita a un número n dígitos por delante
     *
     * @param x Número inicial
     * @param n Cantidad de números a cortar por delante
     * @return Número recortado por delante
     */
    public static int quitaPorDelante(int x, int n) {
        return (int) quitaPorDetras((long) x, n);
    }

    /**
     * pegaPorDetras: Añade un dígito a un número por detrás.
     *
     * @param x Número inicial
     * @param n Dígito a añadir por detrás
     * @return Nuevo número con el dígito añadido detrás
     */
    public static long pegaPorDetras(long x, long n) {
        x *= potencia(10, digitos(n));
        x += n;
        return x;
    }

    /**
     * pegaPorDetras: Añade un dígito a un número por detrás.
     *
     * @param x Número inicial
     * @param n Dígito a añadir por detrás
     * @return Nuevo número con el dígito añadido detrás
     */
    public static int pegaPorDetras(int x, int n) {
        return (int) (pegaPorDetras((long) x, (long) n));
    }

    /**
     * pegaPorDelante: Añade un dígito a un número por delante.
     *
     * @param x Número inicial
     * @param n Dígito a añadir por delante
     * @return Nuevo número con el dígito añadido por delante
     */
    public static long pegaPorDelante(long x, long n) {
        // Process
        n *= potencia(10, digitos(x));
        n += x;
        return n;
    }

    /**
     * pegaPorDelante: Añade un dígito a un número por delante.
     *
     * @param x Número inicial
     * @param n Dígito a añadir por delante
     * @return Nuevo número con el dígito añadido por delante
     */
    public static int pegaPorDelante(int x, int n) {
        return (int) (pegaPorDelante((long) x, (long) n));
    }

    /**
     * trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
     * de un número y devuelve el trozo correspondiente.
     *
     * @param x     Número pasado por parámetro
     * @param nInit Posición inicial
     * @param nEnd  Posición final
     * @return Nuevo trozo de número
     */
    public static long trozoDeNumero(long x, int nInit, int nEnd) {
        // Process
        int longitud = digitos(x);
        if (nInit < 0 || nInit > longitud)
            return -1;
        if (nEnd < 0 || nEnd > longitud)
            return -1;
        x = quitaPorDelante(x, nInit);
        x = quitaPorDetras(x, nEnd);
        return x;
    }

    /**
     * trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
     * de un número y devuelve el trozo correspondiente.
     *
     * @param x     Número pasado por parámetro
     * @param nInit Posición inicial
     * @param nEnd  Posición final
     * @return Nuevo trozo de número
     */
    public static int trozoDeNumero(int x, int nInit, int nEnd) {
        return (int) (trozoDeNumero((long) x, nInit, nEnd));
    }

    /**
     * juntaNumeros: Pega dos números para formar uno.
     *
     * @param x Primer número
     * @param n Segundo número
     * @return Nuevo número formado por los dos números pasados
     */
    public static long juntaNumeros(long x, long n) {
        int longitud = digitos(n);
        x = x * (long) potencia(10, longitud) + n;
        // Process
        return x;
    }

    /**
     * juntaNumeros: Pega dos números para formar uno.
     *
     * @param x Primer número
     * @param n Segundo número
     * @return Nuevo número formado por los dos números pasados
     */
    public static long juntaNumeros(int x, int n) {
        return juntaNumeros((long) x, (long) n);
    }

    /**
     * pasaADecimal: Pasa un número de cualquier base a decimal.
     *
     * @param x    String con el número que se quiere convertir a decimal
     * @param base Base inicial de la cadena pasada
     * @return Nuevo número en base decimal
     */
    public static int pasaADecimal(String x, int base) {
        // Var declarations
        int lon;
        int res;
        int charToNumber = 0;
        res = 0;
        // Process
        lon = x.length();
        for (int i = 0; i < lon; i++) {
            switch (x.charAt(i)) {
                case 'a':
                    charToNumber = 10;
                    break;
                case 'b':
                    charToNumber = 11;
                    break;
                case 'c':
                    charToNumber = 12;
                    break;
                case 'd':
                    charToNumber = 13;
                    break;
                case 'e':
                    charToNumber = 14;
                    break;
                case 'f':
                    charToNumber = 15;
                    break;
                default:
                    charToNumber = Character.getNumericValue(x.charAt(i));
                    break;
            }
            res += charToNumber * General.potencia(base, lon - i - 1);
        }
        return res;
    }

    /**
     * pasaDeDecimal: Pasa un número de decimal a otra base.
     *
     * @param x    Número decimal
     * @param base Base a la que se desea convertir
     * @return Nuevo número en la base indicada
     */
    public static String pasaDeDecimal(String x, int base) {
        // Var declarations
        String[] baseString = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
        int aux = Integer.parseInt(x);
        String res;
        res = "";
        // Process
        while (aux > 0) {
            res = baseString[aux % base] + res;
            aux = (int) aux / base;
        }
        ;
        return res;
    }

    /**
     * convierteEnPalotes Convierte en un string con base Palotes un número entrado
     * como parámetro
     *
     * @param n Número que se quiere convertir a la base Palotes
     * @return String con la cadena palotes
     */
    public static String convierteEnPalotes(int n) {
        // Var declarations
        String res;
        int nLong;
        int aux;

        // Var init
        res = "";

        // Cuenta longitud del número
        nLong = digitos(n);

        // Process
        while (n > 0) {
            aux = (int) ((int) n / (Math.pow(10, nLong - 1)));
            for (int i = 0; i < aux; i++)
                res += "|";
            n = (int) ((int) n % (Math.pow(10, nLong - 1)));
            nLong--;
            if (nLong > 0)
                res += "-";
        }

        return res;
    }

    /**
     * convierteEnMorse: Convierte el número n al sistema Morse y lo devuelve en una
     * cadena de caracteres.
     *
     * @param n Número a convertir
     * @return String con el número convertido en morse
     */

    /*
     * 
     * 1 .____ 6 _....
     * 2 ..___ 7 __...
     * 3 ...__ 8 ___..
     * 4 ...._ 9 ____.
     * 5 ..... 0 _____
     */
    public static String convierteEnMorse(int n) {
        // Var declaration
        String[] code = { "_____", ".____", "..___", "...__", "...._", ".....", "_....", "__...", "___..", "____." };
        int digits;
        String res;

        // Var init
        digits = digitos(n);
        res = "";

        // Process
        for (int i = 0; i < digits; i++)
            res += code[digitoN(n, i)];

        return res;
    }

    /**
     * convierteEnPalabras: Convierte los dígitos del número n en las
     * correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por
     * ejemplo, el 470213 convertido a palabras sería: cuatro, siete, cero, dos,
     * uno, tres.
     *
     * @param n Número a convertir
     * @return String con el número convertido en palabras
     */

    public static String convierteEnPalabras(int n) {
        // Var declaration
        String[] code = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        int digits;
        String res;

        // Var init
        digits = digitos(n);
        res = "";

        // Process
        for (int i = 0; i < digits; i++)
            if (i != 0)
                res += ", " + code[digitoN(n, i)];
            else
                res += code[digitoN(n, i)];

        return res;
    }

    /**
     * imprimeLinea: Imprime una línea con los caracteres indicados, rellena o
     * bordes en función del parámetro de entrada
     *
     * @param x Tamaño de la línea
     * @param c Carácter a imprimir
     * @param t Bordes de línea solamente, true: bordes; false: rellena
     * @return void imprime la línea solicitada
     */
    public static void imprimeLinea(int x, String c, boolean t) {
        for (int i = 0; i < x; i++) {
            if (t == false)
                System.out.print(c);
            else if (i == 0 || i == (x - 1))
                System.out.print(c);
            else
                System.out.print(" ");
        }
    }

    /**
     * ocurrencias: Devuelve en número de veces que aparece un dígito en un número
     *
     * @param digito Dígito a buscar en el número
     * @param n      Número a
     * @return Número de ocurrencias, 0 si no hay ninguna
     */
    public static int ocurrencias(int digito, int n) {
        // Var init
        int counter;
        counter = 0;
        // Process
        for (int i = 0; i < General.digitos(n); i++)
            if (digito == General.digitoN(n, i))
                counter++;
        return counter;
    }
}
