package d_31_05_2022_zadatak1;

public class Osoba {
    protected String punoIme;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba(){}
    public Osoba(String punoIme, String jmbg, int godinaRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampa(){
        System.out.println("Ime i prezime: ( " + this.punoIme + "), JMBG: ( "  +
                this.jmbg + "), godina rodjenja: (" + this.godinaRodjenja + ")");
    }
}
