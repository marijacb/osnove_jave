package d_18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Milka";
        cokolada.cena = 120;
        cokolada.tezinaG = 100;
        cokolada.Stampaj();

        Proizvod prasak = new Proizvod();
        prasak.naziv = "Persil";
        prasak.cena = 1800;
        prasak.tezinaG = 5;
        prasak.Stampaj();
    }
}
