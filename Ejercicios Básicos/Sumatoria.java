/*
* Planteamiento del ejercicio: Escribe un programa que solicite
* al usuario un número entero y dé como resultado la suma de todos
* los números desde el 1 hasta dicho numero.
* */

import java.util.Scanner;
public class Sumatoria {
    public static void main(String[] args) {
        int numero, suma = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Sumatoria de números---");
        System.out.println("Ingresa un número para calcular la sumatoria:");
        numero = leer.nextInt();

        for(int i = 1; i <= numero; i++){
            suma = suma+i;
        }

        System.out.println("La sumatoria es: " + suma);

    }
}
