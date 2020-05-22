package poo;

public class Principal {
    public static void main(String[] args) {
        Ponto ponto = new Ponto(2, 7,0);
        ponto.desenhar();

        Circulo circulo = new Circulo(ponto, 10.0);

    }
}
