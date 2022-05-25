package d_23_05_2022;

public class AutorKnjigaMain {
    public static void main(String[] args) {
        Autor a = new Autor();
        a.setPunoIme("Ken Folet");
        a.Stampaj();

        Knjiga k = new Knjiga();
        k.setIsbn("123-4857-0");
        k.setNaziv("Vece i jutro");
        k.setGodinaIzdanja(2022);
        k.setAutor(a);
        k.Stampa();


    }


}