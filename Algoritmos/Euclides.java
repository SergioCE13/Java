import java.util.Scanner;

/**
 * Este programa calcula el máximo común divisor (MCD) de una lista de números
 * enteros utilizando el algoritmo de Euclides.
 */
public class Euclides {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de valores
        do{
            System.out.print("Ingrese la cantidad de valores: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("El número de valores debe ser mayor que cero.");
            }
        }while(n<=0);

        // Crear un arreglo de enteros para almacenar los valores
        int[] valores = new int[n];

        // Leer los valores desde el teclado
        System.out.println("Ingrese los valores uno por uno:");
        for (int i = 0; i < n; i++) {
            valores[i] = scanner.nextInt();
        }

        // Calcular el MCD de los valores utilizando el algoritmo de Euclides
        int mcd = calcularMCD(valores);

        // Mostrar el resultado
        System.out.println("El MCD de los números ingresados es: " + mcd);

        scanner.close();
    }

    /**
     * Calcula el MCD de una lista de números enteros utilizando el algoritmo de Euclides.
     *
     * @param valores Un arreglo de enteros que contiene los números para calcular el MCD.
     * @return El MCD de los números en el arreglo.
     */
    public static int calcularMCD(int[] valores) {
        if (valores.length == 0) {
            return 0;
        }

        int mcd = valores[0];

        for (int i = 1; i < valores.length; i++) {
            mcd = calcularMCD(mcd, valores[i]);
        }

        return mcd;
    }

    /**
     * Calcula el MCD de dos números enteros utilizando el algoritmo de Euclides.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El MCD de los dos números.
     */
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
