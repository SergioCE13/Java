package Objetos.DesySerializacion;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;//Permite abrir el archivo para lectura
import java.io.ObjectInputStream; //Permite leer las lineas del archivo.
import java.io.FileNotFoundException; 
import java.io.IOException;
import Objetos.Clases_Auxiliares.Personas;

public class DesSerializacionPer {
    public static void main(String[] args) {

        Personas p;
        File archivo = new File("ruta_archivo.ser");
        
        try{

            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream lector = new ObjectInputStream(fileIn);

            //El método avaible() retorna una aproximación del número de bytes que faltan por leer. (si es muy pequeño puede retornar 0 directamente) por ello usamos while true
            try{ //readObject() regresa una excepción de tipo EODException cuando ya no queda más objetos para leer.
                while(true){ 
                    p = (Personas)lector.readObject(); 
                    //readObject retorna un elemento de tipo Object (clase base de java), es por eso que se hace el Casting con (Empleado) para convertir el objeto a tipo Empleado.
                    System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getEdad());
                }
            }catch(EOFException e){
                System.out.println("Se acabaron los Objetos del archivo");
            }
            lector.close();
        }catch(FileNotFoundException e){
            e.printStackTrace(System.out);
            return;
        }catch(IOException ex){
            ex.printStackTrace(System.out);
            return;
        }catch(ClassNotFoundException ec){
            ec.printStackTrace(System.out);
            return;
        }
    }
}
