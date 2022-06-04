package d_03_06_2022;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla,
                            double netoTezina, double brutoTezina,
                            double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla(){
        if(this.daLiSePlacaKaucija==true){
            return osnovnaCena * 1.2 + kaucija;
        }else {
            return osnovnaCena * 1.2;
        }
    }
    @Override
    public void stampa(){
        System.out.println(this.nazivArtikla);
        System.out.println(this.barkod);
        System.out.println(this.tezinaPakovanja());
        System.out.println(this.cenaArtikla());

    }
}
