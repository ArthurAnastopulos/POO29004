package poo;

public class Retangulo extends Linha {
    private final int EXP = 2;

    public Retangulo(int comprimento) {
        super(comprimento);
    }

    public int getArea() {
        return (int) (Math.pow(this.comprimento, 2));
    }

    public void desenhar() {
        System.out.println("Retangulo com comprimento " + this.comprimento + " desenhado.");
    }
}
