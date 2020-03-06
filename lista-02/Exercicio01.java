public class Exercicio01 {
    static int num = 0;
    public static void main(String[] args) {
        if(args.length == 0 || args.length < 2) { 
            System.out.println("Não há argumentos.");
            return;
        }
        String str = args[0];
        num = Integer.parseInt(args[1]);

        switch (str) {
            case "quadrado":
                if(num % 2 != 0) {
                    System.out.println("Argumento não é par.");
                    break;
                }
                if((num >= 4)) {
                    for (int i = 1;i <= num;i++) {
                        for (int j = 1; j <= num;j++ ) {
                            if (i == 1 || i == num || j == 1 || j == num)
                                System.out.print("*");
                            else 
                                System.out.print(" ");
                        }
                        System.out.println("");
                    }
                } else {
                    System.out.println("Argumento Inválido de linhas.");
                }
                break;
            case "losango":
                if(num % 2 == 0) {
                    System.out.println("Argumento não é ímpar.");
                    break;
                }
                if((num >= 3) && (num%2 != 0)) {   
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