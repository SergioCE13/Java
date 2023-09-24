package ClasesWrapper;

public class ClaseCharacter {
    public static void main(String[] args) {
        
        //****************************************
        // MÉTODOS ESTÁTICOS DE LA CLASE CHARACTER
        //****************************************

        //* Convertir un char (caracter primitivo) a un Character (instancia de la clase Character).
        char c1 = 'S';
        Character c2 = Character.valueOf(c1);
        System.out.println(c2);

        //* Convertir el valor de un char primitivo a Mayúsculas:
        System.out.println(Character.toUpperCase(c1));

        //* Convertir el valor de un char primitivo a Minúsculas:
        System.out.println(Character.toLowerCase(c1));

        //* Verificar si un char primitivo es minúscula:
        System.out.println(Character.isLowerCase(c1)); //Imprimirá TRUE si es minúscula, FALSE en caso contrario.

        //* Verificar si un char primitivo es mayúscula:
        System.out.println(Character.isUpperCase(c1)); // Imprime TRUE si es mayúscula, FALSE en caso contrario.

        //* Verificar si un char primitivo es un digito numérico:
        System.out.println(Character.isDigit(c1)); //Imprimirá TRUE si es digito, FALSE en caso contrario.

        //* Verifica si el char primitivo es un espacio en blanco:
        System.out.println(Character.isSpaceChar(c1)); //Imprimirá TRUE si el espacio, FALSE en caso contrario..

        //* Verificar si el char primitivo es una letra:
        System.out.println(Character.isLetter(c1));

        //********************************************
        //MÉTODOS DE INSTANCIA DE LA CLASE Character
        //********************************************

         /*
          * toString() -> Toma una instancia de la clase Charater y la convierte a una String.
          * charValue() -> Toma una instancia de la clase Charater y devuelve el valor de esta.
          * equals(Object obj) -> Compara 2 instancias de la clase Charater y compara si sus valores son iguales.
          */
    }
}
