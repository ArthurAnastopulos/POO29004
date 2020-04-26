package app;

/**
 * Classe Masterthesis do  BibTeX
 *
 * @author Arthur Anastopulos dos Santos
 */
public class Masterthesis {
    private String nameID;
    private String author;
    private String month;
    private String title;
    private int year;
    private String address;

    /**
     * Construtor do Masterthesis.
     * @param nameID
     * @param author
     * @param title
     * @param year
     */
    public Masterthesis(String nameID, String author, String title, int year) {
        this.nameID = nameID;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    /**
     * Construtor do Masterthesis.
     * @param nameID
     * @param author
     * @param month
     * @param title
     * @param year
     */
    public Masterthesis(String nameID, String author, String month, String title, int year) {
        new Masterthesis(nameID, author, title, year);
        this.month = month;
    }

    /**
     * Construtor do Masterthesis.
     * @param nameID
     * @param author
     * @param month
     * @param title
     * @param year
     * @param address
     */
    public Masterthesis(String nameID, String author, String month, String title, int year, String address) {
        new Masterthesis(nameID, author, month, title, year);
        this.address = address;
    }

    public String getNameID() {
        return this.nameID;
    }

    /**
     * Override toString() para formatação BibTeX.
     * @return Retorna uma String.
     */
    @Override
    public String toString() {
        return "@masterthesis{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  title={" + this.title + "}," + "\n" +
                "  year={" + this.year + "}" + "\n" +
                "  address={" + this.address + "}" + "\n" +
                "}";
    }
}

