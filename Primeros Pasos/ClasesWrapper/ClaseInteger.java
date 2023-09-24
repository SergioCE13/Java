package ClasesWrapper;

public class ClaseInteger {
    public static void main(String[] args) {

        //Constantes de la clase Integer.
        //Para imprimir en consola el valor mínimo admitido para un objeto de la clase Integer utilizamos:
        System.out.println("El mínimo pra la clase Integer es: " + Integer.MIN_VALUE);

        //Para imprimir en consola el valor máximo admitido para un objeto de la clase Integer utilizamos:
        System.out.println("El máximo para la clase Integer es: " + Integer.MAX_VALUE);

        //*************************************
        //MÉTODOS ESTÁTICOS DE LA CLASE INTEGER
        //*************************************

        //*Para convertir un entero a string utilizamos:
        //Opcion 1 indicar el sistem númerico o base de la cantidad que se está trabajando.
        int numero = 123456;
        String numeroCadena;
        numeroCadena =  Integer.toString(numero, 10); 
        //? Donde número es el valor que se quiere convertir en cadena y 10 es la base del sistema número con el que se está trabajando, en este caso sistema decimal.
        System.out.println("El número convertido a cadena es: " + numeroCadena);

        //Opción 2 tomar por defecto el sistema decimal para convertir el número a String.
        int numero2 = 123456;
        String numeroCadena2;
        numeroCadena2 = Integer.toString(numero2);
        System.out.println("El número convertido a cadena es: " + numeroCadena2);


        //* */ Para convertir una cadena a entro primitivo: 
        //Opción 1 indicar el sistema numérico o la base del entero.
        int cadint1;
        cadint1 = Integer.parseInt(numeroCadena,10);
        System.out.println(cadint1);

        //Opción 2 tomar por defecto el sistema decimal para convertir el string a entero.
        int cadint2;
        cadint2 = Integer.parseInt(numeroCadena2);
        System.out.println(cadint2);
        //? NOTA: Se debe tomar en cuenta que el método anterior convierte una cadena a un tipo primitivo int, no a un objeto de la clase Integer.

        //* Para convertir una cadena a un objeto de la clase Integer:
        // Opción 1 indicar el sistema numérico o la base del entero: 
        Integer objint1 = Integer.valueOf(numeroCadena, 10); //valueOf regresa la instancia de la clase Integer por lo que se puede decir que sustituye a la palabra new.
        System.out.println(objint1);

        // Opción 2 tomar por defecto el sistema numérico decimal.
        Integer objint2 = Integer.valueOf(numeroCadena2);
        System.out.println(objint2);
        //?NOTA: Los sistemas en los que se puede manejar tanto el tipo primitivo int como una instancia de la clase Integer son: binario, Octal, Decimal, Hexadecimal.
        

        //****************************************
        //MÉTODOS DE INSTANCIA DE LA CLASE INTEGER
        //****************************************

        /*
         * intValue() -> Toma una instancia de la clase Integer y regresa el valor de esta como un entero primitivo.
         * longValue() -> Toma una instancia de la clase Integer y regresa el valor de esta como un long primitivo.
         * floatValue() -> Toma una instancia de la clase Integer y regresa el valor de esta como un float primitivo.
         * doubleValue() -> Toma una instancia de la clase Integer y regresa el valor de esta como un double primitivo.
         * toString() -> Toma una instancia de la clase Integer y regresa el valor de esta como un Objeto de tipo String.
         * hashCode() -> Regresa la dirección de memoria en la que está almacenada la instancia de tipo Integer.
         * equals(Object obj) -> Compara dos instancias de la clase Integer y devuelve TRUE si sus valores son iguales, FALSE en caso contrario.
         * byteValue() -> Toma una instancia de la clase Integer y regresa el valor de esta como un byte primitivo (se debe tener cuidado ya que int trabaja hasta con 32bits y byte hasta 8bits).
         * shortValue() -> Toma una instancia de la clase Integer y regresa el valor de esta como un short primitivo (se debe tener cuidado ya que short trabaja hasta con 16bits).
         */




    }
}
