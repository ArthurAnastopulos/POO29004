import java.util.Queue;

public class Switch {
    private String[] pacotes;
    private String endereco;
    private Queue<String> store;
    private int porta;

    public Switch(int quantidade) {
        this.pacotes = new String[quantidade];
        this.endereco = "";
        this.porta = 0;
    }

    public Switch(String[] pacotes, String endereco, int porta) {
        this.pacotes = pacotes;
        this.endereco = endereco;
        this.porta = porta;
    }

    public String[] getPacotes() {
        return pacotes;
    }

    public void setPacotes(String[] pacotes) {
        this.pacotes = pacotes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Queue<String> getStore() {
        return store;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public void store() {
        for(int i = 0; i < this.pacotes.length; i++) {
            this.store.add(this.pacotes[i]);
        }
    }

    public void store(String pacote) {
        this.store.add(pacote);
    }

    public String[] foward(String destino) {
        if(!destino.equals(this.endereco)) {
            String[] aux = new String[store.size()];
            for(int i = 0; i < store.size(); i++) {
                aux[i] = store.poll();
            }
            return aux;
        }

    }
}