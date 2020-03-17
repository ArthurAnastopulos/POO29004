package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Soldado[] soldados = new Soldado[10];
        final int MAX = 10;
        int aux = 0;
        while (true) {
            System.out.println("Menu:" + "\n" + "1 - Criar um soldado" + "\n" + "2 - Quantidade de soldados"
                                + "\n" + "3 - Movimentar um soldado" + "\n" + "4 - Movimentar todos os soldados"
                                + "\n" + "5 - Atacar com os soldados" + "\n" + "6 - Finalizar.");

            Scanner teclado = new Scanner(System.in);
            int option = teclado.nextInt();

            switch (option) {
                case 1 :
                    if(aux < MAX) {
                        System.out.println("Soldado criado.");
                        soldados[aux] = new Soldado();
                        aux++;
                    } else System.out.println("Quantidade maxíma de soldados.");
                    break;
                case 2 :
                    System.out.println("Quantidade de soldados: " + Soldado.getNumSoldier() + " !");
                    break;
                case 3:
                    System.out.println("Qual Soldado você deseja movimentar.");
                    Scanner soldier = new Scanner(System.in);
                    int move = soldier.nextInt();
                    if(move <= MAX) {
                        Scanner movement = new Scanner(System.in);
                        int pos = movement.nextInt();
                        if (pos > 0) soldados[move - 1].move(pos);
                        else soldados[move - 1].move();
                    }
                    break;
                case 4 :
                    System.out.println("Movendo todos os soldado.");
                    Scanner movement = new Scanner(System.in);
                    int pos = movement.nextInt();
                    for (int i = 0; i < MAX; i++ ) {
                        if(pos > 0)soldados[i].move(pos);
                        else soldados[i].move();
                    }
                    break;
                case 5:
                    System.out.println("Com qual arma você deseja atacar");
                    Scanner arma = new Scanner(System.in);
                    String escolha = arma.nextLine();
                    switch (escolha) {
                        case "punho":
                            System.out.println("punhos escolhido como arma.");
                            soldados[MAX - 1].attack(escolha);
                            break;
                        case "baioneta":
                            System.out.println("baioneta escolhido como arma.");
                            soldados[MAX - 1].attack(escolha);
                            break;
                        case "fuzíl":
                            System.out.println("fuzíl escolhido como arma.");
                            soldados[MAX - 1].attack(escolha);
                            break;
                        default:
                            soldados[MAX - 1].attack();
                    }
                    break;
                case 6:
                    System.out.println("Finalizando aplicação.");
                    return;
            }
        }
    }
}
