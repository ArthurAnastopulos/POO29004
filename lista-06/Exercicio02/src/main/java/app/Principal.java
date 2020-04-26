package app;

import java.util.ArrayList;

/**
 * Classe Principal que Executa o programa.
 *
 * @author Arthur Anastopulos dos Santos.
 */
public class Principal {
    /**
     * main()
     * @param args - argumentos.
     */
    public static void main(String[] args) {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        app.add(book,"Bib. Arthur");
        app.add(misc,"Bib. Arthur");
        app.add(article,"Bib. Arthur");
        app.add(masterthesis,"Bib. Arthur");
        app.add(techreport,"Bib. Arthur");

        app.remove("Bib. Arthur", "test01");
        ArrayList<String> bases = app.export("Bib. Arthur");
        for (String aux: bases) {
            System.out.println(aux.toString());
        }
    }
}
