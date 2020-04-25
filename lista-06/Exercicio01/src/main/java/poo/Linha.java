package poo;

public class Linha {
    protected int comprimento;

    public Linha(int comprimento) {
        this.comprimento = comprimento;
    }

    public void desenhar() {
        System.out.println("Linha com Comprimento " + this.comprimento + " desenhado.");
    }
}
