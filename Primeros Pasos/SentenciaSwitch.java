package Conceptos.sentenciasyciclos;

import java.util.Scanner;

public class SentenciaSwitch {
    
    public static void main(String[] args) {
        //Opción 1: area y perimetro de rectangulo, Opción 2: perimetro y area de un circulo 
        System.out.println("Menú de opciones:\n\t1. Calcular Área y Perímetro de un Triangulo\n\t2. Calcular Área y Perímetro de un Círculo\n\t3. Salir");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingresa la opción que desees ejecutar: ");
        int opcion = sc.nextInt();
        double area = 0, perimetro = 0;

        switch(opcion){

            case 1: //Opción 1: area y perimetro de rectangulo
                System.out.println("Ingresa el tamaño de la base: ");
                int base = sc.nextInt();
                System.out.println("Ingresa el tamaño de la altura: ");
                int alto = sc.nextInt();
                area = base*alto;
                perimetro = 2*base+2*alto;
                System.out.println("El perímetro es de: " + perimetro);
                System.out.print("El área es de: " + area);
            break; 

            case 2:  //Opción 2: perimetro y area de un circulo
                final double pi = 3.1415;
                System.out.println("Ingresa el tamaño del radio: ");
                double radio = sc.nextDouble();
                area = pi*Math.pow(radio,2);
                perimetro = 2*pi*radio;
                System.out.println("El area es de: " + area);
                System.out.println("El perímetro es de: " + perimetro);
            break;

            case 3:  //Opción 3: salir
                System.out.println("Saliendo del programa...");
            break; 

            default: 
                System.out.println("Opción invalida, Terminando el programa...");
            break; 

            /* 
             NOTA: Para el uso de switch, podemos asignarle dos valores o más a cada caso,
             esto mediante el uso de ,entre cada valor a la hora de declarar el caso,es decir:
             * case 1 , 5 , 6: 
             * ´´ ´´ contenido del caso
             * break; 
             */
        } //Final del Swich
        sc.close();
    }
}
