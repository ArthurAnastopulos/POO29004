package app;

public class Pampa extends Veiculo implements TracaoIntegral{
    public Pampa(String nome, int velocidade) {
        super(nome, velocidade);
    }

    public boolean abrirCacamba() {
        return getVelocidade() == 0;
    }

    public boolean fecharCacamba() {
        return getVelocidade() == 0;
    }

    @Override
    public boolean ativarDesativarTracao() {
        return getVelocidade() == 0;
    }

    @Override
    public void frear(int i) {
        if(getVelocidade() != 0) {
            int calculo = getVelocidade() - i;
            setVelocidade(Math.max(calculo, 0));
        }
    }

    @Override
    public void acelerar(int i) {
        if (getVelocidade() > 0) {
            int calculo = getVelocidade() + i;
            setVelocidade(calculo);
        }
    }
}
