package poo;

public class Triangulo extends FormaGeometricas{
    private Ponto vertice01;
    private Ponto vertice02;
    private Ponto vertice03;

    public Triangulo(Ponto vertice01, Ponto vertice02, Ponto vertice03) {
        this.vertice01 = vertice01;
        this.vertice02 = vertice02;
        this.vertice03 = vertice03;
    }

    public void desenhar() {
        System.out.print("Triangulo -> Vertice01 ");
        this.vertice01.desenhar();
        System.out.print("Triangulo -> Vertice02 ");
        this.vertice02.desenhar();
        System.out.print("Triangulo -> Vertice03 ");
        this.vertice03.desenhar();
    }

    public double getArea() {
        return ( vertice01.getCoord_x() + vertice02.getCoord_x() ) * vertice03.getCoord_y();
    }

}
