/*
* Planteamiento del ejercicio: Escriba un programa que solicite los valores de a, b, c y d
* (como números enteros) y calcule el valor de la multiplicación y lo muestre en pantalla en
* forma de número con decimales y en forma de fracción (ejemplo 17/33) (Se debe resolver como un
* multiplicador de fracciones).
* */

import java.util.Scanner;

public class Fracciones {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Calculadora de Multiplicación Fracciones---");
        System.out.println("Ingrese el primer numerador: ");
        a = leer.nextInt();
        System.out.println("Ingrese el primer denominador: ");
        b = leer.nextInt();
        System.out.println("Ingrese el segundo numerador: ");
        c = leer.nextInt();
        System.out.println("Ingrese el segundo denominador: ");
        d = leer.nextInt();

        System.out.println("Resultado en decimal: " + (a*c)/(b*d));
        System.out.println("Resultado en fracción " + a*c + "/" + b*d);

    }
}
