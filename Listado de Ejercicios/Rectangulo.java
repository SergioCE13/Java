/*
* Planteamiento del ejercicio: Escribe un programa que calcule el radio
* de la circunferencia inscrita en un triángulo rectángulo.
* */

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        double a,b,c, radio;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Calcular el radio de una circunferencia inscrita en un triangulo rectangulo---");
        System.out.println("Ingrese la longitud del cateto adyacente: ");
        a = leer.nextDouble();
        System.out.println("Ingrese la longitud del cateto opuesto:");
        b = leer.nextDouble();
        System.out.println("Ingrese la longitud de la hipotenusa:");
        c = leer.nextDouble();

        radio = (a+b-c)/2;
        System.out.println("El tamaño del radio es de: " + radio);
    }
}
