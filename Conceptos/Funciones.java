package Conceptos.metodosyfunciones;

import java.util.Scanner;

public class Funciones {
    
        /* Una función se compone de la siguientes partes: 
     * El tipo de acceso: public, private, protected.
     * Static: Cuando pertenece a si mismo y no al tipo que se acaba de declarar.
     * El tipo de retorno: void, int, char, float, double, etc.
     * El nombre de la función.
     * Los argumentos que recibe para poder trabajar (junto con el tipo de cada uno de ellos).
     * Apertura y cerradura de llaves.
     */

     public static double areaRectangulo(double alto, double ancho){
        return alto*ancho; 
    }

    /*NOTA IMPORTANTE
    Debajo se muestra un ejemplo de JavaDoc, lo cual es una herramienta de java con la cual
    podemos documentar nuestro codigo de una manera más específica, para crear un javaDoc es
    necesario escribir /**  seguido de un salto de linea para que nos muestre la escritura por
    default, la cual se muestra a continuación:
    */

    /**
     * Aqui se pone la descripción de la función que se quiere documentar.
     * @param alto Largo del rectángulo <-- Esto es una notación, comienzan con arroba, param señaliza un parametro de la función
     * @param ancho Ancho del rectángulo 
     * @return Regresa el valor del area del rectangulo <-- return, señala el, o los valores que retorna el método.
     */

    public static double perimetroRectangulo(double alto, double ancho){
        return 2*alto + 2*ancho;
    }

    public static void main(String[] args) {
        
        //Declaración de variables: 
        double alto, ancho, area, perimetro;
        Scanner sc = new Scanner(System.in);

        //Ingreso de datos:
        System.out.println("Ingresa el largo del rectangulo: ");
        alto = sc.nextDouble();
        System.out.println("Ingresa el ancho del rectangulo: ");
        ancho = sc.nextDouble();

        //Ceramos la lectura de teclado:
        sc.close();

        //Operaciones:
        area = areaRectangulo(alto, ancho);
        perimetro = perimetroRectangulo(alto, ancho);

        //Impresión de resultados:
        System.out.println("El area del rectangulo es: " +area);
        System.out.println("El perimetro del rectangulo es: " +perimetro);
        
    }

}
