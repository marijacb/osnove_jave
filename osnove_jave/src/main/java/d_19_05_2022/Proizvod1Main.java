package d_19_05_2022;


public class Proizvod1Main {
    public static void main(String[] args) {
        Proizvod1 k = new Proizvod1();
        k.naziv = "Kafa";
        k.cena = 150.0;
        k.tezinaG = 200.0;

        k.stampaj();
        k.povecajCenu(10);
        k.cenaSaPopustom(13);
        System.out.println("postarina je: "+ k.racunajPostarinu() + "din");


        Proizvod1 s = new Proizvod1();
        s.naziv = "Secer";
        s.cena = 100.0;
        s.tezinaG = 500.0;

        s.stampaj();
        s.povecajCenu(10);
        s.cenaSaPopustom(13);
        System.out.println("postarina je: "+ s.racunajPostarinu() + "din");




    }
}
