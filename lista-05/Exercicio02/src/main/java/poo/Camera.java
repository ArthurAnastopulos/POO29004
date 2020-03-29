package poo;

import java.util.ArrayList;

public class Camera {
    private boolean funcionamento;
    private final boolean LIGADO = true;
    private String tipo;
    private final String TIPO = "normal";
    private final String INFRAV = "infravermelho";

    public Camera() {
        this.funcionamento = LIGADO;
        this.tipo = TIPO;
    }

    public boolean captura() {
        if (this.funcionamento == LIGADO) {
            return true;
        } else return false;
    }

    public boolean tipoCamera(String tipo) {
        if(this.funcionamento == LIGADO) {
            if(tipo.equalsIgnoreCase(INFRAV)) {
                this.tipo = tipo;
                return true;
            } else if(tipo.equalsIgnoreCase(TIPO)) {
                this.tipo = tipo;
                return true;
            } else return false;
        } else return false;
    }
}
