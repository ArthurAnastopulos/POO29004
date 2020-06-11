package poo;

import java.util.HashMap;
import java.util.Iterator;

public class Email {
    private HashMap<String, String> dados;

    public Email() {
        this.dados = new HashMap<>();
    }

    public boolean add(String r, String n) {
        String emailVer =
                "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(n.matches(emailVer)) {
            if (! this.dados.containsKey(r)) {
                this.dados.put(r, n);
                return true;
            }
        } else return false;
        return false;
    }

    public boolean remove(String r){
        Iterator<String> it = dados.keySet().iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.equalsIgnoreCase(r)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean update(String r, String n) {
        String emailVer =
                "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(n.matches(emailVer)) {
            if (! this.dados.containsKey(r)) {
                this.dados.replace(r, n);
            }
        } else return false;
        return false;
    }

    @Override
    public String toString() {
        return "Email{" +
                "dados=" + this.dados +
                '}';
    }
}
