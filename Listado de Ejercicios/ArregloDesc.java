/*
* Planteamiento del ejerciccio: Leer en un arreglo una serie de 10 números e
* indicar si todos los elementos están ordenados de forma descendente
* */

import java.util.Scanner;
public class ArregloDesc {
    public static void main(String[] args) {
        int comparador;
        int arreglo[] = new int[10];
        Scanner leer = new Scanner(System.in);

        for(int i = 0; i<=9; i++){
            System.out.println("Ingresa un número: ");
            arreglo[i] = leer.nextInt();
        }

        for(int i = 0; i <= 9; i++){
            if(i>0){
                if(arreglo[i] > arreglo[i-1]){
                    System.out.println("El arreglo no está en orden descendente...");
                    break;
                }
            }
            if(i == 9 && arreglo[i] <= arreglo[i-1]){
                System.out.println("El arreglo está en orden descendente");
            }
        }
    }
}
