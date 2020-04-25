package poo;

public class Ponto {
    protected int coord_x;
    protected int coord_y;

    public Ponto(int coord_x, int coord_y) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }

    public void desenhar() {
        System.out.println("Ponto com Coordenadas " + "[" + this.coord_x + "," + this.coord_y
                + "]" + " desenhado.");
    }

}
