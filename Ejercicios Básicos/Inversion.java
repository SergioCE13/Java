/*
* Planteamiento del ejercicio: Calcular cuanto dinero tendría en una cuenta de ahorro
* al final de 20 años si al inicio de cada año añado $10,000, el rendimiento anual es 5%
* y reinvierto las ganancias obtenidas cada año.
* */

import java.text.DecimalFormat;

public class Inversion {
    public static void main(String[] args) {
        double rendimiento, saldo=10000;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("---Calculo de una inversión a 20 años con 5% de rendimiento---");
        for(int i = 1; i<=20; i++){
            saldo = saldo + (saldo * 0.05);
        }
        System.out.println("Saldo después de 20 años: " + df.format(saldo));
    }
}
