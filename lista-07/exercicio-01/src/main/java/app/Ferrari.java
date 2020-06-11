package app;

public class Ferrari extends Veiculo implements Conversivel {

    public Ferrari(String nome, int velocidade) {
        super(nome, velocidade);
    }

    public boolean ligarFarolNeblina() {
        return true;
    }

    public boolean desligarFarolAposNeblina() {
        return false;
    }

    @Override
    public boolean abrirCapota() {
        return getVelocidade() <= 20;
    }

    @Override
    public boolean fecharCapota() {
        return getVelocidade() <= 20;
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
