/*
* Planteamiento del ejercicio: Leer una serie de 10 números, moverlos una posición hacia adelante en el
* arreglo y mostrar el arreglo resultante. Ejemplo, tenemos el siguiente arreglo 1, 2, 3, 4, 5, si desplazamos los elementos una posición hacia adelante debemos obtener 5, 1, 2, 3, 4.
* */

import java.util.Scanner;

public class ArregloIzq {
    public static void main(String[] args) {
        int aux;
        int[] arreglo = new int[10];
        Scanner leer = new Scanner(System.in);

        System.out.println("---Guardar un arreglo y avanzar ulos datos una casilla ala izquierda---");

        for (int i = 0; i <= 9; i++) {
            System.out.println("Ingresa un número a guardar: ");
            arreglo[i] = leer.nextInt();
        }

        System.out.println("El arreglo original es: ");
        for (int x : arreglo) {
            System.out.print(x + ", ");
        }

        aux = arreglo[0];
        for(int i = 0; i <= 8; i++){
            arreglo[i] = arreglo[i+1];
        }
        arreglo[9] = aux;

        System.out.println("\n El arreglo modificado es: ");
        for (int x : arreglo) {
            System.out.print(x + ", ");
        }

    }
}
