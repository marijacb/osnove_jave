package d_03_06_2022;

public class Tetrapak extends Ambalaza{
    private boolean reciklaza;
    private double osnovnaCena;


    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla(){
        if(reciklaza==true){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }else {
            return this.osnovnaCena;
        }
    }
    @Override
    public void stampa (){
        System.out.println(this.nazivArtikla);
        System.out.println(this.barkod);
        System.out.println(this.reciklaza);
        System.out.println(this.osnovnaCena);
        System.out.println(this.tezinaPakovanja());
    }
}
