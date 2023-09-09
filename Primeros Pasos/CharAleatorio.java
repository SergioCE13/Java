package Conceptos.sentenciasyciclos;

import java.util.Random;

public class CharAleatorio {
    
    public static void main(String[] args){
                        
        //Declaramos la variables y objetos necesarios.
        int numero;
        char letra;
        Random sorteo = new Random();

        //Creamos un bucle for para hacer generar automaticamente el numero de letras deseadas.
        for(int i = 0; i < 50; i++){
            numero = sorteo.nextInt(90-65+1)+65; //Para generar números aleatorios dentro de un rango, se utiliza la formula -> (max-min+1)+min
            letra = (char)numero; // Convertimos el número obtenido para el código ASCII a tipo caracter.
            System.out.print(letra + " "); //Imprimimos la letra resultado.
        }
    }
}
