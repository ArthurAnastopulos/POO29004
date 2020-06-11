package app;

public class Panther extends Veiculo implements Conversivel, TracaoIntegral, VeiculoAnfibio{
    private int tempRefri;
    private int Lastro;
    private boolean rodas;

    public Panther(String nome, int velocidade) {
        super(nome, velocidade);
        this.rodas = false;
    }

    public int getTempRefri() {
        return tempRefri;
    }

    public void setTempRefri(int t) {
        this.tempRefri = t;
    }

    @Override
    public boolean abrirCapota() {
        return getVelocidade() == 0;
    }

    @Override
    public boolean fecharCapota() {
        return getVelocidade() == 0;
    }

    @Override
    public boolean ativarDesativarTracao() {
        return this.abrirRodas();
    }

    @Override
    public boolean recolherRodas() {
        this.esvaziarLastro();
        return this.rodas = true;
    }

    @Override
    public boolean abrirRodas() {
        return this.rodas = true;
    }

    @Override
    public void esvaziarLastro() {
        if(this.Lastro > 0) this.Lastro = 0;
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
