package d_24_05_2022;

public class RacunTransakcijaMain {
    public static void main(String[] args) {
        Racun n = new Racun(20000);
        n.setBrojRacuna("123-567-0983");
        n.setPunoIme("Marija Barjaktarevic");
        n.menjaStanje(10000);

        Racun m = new Racun(0);
        m.setBrojRacuna("186-493-0985");
        m.setPunoIme("Ivana Ilic");

        Transakcija k = new Transakcija();
        k.setIdTranksakcije("198285");
        k.setRacunSaKogPrenose(n);
        k.setRacunaNaKojiPrenose(m);
        k.stampa();

    }
}
