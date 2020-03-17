package poo;

public class Soldado {
    private final int WEAPONS = 3;
    private final int MOVE = 5;
    private final int NUMSOLDIERMIN = 3;
    private final int NUMSOLDIERMAX = 10;
    private final String[] WEAPON = new String[] {"punho", "baioneta", "fuzíl"};
    private static int numSoldier = 0;

    public Soldado() {
        numSoldier++;
    }

    public void move() {
        this.move(this.MOVE);
    }

    public void move(int pos) {
        if(numSoldier > this.NUMSOLDIERMIN) {
            System.out.println("Soldado moveu " + pos + " posições!");
        } else System.out.println("Ainda não, esperando o exército ficar maior.");
    }

    public void attack(){
        if (numSoldier <= this.NUMSOLDIERMIN){
            System.out.println("Ainda não, esperando o exército ficar maior.");
            return;
        }
        if(numSoldier == this.NUMSOLDIERMAX) System.out.println("O soldado acertou um headshot com seu fuzíl no inimigo.");
        else System.out.println("Necessitamos mais soldados para atacar.");
    }

    public void attack(String weapon) {
        if (numSoldier <= this.NUMSOLDIERMIN){
            System.out.println("Ainda não, esperando o exército ficar maior.");
            return;
        }
        if(numSoldier == this.NUMSOLDIERMAX) {
            for(String aux:this.WEAPON) {
                if(weapon.equals(aux)){
                    System.out.println("O soldado atacou com " + weapon + " acerteiramente o inimigo!");
                }
            }
        } else System.out.println("Necessitamos mais soldados para atacar.");
    }

    public static int getNumSoldier() {
        return numSoldier;
    }
}
