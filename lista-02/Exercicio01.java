public class Exercicio01 {
    static int num = 0;
    public static void main(String[] args) {
        if(args.length == 0) System.out.println("Não há argumentos.");
        String str = args[0];
        num = Integer.parseInt(args[1]);

        switch (str) {
            case "quadrado":
                if(num % 2 != 0) System.out.println("Argumento não é par.");
                if((num >= 4)) {
                    System.out.println("*****");
                    for(int i = 0; i != num - 2 ; i++) {
                        System.out.println("*   *");
                    }
                    System.out.println("*****");
                } else {
                    System.out.println("Argumento Inválido de linhas.");
                }
                break;
            case "losango":
                if(num % 2 == 0) System.out.println("Argumento não é ímpar.");
                if((num >= 3) && (num%2 != 0)) {   
                    //superior
                    for(int i = 1; i <= num; i++){
                        for(int j = num; j > i; j--){
                           System.out.print(" ");
                        }
                        System.out.print("*");
                        for(int j = 1; j<(i-1)*2; j++){
                           System.out.print(" ");
                        }
                        if(i==1){
                          System.out.print("\n");
                        }
                        else{
                          System.out.print("*\n");
                        }
                    }
                    //inferior
                    for(int i = num-1; i >= 1; i--){
                        for(int j = num; j>i; j--){
                           System.out.print(" ");
                        }
                        System.out.print("*");
                        for(int j=1; j<(i-1)*2; j++){
                           System.out.print(" ");
                        }
                        if(i==1){
                          System.out.print("\n");
                        }
                        else{
                          System.out.print("*\n");
                        }
                    }    
                } else {
                    System.out.println("Argumento Inválido de linhas.");
                }
                break;
            default:
                System.out.println("Argumento Inválido de forma.");
                break;  
        }
        return;
    }
}