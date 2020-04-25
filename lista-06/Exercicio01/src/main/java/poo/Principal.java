package poo;

public class Principal {
    public static void main(String[] args) {
        Ponto ponto = new Ponto(2, 7);
        ponto.desenhar();

        Circulo circulo = new Circulo(2, 7, 5);
        circulo.desenhar();

        Linha linha = new Linha(12);
        linha.desenhar();

        Retangulo retangulo = new Retangulo(12);
        retangulo.desenhar();

        Triangulo triangulo = new Triangulo(12);
        triangulo.desenhar();

        Cubo cubo = new Cubo(12);
        cubo.desenhar();
    }
}
