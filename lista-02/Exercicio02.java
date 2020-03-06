import java.util.Random;

public class Exercicio02 {
     public static void main(String[] args) {
        int[] nums = new int[10];

        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            nums[i] = gerador.nextInt(10);
        }

        int arrLength = nums.length;
        int aux = 0;

        for(int i=0; i < arrLength; i++) {
            for(int j=1; j < (arrLength - i); j++) {
                if(nums[j-1] > nums[j]) {
                    aux = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = aux;
                }    
            }
        }

        for(int i = 0; i < arrLength; i++) System.out.print(nums[i] + " ");
        System.out.println("\n");
        return;
    }
}