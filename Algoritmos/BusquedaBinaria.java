import java.util.Random;
import java.util.Scanner;

/**
 * Este programa genera un arreglo de "n" enteros aleatorios, lo ordena y luego permite al usuario
 * ingresar un número para realizar una búsqueda binaria en el arreglo para verificar si el número se
 * encuentra dentro de este.
 */
public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        // Leer el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = leer.nextInt();

        // Crear un arreglo de enteros de tamaño n y llenarlo con números aleatorios entre 0 y 100
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(11); // Números aleatorios entre 0 y 100
        }

        // Leer el número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int x = leer.nextInt();

        // Realizar la búsqueda binaria
        int resultado = busquedaBinaria(arreglo, x);

        // Mostrar los resultados
        if (resultado != -1) {
            System.out.println("El número " + x + " se encontró en el arreglo.");
        } else {
            System.out.println("El número " + x + " no se encontró en el arreglo.");
        }

        leer.close();
    }

    /**
     * Muestra un arreglo de enteros en pantalla.
     *
     * @param arreglo El arreglo de enteros que se va a mostrar.
     */
    public static void mostrarArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    /**
     * Implementación del algoritmo de búsqueda binaria en un arreglo ordenado.
     *
     * @param arreglo El arreglo de enteros en el que se va a buscar.
     * @param x       El número que se busca en el arreglo.
     * @return La posición del número en el arreglo si se encuentra, o -1 si no se encuentra.
     */
    public static int busquedaBinaria(int[] arreglo, int x) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == x) {
                return medio;
            }

            if (arreglo[medio] < x) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1; // El elemento no se encontró en el arreglo
    }
}
