/*
* Planteamiento del ejercicio: Escribir un programa que reciba una
* cantidad en grados centígrados e indique a cuánto equivalen en grados Fahrenheit.
* */

import java.util.Scanner;

public class Covertidor {
    public static void main(String[] args) {
        double celcius,fahrenheit;
        Scanner leer = new Scanner(System.in);
        System.out.println("--- Convertidor de grados centigrados a Fahrenheit---");
        System.out.println(" Ingrese los grados centigrados:");
        celcius = leer.nextDouble();
        fahrenheit = (celcius*1.8)+32;
        System.out.println("Grados celcius ingresados: " + celcius + "\nGrados Fahrenheit calculados: " + fahrenheit);
        }
    }

