/*
* Planteamiento del ejercicio: Escribe un programa que lea un archivo de texto
* y que escriba en otro archivo solo las líneas impares del archivo original.
* */

import java.io.*;

public class ArchivoCopia {
    public static void main(String[] args) {

        String archivoEntrada = "archivoEntrada.txt";
        String archivoSalida = "archivoSalida.txt";

        try {
            FileReader fr = new FileReader(archivoEntrada);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(archivoSalida);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea;
            int numeroLinea = 1;

            while ((linea = br.readLine()) != null) {
                if (numeroLinea % 2 != 0) {
                    bw.write(linea);
                    bw.newLine();
                }
                numeroLinea++;
            }

            br.close();
            bw.close();

            System.out.println("Líneas impares copiadas con éxito en " + archivoSalida);
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
