package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {
    private HashMap<String, String> dados;
    private final String MASCARA = "(##) #####-####";

    public Telefone() {
        this.dados = new HashMap<>();
    }

    public boolean add(String r, String n) {
        try {
            String tel = this.formata(MASCARA,  n);
            if (! this.dados.containsKey(r)) {
                this.dados.put(r, tel);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean remove(String r){
        try {
            this.dados.remove(r);
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean update(String r, String n) {
        try {
            String tel = this.formata(MASCARA,  n);
            if(this.dados.containsKey(r)) {
                this.dados.replace(r,n);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
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
