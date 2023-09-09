/*
* Planteamiento del ejercicio: Escribe un programa que lea un número
* X y un número Y. Mostrar los números de Y en Y, comenzando en X hasta
* llegar a 200. Ejmplo: X = 8, Y = 2, el resultado comenzaría de la siguiente
* manera: 8, 10, 12, 14, 16, 18 …
* */

import java.util.Scanner;
public class Multiplos200 {
    public static void main(String[] args) {
        int x,y,num = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Múltiplos hasta el 200---");
        System.out.println("Ingresa el primer número: ");
        x = leer.nextInt();
        System.out.println("Ingresa el segundo número: ");
        y = leer.nextInt();
        num = x;

        do{
        System.out.print(num + ", ");
        num = num + y;
        }while(num<=200);
    }
}

