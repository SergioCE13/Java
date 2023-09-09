/*
* Planteamiento del ejercicio: La Comisión Federal de Electricidad cobra el
* consumo de electricidad de acuerdo con un tabulador basado en los kilowatts
* consumidos en el periodo. La tabla es la siguiente:
Costo del kW para Hogares:
De 0 a 250 kW el costo por kW es de $0.65
De 251 a 500 kW el costo por kW es de $0.85
De 501 a 1200 kW el costo por kW es de $1.50
De 1201 a 2100 kW el costo por kW es de $2.50
De 2101 kW hacia arriba el costo por kW es de $3.00
Costo del kW para Negocios:
$5.00, el costo es fijo por kilowatt sin importar la cantidad consumida.
* */

import java.util.Scanner;
public class CFE {

    public static void main(String[] args) {
        byte tipoServicio;
        double kW, monto;
        final double costo1 = 0.65, costo2 = 0.85, costo3 = 1.5, costo4 = 2.5, costo5 = 3, costonegocio = 5;
        Scanner leer = new Scanner(System.in);

        System.out.println("---Sistema de cobro de la CFE---");
        System.out.println("Ingrese el tipo de Servicio 1-Casa 2-Negocio: ");
        tipoServicio = leer.nextByte();
        System.out.println("Ingrese la cantidad de kW consumidos: ");
        kW = leer.nextDouble();

        if(tipoServicio ==1){
            if (kW >= 0 && kW <= 250) {
                monto = kW * costo1;
                System.out.println("El monto a pagar es de: " + monto);
            } else if(kW>=251 && kW<=500){
                monto = (250 * costo1) + (kW-250) * costo2;
                System.out.println("El monto a pagar es de: " + monto);
            }else if(kW>=501 && kW<=1200){
                monto = (250 * costo1) + (250 * costo2) + (kW-500) * costo3;
                System.out.println("El monto a pagar es de: " + monto);
            }else if(kW>=1201 && kW<=2100){
                monto = (250 * costo1) + (250 * costo2) + (700 * costo3) + (kW-1200) * costo4;
                System.out.println("El monto a pagar es de: " + monto);
            }else if(kW>=2101){
                monto = (250 * costo1) + (250 * costo2) + (700 * costo3) + (900 * costo4) + (kW-2100) * costo5;
                System.out.println("El monto a pagar es de: " + monto);
            }
        }
        if(tipoServicio == 2){
            monto = kW*5;
            System.out.println("El monto a pagar es de: " + monto);
        }else{
            System.out.println("Tipo de servicio inváldo");
        }
    }
}
