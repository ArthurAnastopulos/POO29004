package poo;

public class Retangulo {
    //atributos
    private int height = 0;
    private int width = 0;
    private final int HEIGHT = 4;
    private final int WIDTH = 4;

    public Retangulo() {
        this.height = HEIGHT;
        this.width = WIDTH;
    }

    public Retangulo(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        if(height >= 2) {
            this.height = height;
        }
    }

    public void setWidth(int width) {
        if(width >= 2) {
            this.height = height;
        }
    }

    public void desenharASCII() {
        for (int i = 1;i <= this.width;i++) {
            for (int j = 1; j <= this.height;j++ ) {
                if ((i == 1 || i == this.width) && (j == 1 || j == this.height))
                    System.out.print("+");
                else if ((i != 1 || i != this.width) && (j == 1 || j == this.height))
                    System.out.print("|");
                else if(i == 1 || i == this.width)
                    System.out.print("-");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void desenharUTF8() {
        for (int i = 1;i <= this.width;i++) {
            for (int j = 1; j <= this.height;j++ ) {
                if ((i == 1 || i == this.width) && (j == 1 || j == this.height)) {
                    if((i == 1) && (j== 1)) System.out.print("\u250c");
                    else if((i == this.width) && (j == 1))System.out.print("\u2514");
                    else if(((i == this.width) && (j == this.height))) System.out.print("\u2518");
                    else if(((i == 1) && (j == this.height))) System.out.print("\u2510");
                }
                else if ((i != 1 || i != this.width) && (j == 1 || j == this.height))
                    System.out.print("\u2502");
                else if(i == 1 || i == this.width)
                    System.out.print("\u2500");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
