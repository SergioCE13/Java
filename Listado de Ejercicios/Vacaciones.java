/*
* Planteamiento del ejercicio: Escribir un programa que indique
* cuántos días de vacaciones le corresponden a un empleado considerando
* los años que ha trabajado en la empresa. Entre 1 y 5 años corresponden
* 5 días de vacaciones, entre 6 y 10 años deben ser 10 días de vacaciones,
* de allí en adelante, es un día de vacaciones extra por cada año de trabajo
* (a partir de 10), a partir de 20 años de trabajo se añaden 2 días de vacaciones
* por cada año hasta un máximo de 45 días.
* */

import  java.util.Scanner;

public class Vacaciones {
    public static void main(String[] args) {
        int anni, diferencia;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Calculadora de días de vacaciones para empleados---");
        System.out.println("Ingrese los años laborados en la empresa: ");
        anni = leer.nextInt();

        if(anni>=1 && anni <= 5){
            System.out.println("Cuenta con 5 días de vacaciones");
        }else if (anni>=6 && anni<=10){
            System.out.println("Cuenta con 10 días de vacaciones");
        } else if (anni>10 && anni<=19){
            System.out.println("Cuenta con " + anni + " días de vacaciones");
        } else if (anni>= 20){
            diferencia = anni - 19;
            if((19+(diferencia)*2) < 45) {
                System.out.println("Cuenta con " + (19+(diferencia)*2) + " días de vacaciones");
            }else{
                System.out.println("Cuenta con 45 días de vacaciones");
            }
        }

    }
}
