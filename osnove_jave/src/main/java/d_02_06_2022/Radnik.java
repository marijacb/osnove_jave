package d_02_06_2022;

import java.util.ArrayList;

public abstract class Radnik {
    protected String punoIme;
   protected ArrayList<Sektor> nizSektora;

    public Radnik(String punoIme) {
        this.punoIme = punoIme;
        this.nizSektora=new ArrayList<Sektor>();
    }

    public abstract double plataRadnika();
    public void zaposliUSektor(Sektor sektor){
        this.nizSektora.add(sektor);
    }

}
