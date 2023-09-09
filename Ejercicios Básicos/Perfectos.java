/*
* Planteamiento del ejercicio: Un número perfecto es un número natural
* que es igual a la suma de sus divisores propios, sin incluirse él mismo.
*  Por ejemplo, el número 6 es perfecto porque sus divisores son 1, 2 y 3;
* y dado que 1+2+3 = 6 entonces el 6 es un número perfecto. Escriba un programa
* que indique los números perfectos existentes entre 1 y 10,000.
* */

public class Perfectos {
    public static void main(String[] args) {
        int i, j, suma;
        System.out.println("Números perfectos entre 1 y 10000: ");
        for(i=1;i <= 10000;i++){
            suma = 0;
            for(j = 1;j < i;j++){
                if(i % j==0){
                    suma = suma + j;
                }
            }
            if(i == suma){
                System.out.println("Encontré el número perfecto: " + i);
            }
        }
    }
}