package app;

public interface VeiculoAnfibio extends VeiculoMarinho, VeiculoTerrestre {
    boolean recolherRodas();
    boolean abrirRodas();
}
