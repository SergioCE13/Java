package Objetos.DesySerializacion;

import java.io.File;
import java.io.FileOutputStream; //Permite abrir el archivo para escritura
import java.io.ObjectOutputStream; //Permite escribir la información de bits en el archivo.
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import Objetos.Clases_Auxiliares.Personas;

/* Conceptos para la serialización:
    * Archivos tipados: Guardan información binaria (información de cualquier tipo).
    * Serialización: Es un proceso que transforma un objeto en un conjunto de bits que 
      puede ser guardado en un archivo para ser leído después. 
    Estructura: Para la serialización es necesario implementar la Interfaz Serializable, 
     eso a través de la Palabra implements depués del nombre de la clase que queremos serializar.
     Esto también permite que los Objetos de la clase serializada se puedan tomar como objetos 
     de la clase Serializable.
     Los atributos de una clase Serializada deben haber sidos señalados como serilizados.
     (Todos los tipos primitivos [String, int, etc.] son serializables.).
     Los archivos serializados pueden ser de cualquier extensión, pero no lo puede abrir cualquier aplicación
     porque es información de nuestro programa específico.
     Un archivo serializado es multiplataforma, se puede abrir en MAC, LINUX, WINDOS. siempre y cuando
     la aplicación que abra el archivo contenga al a clase Serializable.
     Un archivo serializado, solo puede contener un tipo de objeto.
 */
public class SerializacionPer implements Serializable{ // *Serializable aunque se menciona como un interfaz, solo sirve para mencionar que se habla de algo serializable.

    public static void main(String[] args) {
        Personas p;
        File archivo = new File("ruta_archivo.ser");

        try{
            
            FileOutputStream fileOut = new FileOutputStream(archivo,true);
            //De igual manera que los archivos de texto se puede añadir true, para añadir información después de la ya guardada.
            ObjectOutputStream escritor = new ObjectOutputStream(fileOut);
            
            for(int i = 0; i < 10; i++){
                p = new Personas("Persona" + i , "Apellido" + i, (byte)i);
                escritor.writeObject(p);
            }
            escritor.close();
            fileOut.close();
        }catch(FileNotFoundException e){
            e.printStackTrace(System.out);
            return;
        }catch(IOException ex){
            ex.printStackTrace(System.out);
            return;
        }

    }

    

}