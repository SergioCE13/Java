package org.example;

import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {

        int numero;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un número para verifica si es par o impar: ");
        numero = leer.nextInt();

        /*
        * La sentencia if es el condicional más básico en java para verifiar el cumplimiento de condiciones
        * y con base en ello ejercutar un fragmento de código u otro, la estructura básica de un if se muestra
        * a continuación...
        * */

        if(numero%2 == 0){ // Si (condición a cumplir), entonces:
            System.out.println("El número es par");
        }else if(numero%2 != 0){ //En caso contrario Si(condición a cumplir), entonces:
            System.out.println("El número es impar");
        } else { // En caso de que ninguna de las condiciones se cumpla entonces:
            System.out.println("No ingresaste un número");
        }

        /* Las condiciones a estructurar para la sentencia if se basan en dos tipos de operadores:

            * Operadores de comparación:
                * Mayor que: ">"
                * Menor que: "<"
                * Igual a: "=="
                * Mayor o igual: ">="
                * Menor o igual: "<="
                * Diferente de: "!="

            * Operadores lógicos:
                * AND: "&&" Ejemplo: if(x<=2 && x>=0) Si x es menor o igual a 2 y x es mayor o igual a 0...
                * OR: "||" Ejemplo: if(x<=2 || y<=100) Si x es menor o igual a 2 y "y" es menor o igual a 100...
        * */
    }
}