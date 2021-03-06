package poo;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
    private ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addPessoa(Pessoa p) {
        try {
            return this.contatos.add(p);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removePessoa(String n, String s) {
        try {
            Iterator<Pessoa> iteracao = contatos.iterator();
            while(iteracao.hasNext()){
                Pessoa p = iteracao.next();
                String aux = p.getNome() + " " + p.getSobrenome();
                if (aux.equals(n + " " + s)){
                    iteracao.remove();
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean addTelefone(String r, String n, int pIndex) {
        try {
            Pessoa p = this.contatos.get(pIndex - 1);
            return p.addTelefone(r, n);
        } catch (Exception e){
            return false;
        }
    }

    public  boolean addEmail(String r, String n, int pIndex) {
        try {
            Pessoa p = this.contatos.get(pIndex - 1);
            return p.addEmail(r, n);
        } catch (Exception e){
            return false;
        }
    }

    public boolean updateTelefone(String r, String n, int pIndex) {
        try {
            Pessoa p = this.contatos.get(pIndex - 1);
            return p.updateTelefone(r, n);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateEmail(String r, String n, int pIndex) {
        try {
            Pessoa p = this.contatos.get(pIndex - 1);
            return p.updateEmail(r, n);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeTelefone(String r, int pIndex) {
        try {
            Pessoa p = this.contatos.get(pIndex - 1);
            p.removeTelefone(r);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean removeEmail(String r, int pIndex) {
        try {
            Pessoa p = this.contatos.get(pIndex - 1);
            return p.removeEmail(r);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + this.contatos +
                '}';
    }
}
