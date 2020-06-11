package card;

import java.util.ArrayList;

public class Baralho {
    private ArrayList<Cartas> baralho;

    Baralho() {
        baralho = new ArrayList<Cartas>();
        Cartas c;
        int aux = 0;

        while (aux < 4) {
            for(int i = 1; i <= 13; i++) {
                c = new Cartas();
                c.setNaipe(aux);
                c.setValor(i);
                baralho.add(c);
            }
        }
    }
}
