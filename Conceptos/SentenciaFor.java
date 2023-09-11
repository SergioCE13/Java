package org.example;

import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {
        int numero,sumatoria=0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un número para calcular la sumatoria desde 0 hasta dicho numero");
        numero = leer.nextInt();

        /*
        * Sentencia Repetitiva for: La sentencia for consiste en realizar n número de iteraciones en
        * un fragmento de código, dicho número de iteraciones estará compuesto por una condición.
        * La estructura de un for es la siguiente:
        * */
        for(int i = 1; i <= numero; i++){
            sumatoria = sumatoria + i;
            System.out.print(i + " + ");
        }

        System.out.println(" = " + sumatoria);
    /*
    * Donde int i = 1  Se declara una variable para controlar el número de iteraciones que se van ejecutando.
    * i <= numero Es la condición que de limita el número de iteraciones, en este caso se ejecutará siempre y cuando
    * el valor de i sea menor o igual a el valor de la variable "número".
    * i++ incrementa el valor de i una vez que el proceso se ha realizado para pasar a la siguiente iteración.
    * */

    }
}
