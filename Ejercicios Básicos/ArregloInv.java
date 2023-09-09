/*
* Planteamiento del ejercicio: Leer 10 números enteros, guardarlos en orden
* inverso al que fueron introducidos y mostrarlos en pantalla.
* */

import java.util.Scanner;

public class ArregloInv {
    public static void main(String[] args) {
        int arreglo[] = new int[10];
        Scanner leer = new Scanner(System.in);

        System.out.println("---Guardar inversamente un arreglo---");
        for(int i = 0; i <= 9; i++){
            System.out.println("Ingresa un número: ");
            arreglo[9-i] = leer.nextInt();
        }

        for(int i = 0; i <= 9; i++){
            System.out.print( arreglo[i] + ", ");
        }
    }
}
