import java.util.Random;

public class Ejercicio6{
    public static void main(String[] args) {
        if (args.length != 1) { //Verificamos que el usuario indique el número de palabras a generar.
            System.out.println("No has ingresado el número de palabras a generar.");
            return;
        }

        long start = System.nanoTime();
        int n = Integer.parseInt(args[0]); // Convertimos el argumento del usuario a Entero.
        StringBuilder cadena = new StringBuilder(); // Generamos el objeto de tipo StringBuilder para almacenar la cadena.
        Random random = new Random(); // Creamos un objeto de tipo Random para generar los caracteres.

        // Generar palabras aleatorias y concatenarlas en la cadena gigante.
        for (int i = 0; i < n; i++) { //Ciclo para generar las palabras
            for (int j = 0; j < 3; j++) { //Ciclo para generar las letras
                char letra = (char) ('A' + random.nextInt(26)); // Generar letra aleatoria
                cadena.append(letra); //Concatenar los caracteres
            }
            cadena.append(' '); // Agregar espacio en blanco a la palabra
        }

        // Imprimir la cadena gigante
        System.out.println("Cadena gigante: " + cadena.toString());

        // Buscar la subcadena "IPN" y contar apariciones
        String subcadena = "IPN";
        int contador = 0;
        int posicion = -1;
        int inicio = 0;

        while ((posicion = cadena.indexOf(subcadena, inicio)) != -1) { //Ciclo para buscar la palabra IPN en la StringBuilder 
            contador++;
            System.out.println("Hay una aparición de IPN en la posición: " + posicion);
            inicio = posicion + 1; // Buscar a partir de la siguiente posición
        }
        
        long end = System.nanoTime();
        long tiempo = end - start;
        double segundos = (double)tiempo/1_000_000_000;
        System.out.println("Número total de apariciones de 'IPN': " + contador); //Imprimimos el número total de apariciones.
        System.out.println("El tiempo transcurrido es: " + segundos);
    }
}