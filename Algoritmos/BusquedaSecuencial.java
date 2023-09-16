import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase realiza una búsqueda secuencial en un arreglo de enteros generados aleatoriamente.
 */
public class BusquedaSecuencial {
    /**
     * El método principal que inicia el programa.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        // Leer el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = leer.nextInt();

        // Crear un arreglo de enteros de tamaño n y llenarlo con números aleatorios entre 0 y 100
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(101); // Números aleatorios entre 0 y 100
        }


        // Leer el número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int x = leer.nextInt();

        // Realizar la búsqueda secuencial
        int contador = 0;
        for (int elemento : arreglo) {
            if (elemento == x) {
                contador++;
            }
        }

        // Mostrar los resultados
        if (contador > 0) {
            System.out.println("El número " + x + " se encontró en el arreglo " + contador + " veces.");
        } else {
            System.out.println("El número " + x + " no se encontró en el arreglo.");
        }

        // Mostrar el arreglo generado
        System.out.println("Arreglo generado:");
        mostrarArreglo(arreglo);

        leer.close();
    }

    /**
     * Este método muestra un arreglo de enteros en pantalla.
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
