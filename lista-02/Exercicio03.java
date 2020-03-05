import java.util.*;

public class Exercicio03 {
    static int cont = 0;

    private static boolean verificaPar(int numero) {
        if(numero % 2 == 0) return true;
        else return false;
    }

    private static boolean verificaImpar(int numero) {
        if(numero % 2 != 0) return true;
        else return false;
    }
    
    private static boolean verificaPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
        ArrayList<String> arrKey = new ArrayList<String>();

        while(scan.hasNext()) {
            String key = scan.nextLine();
            if(hash.containsKey(key)) {
                int aux = hash.get(key);
                hash.put(key, (aux + 1));   
            } else {
                hash.put(key, 1);
                arrKey.add(key);
            }
        }


        System.out.println("Total de números únicos: " + hash.size());

        ArrayList<Integer> arrInt = new ArrayList<Integer>(hash.values());
        Collections.sort(arrInt);
        int rept = arrInt.get(arrInt.size() - 1);
        Iterator<String> iter1 = arrKey.iterator();
        while(iter1.hasNext()) {
            String str = iter1.next();
            int aux = hash.get(str);
            if(rept == aux) {
                System.out.println("Número com o maior número de repetições: " + str);
                break;
            }
        }

        Iterator<String> iter2 = arrKey.iterator();
        while(iter2.hasNext()) {
            int par = Integer.parseInt(iter2.next());
            if(verificaPar(par)) cont++;
        }
        System.out.println("Total de números pares: " + cont);
        cont = 0;

        Iterator<String> iter3 = arrKey.iterator();
        while(iter3.hasNext()) {
            int impar = Integer.parseInt(iter3.next());
            if(verificaImpar(impar)) cont++;
        }
        System.out.println("Total de números impares: " + cont);
        cont = 0;
        
        Iterator<String> iter4 = arrKey.iterator();
        while(iter4.hasNext()) {
            int primo = Integer.parseInt(iter4.next());
            if(verificaPrimo(primo)) cont++;
        }
        System.out.println("Total de números primo: " + cont);
        cont = 0;
        
        scan.close();
        return;
    }
}