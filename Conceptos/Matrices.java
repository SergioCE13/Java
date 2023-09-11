package Conceptos.sentenciasyciclos;

import java.util.Random;

public class Matrices {
    
    public static void main(String[] args) {
        char sopa[][] = new char[5][3];
        Random rand = new Random();

        //Para rellenar la matriz utilizamos 2 ciclso for:
        for(int i = 0; i < 5; i++){ // for 1. Para las filas
            for(int j = 0; j < 3; j++){ //for 2. Para las columnas
                sopa[i][j] = (char)(rand.nextInt(26)+65);
            }
        }

        //Para rellenar la matriz utilizamos 2 ciclso for:
        for(int i = 0; i < 5; i++){ // for 1. Para las filas
            for(int j = 0; j < 3; j++){ //for 2. Para las columnas
                System.out.print(sopa[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
