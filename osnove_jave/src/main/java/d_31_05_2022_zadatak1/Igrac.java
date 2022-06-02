package d_31_05_2022_zadatak1;

public class Igrac extends Osoba {
    private int brojKojiNosi;
    private String pozicija;
    private boolean kapiten;

    Igrac(){
        super();
    }

    public Igrac(String punoIme,String jmbg, int godinaRodjenja,
                 int brojKojiNosi, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.brojKojiNosi = brojKojiNosi;
        this.pozicija = pozicija;
        this.kapiten = kapiten;

    }

    public int getBrojKojiNosi() {
        return brojKojiNosi;
    }

    public void setBrojKojiNosi(int brojKojiNosi) {
        this.brojKojiNosi = brojKojiNosi;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    @Override
    public void stampa(){
        System.out.println(this.punoIme + " " + this.jmbg + " " +
            this.godinaRodjenja+ " " + this.brojKojiNosi+ " " +  this.kapiten);
    }
}
