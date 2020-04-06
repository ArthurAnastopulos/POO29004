package poo;

import com.grum.geocalc.Coordinate;
import com.grum.geocalc.Point;

import java.util.ArrayList;

public class Drone {
    private ArrayList<Rotor> rotores;
    private Camera camera;
    private ArrayList<String> fotos = new ArrayList<String>();
    private Coordenadas coordenadas;
    private int bateria;
    private ArrayList<String> plano;

    private final int CEM = 100;
    private final int ROTORES = 4;
    private final int SQRT = 2;
    private final int AUTO = 10;

    public Drone() {
        this.rotores = new ArrayList<Rotor>();
        for(int i = 0; i < ROTORES; i++) {
           Rotor r = new Rotor();
           this.rotores.add(r);
        }
        this.camera = new Camera();
        this.coordenadas = new Coordenadas();
        this.bateria = CEM;
    }

    public boolean decolar() {
        if(this.bateria > AUTO) {
            if (this.rotores.size() < 4) {
                return false;
            } else {
                for (int i = 0; i < ROTORES; i++) {
                    Rotor r = this.rotores.get(i);
                    this.consomeBateria(AUTO);
                    if (!r.decolagem()) return false;
                }
            }
            return true;
        } else {
            return this.origem();
        }
    }

    public boolean mover(String move, double valor) {
        if(this.coordenadas.alterar(move,valor)){
            if(move.equalsIgnoreCase("x")) {
                Coordinate aux2 = this.coordenadas.getLat();
                this.consomeBateria(valor);
                return true;
            } else if(move.equalsIgnoreCase("y")) {
                Coordinate aux2 = this.coordenadas.getLng();
                this.consomeBateria(valor);
                return true;
            } else if (move.equalsIgnoreCase("z")) {
                Coordinate aux2 = this.coordenadas.getAlt();
                this.consomeBateria(valor);
                return true;
            }
        }
        return false;
    }

    public String getPosicao() {
        return this.coordenadas.toString();
    }

    public int getBateria() {
        return this.bateria;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public boolean captura() {
        if(this.camera.captura()) {
            this.fotos.add("Foto capturada em " + this.coordenadas.toString());
            return true;
        } else return false;
    }

    public boolean carregarPlano(ArrayList<String> plano) {
        if(this.plano.size() == 0) {
            this.plano = plano;
            return true;
        } else return false;
    }

    public boolean vooAutonomo() {
        for (String str : this.plano) {
            String[] aux = str.split(" ");
            if(aux.length < 3)return false;
            Double lat = Double.parseDouble(aux[0]);
            Double lng = Double.parseDouble(aux[1]);
            Double alt = Double.parseDouble(aux[2]);
            if(! this.mover("x", lat))return false;
            if(! this.mover("y", lng))return false;
            if(! this.mover("z", alt))return false;
        }
        return true;
    }

    public boolean tipoCamera(String tipo) {
        if(this.camera.tipoCamera(tipo)) return true;
        else return false;
    }

    public boolean velocidadeRotacao(int velocidade) {
        for(Rotor r : this.rotores) {
            if (! r.velocidadeRotacao(velocidade)) return false;
        }
        return true;
    }

    public boolean parar() {
        for (Rotor r : this.rotores) {
            if (! r.parar()) return false;
        }
        return true;
    }

    public boolean origem() {
        if (this.coordenadas.origem()) return true;
        else return false;
    }

    private void consomeBateria(double valor) {
        this.bateria = (int) (this.bateria - Math.sqrt(Math.pow((valor / 2),SQRT)));
    }

}
