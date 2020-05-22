package poo;

public class Ponto {
    protected double coord_x;
    protected double coord_y;
    protected double coord_z;

    public Ponto(double coord_x, double coord_y, double coord_z) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.coord_z = coord_z;
    }

    public void desenhar() {
        System.out.println("Coordenadas  " + "[" + this.coord_x + "," + this.coord_y
               + "," + this.coord_z + "]" + " desenhado.");
    }

    public double getCoord_x() {
        return coord_x;
    }

    public double getCoord_y() {
        return coord_y;
    }

    public double getCoord_z() {
        return coord_z;
    }
}
