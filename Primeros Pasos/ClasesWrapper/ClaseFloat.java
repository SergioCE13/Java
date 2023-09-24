package ClasesWrapper;

public class ClaseFloat {
    public static void main(String[] args) {
                
        //****************************
        //Constantes de la clase Float.
        //****************************

        //Para imprimir en consola el valor mínimo admitido para un objeto de la clase Float utilizamos:
        System.out.println("El mínimo pra la clase Float es: " + Float.MIN_VALUE);

        //Para imprimir en consola el valor máximo admitido para un objeto de la clase Float utilizamos:
        System.out.println("El máximo para la clase Float es: " + Float.MAX_VALUE);

        //Cuando un número es un número positivo muy grande para representarse como un Float existe la constante POSITIVE_INFINITY.
        System.out.println("El valor del número es muy grande: " + Float.POSITIVE_INFINITY);

        //Cuando un número es un número negativo muy pequeño para representarse como un Float existe la constante NEGATIVE_INFINITY.
        System.out.println("El valor del número es muy pequeño: " + Float.NEGATIVE_INFINITY);


        //*************************************
        //MÉTODOS ESTÁTICOS DE LA CLASE Float
        //*************************************

        //*Para convertir un Float a string utilizamos:
        Float numero = 123.456f;
        String numeroCadena;
        numeroCadena =  Float.toString(numero); 
        System.out.println("El número convertido a cadena es: " + numeroCadena);


        //* */ Para convertir una cadena a entro primitivo: 
        Float cadFloat1;
        cadFloat1 = Float.parseFloat(numeroCadena);
        System.out.println(cadFloat1);


        //* Para convertir una cadena a un objeto de la clase Float:
        Float objFloat1 = Float.valueOf(numeroCadena); //valueOf regresa la instancia de la clase Float por lo que se puede decir que sustituye a la palabra new.
        System.out.println(objFloat1);

        //* Para convertir un Float primitivo a una instancia de la clase Float:
        Float numFloat = Float.valueOf(numero);
        System.out.println(numFloat);

        //* Para Verificar si el valor de un primitivo o instancia de Float es un número válido:
        System.out.println(Float.isNaN(numero)); //Imprimirá FALSE si el número es válido por ejemplo 314.159E-2, TRUE si el número no es válido por ejemplo 0/0 -> está indeterminado. 

        //* Para Verificar si un número es infinito ya sea positivo o negativo.
        System.out.println(Float.isInfinite(Float.POSITIVE_INFINITY)); // Imprimirá TRUE si el valor es infinito, FALSE en caso contrario.

        //* Para convertir un primitivo de float a su representación binaria como entero sin signo de 32 bits utlizamos:
        int repbin;
        repbin = Float.floatToIntBits(numero);
        System.out.println(repbin);

        //* Para convertir un entero sin signo de 32 bits a un float primitivo utilizamos:
        float fprim;
        fprim = Float.intBitsToFloat(repbin);
        System.out.println(fprim);

        //* Para comparar dos float primitivos para determinar su orden relativo, utilizamos:
        float f1 = 52.3f, f2 = 45.3f;
        System.out.println(Float.compare(f1, f2));


        //****************************************
        //MÉTODOS DE INSTANCIA DE LA CLASE Float
        //****************************************

        /*
         * intValue() -> Toma una instancia de la clase Float y regresa el valor de esta como un Float primitivo.
         * longValue() -> Toma una instancia de la clase Float y regresa el valor de esta como un Float primitivo.
         * floatValue() -> Toma una instancia de la clase Float y regresa el valor de esta como un float primitivo.
         * FloatValue() -> Toma una instancia de la clase Float y regresa el valor de esta como un Float primitivo.
         * toString() -> Toma una instancia de la clase Float y regresa el valor de esta como un Objeto de tipo String.
         * isNaN() -> Regresa TRUE si el valor de la instancia es un número válido, FALSE en caso contrario.
         * isInfinite() -> Regresa TRUE si el valor de la instancia es Infinito positivo o negatico, FALSE en caso contrario.
         * equals(Object obj) -> Compara si lo valores de dos instancias de la clase float son iguales. 
         * hashCode() -> Toma una instancia de la clase Float y regresa la dirección de memoria donde está almacenada la instancia.
         * byteValue() -> Toma una instancia de la clase Float y regresa el valor de esta como un byte primitivo (se debe tener cuidado ya que Float trabaja hasta con 32bits y byte hasta 8bits).
         * shortValue() -> Toma una instancia de la clase Float y regresa el valor de esta como un short primitivo (se debe tener cuidado ya que short trabaja hasta con 16bits).
         */

    }
}
