package d_03_06_2022;

public class SuperKartica {
    private int brojKartice;
    private String punoImeVlasnika;
    private int popust;

    public SuperKartica(int brojKartice, String punoImeVlasnika,
                        int popust) {
        this.brojKartice = brojKartice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampa(){
        System.out.println(this.brojKartice + " " + this.punoImeVlasnika);
    }
}

