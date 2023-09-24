package ClasesWrapper;

public class ClaseDouble {
    public static void main(String[] args) {
        
        //****************************
        //Constantes de la clase Double.
        //****************************

        //Para imprimir en consola el valor mínimo admitido para un objeto de la clase Double utilizamos:
        System.out.println("El mínimo pra la clase Double es: " + Double.MIN_VALUE);

        //Para imprimir en consola el valor máximo admitido para un objeto de la clase Double utilizamos:
        System.out.println("El máximo para la clase Double es: " + Double.MAX_VALUE);

        //Cuando un número es un número positivo muy grande para representarse como un double existe la constante POSITIVE_INFINITY.
        System.out.println("El valor del número es muy grande: " + Double.POSITIVE_INFINITY);

        //Cuando un número es un número negativo muy pequeño para representarse como un double existe la constante NEGATIVE_INFINITY.
        System.out.println("El valor del número es muy pequeño: " + Double.NEGATIVE_INFINITY);


        //*************************************
        //MÉTODOS ESTÁTICOS DE LA CLASE Double
        //*************************************

        //*Para convertir un Double a string utilizamos:
        double numero = 123.456;
        String numeroCadena;
        numeroCadena =  Double.toString(numero); 
        System.out.println("El número convertido a cadena es: " + numeroCadena);


        //* */ Para convertir una cadena a entro primitivo: 
        Double caddouble1;
        caddouble1 = Double.parseDouble(numeroCadena);
        System.out.println(caddouble1);


        //* Para convertir una cadena a un objeto de la clase Double:
        Double objdouble1 = Double.valueOf(numeroCadena); //valueOf regresa la instancia de la clase Double por lo que se puede decir que sustituye a la palabra new.
        System.out.println(objdouble1);

        //* Para convertir un double primitivo a una instancia de la clase Double:
        Double numDouble = Double.valueOf(numero);
        System.out.println(numDouble);

        //* Para Verificar si el valor de un primitivo o instancia de Double es un número válido:
        System.out.println(Double.isNaN(numero)); //Imprimirá FALSE si el número es válido por ejemplo 314.159E-2, TRUE si el número no es válido por ejemplo 0/0 -> está indeterminado. 

        //* Para Verificar si un número es infinito ya sea positivo o negativo.
        System.out.println(Double.isInfinite(Double.POSITIVE_INFINITY)); // Imprimirá TRUE si el valor es infinito, FALSE en caso contrario.

        //* Para convertir un tipo primitivo double a un tipo primitivo long utilizamos:
        long l;
        l = Double.doubleToLongBits(numDouble);
        System.out.println(l);
        
        //* Para convertir un tipo primitivo long a un tipo primitivo double utilizamos:
        double d2;
        d2 = Double.longBitsToDouble(l);
        System.out.println(d2);


        //*


        //****************************************
        //MÉTODOS DE INSTANCIA DE LA CLASE Double
        //****************************************

        /*
         * intValue() -> Toma una instancia de la clase Double y regresa el valor de esta como un Double primitivo.
         * longValue() -> Toma una instancia de la clase Double y regresa el valor de esta como un Double primitivo.
         * floatValue() -> Toma una instancia de la clase Double y regresa el valor de esta como un float primitivo.
         * doubleValue() -> Toma una instancia de la clase Double y regresa el valor de esta como un double primitivo.
         * toString() -> Toma una instancia de la clase Double y regresa el valor de esta como un Objeto de tipo String.
         * isNaN() -> Regresa TRUE si el valor de la instancia es un número válido, FALSE en caso contrario.
         * isInfinite() -> Regresa TRUE si el valor de la instancia es Infinito positivo o negatico, FALSE en caso contrario.
         * equals(Object obj) -> Compara dos instancias de la clase Double y devuelve TRUE si sus valores son iguales, FALSE en caso contrario.
         * byteValue() -> Toma una instancia de la clase Double y regresa el valor de esta como un byte primitivo (se debe tener cuidado ya que double trabaja hasta con 32bits y byte hasta 8bits).
         * shortValue() -> Toma una instancia de la clase Double y regresa el valor de esta como un short primitivo (se debe tener cuidado ya que short trabaja hasta con 16bits).
         */


    }
}
