/*
* Planteamiento del ejercicio: Leer un arreglo de 10
* nombres de ciudades e indicar cuál es la que tiene el nombre más largo.
* */

import java.util.Scanner;
public class Ciudades {
    public static void main(String[] args) {
        int leng = 0;
        String nom_ciudad = "";
        String[] ciudad = new String[10];
        Scanner leer = new Scanner(System.in);

        System.out.println("Arreglo con nombres de ciudades");

        for(int i = 0; i <= 9; i++){
            System.out.println("Ingresa el nombre de un ciudad: ");
            ciudad[i] = leer.nextLine();
        }

        for(int i = 0; i <= 8; i++){
            if(ciudad[i].length() >= ciudad[i+1].length()){
                nom_ciudad = ciudad[i];
                leng = ciudad[i].length();
            } else{
                nom_ciudad = ciudad[i+1];
                leng = ciudad[i+1].length();
            }
        }
        System.out.println("El nombre más largo es: " + nom_ciudad + " con: " + leng + " letras");
    }
}
