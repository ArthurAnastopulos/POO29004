package poo;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static Agenda agenda = new Agenda();

    public static void main(String[] args) {
//        System.out.println("----MENU----");
//        System.out.print("1 - Adiciona Pessoa" + "\n" + "2 - Remove Pessoa" + "\n" + "3 - Adiciona Telefone" + "\n"
//                + "4 - Adicona Email" + "\n" + "5 - Atualiza Telefone" + "\n" + "6 - Atualiza Email" + "\n"
//                + "7 - Remove Telfone" + "\n" + "8 - Remove Email" + "\n" + "9 - Mostrar na tela" + "\n"
//                + "Pressione Qualquer outro botão para sair." + "\n");
//        System.out.println("---- ----");
//        menu();

        List<Pessoa> pessoas = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate dn1 = LocalDate.parse("01/01/1990", formatter);
        LocalDate dn2 = LocalDate.parse("01/01/1989", formatter);
        LocalDate dn3 = LocalDate.parse("01/01/1991", formatter);
        LocalDate dn4 = LocalDate.parse("01/01/1980", formatter);

        pessoas.add(new Pessoa ("Joao", "Silva" , dn1));
        pessoas.add(new Pessoa ("Ana", "Paula" , dn2));
        pessoas.add(new Pessoa ("Joao", "Santos", dn3));
        pessoas.add(new Pessoa ("Joao", "Silva" , dn4));
        System.out.println(pessoas);
        pessoas.sort(Comparator.naturalOrder());
        System.out.println(pessoas);

    }

    public static void menu() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        Scanner teclado = new Scanner(System.in);
        int x = 0;

        while (x != 9) {
            try {
                String opt = teclado.nextLine();

                x = Integer.parseInt(opt);

                switch (x) {
                    case 1:
                        System.out.println("Insira o nome:");
                        String n = teclado.nextLine();

                        System.out.println("Insira o sobrenome:");
                        String s = teclado.nextLine();

                        System.out.println("Insira a data de nascimento (dd/mm/yyyy):");
                        String date = teclado.nextLine();
                        LocalDate dn = LocalDate.parse(date, formatter);

                        Pessoa pessoa = new Pessoa(n, s, dn);

                        if (agenda.addPessoa(pessoa)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");

                        break;

                    case 2:
                        System.out.println("Insira o nome:");
                        String n1 = teclado.nextLine();

                        System.out.println("Insira o sobrenome:");
                        String s2 = teclado.nextLine();

                        if (agenda.removePessoa(n1, s2)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;

                    case 3:
                        System.out.println("Insira o rótulo do número:");
                        String rot = teclado.nextLine();

                        System.out.println("Insira o número:");
                        String num = teclado.nextLine();

                        System.out.println("Insira a posição:");
                        String aux = teclado.nextLine();

                        int pos = Integer.parseInt(aux);

                        if (agenda.addTelefone(rot, num, pos)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;

                    case 4:
                        System.out.println("Insira o rótulo do email:");
                        String rotEmail = teclado.nextLine();

                        System.out.println("Insira o email:");
                        String email = teclado.nextLine();

                        System.out.println("Insira a posição:");
                        String aux1 = teclado.nextLine();

                        int pos1 = Integer.parseInt(aux1);

                        if (agenda.addEmail(rotEmail, email, pos1)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");

                        break;

                    case 5:
                        System.out.println("Isira o rótulo do número:");
                        String rotNum = teclado.nextLine();

                        System.out.println("Insira o novo número:");
                        String numero = teclado.nextLine();

                        System.out.println("Insira a posição:");
                        String aux2 = teclado.nextLine();

                        int pos2 = Integer.parseInt(aux2);

                        if (agenda.updateTelefone(rotNum, numero, pos2)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;

                    case 6:
                        System.out.println("Insira o rótulo do email:");
                        String rotEmail1 = teclado.nextLine();

                        System.out.println("Insira o email:");
                        String email1 = teclado.nextLine();

                        System.out.println("Insira a posição:");
                        String aux3 = teclado.nextLine();

                        int pos3 = Integer.parseInt(aux3);


                        if (agenda.updateEmail(rotEmail1, email1, pos3)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");

                        break;

                    case 7:
                        System.out.println("Insira o rotulo do número a ser removido:");
                        String rotNum3 = teclado.nextLine();

                        System.out.println("Insira a posição:");
                        String aux4 = teclado.nextLine();

                        int pos4 = Integer.parseInt(aux4);

                        if (agenda.removeTelefone(rotNum3, pos4)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;

                    case 8:
                        System.out.println("Insira o rotulo do email a ser removido:");
                        String rotEmail3 = teclado.nextLine();

                        System.out.println("Insira a posição:");
                        String aux5 = teclado.nextLine();

                        int pos5 = Integer.parseInt(aux5);

                        if (agenda.removeTelefone(rotEmail3, pos5)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;

                    case 9:
                        System.out.println(agenda.toString());
                        break;
                    default:
                        System.out.println("Saindo.");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Input errado.");
            }
        }
    }
}