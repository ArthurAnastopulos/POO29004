package poo;

public class Principal {
    public static void main(String[] args) {
        Ponto ponto = new Ponto(2, 7,0);
        ponto.desenhar();

        Circulo circulo = new Circulo(ponto, 10.0);
        circulo.desenhar();
        System.out.println(circulo.getArea());

        Ponto ponto2 = new Ponto(4, 14,0);
        Retangulo retangulo = new Retangulo(ponto,ponto2);
        retangulo.desenhar();
        System.out.println(retangulo.getArea());

        Ponto ponto3 = new Ponto(4, 7,0);
        Triangulo triangulo = new Triangulo(ponto, ponto3 ,ponto2);
        triangulo.desenhar();
        System.out.println(triangulo.getArea());

        Linha linha = new Linha(ponto, ponto2);
        linha.desenhar();
        System.out.println(linha.getArea());

        Ponto vert = new Ponto(4, 14,  4);
        Cubo cubo = new Cubo(ponto, vert);
        cubo.desenhar();
        System.out.println(cubo.getArea());

    }
}
