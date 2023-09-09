package TiposAD.Auxiliares;


import TiposAD.Estructuras.LinkedListInteger;

public class PruebasLinked {
     public static void main(String[] args) {
          LinkedListInteger lista = new LinkedListInteger(); //Creación del objeto de tipo LinkedList
          for(int i = 0; i < 10; i++){ // Ciclo for para insertar datos en la lista enlazada
               lista.insertar(i); //Ingresamos un dato en la posición de la lista.
          }
          lista.imprimir(); //Llamada el método imprimir para mostrar los datos dentro de la lista enlazada
          System.out.println("Existen " + lista.getSize() + " elementos en la lista.");
          int elemento = lista.quitUltimo();
          System.out.println("El elemento eliminado es: " + elemento);
          lista.imprimir();
          System.out.println("Existen " + lista.getSize() + " elementos en la lista.");
          elemento = lista.quitPrimero();
          System.out.println("El elemento eliminado es: " + elemento);
          lista.imprimir(); 
          elemento = lista.quitElemento(3);
          System.out.println("El elemento eliminado es: " + elemento);
          lista.imprimir();
     }
}
