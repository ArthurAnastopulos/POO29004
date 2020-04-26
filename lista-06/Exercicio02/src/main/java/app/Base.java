package app;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe Base do arquivo BibTeX.
 *
 * @author Arthur Anastopulos dos Santos.
 */
public class Base {
    private String name;
    private ArrayList<String> ids = new ArrayList<>();
    private ArrayList<Article> articles = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Masterthesis> mastertheses = new ArrayList<>();
    private ArrayList<Misc> miscs = new ArrayList<>();
    private ArrayList<Techreport> techreports = new ArrayList<>();

    /**
     * Construtor Base.
     * @param name nome da Base.
     */
    public Base(String name) {
        this.name = name;
    }

    /**
     * Adiciona um Article
     * @param article article a ser adicionado
     * @return Retorna True ou False dependendo se houve erro ou não
     */
    public boolean add(Article article) {
        try {
            this.articles.add(article);
            this.ids.add(article.getNameID());
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * adiciona um Book
     * @param book Book a ser adicionado
     * @return Retorna True ou False dependendo se houve erro ou não
     */
    public boolean add(Book book) {
        try {
            this.books.add(book);
            this.ids.add(book.getNameID());
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * adiciona um Masterthesis
     * @param masterthesis Masterthesis a ser adicionado
     * @return Retorna True ou False dependendo se houve erro ou não
     */
    public boolean add(Masterthesis masterthesis) {
        try {
            this.mastertheses.add(masterthesis);
            this.ids.add(masterthesis.getNameID());
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * adiciona um Misc
     * @param misc Misc a ser adicionado
     * @return Retorna True ou False dependendo se houve erro ou não
     */
    public boolean add(Misc misc) {
        try {
            this.miscs.add(misc);
            this.ids.add(misc.getNameID());
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * adiciona um Techreport
     * @param techreport Techreport a ser adicionado
     * @return Retorna True ou False dependendo se houve erro ou não
     */
    public boolean add(Techreport techreport) {
        try {
            this.techreports.add(techreport);
            this.ids.add(techreport.getNameID());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean containID(String id){
        return !this.ids.contains(id);
    }

    public String getName() {
        return this.name;
    }

    /**
     * Exporta um ArrayList das String de cada BibTeX.
     * @return ArrayList String
     */
    public ArrayList<String> exportText() {
        try {
            ArrayList<String> data = new ArrayList<>();
            if (this.articles.size() > 0){
                for (Article aux : this.articles) {
                    data.add(aux.toString());
                }
            }

            if (this.books.size() > 0){
                for (Book aux : this.books) {
                    data.add(aux.toString());
                }
            }

            if (this.mastertheses.size() > 0){
                for (Masterthesis aux : this.mastertheses) {
                    data.add(aux.toString());
                }
            }

            if (this.miscs.size() > 0){
                for (Misc aux : this.miscs) {
                    data.add(aux.toString());
                }
            }

            if (this.techreports.size() > 0){
                for (Techreport aux : this.techreports) {
                    data.add(aux.toString());
                }
            }
            return data;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * Faz um ArrayList de todos os ID.
     * @return ArrayList String
     */
    public ArrayList<String> getAllID(){
        try {
            ArrayList<String> data = new ArrayList<>();
            if (this.articles.size() > 0){
                for (Article aux : this.articles) {
                    data.add(aux.getNameID());
                }
            }

            if (this.books.size() > 0){
                for (Book aux : this.books) {
                    data.add(aux.getNameID());
                }
            }

            if (this.mastertheses.size() > 0){
                for (Masterthesis aux : this.mastertheses) {
                    data.add(aux.getNameID());
                }
            }

            if (this.miscs.size() > 0){
                for (Misc aux : this.miscs) {
                    data.add(aux.getNameID());
                }
            }

            if (this.techreports.size() > 0){
                for (Techreport aux : this.techreports) {
                    data.add(aux.getNameID());
                }
            }
            return data;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * Remove um ID.
     * @param id ID a ser removido.
     * @return Retorna True ou False dependendo se encontrou o ID a ser removido.
     */
    public boolean remove(String id){
        for (int i = 0; i < this.ids.size() ; i++) {
            Iterator<Book> bookIterator = this.books.iterator();
            while (bookIterator.hasNext()) {
                Book book = bookIterator.next();
                if (book.getNameID().equalsIgnoreCase(id)) {
                    bookIterator.remove();
                    return true;
                }
            }

            Iterator <Masterthesis> masterthesisIterator = this.mastertheses.iterator();
            while (masterthesisIterator.hasNext()) {
                Masterthesis masterthesis = masterthesisIterator.next();
                if(masterthesis.getNameID().equalsIgnoreCase(id)) {
                    masterthesisIterator.remove();
                    return true;
                }
            }

            Iterator<Article> articleIterator = this.articles.iterator();
            while (articleIterator.hasNext()) {
                Article article = articleIterator.next();
                if(article.getNameID().equalsIgnoreCase(id)) {
                    articleIterator.remove();
                    return true;
                }
            }

            Iterator<Misc> miscIterator = this.miscs.iterator();
            while (miscIterator.hasNext()) {
                Misc misc = miscIterator.next();
                if(misc.getNameID().equalsIgnoreCase(id)) {
                    miscIterator.remove();
                    return true;
                }
            }

            Iterator<Techreport> techreportIterator = this.techreports.iterator();
            while (techreportIterator.hasNext()) {
                Techreport techreport = techreportIterator.next();
                if(techreport.getNameID().equalsIgnoreCase(id)) {
                    techreportIterator.remove();
                    return true;
                }
            }
        }
        return false;
    }
}