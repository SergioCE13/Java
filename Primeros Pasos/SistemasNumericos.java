/**
 * SistemasNumericos
 */
public class SistemasNumericos {

    public static void main(String[] args) {

        //Conversión de un número decimal a binario, hexadecimal, octal.
        int entero = 500;
        System.out.println("El número en decimal es: " + entero);
        System.out.println("El número en binario es: " + Integer.toBinaryString(entero));
        System.out.println("El número en hexadecimal es: " + Integer.toHexString(entero));
        System.out.println("El número en octal es: " + Integer.toOctalString(entero));
        System.out.println("");

        //Conversión de un número binario a Octal, Hexadecimal, Decimal.
        int binario = 0b111110100;
        System.out.println("El número en binario es: " + binario);
        System.out.println("El número en octal es: " + Integer.parseInt(Integer.toString(binario)));
        System.out.println("El número en hexadecimal es : " + Integer.toHexString(binario));
        //System.out.println("El número en decimal es: " + Integer.);
        System.out.println("");


        //Conversión de un número binario a Octal, Hexadecimal, Decimal.
        int Octal = 0764;
        System.out.println("El número en octal es: " + Integer.toString(Octal));
        System.out.println("El número en binario es: " + Integer.toBinaryString(Octal));
        System.out.println("El número en hexadecimal es : " + Integer.toHexString(Octal));
        System.out.println("El número en decimal es: " + Integer.parseInt(Integer.toString(Octal),8));

    }
}