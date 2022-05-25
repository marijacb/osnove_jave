package d_23_05_2022;

//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
public class Knjiga {
    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;


    public Knjiga(String ISBN, String naziv, int godinaIzdanja, Autor autor) {
        this.isbn = ISBN;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public Knjiga() {

    }

    public String getIsbn() {
        return isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setIsbn(String ISBN) {
        this.isbn = ISBN;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void Stampa() {
        System.out.println(getIsbn());
        System.out.println(this.naziv +  " " + this.godinaIzdanja);
        System.out.println(this.autor.getPunoIme());
    }
}