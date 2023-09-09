/*
* Planteamiento del ejercicio: Escribe un programa que lea un archivo de texto plano,
* lo analice y obtenga la cantidad de veces que se encuentra cada letra en el archivo.
* */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoLetras {
    public static void main(String[] args) {
        String archivoEntrada = "archivoEntrada.txt";

        int[] frecuenciaLetras = new int[26];

        try {
            FileReader fr = new FileReader(archivoEntrada);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.toLowerCase();
                for (int i = 0; i < linea.length(); i++) {
                    char caracter = linea.charAt(i);
                    if (Character.isLetter(caracter)) {
                        int indice = caracter - 'a';
                        if (indice >= 0 && indice < 26) {
                            frecuenciaLetras[indice]++;
                        }
                    }
                }
            }

            br.close();

            for (char letra = 'a'; letra <= 'z'; letra++) {
                int indice = letra - 'a';
                System.out.println(letra + ": " + frecuenciaLetras[indice]);
            }

        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
