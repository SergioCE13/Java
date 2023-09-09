/*
 * Planteamiento del ejercicio: Calcular el cobro que una caseta de cuota debe
 * realizar a un vehículo de acuerdo con las siguientes reglas: Motocicleta = $20,
 * 2 ejes(automóviles) = $40, 3 ejes (camionetas) = $60, 4, 5 y 6 ejes (camiones de carga) = $250,
 *  eje adicional $50. Por ejemplo si llega un trailer de 8 ejes se deben cobrar $350.
 */

/

import java.util.Scanner;

public class Caseta {
    public static void main(String[] args) {
        int ejes, diferencia;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Caseta de cobro---");
        System.out.println("Ingrese el número de ejes del vehiculo \n Nota: Para motocicleta ingrese 1 \n");
        ejes = leer.nextByte();

        if(ejes == 1){
            System.out.println("El monto es de: $20");
        } else if (ejes == 2){
            System.out.println("El monto es de: $40");
        } else if(ejes == 3){
            System.out.println("El monto es de: $60");
        } else if(ejes>= 4 && ejes<=6){
            System.out.println("El monto es de: $250");
        } else{
            diferencia = ejes-6;
            System.out.println("El monto es de: $" + (250+(diferencia*50)));
        }
    }
}
