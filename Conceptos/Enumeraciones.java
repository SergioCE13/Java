package Conceptos.enumyregis;


public class Enumeraciones {

    // ? En java una enumeración es un conjunto de constantes con un nombre. Las enumeraciones se mandan llamar por el nombre de la enumeración y el valor de esta.: diaSemana.DOMINGO;
    public static enum diasSemana{DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO}

    public static void main(String[] args) {

        diasSemana d = diasSemana.SABADO;
        
        //Para imprimir un valor de enumeración, se pueden utilizar dos formas: 
        System.out.println(d.name()); //1ra forma, llamando al método name()
        System.out.println(d.toString()); //2da forma, llamando al método toString() para convertir el valor en una cadena.

        //Para ver la posición dentro de la enumeración del valor actual de la variable d podemos utilizar la clase ordinal. 
        System.out.println(d.ordinal());

        //Para verificar los valores que se encuentran en la enumeración podemos utilizar la funcion values().
        diasSemana[] dias = diasSemana.values();
        for(diasSemana nom : dias){
            System.out.print(nom + " ");
        }

        //Probando el pase de parametros de una enumeración:
        asigDia(d, 1);
        System.out.println("\nEl día seleccionado es: " + d.name());

        /*NOTA 1: Al correr el programa podemos observar que como resultado el dia seleccionado siempre aparece como SABADO, esto debido a que 
         * el pase de paramtro de una enumeración como se realizó en este ejercicio, trata de un parametro por copia y no por referencia, es decir
         * no se esta alterando el valor de la variable original, si no el valor de la variable que se recibe en el método y si nosotros queremos
         * utilizar el "nuevo valor" fuera de dicho metodo, su valor será siendo el mismo de antes de llamar al método.
         */
        
        
    }

    /**
     * Método que se utilizar para asignar un día de la semana dependiendo de el número que se indique.
     * @param dia Variable en la que se asignará un valor de la enumeración diasSemana.
     * @param x Variable que determinará el número del día de la semana que se asignará. 
     */
    public static void asigDia(diasSemana dia, int x){

         /*Condición para verificar que el número ingresado sea mayor a 0 y menor a la cantidad total de valores de la enumeración, primero se obtiene el arreglo de la enumerción con
         el método values() y luego obtenemos el largo del arreglo con el método length()*/ 
        if((x >= 0) && (x < diasSemana.values().length)){
            dia = diasSemana.values()[x];
            System.out.println("\nEl día seleccionado 2 es: " + dia.name()); // @see nota 1: dentro del métoo si nos es posible cambiar el valor de la variable local día.
        }else{
            dia = diasSemana.DOMINGO;
        }
    }

}
