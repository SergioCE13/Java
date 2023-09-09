/*
* Planteamiento del ejercicio: Escribe un programa que solicite al usuario
* los tamaños de las dos matrices a multiplicar y luego solicite los valores,
* realice la multiplicación y muestre el resultado.
*/

import java.util.Scanner;
public class MultiMatriz {
    public static void main(String[] args) {
        int f1 = 0,c1 = 0, c2 = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Multiplicación de matrices---");
        System.out.println("De la matriz 1 ingrese el número de filas: ");
        f1 = leer.nextInt();
        System.out.println("De la matriz 1 ingrese el número de columnas: ");
        c1 = leer.nextInt();
        System.out.println("El número e columnas de la matriz 1 debe ser igual al número de filas de la matriz 2... ");
        System.out.println("De la matriz 2 ingrese el número de columnas: ");
        c2 = leer.nextInt();
        int[][] x = new int[f1][c1];
        int[][] y = new int[c1][c2];
        int[][] r = new int[f1][c2];

        for(int i = 0; i <=f1-1; i++){
            for(int j = 0; j <=c1-1; j++){
                System.out.println("Matriz 1: Ingresa el numero para la casilla: (" + i + "," + j + ")");
                x[i][j] = leer.nextInt();
            }
        }
        for(int i = 0; i <=c1-1; i++){
            for(int j = 0; j <=c2-1; j++){
                System.out.println("Matriz 2: Ingresa el numero para la casilla: (" + i + "," + j + ")");
                y[i][j] = leer.nextInt();
            }
        }

        for(int i = 0; i < f1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    r[i][j] += x[i][j] * y[k][j];
                }
            }
        }

        System.out.println("La matriz resultado es: ");
        for(int i = 0; i <= f1-1; i++){
            for(int j = 0; j <= c2-1; j++) {
            System.out.print(r[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
