import java.text.DecimalFormat;

public class Ejercicio2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.0000000000");
        System.out.println(df.format(Math.PI));
    }
}
