package Conceptos.enumyregis;

import java.util.Scanner;

public class Registros {
    
    //Declarando un registro/Estructura
    public static record Persona(String nombre, String apellido, byte edad){

    }
     /* NOTA 1: Nombre, apellido, y edad, son atributos privados del Objeto de la clase Persona, no son parametros como tal.
     En este caso son objetos inmutables, es decir, no se pueden modificar, son constantes debido al uso de string y byte,
     En caso de que se deseara trabajar con objetos mutables, deberíamos trabajar con StringBuilder y AtomicInteger y utilizar 
     las funciones delete, append (en el caso de StringBuilder) y set() (en el caso de AtomicInteger) para modificar los "estados". */

     public static void main(String[] args) {
        
        Persona p;
        String nombre, apellido;
        byte edad;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el nombre a registrar: ");
        nombre = leer.nextLine();
        System.out.println("Ingresa el apellido: ");
        apellido = leer.nextLine();
        System.out.println("Ingresa la edad: ");
        edad = leer.nextByte();

        p = new Persona(nombre,apellido,edad);
        System.out.println(p.nombre + " " + p.apellido + " " + p.edad);
        
        leer.close();
    }

    //? RECORD: Existen algunos puntos importantes para el manejo de registros por ejemplo: 
    //* Los registros, consisten en una estructura de datos inmutable con un conjunto de atributos, es decir
    //* Una vez que los atributos obtienen un valor inicial, este no es modifiable, ya que no se cuenta con métodos
    //* setters que permitan realizar dicho cambio, un registro  
    /* 
    Persona persona = new Persona("Juan", 30);
    persona.nombre();
    persona.edad();
    A diferencia de los getters, accederemos al record directamente con el nombre del atributo cómo nombre del método.
	
    public record Persona(String nombre, int edad) {
 
        public Persona(String nombre) {
            this(nombre, 0);
    }
 
    public Persona(int edad) {
        this("", edad);
    }
 
    public Persona(String nombre, int edad, String apellidos) {
        this(nombre + " " + apellidos, edad);
    }
}
    */
}
