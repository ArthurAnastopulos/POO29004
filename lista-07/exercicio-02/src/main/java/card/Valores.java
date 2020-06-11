package card;

public enum Valores {
    AS(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10),
        VALETE(11), DAMA(12), REI(13);

    public final int codigo;

    Valores(int codigo) {
        this.codigo = codigo;
    }

    public static Valores getValor(int c) {
        for(Valores valor : Valores.values()) {
            if(c == valor.codigo) {
                return valor;
            }
        }
        throw new IllegalArgumentException();
    }
}
