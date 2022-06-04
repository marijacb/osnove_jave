package d_03_06_2022;

import java.util.ArrayList;

public class Korpa {


    ArrayList<Ambalaza>nizAmbalaza= new ArrayList<Ambalaza>();

    public void dodajAmbalazu(Ambalaza a){
        this.nizAmbalaza.add(a);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            Ambalaza a = this.nizAmbalaza.get(i);
            if ((a.getBarkod().equals(barkod))) {
                this.nizAmbalaza.remove(a);
            }
        }
    }
    private double cenaAmbalazeSaPopustom(double popust){
        double suma =0;
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            suma=suma + this.nizAmbalaza.get(i).cenaArtikla()* popust;
        }
        return suma;
    }
    public double ukupnaCenaKorpe(SuperKartica popust){
        double suma = 0;
        return suma+this.cenaAmbalazeSaPopustom(popust.getPopust());

    }
}

