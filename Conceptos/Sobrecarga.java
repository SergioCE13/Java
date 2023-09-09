package Conceptos.metodosyfunciones;

import java.util.Scanner;

public class Sobrecarga{
        
    //Declarando variables globales:
    static double area, perimetro, altura, ancho;
    static Scanner sc = new Scanner(System.in);
    
    /**
     * Método para calcular el area de un rectangulo.
     * @param altura // Medida de la altura del rectangulo proporcionada por el usuario.
     * @param ancho // Medida del ancho del rectangulo proporcionada por el usuario.
     * @return //Regresa el calculo del area del rectangulo.
     */
    public static double areaRectangulo(double altura, double ancho){
        return altura*ancho;
    }

    /*NOTA: La sobre carga de métodos conciste en tener dos o más métodos con el mismo nombre
     * sin embargo, java va a distinguir entre dichos métodos dependiendo de la cantidad y tipo
     * de paramtetros que nosotros mandemos hacia el método.
    
    public static double areaRectangulo(int altura, int ancho){
        return altura*ancho;
    }
    
     */


    /**
     * Método para caluclar el perimetro de un Rectangulo.
     * @param altura //Medida de la altura del rectangulo posicionada por el usuario.
     * @param ancho //Medida del ancho del rectangulo posicionada por el usuario.
     * @return //Retorna el caluclo del perimetro del rectangulo.
     */
    public static double perimetroRectangulo(double altura, double ancho){
        return 2*altura + 2*ancho;
    }

    public static void main(String[] args) {
        
        //Ingreso de datos:
        System.out.println("Ingresa la altura del rectangulo: ");
        altura = sc.nextDouble();
        System.out.println("Ingresa el ancho del rectangulo: ");
        ancho = sc.nextDouble();

        //Cerrando lectura de teclado:
        sc.close();

        //Operaciones:
        area = areaRectangulo(altura, ancho);
        perimetro = perimetroRectangulo(altura, ancho);


        //Impresión de resultados:
        System.out.println("El area del rectangulo es: " +area);
        System.out.println("El perimetro del rectangulo es: " +perimetro);
    }
    
}
