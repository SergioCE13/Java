package Conceptos.sentenciasyciclos;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        //Declaramos las variables necesarias para el proceso
        Random sorteo = new Random(); //Objeto para números aleatorios
        int arregloNumeros[] = new int[10]; //Declaración del arreglo de enteros con un tamaño de 10
        int numero; //Declaración de la variable donde guardaremos el numero aleatorio generado

        //Generamos el ciclo que nos permite llenar una arreglo cualquiera.
        for(int i = 0; i < 10; i++){
            int j = 0; //Se inicializa una variable auxiliar para las iteraciones 
            numero = sorteo.nextInt(10); //Generamos el número aleatorio que se guardará en la posición indicada por el for
            
            while(j<i){ //Generamos un ciclo para ir verificando linealmente que no tengamos números repetidos en el arreglo
                    if(arregloNumeros[j] == numero){ //Condicional para verificar coincidencias.
                    j = 0; //reestablecemos la variable auxiliar si existe una coincidencia
                    numero = sorteo.nextInt(10); //Generamos un nuevo número para guardarlo en el arreglo (comprobando nuevamente que no exista coincidencia).
                }else{ //En caso de no encontrar coincidencias pasamos a esta condición.
                    j++; //En caso de que no exista coincidencia entre los valores, pasamos a la siguiente posición del arreglo.
                }
            }
            arregloNumeros[i] = numero; // Una vez verificado que no exista coincidencia, guardamos el valor en el arreglo.
        }

        for(int x : arregloNumeros){ //Declaramos un for each para recorrer el arreglo con el objetivo de imprimir los elementos.
            System.out.print(x+" ");
        }
    }
    
}
