package Conceptos.sentenciasyciclos;
import java.util.Scanner;
import java.lang.Math;


class Introduccion{
    public static void main(String[] args) {
        //Para imprimir en consola se puede utilizar: 
        System.out.println("Esto es un renglón con salto de linea (println)");
        System.out.print("Esto es un renglón sin salto de linea (print)");
        System.out.println();

        //Lectura de datos desde teclado:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine(); //nextLine(); sirve para leer cadenas
        System.out.println("El nombre indicado es: " + nombre); //Imprimimos el valor de la variable
        
        //Lectura de datos enteros:
        System.out.println("Ingresa un número"); 
        int x = scanner.nextInt();
        System.out.println("El número es: " + x);
    
        System.out.flush();

        //Calculos en Java:
        System.out.println("Vamos a calcular el area y perímetro de un rectangulo:");
        System.out.println("Ingresa la longitud de la base del rectangulo: ");
        int base = scanner.nextInt();
        System.out.println("Ingresa la altura del rectangulo: ");
        int altura = scanner.nextInt();

            //Calculos para un rectangulo:
            int area = base * altura; 
            float perimetro = base*2+altura*2;
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perímetro del rectangulo es: " + perimetro);

        //Constantes en Java:
        final double pi = 3.1415; //La palabra final anterior al tipo de variable indica que se trata de una constante
        System.out.println("Vamos a calcular el perímetro y área de un círculo: ");
        System.out.println("Ingresa la medida del radio del círculo: ");
        double radio = scanner.nextFloat();
        double area2 = Math.pow(radio,2)*pi; 
        double perimetro2 = radio*2*pi;
        System.out.println("El area del circulo es: " + area2);
        System.out.print("El perimetro del circulo es: " + perimetro2);

        //Inferencia de tipos de variables: 
        var frase = scanner .nextLine(); //Con var podemos declarar variables inferidas, es decir sin específicar en un inicio que tipo de variable es.
        System.out.println("La frase "+ frase + " es correcta.");

        //Caracteres de Escape:
        /* 
         * \t Inserta una tabulación en el texto
         * \b Inserta un espacio e
         * \n Inserta un caracter de nueva linea 
         * \r Inserta un retorno de carro
         * \f Inserta un salto de linea 
         * \' Inserta comillas simples
         * \" Inserta comillas dobles
         * \\ Inserta una barra izquierda
         */

        /*Tipos primitivos en java:
        byte b; // Son Números enteros entre -128 y 127, Ocupa 1 byte de memoria.
        short s; //Son Números enteros entre -32768 y 32767, Ocupan 2 bytes de memoria.
        int i; //Son Números enteros entre -2147483648 y 2147483647, Ocupan 4 bytes de memoria.
        long l; //Son Números enteros entre -9223372036854775808 y  -9223372036854775807, Ocuapn 8 bytes de memoria.
        float f; //Son Números de coma flotante de hasta 6 y 7 dígitos decimales, Ocupan 4 bytes de memoria.
        double d; //Son Números de coma de hasta 15 dígitos decimales, Ocupan 8 bytes de memoria.
        boolean bo; //Son Valores de True o False, Ocupa 1 byte de memoria.
        char c; //Un caracter siemple dentro de los valores ASCII, Ocupa 2 bytes de memoria. 
        */
        scanner.close();
    }
}