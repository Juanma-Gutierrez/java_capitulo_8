/**
 * Exercise: 55
 *
 * @version: 12/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza una función que tome como parámetro un array de cadenas de caracteres
 * y que devuelva otro array con los mismos valores habiendo eliminado las
 * posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto
 * “hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores
 * {“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”, “sol”,
 * “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”, “coche”,
 * “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto el código de la
 * función como el código de prueba que la usa. La cabecera de la función es la
 * siguiente:
 * 
 * public static String[] sinRepetir(String[] s)
 */

import comp.jgutierr.arrays.MyArrays;

public class Ejercicio55 {
    public static void main(String[] args) {
        // Var declarations
        String[] listArray = { "casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA" };

        MyArrays.imprimeArray(listArray);
        listArray = MyArrays.sinRepetir(listArray);
        MyArrays.imprimeArray(listArray);
    }
}
