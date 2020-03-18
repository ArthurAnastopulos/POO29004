package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int LIMIT = 100;
        Scanner input = new Scanner(System.in);
        int area = Integer.parseInt(input.nextLine());
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        String direcao = input.nextLine();
        Robo rob = new Robo(area, x, y, direcao);

        String[] plano = new String[LIMIT];
        int aux = 0;
        while(input.hasNext() && aux < LIMIT) {
            plano[aux] = input.nextLine();
            aux++;
        }

        rob.loadPlanoExploracao(plano);
        rob.executarExploracao();
        System.out.println(rob.toString());
    }
}
