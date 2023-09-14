import java.util.Random;

public class Ejercicio5{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SubstringSearchWithoutIndexOf <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        char[] cadenota = new char[n * 4];
        Random random = new Random();

        // Generar palabras aleatorias y concatenarlas en la cadena gigante
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                char letra = (char) ('A' + random.nextInt(26)); // Generar letra aleatoria
                cadenota[i * 4 + j] = letra;
            }
            cadenota[i * 4 + 3] = ' '; // Agregar espacio en blanco
        }

        String cadenaGigante = new String(cadenota);

        // Imprimir la cadena gigante
        System.out.println("Cadena gigante: " + cadenaGigante);

        // Buscar la subcadena "IPN" y contar apariciones
        String subcadena = "IPN";
        int contador = 0;

        for (int i = 0; i < cadenaGigante.length(); i++) {
            if (cadenaGigante.charAt(i) == subcadena.charAt(0)) {
                // Comienza una posible aparición, verifica el resto de la subcadena
                boolean match = true;
                for (int j = 1; j < subcadena.length(); j++) {
                    if (i + j >= cadenaGigante.length() || cadenaGigante.charAt(i + j) != subcadena.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    contador++;
                    System.out.println("Aparición " + contador + ": Posición " + i);
                }
            }
        }

        System.out.println("Número total de apariciones de 'IPN': " + contador);
    }
}