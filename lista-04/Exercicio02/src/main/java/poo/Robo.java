package poo;

public class Robo {
    private int area;
    private int coordenadaX;
    private int coordenadaY;
    private String frente;
    private String[] plano;

    public Robo(int area, int coordenadaX, int coordenadaY, String frente) {
        this.area = area;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.frente = frente;
    }

    public void loadPlanoExploracao(String[] comando) {
        if(comando.length > 100) {
            System.out.println("Passou do limite de comandos.");
            return;
        }
        if(comando.length < 1) {
            System.out.println("Não há comandos suficientes.");
            return;
        }
        this.plano = new String[comando.length];
        System.arraycopy(comando, 0, this.plano, 0, comando.length);
    }

    public void executarExploracao() {
        for (int i = 0; i < this.plano.length; i++) {
            if(this.plano[i].equalsIgnoreCase("E")) {
                if(this.frente.equalsIgnoreCase("N")) {
                    this.frente = "O";
                }
                if(this.frente.equalsIgnoreCase("L")) {
                    this.frente = "N";
                }
                if(this.frente.equalsIgnoreCase("O")) {
                    this.frente = "S";
                }
                if(this.frente.equalsIgnoreCase("S")) {
                    this.frente = "L";
                }
            } else if (this.plano[i].equalsIgnoreCase("D")) {
                if(this.frente.equalsIgnoreCase("N")) {
                    this.frente = "L";
                }
                if(this.frente.equalsIgnoreCase("L")) {
                    this.frente = "S";
                }
                if(this.frente.equalsIgnoreCase("O")) {
                    this.frente = "N";
                }
                if(this.frente.equalsIgnoreCase("S")) {
                    this.frente = "O";
                }
            } else if(this.plano[i].equalsIgnoreCase("M")) {
                if(this.frente.equalsIgnoreCase("N")) {
                   if(this.coordenadaY != this.area || this.coordenadaY != 0) {
                       this.coordenadaY++;
                   }
                }
                if(this.frente.equalsIgnoreCase("L")) {
                    if(this.coordenadaX != this.area || this.coordenadaX != 0) {
                        this.coordenadaX++;
                    }
                }
                if(this.frente.equalsIgnoreCase("O")) {
                    if(this.coordenadaX != this.area || this.coordenadaX != 0) {
                        this.coordenadaX--;
                    }
                }
                if(this.frente.equalsIgnoreCase("S")) {
                    if(this.coordenadaY != this.area || this.coordenadaY != 0) {
                        this.coordenadaY--;
                    }
                }
            }
        }
        this.plano = null;
    }

    public int getArea() {
        return area;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public String getFrente() {
        return frente;
    }

    @Override
    public String toString() {
        return "Robo{" +
                ", coordenadaX=" + coordenadaX +
                ", coordenadaY=" + coordenadaY +
                ", frente='" + frente + '\'' +
                '}';
    }
}
