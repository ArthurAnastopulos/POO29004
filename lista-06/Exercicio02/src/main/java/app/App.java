package app;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe da aplicação do programa. Usada para interagir com Gerenciador de bibliografias.
 *
 * @author Arthur Anastopulos dos Santos.
 */
public class App {
    private ArrayList<Base> bases = new ArrayList<>();

    /**
     * Adiciona uma Base a aplicação.
     * @param base Base a ser adicionada.
     * @return True ou False dependendo se já existe tal Base.
     */
    public boolean add(Base base){
        for (Base aux : this.bases) {
            if (aux.getName().equals(base.getName())) {
                return false;
            }
        }
        this.bases.add(base);
        return true;
    }

    /**
     * Remove uma Base da aplicação.
     * @param name Nome da Base a ser removida.
     * @return True ou False dependendo se já foi possivel remover tal Base.
     */
    public boolean remove(String name){
        Iterator<Base> coreIterator = this.bases.iterator();
        while (coreIterator.hasNext()) {
            Base base = coreIterator.next();
            if(base.getName().equalsIgnoreCase(name)) {
                coreIterator.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um Article em dada base.
     * @param article Article a ser adicionado.
     * @param name Nome da Base a ser adicionado.
     * @return True ou False dependendo se já existe tal Article.
     */
    public boolean add(Article article, String name){
        for (Base aux : this.bases) {
            if (aux.getName().equals(name)) {
                if (aux.containID(article.getNameID())) {
                    aux.add(article);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Adiciona um Book em dada base.
     * @param book Book a ser adicionado.
     * @param name Nome da Base a ser adicionado.
     * @return True ou False dependendo se já existe tal Book.
     */
    public boolean add(Book book, String name){
        for (Base aux : this.bases) {
            if (aux.getName().equals(name)) {
                aux.add(book);
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um Masterthesis em dada base.
     * @param masterthesis Masterthesis a ser adicionado.
     * @param name Nome da Base a ser adicionado.
     * @return True ou False dependendo se já existe tal Masterthesis.
     */
    public boolean add( Masterthesis masterthesis, String name){
        for (Base aux : this.bases) {
            if (aux.getName().equals(name)) {
                aux.add(masterthesis);
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um Misc em dada base.
     * @param misc Misc a ser adicionado.
     * @param name Nome da Base a ser adicionado.
     * @return True ou False dependendo se já existe tal Misc.
     */
    public boolean add(Misc misc, String name){
        for (Base aux : this.bases) {
            if (aux.getName().equals(name)) {
                if (aux.containID(misc.getNameID())) {
                    aux.add(misc);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Adiciona um Techreport em dada base.
     * @param techreport Techreport a ser adicionado.
     * @param name Nome da Base a ser adicionado.
     * @return True ou False dependendo se já existe tal Techreport.
     */
    public boolean add(Techreport techreport, String name){
        for (Base aux : this.bases) {
            if (aux.getName().equals(name)) {
                if (aux.containID(techreport.getNameID())) {
                    aux.add(techreport);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Remove um item com o determinado id.
     * @param name Nome da Base do id a ser removido
     * @param id Id a ser Removido.
     * @return True ou False dependendo se foi possível remover o id.
     */
    public boolean remove(String name, String id) {
        Iterator<Base> coreIterator = this.bases.iterator();
        while (coreIterator.hasNext()) {
            Base base = coreIterator.next();
            if(base.getName().equalsIgnoreCase(name)) {
                base.remove(id);
                return true;
            }
        }
        return false;
    }

    /**
     * Exporte um ArrayList de String das Base
     * @param name Base a ser procurado.
     * @return um ArrayList String da Base.
     */
    public ArrayList<String> export(String name){
        for (Base aux : this.bases) {
            if (aux.getName().equals(name)) {
                return aux.exportText();
            }
        }
        return null;
    }

    public ArrayList<Base> getBases() {
        return bases;
    }
}
