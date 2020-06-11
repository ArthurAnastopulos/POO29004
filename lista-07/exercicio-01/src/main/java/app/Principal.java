package app;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Ferrari("ferrari", 25));
        veiculos.add(new Pampa("pampa", 100));
        veiculos.add(new Panther("panther", 123));

        Iterator<Veiculo> it = veiculos.iterator();
        while (it.hasNext()) {
            Ferrari f = (Ferrari) it.next();
            f.frear(10);
            if(f.abrirCapota()) System.out.println("Capota aberta.");
            Pampa p = (Pampa) it.next();
            p.frear(100);
            if(p.abrirCacamba()) System.out.println("Camcamba Aberta");;
            Panther pt = (Panther) it.next();
            pt.frear(123);
            if(pt.recolherRodas()) System.out.println("rodas recolhidas");
        }
    }
}
