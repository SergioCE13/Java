/*
* Planteamiento del ejercicio: Encontrar los números entre el 1 y
* el 5000 que cumplen la regla de que la suma del cubo de sus dígitos
* es igual al número mismo. Ejemplo: 153=13+53+33
* */

import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class ReglaDelCubo {

    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 5000; i++) {
            int totalD, aux = i, suma = 0;

            if (i == 0) {
                totalD = 1;
            } else {
                totalD = (int) (log10(i) + 1);
            }

            for (int j = 1; j <= totalD; j++) {
                int digito = aux % 10;
                aux /= 10;
                suma += pow(digito, totalD);
            }

            if (i == suma) {
                System.out.printf("%d%n", i);
            }
        }
    }
}
