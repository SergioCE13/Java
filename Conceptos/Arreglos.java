package Conceptos.sentenciasyciclos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        
        //Declaración de un arreglo: 
        int arreglo[] = new int[12]; //Inicializamo un arreglo con 12 posiciones, es decir 0-11.
        int arreglo2[] = new int[12];

        for(int i = 0; i < 12; i++){ //Creamos un ciclo para llenar los valores del arreglo.
            arreglo[i] = i+1; //Asignamos los valores a la posición del arreglo señalada.
            System.out.println("Indice: " + i + " valor: " + arreglo[i]);
        }

        //Para comparar arreglos no podemos utilizar arreglo1 == arreglo2, por lo tanto utilizamos: 
        System.out.println(Arrays.equals(arreglo, arreglo2));

        //Para obtener la longiud de un arreglo podemos hacer: 
        System.out.println(arreglo.length);
        
        
        
        //Busqueda lineal en un arreglo
        int numeros[] = new int[10];
        int posiciones[] = new int[10];
        int tope = -1;
        Random rand = new Random();
        Scanner leer = new Scanner(System.in);

        
        for(int i = 0; i < 10; i++){//Llenando las posiciones del arreglo
            numeros[i] = rand.nextInt(10)+1;
        }
        System.out.println("Ingresa el número 1-10 que quieres buscar: ");
        int numero = leer.nextInt();

        for(int i = 0; i < 10; i++){
            if(numeros[i] == numero){
                tope++;
                posiciones[tope] = i;
            }
        }

        System.out.println("El arreglo es: ");
        for(int i:numeros){ //Implementación de un for each 
            System.out.print(" " + i);
        }
        System.out.println("");
        
        System.out.print("Las posiciones en las que aparece el número "+ numero +" son:");
        for(int i = 0; i <= tope; i++){
            System.out.print(posiciones[i] + " ");
        
        }

        

        //Arreglos de caracteres
        char[] simbolos = {'a', 'b', 'c', 'c'};
        
        for(char i: simbolos){
            System.out.print(i + " ");
        }
        leer.close();
        
        /*
         * NOTA: Algunas funciones que pueden ser utiles a la hora de manejar caracteres son: 
         * -toCharArray(); Convierte un Strin en un arreglo de caracteres
         * -charAt(int); Obtiene el caracter que se encuentra la posición indiciada (argumento), dentro de un string
         * -.length(); Obtiene la longitud de un arreglo de caracteres, string, etc.
         */
        
    }
}
