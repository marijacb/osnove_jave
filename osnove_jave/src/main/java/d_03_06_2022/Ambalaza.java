package d_03_06_2022;

public abstract  class Ambalaza {
    protected String barkod;
    protected String nazivArtikla;
    protected double netoTezina;
    protected double brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String nazivArtikla,
                        double netoTezina, double brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezinal) {
        this.netoTezina = netoTezinal;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double tezinaPakovanja() {

        double tezinaPakovanja = brutoTezina - netoTezina;
        return tezinaPakovanja;
    }

    public abstract double cenaArtikla();

    public abstract void stampa();
}
