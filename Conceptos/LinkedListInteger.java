package TiposAD.Estructuras;
/*
 * Lista simple encadenada, debe tener minimo: 
 * Constructor: Que permita crear una lista vacía, retornando algo de tipo lista.
 * Getters:
     * GetFirst: Obtener el primer dato del elemento de la lista (lo que contiene la lista y no el primer indice como tal).
     * GetTail: Obtener lo que se encuentra después del primer elemento de la lista. (2do elemento en adelante).
 *Logics:  
     * esVacia: Permite conocer si una lista está vacía.
     * existe: Permite saber si un elemento específico se encuentra dentro de la lista.
 * Modifiers: 
     * insertarInicio: Permite insertar un nuevo elemeto al inicio de la lista.
     * indertarFinal: Permite insertar un nuevo elemeto al final de la lista.
     * insertarDespuesde:  Permite insertar  un nuevo elemeto en una posición específica de la lista indicando el elemento que quedará como antesesor. 
 * Destroyers: 
 * quitarElemento: Permite quitar un elemento de la lista y retorna dicho elemento.
 * elimElemento: Permite eliminar el elemento de la lista y lo borra de la memoria.
 * elimLista: Permite borrar la lista de la memoria. 
 * Lista simple circular: es exactamente igual a una lista simple con la diferencia de que el "último" elemento de la lisa apunta al primer elemento
 * por lo cual, como tal la lista no tiene ni un incio, ni un fin, simplemente se genera un bucle de elementos.
 */

public class LinkedListInteger {

     /**
      * Clase interna "Nodo" de la clase externa LinkedListInteger.
      */
     private class Nodo{
          private int n;
          private Nodo siguiente;//Atributo recursivo, Un elemento del mismo tipo de la clase donde es de clarado.

          public Nodo(int n){
               this.n = n;
               this.siguiente = null;
          }

          /**
           * Método asignar un elemento de tipo int al nodo.
           * @return Retorn un entero.
           */
          public int getNumero(){
               return this.n;
          }

          /**
           *Método para obtener el elemento guardado en el Nodo.
           * @return
           */
          public Nodo getSiguiente(){
               return this.siguiente;
          }

          /**
           * Método para indicarle al nodo actual, cual nodo es al que debe apuntar.
           * @param siguiente Nodo siguiente de la lista.
           */
          public void setSiguiente(Nodo siguiente){
               this.siguiente = siguiente;
          }
     } 
     
     private Nodo cabeza;
     private Nodo ultimoNodo;
     private int size;
     
     //Constructor: 
     public LinkedListInteger(){
          this.cabeza = null;
          this.ultimoNodo = null;
          this.size = 0;
     }

     /**
      * Método para verificar si la lista se encuentra vacía.
      * @return Retorna true, si no existen elementos en la lista, false en caso contrario.
      */
     public boolean esVacia(){
          return this.cabeza == null;
     }

     /**
      * Método para insertar un nuevo Nodo en la lista.
      * @param n Retorna el elemento de tipo int guardado en el nodo.
      */
     public void insertar(int n){
          Nodo nuevoNodo = new Nodo(n);
          
          if(this.esVacia()){
               this.cabeza = nuevoNodo;
               this.ultimoNodo = nuevoNodo;
          }else{               
               this.ultimoNodo.setSiguiente(nuevoNodo);
               this.ultimoNodo = nuevoNodo;
          }
          this.size++;
     }

     /**
      * Método para imprimir todos los elementos de los Nodos existentes en la lista.
      */
     public void imprimir(){
          Nodo apuntador = this.cabeza;
          System.out.print("[");
          while(apuntador!=null){
               System.out.print(apuntador.getNumero() + " ");
               apuntador = apuntador.getSiguiente();
          }
          System.out.println("]");
     }

     /**
      * Método para obtener el tamaño de la lista.
      * @return Retorna un entero.
      */
     public int getSize(){
          return this.size;
     }

     /**
      * Método para eliminar el último Nodo ingresado en  la lista.
      * @return Retorna el elemento que contenia el Nodo eliminado.
      */
     public int quitUltimo(){
          if(!esVacia()){
               int elemento = this.ultimoNodo.getNumero(); 
               Nodo apuntador = this.cabeza;
               while(this.ultimoNodo != apuntador.getSiguiente()){
                    apuntador = apuntador.getSiguiente();
               }
               this.ultimoNodo = apuntador;
               apuntador.setSiguiente(null);
               this.size--;
               return elemento;
          }else{
               System.out.println("La lista está vacía, no hay nodos para remover.");
               return 0;
          }
     }


     /**
      * Método para quitar un Nodo especifico de la lista de Nodos.
      * @param e elemento del nodo a eliminar.
      * @return Retorna el elemento del nodo eliminado.
      */
     public int quitElemento(int e){
          if(!esVacia()){
               int elemento;
               Nodo apuntador = this.cabeza;

               for(int i = 1; i < this.size; i++){

                    if(apuntador.getSiguiente().getNumero() == e){
                         elemento = apuntador.getSiguiente().getNumero();
                         apuntador.setSiguiente(apuntador.getSiguiente().getSiguiente());;
                         return elemento;
                    }

                    apuntador = apuntador.getSiguiente();
               }
               System.out.println("Busqueda terminada, elemento no encontrado...");
               return 0;
          }else{
               System.out.println("La lista está vacía, no hay nodos para remover.");
               return 0;
          }
     }

     /**
      * Método para eliminar el primer nodo en la lista.
      * @return Retorna el elemento que guardaba el nodo eliminado.
      */
     public int quitPrimero(){
          
          if(!esVacia()){
               int elemento = this.cabeza.getNumero();
               Nodo apuntador = this.cabeza;

               this.cabeza = null;
               this.cabeza = apuntador.getSiguiente();
               return elemento;
          }else{
               System.out.println("La lista está vacía, no hay nodos para remover.");
               return 0;
          }
     }
}

/*Clase interna:
 * Una clase interna es aquella que se declara dentro de otra.
 * Las clases internas, suelen guardarse en archivos independientes, pero referenciando a la clase que las contiene
 * por ejemplo: la clase nodo del presente archivo, lleva el nombre de LinkedListInteger$Nodo.java indicando que esta
 * hace referencia a la clase LinkedListInteger.
 * También debemos tomar en cuenta que todas las instancias de la clase interna, pasan a ser parte de la clase principal,
 * es decir, todos los objetos de tipo Nodo creados se podrán utilizar dentro de la clase LinkedListInteger sin necesidad de
 * realizar alguna importación ni de tratarlos como objetos independientes (es decir no tenemos que declarar como tal Nodo n1, n2, n3, etc)
 * por cada nodo que creemos. @see insertar()
 */