import java.util.Scanner;

/**
 * Clase que ordena un arreglo de enteros en orden descendente utilizando el algoritmo de burbuja.
 */
public class BurbujaDescendente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Leer el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = leer.nextInt();

        // Crear un arreglo de enteros de tamaño n
        int[] arreglo = new int[n];

        // Solicitar al usuario que llene el arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = leer.nextInt();
        }

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        // Llamar al método para ordenar los elementos del arreglo.
        ordenarBurbujaDescendente(arreglo);

        // Mostrar el arreglo ordenado en orden descendente
        System.out.println("Arreglo ordenado descendentemente:");
        mostrarArreglo(arreglo);

        leer.close();
    }

    /**
     * Implementación del algoritmo de burbuja para ordenar un arreglo en orden descendente.
     *
     * @param arreglo El arreglo de enteros que se va a ordenar en orden descendente.
     */
    public static void ordenarBurbujaDescendente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto (descendente)
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Método para mostrar un arreglo en pantalla.
     *
     * @param arreglo El arreglo de enteros que se va a mostrar.
     */
    public static void mostrarArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
