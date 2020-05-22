package poo;

public class Circulo extends FormaGeometricas{
   private Ponto centro;
   private double raio;

   public Circulo(Ponto centro, double raio) {
      this.centro = centro;
      this.raio = raio;
   }

   public void desenhar() {
      System.out.print("Circulo -> Centro ");
      this.centro.desenhar();
      System.out.println("Circulo -> Com Raio de " + this.raio + ".");
   }

   public double getArea() {
      return Math.PI * Math.sqrt(raio);
   }
}
