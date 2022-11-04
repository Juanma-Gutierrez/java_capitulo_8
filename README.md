# java_capitulo_8

Soluciones a los ejercicios del libro **Aprende Java con ejercicios** de Luis José Sánchez (_Edición 2019_).

Este libro está a la venta en <https://leanpub.com/aprendejava>

![image](https://user-images.githubusercontent.com/101201349/198890431-a5598843-2252-4e82-a764-bb1380121200.png)

## Listado de ejercicios

[Ejercicios 1-14](#ejercicios-1-14)
[Ejercicio 15](#ejercicio-15)
[Ejercicio 16](#ejercicio-16)
[Ejercicio 17](#ejercicio-17)
[Ejercicio 18](#ejercicio-18)
[Ejercicio 19](#ejercicio-19)
[Ejercicios 20-28](#ejercicios-20-28)
[Ejercicios 29-34](#ejercicios-29-34)
[Ejercicio 35](#ejercicio-35)
[Ejercicio 36](#ejercicio-36)
[Ejercicio 37](#ejercicio-37)
[Ejercicio 38](#ejercicio-38)
[Ejercicio 39](#ejercicio-39)
[Ejercicio 40](#ejercicio-40)
[Ejercicio 41](#ejercicio-41)
[Ejercicio 42](#ejercicio-42)
[Ejercicio 43](#ejercicio-43)
[Ejercicio 44](#ejercicio-44)
[Ejercicio 45](#ejercicio-45)
[Ejercicio 46](#ejercicio-46)
[Ejercicio 47](#ejercicio-47)
[Ejercicio 48](#ejercicio-48)
[Ejercicio 49](#ejercicio-49)
[Ejercicio 50](#ejercicio-50)
[Ejercicio 51](#ejercicio-51)
[Ejercicio 52](#ejercicio-52)
[Ejercicio 53](#ejercicio-53)
[Ejercicio 54](#ejercicio-54)
[Ejercicio 55](#ejercicio-55)
[Ejercicio 56](#ejercicio-56)

### Ejercicios 1-14

Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que puedes usar unas dentro de otras si es necesario. Observa bien lo que hace cada función ya que, si las implementas en el orden adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de implementar teniendo esPrimo.

1. **esCapicua**: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
2. **esPrimo**: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
3. **siguientePrimo**: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
4. **potencia**: Dada una base y un exponente devuelve la potencia.
5. **digitos**: Cuenta el número de dígitos de un número entero.
6. **voltea**: Le da la vuelta a un número.
7. **digitoN**: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
8. **posicionDeDigito**: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
9. **quitaPorDetras**: Le quita a un número n dígitos por detrás (por la derecha).
10. **quitaPorDelante**: Le quita a un número n dígitos por delante (por la izquierda).
11. **pegaPorDetras**: Añade un dígito a un número por detrás.
12. **pegaPorDelante**: Añade un dígito a un número por delante.
13. **trozoDeNumero**: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
14. **juntaNumeros**: Pega dos números para formar uno.

### Ejercicio 15

Muestra los números primos que hay entre 1 y 1000.

```
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997,
```

### Ejercicio 16

Muestra los números capicúa que hay entre 1 y 99999.

```
1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, 212, 222, 232, 242, 252, 262, 272, 282, 292, 303, 313, 323, 333, 343, 353, 363, 373, 383, 393, 404, 414, 424, 434, 444, 454, 464, 474, 484, 494, 505, 515, 525, 535, 545, 555, 565, 575, 585, 595, 606, 616, 626, 636, 646, 656, 666, 676, 686, 696, 707, 717, 727, 737, 747, 757, 767, 777, 787, 797, 808, 818, 828, 838, 848, 858, 868, 878, 888, 898, 909, 919, 929, 939, 949, 959, 969, 979, 989, 999, 1001, 1111, 1221, 1331, 1441, 1551, 1661, 1771, 1881, 1991, 2002, 2112, 2222, 2332, 2442, 2552, 2662, 2772, 2882, 2992, 3003, 3113, 3223, 3333, 3443, 3553, 3663, 3773, 3883, 3993, 4004, 4114, 4224, 4334, 4444, 4554, 4664, 4774, 4884, 4994, 5005, 5115, 5225, 5335, 5445, 5555, 5665, 5775, 5885, 5995, 6006, 6116, 6226, 6336, 6446, 6556, 6666, 6776, 6886, 6996, 7007, 7117, 7227, 7337, 7447, 7557, 7667, 7777, 7887, 7997, 8008, 8118, 8228, 8338, 8448, 8558, 8668, 8778, 8888, 8998, 9009, 9119, 9229, 9339, 9449, 9559, 9669, 9779, 9889, 9999, 10001, 10101, 10201, 10301, 10401, 10501, 10601, 10701, 10801, 10901, 11011, 11111, 11211, 11311, 11411, 11511, 11611, 11711, 11811, 11911, 12021, 12121, 12221, 12321, 12421, 12521, 12621, 12721, 12821, 12921, 13031, 13131, 13231, 13331, 13431, 13531, 13631, 13731, 13831, 13931, 14041, 14141, 14241, 14341, 14441, 14541, 14641, 14741, 14841, 14941, 15051, 15151, 15251, 15351, 15451, 15551, 15651, 15751, 15851, 15951, 16061, 16161, 16261, 16361, 16461, 16561, 16661, 16761, 16861, 16961, 17071, 17171, 17271, 17371, 17471, 17571, 17671, 17771, 17871, 17971, 18081, 18181, 18281, 18381, 18481, 18581, 18681, 18781, 18881, 18981, 19091, 19191, 19291, 19391, 19491, 19591, 19691, 19791, 19891, 19991, 20002, 20102, 20202, 20302, 20402, 20502, 20602, 20702, 20802, 20902, 21012, 21112, 21212, 21312, 21412, 21512, 21612, 21712, 21812, 21912, 22022, 22122, 22222, 22322, 22422, 22522, 22622, 22722, 22822, 22922, 23032, 23132, 23232, 23332, 23432, 23532, 23632, 23732, 23832, 23932, 24042, 24142, 24242, 24342, 24442, 24542, 24642, 24742, 24842, 24942, 25052, 25152, 25252, 25352, 25452, 25552, 25652, 25752, 25852, 25952, 26062, 26162, 26262, 26362, 26462, 26562, 26662, 26762, 26862, 26962, 27072, 27172, 27272, 27372, 27472, 27572, 27672, 27772, 27872, 27972, 28082, 28182, 28282, 28382, 28482, 28582, 28682, 28782, 28882, 28982, 29092, 29192, 29292, 29392, 29492, 29592, 29692, 29792, 29892, 29992, 30003, 30103, 30203, 30303, 30403, 30503, 30603, 30703, 30803, 30903, 31013, 31113, 31213, 31313, 31413, 31513, 31613, 31713, 31813, 31913, 32023, 32123, 32223, 32323, 32423, 32523, 32623, 32723, 32823, 32923, 33033, 33133, 33233, 33333, 33433, 33533, 33633, 33733, 33833, 33933, 34043, 34143, 34243, 34343, 34443, 34543, 34643, 34743, 34843, 34943, 35053, 35153, 35253, 35353, 35453, 35553, 35653, 35753, 35853, 35953, 36063, 36163, 36263, 36363, 36463, 36563, 36663, 36763, 36863, 36963, 37073, 37173, 37273, 37373, 37473, 37573, 37673, 37773, 37873, 37973, 38083, 38183, 38283, 38383, 38483, 38583, 38683, 38783, 38883, 38983, 39093, 39193, 39293, 39393, 39493, 39593, 39693, 39793, 39893, 39993, 40004, 40104, 40204, 40304, 40404, 40504, 40604, 40704, 40804, 40904, 41014, 41114, 41214, 41314, 41414, 41514, 41614, 41714, 41814, 41914, 42024, 42124, 42224, 42324, 42424, 42524, 42624, 42724, 42824, 42924, 43034, 43134, 43234, 43334, 43434, 43534, 43634, 43734, 43834, 43934, 44044, 44144, 44244, 44344, 44444, 44544, 44644, 44744, 44844, 44944, 45054, 45154, 45254, 45354, 45454, 45554, 45654, 45754, 45854, 45954, 46064, 46164, 46264, 46364, 46464, 46564, 46664, 46764, 46864, 46964, 47074, 47174, 47274, 47374, 47474, 47574, 47674, 47774, 47874, 47974, 48084, 48184, 48284, 48384, 48484, 48584, 48684, 48784, 48884, 48984, 49094, 49194, 49294, 49394, 49494, 49594, 49694, 49794, 49894, 49994, 50005, 50105, 50205, 50305, 50405, 50505, 50605, 50705, 50805, 50905, 51015, 51115, 51215, 51315, 51415, 51515, 51615, 51715, 51815, 51915, 52025, 52125, 52225, 52325, 52425, 52525, 52625, 52725, 52825, 52925, 53035, 53135, 53235, 53335, 53435, 53535, 53635, 53735, 53835, 53935, 54045, 54145, 54245, 54345, 54445, 54545, 54645, 54745, 54845, 54945, 55055, 55155, 55255, 55355, 55455, 55555, 55655, 55755, 55855, 55955, 56065, 56165, 56265, 56365, 56465, 56565, 56665, 56765, 56865, 56965, 57075, 57175, 57275, 57375, 57475, 57575, 57675, 57775, 57875, 57975, 58085, 58185, 58285, 58385, 58485, 58585, 58685, 58785, 58885, 58985, 59095, 59195, 59295, 59395, 59495, 59595, 59695, 59795, 59895, 59995, 60006, 60106, 60206, 60306, 60406, 60506, 60606, 60706, 60806, 60906, 61016, 61116, 61216, 61316, 61416, 61516, 61616, 61716, 61816, 61916, 62026, 62126, 62226, 62326, 62426, 62526, 62626, 62726, 62826, 62926, 63036, 63136, 63236, 63336, 63436, 63536, 63636, 63736, 63836, 63936, 64046, 64146, 64246, 64346, 64446, 64546, 64646, 64746, 64846, 64946, 65056, 65156, 65256, 65356, 65456, 65556, 65656, 65756, 65856, 65956, 66066, 66166, 66266, 66366, 66466, 66566, 66666, 66766, 66866, 66966, 67076, 67176, 67276, 67376, 67476, 67576, 67676, 67776, 67876, 67976, 68086, 68186, 68286, 68386, 68486, 68586, 68686, 68786, 68886, 68986, 69096, 69196, 69296, 69396, 69496, 69596, 69696, 69796, 69896, 69996, 70007, 70107, 70207, 70307, 70407, 70507, 70607, 70707, 70807, 70907, 71017, 71117, 71217, 71317, 71417, 71517, 71617, 71717, 71817, 71917, 72027, 72127, 72227, 72327, 72427, 72527, 72627, 72727, 72827, 72927, 73037, 73137, 73237, 73337, 73437, 73537, 73637, 73737, 73837, 73937, 74047, 74147, 74247, 74347, 74447, 74547, 74647, 74747, 74847, 74947, 75057, 75157, 75257, 75357, 75457, 75557, 75657, 75757, 75857, 75957, 76067, 76167, 76267, 76367, 76467, 76567, 76667, 76767, 76867, 76967, 77077, 77177, 77277, 77377, 77477, 77577, 77677, 77777, 77877, 77977, 78087, 78187, 78287, 78387, 78487, 78587, 78687, 78787, 78887, 78987, 79097, 79197, 79297, 79397, 79497, 79597, 79697, 79797, 79897, 79997, 80008, 80108, 80208, 80308, 80408, 80508, 80608, 80708, 80808, 80908, 81018, 81118, 81218, 81318, 81418, 81518, 81618, 81718, 81818, 81918, 82028, 82128, 82228, 82328, 82428, 82528, 82628, 82728, 82828, 82928, 83038, 83138, 83238, 83338, 83438, 83538, 83638, 83738, 83838, 83938, 84048, 84148, 84248, 84348, 84448, 84548, 84648, 84748, 84848, 84948, 85058, 85158, 85258, 85358, 85458, 85558, 85658, 85758, 85858, 85958, 86068, 86168, 86268, 86368, 86468, 86568, 86668, 86768, 86868, 86968, 87078, 87178, 87278, 87378, 87478, 87578, 87678, 87778, 87878, 87978, 88088, 88188, 88288, 88388, 88488, 88588, 88688, 88788, 88888, 88988, 89098, 89198, 89298, 89398, 89498, 89598, 89698, 89798, 89898, 89998, 90009, 90109, 90209, 90309, 90409, 90509, 90609, 90709, 90809, 90909, 91019, 91119, 91219, 91319, 91419, 91519, 91619, 91719, 91819, 91919, 92029, 92129, 92229, 92329, 92429, 92529, 92629, 92729, 92829, 92929, 93039, 93139, 93239, 93339, 93439, 93539, 93639, 93739, 93839, 93939, 94049, 94149, 94249, 94349, 94449, 94549, 94649, 94749, 94849, 94949, 95059, 95159, 95259, 95359, 95459, 95559, 95659, 95759, 95859, 95959, 96069, 96169, 96269, 96369, 96469, 96569, 96669, 96769, 96869, 96969, 97079, 97179, 97279, 97379, 97479, 97579, 97679, 97779, 97879, 97979, 98089, 98189, 98289, 98389, 98489, 98589, 98689, 98789, 98889, 98989, 99099, 99199, 99299, 99399, 99499, 99599, 99699, 99799, 99899, 99999,
```

### Ejercicio 17

Escribe un programa que pase de binario a decimal.

### Ejercicio 18

Escribe un programa que pase de decimal a binario.

### Ejercicio 19

Une y amplía los dos programas anteriores de tal forma que se permita convertir un número entre cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.

### Ejercicios 20-28

Crea una biblioteca de funciones para arrays (de una dimensión) de números enteros que contenga las siguientes funciones:

1. **generaArrayInt**: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
2. **minimoArrayInt**: Devuelve el mínimo del array que se pasa como parámetro.
3. **maximoArrayInt**: Devuelve el máximo del array que se pasa como parámetro.
4. **mediaArrayInt**: Devuelve la media del array que se pasa como parámetro.
5. **estaEnArrayInt**: Dice si un número está o no dentro de un array.
6. **posicionEnArray**: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
7. **volteaArrayInt**: Le da la vuelta a un array.
8. **rotaDerechaArrayInt**: Rota n posiciones a la derecha los números de un array.
9. **rotaIzquierdaArrayInt**: Rota n posiciones a la izquierda los números de un array.

### Ejercicios 29-34

Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de números enteros que contenga las siguientes funciones:

1. **generaArrayBiInt**: Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
2. **filaDeArrayBiInt**: Devuelve la fila i-ésima del array que se pasa como parámetro.
3. **columnaDeArrayBiInt**: Devuelve la columna j-ésima del array que se pasa como parámetro.
4. **coordenadasEnArrayBiInt**: Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional. Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
5. **esPuntoDeSilla**: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
6. **diagonal**: Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como parámetro. Se pasan como parámetros fila, columna y dirección. La fila y la columna determinan el número que marcará las dos posibles diagonales dentro del array. La dirección es una cadena de caracteres que puede ser “nose” o “neso”. La cadena “nose” indica que se elige la diagonal que va del noroeste hacia el sureste, mientras que la cadena “neso” indica que se elige la diagonal que va del noreste hacia el suroeste.

### Ejercicio 35

Crea una función con la siguiente cabecera:

```
public static String convierteEnPalotes(int n)
```

Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.

### Ejercicio 36

Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):

```
public static int[] filtraPrimos(int x[])   // Devuelve un array con todos los
                                            // números primos que se encuentren
                                            // en otro array que se pasa como
                                            // parámetro.
                                            // Obviamente el tamaño del array
                                            // que se devuelve será menor o
                                            // igual al que se pasa como
                                            // parámetro.

```

Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es decir, si en el array x el número 13 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no existe ningún número primo en x, se devuelve un array con el número -1 como único elemento.

### Ejercicio 37

Crea una función con la siguiente cabecera:

```
public String convierteEnMorse(int n)
```

Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres. Por ejemplo, el 213 es el . . \_ \_ _ . _ \_ \_ _ . . . _ \_ en Morse. Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.

```
1 . _ _ _ _  6 _ . . . .
2 . . _ _ _  7 _ _ . . .
3 . . . _ _  8 _ _ _ . .
4 . . . . _  9 _ _ _ _ .
5 . . . . .  0 _ _ _ _ _
```

### Ejercicio 38

Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):

```
public int[] filtraCapicuas(int x[])    // Devuelve un array con todos los números
                                        // capicúa que se encuentren en otro array
                                        // que se pasa como parámetro.
                                        // Obviamente el tamaño del array que se
                                        // devuelve será menor o igual al que se
                                        // pasa como parámetro.
```

Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte más fácil, las repeticiones de números capicúa se conservan; es decir, si en el array x el número 505 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no existe ningún número capicúa en x, se devuelve un array con el número -1 como único elemento.

### Ejercicio 39

Crea una función con la siguiente cabecera:

```
public String convierteEnPalabras(int n)
```

Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:

```
cuatro, siete, cero, dos, uno, tres
```

Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al final.

### Ejercicio 40

Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):

```
public int[] filtraCon7(int x[])    // Devuelve un array con todos los números
                                    // que contienen el 7 (por ej. 7, 27, 782)
                                    // que se encuentren en otro array que se
                                    // pasa como parámetro. El tamaño del array
                                    // que se devuelve será menor o igual al
                                    // que se pasa como parámetro.
```

Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte más fácil, las repeticiones de números que contienen 7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no existe ningún número que contiene 7 en el array x, se devuelve un array con el número -1 como único elemento.

### Ejercicio 41

Realiza un programa que pinte un triángulo relleno tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio ya se realizó en el tema de bucles, ahora se trata de usar una función para que la implementación sea más sencilla. Por ejemplo, se puede crear una función linea(char caracter, int repeticiones) que pinte una línea con el carácter especificado.

```
Ejemplo 1:
Introduzca la altura de la figura: 8
XXXXXXXX
XXXXXXX
XXXXXX
XXXXX
XXXX
XXX
XX
X

Ejemplo 2:
Introduzca la altura de la figura: 5
XXXXX
XXXX
XXX
XX
X
```

### Ejercicio 42

Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para pintar las líneas.

```
Ejemplo 1:
Introduzca la altura de la figura: 8
---
XXXXXXXX
X     X
X    X
X   X
X  X
X X
XX
X

Ejemplo 2:
Introduzca la altura de la figura: 5
XXXXX
X  X
X X
XX
X
```

### Ejercicio 43

Realiza un programa que pinte un triángulo relleno tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para pintar las líneas.

```
Ejemplo 1:
Introduzca la altura de la figura: 8
---
XXXXXXXX
 XXXXXXX
  XXXXXX
   XXXXX
    XXXX
     XXX
      XX
       X

Ejemplo 2:
Introduzca la altura de la figura: 5
XXXXX
 XXXX
  XXX
   XX
    X
```

### Ejercicio 44

Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para pintar las líneas.

```
Ejemplo 1:
Introduzca la altura de la figura: 8
XXXXXXXX
 X     X
  X    X
   X   X
    X  X
     X X
      XX
       X

Ejemplo 2:
Introduzca la altura de la figura: 5
XXXXX
 X  X
  X X
   XX
    X
```

### Ejercicio 45

Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Podemos suponer que el usuario introduce una altura mayor o igual a 3.

```
Ejemplo 1:
Introduzca la altura de la figura: 8
X              X
XX            XX
XXX          XXX
XXXX        XXXX
XXXXX      XXXXX
XXXXXX    XXXXXX
XXXXXXX  XXXXXXX
XXXXXXXXXXXXXXXX

Ejemplo 2:
Introduzca la altura de la figura: 5
X        X
XX      XX
XXX    XXX
XXXX  XXXX
XXXXXXXXXX

Ejemplo 3:
Introduzca la altura de la figura: 3
X    X
XX  XX
XXXXXX
```

### Ejercicio 46

Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura. Podemos suponer que el usuario introduce una altura mayor o igual a 3.

```
Ejemplo 1:
Introduzca la altura de la figura: 8
X             X
XX           XX
X X         X X
X  X       X  X
X   X     X   X
X    X   X    X
X     X X     X
XXXXXXXXXXXXXXX

Ejemplo 2:
Introduzca la altura de la figura: 5
X        X
XX      XX
X X    X X
X  X  X  X
XXXXXXXXXX

Ejemplo 3:
Introduzca la altura de la figura: 3
X    X
XX  XX
XXXXXX
```

### Ejercicio 47

Define la función convierteArrayEnString con la siguiente cabecera:

```
public static String convierteArrayEnString(int[] a)
```

Esta función toma como parámetro un array que contiene números y devuelve una cadena de caracteres con esos números.

```
Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
“62501”.
```

### Ejercicio 48

Define la función concatena con la siguiente cabecera:

```
public static int[] concatena(int[] a, int[] b)
```

Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar ambos.

```
Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
```

### Ejercicio 49

Escribe un programa que genere los n primeros términos de la sucesión look and say. El primer término es 1. A continuación se va leyendo - un uno - por tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc. Se recomienda usar arrays para almacenar los dígitos porque los tipos int y long son muy limitados en cuanto al número de dígitos. También puede resultar de ayuda utilizar las funciones convierteArrayEnString y concatena definidas en los ejercicios anteriores.

```
Ejemplo 1:
¿Cuántos términos de la sucesión look and say quiere calcular? 8
1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211

Ejemplo 2:
¿Cuántos términos de la sucesión look and say quiere calcular? 5
1, 11, 21, 1211, 111221

Ejemplo 3:
¿Cuántos términos de la sucesión look and say quiere calcular? 12
1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, 31131211131221, 13211311123113112211,
11131221133112132113212221, 3113112221232112111312211312113211
```

### Ejercicio 50

Define la función mezcla con la siguiente cabecera:

```
public static int[] mezcla(int[] a, int[] b)
```

Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de mezclar los números de ambos de forma alterna, se coge un número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que quedan del otro.

```
Ejemplos:
Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
```

### Ejercicio 51

Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A continuación, el programa indicará para cada uno de ellos si es un número primo y/o un capicúa de la forma que muestra el ejemplo.

```
Ejemplos:
Array generado:
19 22 57 11 3 52 32 46 2 14
El 19 es primo y no es capicúa.
El 22 no es primo y es capicúa.
El 57 no es primo y no es capicúa.
El 11 es primo y es capicúa.
El 3 es primo y es capicúa.
El 52 no es primo y no es capicúa.
El 32 no es primo y no es capicúa.
El 46 no es primo y no es capicúa.
El 2 es primo y es capicúa.
14 no es primo y no es capicúa.
```

### Ejercicio 52

Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:

```
public static int aleatorioDeArray(int[] a)
```

Esta función debe devolver un número del array escogido al azar entre todos los disponibles.

```
Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver el 111, el 222, el 333 o el 444.
Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de prueba.
```

### Ejercicio 53

Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional en la posición n-ésima contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento es el 0. Si la posición donde se busca no existe en el array, la función debe devolver -1. Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:

```
public static int nEsimo(int[][] n, int posicion)
```

Si el array a es el que se muestra a continuación:

```
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48
12 34 56 78 90 12
nEsimo(a, 0) devuelve 35
nEsimo(a, 2) devuelve 24
nEsimo(a, 5) devuelve 60
nEsimo(a, 6) devuelve 32
nEsimo(a, 21) devuelve 78
nEsimo(a, 23) devuelve 12
nEsimo(a, 24) devuelve -1
nEsimo(a, 100) devuelve -1
```

### Ejercicio 54

Crea las funciones cuyas cabeceras se muestran a continuación, observa que tienen el mismo nombre:

```
public static int ocurrencias(int digito, int n)
public static int ocurrencias(int digito, int[] a)
```

La función ocurrencias devuelve el número de veces que aparece un dígito dentro de un número (primera función) o bien el número de veces que aparece un dígito en una serie de números contenidos en un array (segunda función).

```
Ejemplos:
ocurrencias(8, 4672) devuelve 0
ocurrencias(5, 25153) devuelve 2
ocurrencias(2, 123456) devuelve 1 Si a = {714, 81, 9, 11}
ocurrencias(1, a) devuelve 4 Si a = {42, 13, 12345, 4}
ocurrencias(4, a) devuelve 3 Si a = {6, 66, 666}
ocurrencias(6, a) devuelve 6
```

Utiliza estas funciones en un programa para comprobar que funcionan bien.

### Ejercicio 55

Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro array con los mismos valores habiendo eliminado las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto “hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores {“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”, “sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”, “coche”, “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:

```
public static String[] sinRepetir(String[] s)
```

### Ejercicio 56

Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un array bidimensional. Esta capa se extrae en forma de array de una dimensión. La extracción de números comienza en la esquina superior izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:

```
public static int[] corteza(int[][] n)
```

Por ejemplo, si el array bidimensional a es el que se muestra a continuación:

```
45 92 14 20 25 78
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48

El array unidimensional generado por corteza(a) sería el siguiente:
45 92 14 20 25 78 60 39 48 18 11 94 45 98
```
