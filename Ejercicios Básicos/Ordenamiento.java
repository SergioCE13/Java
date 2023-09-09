/*
* Planteamiento del ejercicio: Escribe un programa que pida tres números
* y que los muestre ordenados de mayor a menor. Nota: Este ejercicio no
* requiere ciclos ni ordenamientos especiales, puede realizarse utilizando “IF”.
* */

import java.util.Scanner;
public class Ordenamiento {
    public static void main(String[] args) {
        double a,b,c;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---Ordenamiento de 3 números de mayor a menor---");
        System.out.println("Ingrese el primer número: ");
        a = leer.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        b = leer.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        c = leer.nextDouble();

        if(a>=b && b>=c){
            System.out.println(a + " " + b + " " + c);
        }else if(b>=a && a>=c){
            System.out.println(b + " " + a + " " + c);
        }else if(b>=a && c>=a && b>=c){
            System.out.println( b + " " + c + " " + a);
        }else if(a>=b && c>=b && a>=c){
            System.out.println(a + " " + c + " " + b);
        }else if(c>=a && c>=b && a>=b){
            System.out.println(c + " " + a + " " + b);
        }else if(c>=a && b>=a){
            System.out.println(c + " " + b + " " + a);
        }
    }
}
