package d_03_06_2022;

public class AmbalazaMain {
    public static void main(String[] args) {
        Ambalaza s = new Tetrapak("120-93845-1292","mleko", 5, 10, true, 50 );
        Ambalaza c = new StaklenaAmbalaza("1239-097-191", "vino", 25, 40, 20, true, 100);
        Ambalaza g = new Tetrapak("123-506-30", "jogurt", 5, 10, false, 40);

        s.stampa();
        c.stampa();
        g.stampa();

        Korpa a = new Korpa();
        a.dodajAmbalazu(s);
        a.dodajAmbalazu(c);
        a.dodajAmbalazu(g);

        SuperKartica p = new SuperKartica(1234, "Ivana Ilic",10 );
        a.izbaciAmbalazu("123-506-30");
        System.out.println(a.ukupnaCenaKorpe(p));
    }
}
