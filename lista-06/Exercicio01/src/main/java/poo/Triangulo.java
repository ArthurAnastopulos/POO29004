package poo;

public class Triangulo extends Linha {
    private int base;
    private int altura;

    public Triangulo(int comprimento) {
        super(comprimento);
        this.base = comprimento;
        this.altura = comprimento;
    }

    public int getArea() {
        return ((this.base * this.altura) / 2);
    }

    public void desenhar() {
        System.out.println("Triangulo com Base " + this.base + " e Altura " +
                this.altura + " desenhado.");
    }
}
