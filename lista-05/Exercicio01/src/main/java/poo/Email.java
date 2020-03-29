package poo;

import java.util.HashMap;

public class Email {
    private HashMap<String, String> dados;

    public Email() {
        this.dados = new HashMap<>();
    }

    public boolean add(String r, String n) {
        try {
            String emailVer =
                    "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
            if(n.matches(emailVer)) {
                if (! this.dados.containsKey(r)) {
                    this.dados.put(r, n);
                    return true;
                }
            } else return false;
        } catch (Exception e) {
            return false;
        }
        return false;
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
            String emailVer =
                    "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
            if(n.matches(emailVer)) {
                if (! this.dados.containsKey(r)) {
                    this.dados.replace(r, n);
                }
            } else return false;
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Email{" +
                "dados=" + this.dados +
                '}';
    }
}
