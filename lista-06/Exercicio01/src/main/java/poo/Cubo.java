package poo;

public class Cubo extends Retangulo{
    private int area;
    private int volume;
    private final int EXP1 = 2;
    private final int EXP2 = 6;
    private final int EXP3 = 3;

    public Cubo(int comprimento) {
        super(comprimento);
        this.area = (int) Math.pow((Math.pow(comprimento,2)), 6);
        this.volume = (int) Math.pow(this.area, EXP3);
    }

    public int getArea() {
        return this.area;
    }

    public int getVolume() {
        return this.volume;
    }

    public void desenhar() {
        System.out.println("Cubo com Area " + this.area + " e Volume " +
                this.volume + " desenhado.");
    }
}