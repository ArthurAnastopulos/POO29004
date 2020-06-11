package app;

public abstract class Veiculo {
    private String nome;
    private int velocidade;

    public Veiculo(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
