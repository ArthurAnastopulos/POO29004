package poo;

import java.time.LocalDate;

public class Pessoa {
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
        try {
            return this.telefones.add(r,n);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addEmail(String r, String n) {
        try {
            return this.emails.add(r, n);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeTelefone(String r) {
        try {
            return this.telefones.remove(r);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeEmail(String r) {
        try {
            return this.emails.remove(r);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateTelefone(String r, String n) {
        try {
            return this.telefones.update(r, n);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateEmail(String r, String n) {
        try {
            return this.emails.update(r, n);
        } catch (Exception e) {
            return false;
        }
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
}
