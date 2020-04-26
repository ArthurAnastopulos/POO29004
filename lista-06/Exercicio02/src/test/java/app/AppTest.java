package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void add() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        Base bFalse = new Base("Falso");
        App app = new App();
        app.add(bFalse);
        assertTrue("True",app.add(base));
        assertFalse("False", app.add(bFalse));
    }

    @Test
    public void remove() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        assertTrue("True", app.remove("Bib. Arthur"));
        assertFalse("False", app.remove("Banana"));
    }

    @Test
    public void testAdd() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        assertTrue("True",app.add(article, "Bib. Arthur"));
        assertFalse("False", app.add(article,"false"));
    }

    @Test
    public void testAdd1() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        assertTrue("True",app.add(book, "Bib. Arthur"));
        assertFalse("False", app.add(book,"false"));
    }

    @Test
    public void testAdd2() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        assertTrue("True",app.add(misc, "Bib. Arthur"));
        assertFalse("False", app.add(misc,"false"));
    }

    @Test
    public void testAdd3() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        assertTrue("True",app.add(masterthesis, "Bib. Arthur"));
        assertFalse("False", app.add(masterthesis,"false"));
    }

    @Test
    public void testAdd4() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        assertTrue("True",app.add(techreport, "Bib. Arthur"));
        assertFalse("False", app.add(techreport,"false"));
    }

    @Test
    public void testRemove() {
        Misc misc = new Misc("test01","Teste");
        Article article = new Article("test02","Arthur","Ifsc");
        Book book = new Book("test03","Arthur A.","poo","Teste Book",2020);
        Masterthesis masterthesis = new Masterthesis("test04","Arthur B.","Master Teste",2020);
        Techreport techreport = new Techreport("teste05","Arthur C.","Ifsc","Teste POO",2020);


        Base base = new Base("Bib. Arthur");
        App app = new App();
        app.add(base);
        app.add(misc, "Bib. Arthur");
        assertTrue("True", app.remove("Bib. Arthur", "test01"));
        assertFalse("False", app.remove("Bib.", "test01"));
    }

    @Test
    public void testExport() {
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

        assertNotNull("Not Null",app.export("Bib. Arthur"));
        assertNull("Null",app.export("Bib. POO"));
    }
}