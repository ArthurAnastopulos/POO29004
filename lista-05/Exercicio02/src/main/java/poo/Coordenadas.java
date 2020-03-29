package poo;

public class Coordenadas {
    private double coordX;
    private double coordY;
    private double coordZ;
    private final double ORIGEM = 0.0;

    private final String UP = "subir";
    private final String DOWN = "descer";

    private final String FRONT = "frente";
    private final String BACK = "tras";
    private final String RIGHT = "direita";
    private final String LEFT = "esquerda";

    public Coordenadas() {
        this.coordX = ORIGEM;
        this.coordY = ORIGEM;
        this.coordZ = ORIGEM;
    }

    public boolean altitude(String move, double valor) {
        if(move.equalsIgnoreCase(UP)) {
            if(valor > ORIGEM) {
                this.coordZ = this.coordZ + valor;
                return true;
            } else return false;
        } else if (move.equalsIgnoreCase(DOWN)) {
            if (valor > ORIGEM && (this.coordZ - valor > ORIGEM)) {
                this.coordZ = this.coordZ - valor;
            } else {
                this.coordZ = ORIGEM;
            }
            return true;
        }
        return false;
    }

    public boolean mover(String move, double valor) {
        if (move.equalsIgnoreCase(FRONT)) {
            if (valor > ORIGEM) {
                this.coordX = this.coordX + valor;
                return true;
            } else return false;
        } else if (move.equalsIgnoreCase(BACK)) {
            if(valor > ORIGEM) {
                this.coordX = this.coordX - valor;
                return true;
            } else return false;
        } else if(move.equalsIgnoreCase(RIGHT)) {
            if(valor > ORIGEM) {
                this.coordY = this.coordY - valor;
                return true;
            } else return false;
        } else if(move.equalsIgnoreCase(LEFT)) {
            if (valor > ORIGEM) {
                this.coordY = this.coordY - valor;
                return true;
            }
        }
        return false;
    }

    public boolean origem() {
        if(this.coordZ != ORIGEM || this.coordX != ORIGEM || this.coordY !=ORIGEM) {
            this.coordY = ORIGEM;
            this.coordX = ORIGEM;
            this.coordZ = ORIGEM;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "( " + this.coordX + " , " + this.coordY + " , " + this.coordZ + " )";
    }
}
