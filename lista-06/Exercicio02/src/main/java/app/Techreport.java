package app;

/**
 * Classe Techreport do  BibTeX
 *
 * @author Arthur Anastopulos dos Santos
 */
public class Techreport {
    private String nameID;
    private String address;
    private String author;
    private String institution;
    private String month;
    private String title;
    private int year;

    /**
     * Construtor Techreport.
     * @param nameID
     * @param author
     * @param institution
     * @param title
     * @param year
     */
    public Techreport(String nameID, String author, String institution, String title, int year) {
        this.nameID = nameID;
        this.author = author;
        this.institution = institution;
        this.title = title;
        this.year = year;
    }

    /**
     * Construtor Techreport.
     * @param nameID
     * @param address
     * @param author
     * @param institution
     * @param title
     * @param year
     */
    public Techreport(String nameID, String address, String author, String institution, String title, int year) {
        new Techreport(nameID, author, institution, title, year);
        this.address = address;
    }

    /**
     * Construtor Techreport.
     * @param nameID
     * @param address
     * @param author
     * @param institution
     * @param month
     * @param title
     * @param year
     */
    public Techreport(String nameID, String address, String author, String institution, String month, String title, int year) {
        new Techreport(nameID, address, author, institution, title, year);
        this.month = month;
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
        return "@techreport{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  address={" + this.address + "}," + "\n" +
                "  institution={" + this.institution + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  title={" + this.title + "}," + "\n" +
                "  year={" + this.year + "}" + "\n" +
                "}";
    }
}