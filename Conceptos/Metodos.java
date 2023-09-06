package Conceptos.metodosyfunciones;

import java.util.Scanner;

public class Metodos {
   
    /* Un metodo se compone de la siguientes partes: 
     * el tipo de acceso: public, private, protected.
     * static: Cuando pertenece a si mismo y no al tipo que se acaba de declarar.
     * El tipo de retorno void, ya que un método es aquella función que no retorna ningún valor.
     * El nombre del método.
     * Los argumentos que recibe para poder trabajar (junto con el tipo de cada uno de ellos).
     * Apertura y cerradura de llaves.
     */

     /**
      * Método que imprime un número de asteriscos determinado por el usuario.
      * @param numero //Número de asteriscos a imprimir.
      */
      public static void asteriscos(int numero){ //Ejemplo de la declaración de un método
        for(int i = 1; i<=numero; i++){
            System.out.print("* ");
        }
    }

    public static void main(String[] args) {
        
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la cantidad de asteriscos a imprimir: ");
        numero = sc.nextInt();
        asteriscos(numero);
        sc.close();
    }
}
