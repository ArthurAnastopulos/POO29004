package poo;

import java.time.LocalDate;

public class Pessoa implements Comparable {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String r, String n) {
        if(this.telefones.add(r,n)) return true;
        else return false;
    }

    public boolean addEmail(String r, String n) {
        if (this.emails.add(r, n)) return true;
        else return false;
    }

    public boolean removeTelefone(String r) {
       if (this.telefones.remove(r)) return true;
       else return false;
    }

    public boolean removeEmail(String r) {
        if(this.emails.remove(r)) return true;
        else return false;
    }

    public boolean updateTelefone(String r, String n) {
        if(this.telefones.update(r, n)) return true;
        else return false;
    }

    public boolean updateEmail(String r, String n) {
       if(this.emails.update(r, n)) return true;
       else return false;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public Telefone getTelefones() {
        return telefones;
    }

    public Email getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", sobrenome='" + this.sobrenome + '\'' +
                ", dataNasc=" + this.dataNasc +
                ", telefones=" + this.telefones +
                ", emails=" + this.emails +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Pessoa p = (Pessoa) o;
        if(this.nome.compareTo(p.nome) == 0) {
            if (this.sobrenome.compareTo(p.sobrenome) == 0) {
                if (this.dataNasc.compareTo(p.dataNasc) == 0) {
                    return 0;
                } else  if (this.dataNasc.compareTo(p.dataNasc) > 0) {
                    return 1;
                } else if (this.dataNasc.compareTo(p.dataNasc) < 0) {
                    return -1;
                }
            } else if (this.sobrenome.compareTo(p.sobrenome) > 0) {
                return 1;
            } else if (this.sobrenome.compareTo(p.sobrenome) < 0) {
                return -1;
            }
        } else if (this.nome.compareTo(p.nome) > 0) {
            return 1;
        } else if(this.nome.compareTo(p.nome) < 0) {
            return -1;
        }
        return 0;
    }
}
