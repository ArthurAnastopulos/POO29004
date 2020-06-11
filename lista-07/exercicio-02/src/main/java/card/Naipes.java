package card;

public enum Naipes {
    PAUS(0), OUROS(1), COPAS(2), ESPADAS(3);

    public final int codigo;

    Naipes(int codigo) {
        this.codigo = codigo;
    }

    public static Naipes getNaipe(int c) {
        for(Naipes naipe : Naipes.values()) {
            if(c == naipe.codigo) {
                return naipe;
            }
        }
        throw new IllegalArgumentException();
    }
}
