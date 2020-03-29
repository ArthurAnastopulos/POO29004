package poo;

public class Rotor {
    private boolean funcionamento;
    private final boolean LIGADO = true;
    private int rotacao;
    private final int DECOLAGEM = 100;
    private final int ROTACAO = 0;

    public Rotor() {
        this.funcionamento = LIGADO;
        this.rotacao = ROTACAO;
    }

    public boolean decolagem() {
        if(this.rotacao == ROTACAO){
            this.rotacao = DECOLAGEM;
            return true;
        } else {
            return false;
        }
    }

    public boolean velocidadeRotacao(int velocidade) {
        if(velocidade > ROTACAO && velocidade <= DECOLAGEM) {
            this.rotacao = velocidade;
            return true;
        } else return false;
    }

    public boolean parar(){
        if(this.rotacao > ROTACAO && this.funcionamento == LIGADO) {
            this.rotacao = ROTACAO;
            this.funcionamento = false;
            return true;
        } else return false;
    }

}
