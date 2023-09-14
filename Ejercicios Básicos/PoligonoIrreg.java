public class PoligonoIrreg {

    private Coordenada[] vertices;
    private int cantidadVertices; // Lleva un registro de la cantidad de vértices actuales

    public PoligonoIrreg(int n) {
        vertices = new Coordenada[n];
        cantidadVertices = 0;
    }

    public void anadeVertice(Coordenada coordenada) {
        if (cantidadVertices < vertices.length) {
            vertices[cantidadVertices] = coordenada;
            cantidadVertices++;
        }
    }

    @Override
    public String toString() {
        System.out.println("La lista de vertices es: ");
        for (int i = 0; i < vertices.length; i++) {
            System.out.println(vertices[i].toString());
        }
        return "";
    }

}