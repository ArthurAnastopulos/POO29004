package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static Drone drone = new Drone();
    private  static ArrayList<String> planos = null;
    public static void menu() {
        int x = 0;
        while (x != 13) {
            try {
                Scanner teclado = new Scanner(System.in);

                String opt = teclado.nextLine();

                x = Integer.parseInt(opt);


                switch (x) {
                    case 1:
                        if (drone.decolar()) System.out.println("Sucesso ao decolar.");
                        else System.out.println("Erro.");
                        break;
                    case 2:
                        System.out.println("Cima ou Baixo: ");
                        String d1 = teclado.nextLine();
                        System.out.println("Valor: ");
                        String v1 = teclado.nextLine();
                        double n = Double.parseDouble(v1);
                        if (drone.altitude(d1, n)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;
                    case 3:
                        System.out.println("Direção: ");
                        String d2 = teclado.nextLine();
                        System.out.println("Valor: ");
                        String v2 = teclado.nextLine();
                        double n2 = Double.parseDouble(v2);
                        if (drone.mover(d2, n2)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;
                    case 4:
                        System.out.println("Coordenadas: " + drone.getPosicao());
                        break;
                    case 5:
                        System.out.println(drone.getBateria() + "%");
                        break;
                    case 6:
                        if (drone.captura()) System.out.println("Foto tira com sucesso.");
                        else System.out.println("Erro.");
                        break;
                    case 7:
                        if (drone.carregarPlano(planos)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;
                    case 8:
                        if (drone.vooAutonomo()) System.out.println("Iniciando Voo Autonomo");
                        else System.out.println("Erro.");
                        break;
                    case 9:
                        System.out.println("Tipo de Camera: ");
                        String str = teclado.nextLine();
                        if (drone.tipoCamera(str)) System.out.println("Sucesso.");
                        else System.out.println("Erro.");
                        break;
                    case 10:
                        System.out.println("Velocidade: ");
                        String n3 = teclado.nextLine();
                        int i = Integer.parseInt(n3);
                        if (drone.velocidadeRotacao(i)) System.out.println("Velocidade Alterada para " + i + "%");
                        else System.out.println("Erro.");
                        break;
                    case 11:
                        if (drone.origem()) System.out.println("Drone voltou a Origem com sucesso.");
                        else System.out.println("Erro.");
                        break;
                    case 12:
                        ArrayList<String> fotos = drone.getFotos();
                        for(String str4 : fotos) {
                            System.out.println(str4);
                        }
                        break;
                    default:
                        System.out.println("Saindo");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Input Errado.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Menu ----");
        System.out.print("1 - Decolar " + "\n" + "2 - Alterar Altitude" + "\n" +"3 - Mover Drone" + "\n" +
                "4 - Obter posição do Drone" + "\n" + "5 - Obter porcentagem da bateria." + "\n" +
                "6 - Capturar foto" + "\n" + "7 - Carregar Plano" + "\n" + "8 - Voo Autonomo" + "\n" +
                "9 - Trocar o tipo de Camera" + "\n" + "10 - Alterar a velocidade de Rotação" + "\n" +
                "11 - Voltar Drone a Origem" + "\n" + "Pressione Qualquer botão para sair.");
        System.out.println("---- ----");
        if(args.length > 1) {
            planos = new ArrayList<String>();
            Scanner input = new Scanner(System.in);
            while (input.hasNext())planos.add(input.nextLine());
        }
        menu();
    }
}
