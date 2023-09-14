import java.util.Scanner;

public class PruebaPoligono {
    public static void main(String[] args) {
        int n = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantos vertices?: ");
        n = leer.nextInt();
        PoligonoIrreg pol = new PoligonoIrreg(n);

        
        for(int i = 0; i < n; i++) {
            System.out.println("Ingresa x: ");
            int x = leer.nextInt();
            System.out.println("Ingresa y:");
            int y = leer.nextInt();
            Coordenada c = new Coordenada(x,y);
            pol.anadeVertice(c);
        }
        pol.toString();

        leer.close();

    }
}
