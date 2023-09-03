/*
* Planteamiento del ejercicio: Una universidad comenzará a asignar
* a sus estudiantes a diferentes dormitorios según su sexo y edad.
* Escribe un programa que solicite el sexo (H/M) y edad e indique de
* acuerdo con la siguiente tabla en qué edificio deben ser asignados.
* Validar que el sexo y edad sean valores correctos.
Hombre, 18 años = Edificio A
Mujer, 18 años = Edificio B
Hombre, 19 a 22 años = Edificio C
Mujer, 19 a 22 años = Edificio D
Hombre, Mayor de 22 años = Edificio E1
Mujer, Mayor de 22 años = Edificio E2
* */

import java.util.Scanner;

public class Universidad {
    public static void main(String[] args) {
        byte edad;
        char sexo;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Asignador de dormitorios para estudiantes---");
        System.out.println("Ingrese el sexo del estudiante (H/M): ");
        sexo = leer.next().charAt(0);
        System.out.println("Ingrese la edad del estudiante: ");
        edad = leer.nextByte();

        switch(sexo){
            case 'H':
                    if(edad == 18 ){
                        System.out.println("Edificio A");
                    } else if (edad>= 19 && edad<=22){
                        System.out.println("Edificio C");
                    } else if (edad>22 && edad<=30) {
                        System.out.println("Edificio E1");
                    }else {
                        System.out.println("Edad no válida");
                    }
                break;

            case 'M':
                if(edad == 18 ){
                    System.out.println("Edificio B");
                } else if (edad>= 19 && edad<=22){
                    System.out.println("Edificio D");
                } else if (edad>22 && edad<=30) {
                    System.out.println("Edificio E2");
                }else {
                    System.out.println("Edad no válida");
                }
                break;

            default:
                System.out.println("El sexo ingresado no es válido");
                break;
        }
    }
}
