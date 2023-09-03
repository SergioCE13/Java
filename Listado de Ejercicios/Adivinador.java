/*
* Planteamiento del ejercicio: En este programa la computadora debe
* elegir un número al azar entre 1 y 100 y solicitará al usuario que
* “adivine” el número. A cada intento del usuario la computadora debe
* indicar si el número que el usuario introdujo es mayor o menor que el
* número prefijado. El programa debe terminar cuando el usuario “adivine”
* el número o introduzca el número “0” para salir.
* */


import java.util.Scanner;

public class Adivinador {
    public static void main(String[] args) {
        int intento=200,numero;
        Scanner leer = new Scanner(System.in);
         numero = (int)(Math.random()*100+1);
        System.out.println("---Adivina el número que esto pensando...---  " + numero);
        do{
            intento = leer.nextInt();
            if(intento != 0){
                if(intento < numero){
                    System.out.println("El numero en el que pienso es mayor");
                }else if (intento > numero){
                    System.out.println("El numero en el que pienso es menor");
                }else{
                    System.out.println("¡Felicidades! adivinaste el número");
                }
            }else {
                System.out.println("Adios :) ");
            }
        }while(intento != numero && intento != 0);
    }
}
