/*
* Planteamiento del ejercicio: Lee la definición de números capicúa y escribe un programa que reciba un número entre 0 y 9999 e indique si es un número capicúa.
* Nota, no es necesario utilizar ciclos, es posible realizarlo utilizando divisiones enteras.
* */

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Verificador de números capícua---");
        System.out.println("Ingresa el número a verficar");
        numero = leer.nextInt();

        if(numero/10<=0){
            System.out.println("El número es capícua");
        }else if(numero/100 <=0 || numero/1000 <=0){
            if(numero/100 == numero%10){
                System.out.println("El número es capícua");
            }else{
                System.out.println("El número no es capicua");
            }
        }else if(numero/10000<=0){
            if(numero/1000 == numero%10){
                if((numero/100)%10 == (numero%100)/10){
                    System.out.println("El numero es capícua");
                }else{
                    System.out.println("El número no es capicua");
                }
            }else{
                System.out.println("El número no es capicua");
            }
        }
    }
}
