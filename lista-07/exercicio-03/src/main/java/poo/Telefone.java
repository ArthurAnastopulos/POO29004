package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;

public class Telefone {
    private HashMap<String, String> dados;
    private final String MASCARA = "(##) #####-####";

    public Telefone() {
        this.dados = new HashMap<>();
    }

    public boolean add(String r, String n) {
        String tel = this.formata(MASCARA,  n);
        if (! this.dados.containsKey(r)) {
            this.dados.put(r, tel);
            return true;
        } else return false;
    }

    public boolean remove(String r){
        Iterator<String> it = dados.keySet().iterator();
        while (it.hasNext()) {
            String str = it.next();
            if(str.equalsIgnoreCase(r)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean update(String r, String n) {
        String tel = this.formata(MASCARA,  n);
        if(this.dados.containsKey(r)) {
            this.dados.replace(r,n);
            return true;
        }
        return false;
    }

    private String formata(String mascara, String valor) {
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + this.dados +
                '}';
    }
}
