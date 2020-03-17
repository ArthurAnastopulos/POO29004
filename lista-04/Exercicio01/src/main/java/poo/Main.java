package poo;

public class Main {

    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Quantidade de argumentos Invalida.");
            return;
        }
        int argsHeight = Integer.parseInt(args[1]);
        int argsWidth = Integer.parseInt(args[2]);
        if(argsHeight <= 2) {
            System.out.println("Argumento de Altura Invalido.");
            return;
        }
        if(argsWidth <= 2) {
            System.out.println("Argumento de Largura Invalido." );
            return;
        }

        Retangulo r = new Retangulo(argsHeight,argsWidth);
        String casos = args[0];

        switch (casos) {
            case "ascii" :
                r.desenharASCII();
                break;
            case "uft8" :
                r.desenharUTF8();
                break;
            default :
                System.out.println("Argumento de modo Invalido");
                break;
        }
    }
}
