package poo;

public class Cubo extends FormaGeometricas{
    private Ponto vertice_inicial;
    private Ponto vertice_final;

    public Cubo(Ponto vertice_inicial, Ponto vertice_final) {
        this.vertice_inicial = vertice_inicial;
        this.vertice_final = vertice_final;
    }

    public void desenhar() {
        System.out.print("Cubo -> Vertice Inicial ");
        vertice_inicial.desenhar();
        System.out.print("Cubo -> Vertice Final ");
        vertice_final.desenhar();
    }

    public double getArea() {
        return 11.00;
    }

}