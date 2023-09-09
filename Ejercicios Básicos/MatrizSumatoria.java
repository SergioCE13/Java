/*
* Planteamiento del ejercicio: Escribe un programa que lea un arreglo
* bidimensional de 5x5 y muestre la suma del total del arreglo.
*/

import java.util.Scanner;
public class MatrizSumatoria {
    public static void main(String[] args) {
        int sumatoria = 0;
        int[][] matriz = new int[5][5];
        Scanner leer = new Scanner(System.in);

        System.out.println("---Matriz sumatoria---");

        for(int i = 0; i <=4; i++){
            for(int j = 0; j <=4; j++){
                System.out.println("Ingresa el numero para la casilla: (" + i + "," + j + ")");
                matriz[i][j] = leer.nextInt();
            }
        }

        for(int i = 0; i <=4; i++){
            for(int j = 0; j <=4; j++){
                sumatoria = sumatoria + matriz[i][j];
            }
        }

        System.out.println("La sumatoria de la matriz es: " + sumatoria);
    }
}
