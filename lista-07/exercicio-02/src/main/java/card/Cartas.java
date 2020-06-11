package card;

public class Cartas {
    private Valores valor;
    private Naipes naipe;

    public String getValor() {
        switch (valor) {
            case AS:
                return "Ás";
            case DOIS:
                return "Dois";
            case TRES:
                return "Três";
            case QUATRO:
                return "Quatro";
            case CINCO:
                return "Cinco";
            case SEIS:
                return "Seis";
            case SETE:
                return "Sete";
            case OITO:
                return "Oito";
            case NOVE:
                return "Nove";
            case DEZ:
                return "Dez";
            case DAMA:
                return "Dama";
            case REI:
                return "Rei";
            case VALETE:
                return "Valete";
            default:
                throw new IllegalArgumentException();
        }
    }

    public void setValor(int v) {
        this.valor = Valores.getValor(v);
    }

    public String getNaipe() {
        switch (naipe) {
            case PAUS:
                return "Paus";
            case COPAS:
                return "Copas";
            case OUROS:
                return "Ouros";
            case ESPADAS:
                return "Espadas";
            default:
                throw new IllegalArgumentException();
        }
    }

    public void setNaipe(int n) {
        this.naipe = Naipes.getNaipe(n);
    }
}
