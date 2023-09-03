/*
* Planteamiento del ejercicio: El programa debe leer números mientras
* sean diferentes de 0. Posteriormente calcular el promedio de los números leídos.
* */

import java.text.DecimalFormat;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        int numero = 1, sumatoria = 0, contador = 0;
        double promedio;
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");


        do{
            System.out.println("Ingresa un número: ");
            numero = leer.nextInt();
            sumatoria = sumatoria + numero;
            contador++;
        }while(numero != 0);

        promedio = (double) sumatoria/contador;
        System.out.println("El promedio es: " + df.format(promedio));
    }

}
