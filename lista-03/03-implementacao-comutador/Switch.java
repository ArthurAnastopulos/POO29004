public class Switch {
    private String[][] portas;
    private boolean energia;

    public Switch() {
        this.portas = new String[24][2];
        this.energia = false;
    }

    public Switch(int lin) {
        this.portas = new String[lin][2];
        this.energia = false;
    }

    public Switch(int lin, boolean energia) {
        this.portas = new String[lin][2];
        this.energia = energia;
    }

    public String[][] getPortas() {
        return portas;
    }

    public void setPortas(int lin) {
        this.portas = new String[lin][2];
    }

    public void setPortas(String[][] portas) {
        this.portas = portas;
    }

    public boolean isEnergia() {
        return energia;
    }

    public void setEnergia(boolean energia) {
        this.energia = energia;
    }

    public void conectar(String porta, String endereco) {
        int aux = Integer.parseInt(porta);
        this.portas[aux][2] = endereco;
    }

    public void desconectar(String porta, String endereco) {
        int aux = Integer.parseInt(porta);
        this.portas[aux][2] = "";
    }

    public void desconectar() {
        for(int i = 0; i < this.portas.length;i++) {
            this.portas[i][2] = "";
        }
    }
}