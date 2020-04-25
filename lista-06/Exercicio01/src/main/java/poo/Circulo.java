package poo;

public class Circulo extends Ponto {
    private int raio;
    private final int EXP = 2;

    public Circulo(int coord_x, int coord_y, int raio) {
        super(coord_x, coord_y);
        this.raio = raio;
    }

    public int getArea() {
        return (int) ((Math.PI) * (Math.pow(raio, EXP)));
    }


    public void desenhar() {
        System.out.println("Circulo com origem em " + "[" + this.coord_x + "," + this.coord_y
                + "]" + " e Raio " + this.raio + " desenhado.");
    }
}
