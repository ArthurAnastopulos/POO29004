package poo;

public class Retangulo extends FormaGeometricas{
    private Ponto vertices_inicial;
    private Ponto vertices_final;

    public Retangulo(Ponto vertices_inicial, Ponto vertices_final) {
        this.vertices_inicial = vertices_inicial;
        this.vertices_final = vertices_final;
    }

    public void desenhar() {
        System.out.print("Retangulo -> Vertice Inicial ");
        vertices_inicial.desenhar();
        System.out.print("Retangulo -> Vertice Final ");
        vertices_final.desenhar();
    }

    public double getArea() {
        return vertices_final.getCoord_x() - vertices_inicial.getCoord_x();
    }
}
