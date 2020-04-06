package poo;

import com.grum.geocalc.Coordinate;

public class Coordenadas {
    private Coordinate lat;
    private Coordinate lng;
    private Coordinate alt;
    private final double ORIGEM = 0.0;

    public Coordenadas() {
        this.lat = Coordinate.fromDegrees(ORIGEM);
        this.lng = Coordinate.fromDegrees(ORIGEM);
        this.alt = Coordinate.fromDegrees(ORIGEM);
    }

    public boolean alterar(String move, double valor) {
        if(move.equalsIgnoreCase("x")){
            this.lat = Coordinate.fromDegrees(valor);
            return true;
        } else if(move.equalsIgnoreCase("y")) {
            this.lng = Coordinate.fromDegrees(valor);
            return true;
        } else if(move.equalsIgnoreCase("z")) {
            this.alt = Coordinate.fromDegrees(valor);
            return true;
        } else return false;
    }

    public boolean origem() {
        Coordinate aux = Coordinate.fromDegrees(ORIGEM);
        if(aux != lat || aux != alt || aux != lng) {
            this.lat = Coordinate.fromDegrees(ORIGEM);
            this.lng = Coordinate.fromDegrees(ORIGEM);
            this.alt = Coordinate.fromDegrees(ORIGEM);
            return true;
        } else return false;
    }

    public Coordinate getLat() {
        return lat;
    }

    public Coordinate getLng() {
        return lng;
    }

    public Coordinate getAlt() {
        return alt;
    }

    @Override
    public String toString() {
        return "( " + this.lat + " , " + this.lng + " , " + this.alt + " )";
    }
}
