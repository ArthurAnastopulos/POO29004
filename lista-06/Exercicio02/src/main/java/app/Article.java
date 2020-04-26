package app;

/**
 * Classe Article do  BibTeX
 *
 * @author Arthur Anastopulos dos Santos
 */
public class Article {
    private String nameID;
    private String author;
    private String journal;
    private String month;
    private int number;
    private int pages;
    private String title;
    private int volume;
    private int year;

    /**
     * Construtor do Article.
     * @param nameID
     * @param author
     * @param journal
     */
    public Article(String nameID, String author, String journal) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
    }

    /**
     * Construtor do Article.
     * @param nameID
     * @param author
     * @param journal
     * @param month
     */
    public Article(String nameID, String author, String journal, String month) {
        new Article(nameID, author, journal);
        this.month = month;
    }

    /**
     * Construtor do Article.
     * @param nameID
     * @param author
     * @param journal
     * @param month
     * @param number
     */
    public Article(String nameID, String author, String journal, String month, int number) {
        new Article(nameID, author, journal, month);
        this.number = number;
    }

    /**
     * Construtor do Article.
     * @param nameID
     * @param author
     * @param journal
     * @param month
     * @param number
     * @param pages
     */
    public Article(String nameID, String author, String journal, String month, int number, int pages) {
        new Article(nameID, author, journal, month, number);
        this.pages = pages;
    }

    /**
     * Construtor do Article.
     * @param nameID
     * @param author
     * @param journal
     * @param month
     * @param number
     * @param pages
     * @param title
     */
    public Article(String nameID, String author, String journal, String month, int number, int pages, String title) {
        new Article(nameID, author, journal, month, number, pages);
        this.title = title;
    }

    /**
     * Construtor do Article.
     * @param nameID
     * @param author
     * @param journal
     * @param month
     * @param number
     * @param pages
     * @param title
     * @param volume
     */
    public Article(String nameID, String author, String journal, String month, int number, int pages, String title, int volume) {
        new Article(nameID, author, journal, month, number, pages, title);
        this.volume = volume;
    }

    /**
     * Construtor do Article.
     * @param nameID
     * @param author
     * @param journal
     * @param month
     * @param number
     * @param pages
     * @param title
     * @param volume
     * @param year
     */
    public Article(String nameID, String author, String journal, String month, int number, int pages, String title, int volume, int year) {
        new Article(nameID, author, journal, month, number, pages, title, volume);
        this.year = year;
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
        return "@article{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  journal={" + this.journal + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  number={" + this.number + "}," + number + "\n" +
                "  pages={" + this.pages + "}," + pages + "\n" +
                "  title={" + this.title + "}," + title + "\n" +
                "  volume={" + this.volume + "}," + volume + "\n" +
                "  year={" + this.year + "}" + year + "\n" +
                "}";
    }

}