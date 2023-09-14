public class PruebaRectangulo {

    public static void main (String[] args) {

        

        Rectangulo rect1 = new Rectangulo(2,3,5,1);
        Rectangulo rect2 = new Rectangulo(new Coordenada(2,3), new Coordenada(1,5));

        double ancho, alto;

        

        System.out.println("Calculando el área de un rectángulo dadas sus coordenadas en un plano cartesiano:");

        System.out.println(rect1);

        /*
         alto = rect1.superiorIzquierda().ordenada() - rect1.inferiorDerecha().ordenada();
        ancho = rect1.inferiorDerecha().abcisa() - rect1.superiorIzquierda().abcisa();
        */

        alto = rect2.superiorIzquierda().ordenada() - rect2.inferiorDerecha().ordenada();
        ancho = rect2.inferiorDerecha().abcisa() - rect2.inferiorDerecha().abcisa();

        System.out.println("El área del rectángulo es = " + ancho*alto);

    }

}