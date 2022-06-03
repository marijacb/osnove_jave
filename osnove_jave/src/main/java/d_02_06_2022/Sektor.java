package d_02_06_2022;

public class Sektor {
    protected  String naziv;
    protected double plata;

    public Sektor(String naziv, double plata) {
        this.naziv = naziv;
        this.plata = plata;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getPlata() {
        return plata;
    }
}
