package poo;

public class Linha extends FormaGeometricas{
   private Ponto ponto_inicial;
   private Ponto ponto_final;

    public Linha(Ponto ponto_inicial, Ponto ponto_final) {
        this.ponto_inicial = ponto_inicial;
        this.ponto_final = ponto_final;
    }

    public void desenhar() {
        System.out.print("Linha -> Ponto Inicial ");
        ponto_inicial.desenhar();
        System.out.print("Linha -> Ponto Final ");
        ponto_final.desenhar();
    }

    public double getArea() {
        return ponto_final.getCoord_x() - ponto_inicial.getCoord_x();
    }
}
