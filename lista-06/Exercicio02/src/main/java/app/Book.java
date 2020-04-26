package app;

/**
 * Classe Book do BibTeX.
 *
 * @author Arthur Anastopulos dos Santos.
 */
public class Book {
    private String nameID;
    private String address;
    private String author;
    private String edition;
    private String editor;
    private String month;
    private int number;
    private String publisher;
    private int series;
    private String title;
    private int volume;
    private int year;

    /**
     * Construtor Book.
     * @param nameID
     * @param author
     * @param publisher
     * @param title
     * @param year
     */
    public Book(String nameID, String author, String publisher, String title, int year) {
        this.nameID = nameID;
        this.author = author;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    /**
     * Construtor Book.
     * @param nameID
     * @param address
     * @param author
     * @param publisher
     * @param title
     * @param year
     */
    public Book(String nameID, String address, String author, String publisher, String title, int year) {
        new Book(nameID, author, publisher, title, year);
        this.address = address;
    }

    /**
     * Construtor Book.
     * @param nameID
     * @param address
     * @param author
     * @param edition
     * @param publisher
     * @param title
     * @param year
     */
    public Book(String nameID, String address, String author, String edition, String publisher, String title, int year) {
        new Book(nameID, address, address, publisher, title, year);
        this.edition = edition;
    }

    /**
     * Construtor Book.
     * @param nameID
     * @param address
     * @param author
     * @param edition
     * @param editor
     * @param publisher
     * @param title
     * @param year
     */
    public Book(String nameID, String address, String author, String edition, String editor, String publisher, String title, int year) {
        new Book(nameID, address, author, edition, publisher, title, year);
        this.editor = editor;
    }

    /**
     * Construtor Book.
     * @param nameID
     * @param address
     * @param author
     * @param edition
     * @param editor
     * @param month
     * @param publisher
     * @param title
     * @param year
     */
    public Book(String nameID, String address, String author, String edition, String editor, String month, String publisher, String title, int year) {
        new Book(nameID, address, author, edition, editor, publisher, title, year);
        this.month = month;
    }

    /**
     * Construtor Book.
     * @param nameID
     * @param address
     * @param author
     * @param edition
     * @param editor
     * @param month
     * @param number
     * @param publisher
     * @param title
     * @param year
     */
    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, String title, int year) {
        new Book(nameID, address, author, edition, editor, month, publisher, title, year);
        this.number = number;
    }

    /**
     * Construtor Book.
     * @param nameID
     * @param address
     * @param author
     * @param edition
     * @param editor
     * @param month
     * @param number
     * @param publisher
     * @param series
     * @param title
     * @param year
     */
    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, int series, String title, int year) {
        new Book(nameID, address, author, edition, editor, month, number, publisher, title, year);
        this.series = series;
    }

    /**
     * Construtor Book.
     * @param nameID
     * @param address
     * @param author
     * @param edition
     * @param editor
     * @param month
     * @param number
     * @param publisher
     * @param series
     * @param title
     * @param volume
     * @param year
     */
    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, int series, String title, int volume, int year) {
        new Book(nameID, address, author, edition, editor, month, number, publisher, series, title, year);
        this.volume = volume;
    }

    public String getNameID() {
        return this.nameID;
    }

    /**
     * Override toString() na formatação BibTeX.
     * @return Retorna uma String
     */
    @Override
    public String toString() {
        return "@book{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  address={" + this.address + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  number={" + this.number + "}," + "\n" +
                "  edition={" + this.edition + "}," + "\n" +
                "  title={" + this.title + "}," + "\n" +
                "  volume={" + this.volume + "}," + "\n" +
                "  editor={" + this.editor + "}," + "\n" +
                "  series={" + this.series + "}," + "\n" +
                "  publisher={" + this.publisher + "}," + "\n" +
                "  year={" + this.year + "}" + "\n" +
                "}";
    }
}