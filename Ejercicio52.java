/**
 * Exercise: 52
 *
 * @version: 12/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:
public static int aleatorioDeArray(int[] a)
Esta función debe devolver un número del array escogido al azar entre todos los disponibles.
Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver el 111, el 222, el 333 o el 444.
Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37. Utiliza la función en un pro
 */

import comp.jgutierr.arrays.MyArrays;

public class Ejercicio52 {
    public static void main(String[] args) {
        // Var declarations
        int[] listArray;

        listArray = new int[3];
        listArray = MyArrays.generaArrayInt(5, 100, 999);
        System.out.println("Array generado:");
        MyArrays.imprimeArray(listArray);

        for (int i = 0; i < 20; i++) {
            System.out
                    .println(MyArrays.aleatorioDeArray(listArray));
        }
    }
}
