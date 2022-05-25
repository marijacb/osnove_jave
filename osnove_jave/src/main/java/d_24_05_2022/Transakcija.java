package d_24_05_2022;

public class Transakcija {
    private String idTranksakcije;
    private Racun racunSaKogPrenose;
    private Racun racunaNaKojiPrenose;

    public Transakcija() {
    }


    public String getIdTranksakcije() {
        return idTranksakcije;
    }

    public void setIdTranksakcije(String idTranksakcije) {
        this.idTranksakcije = idTranksakcije;
    }

    public Racun getRacunSaKogPrenose() {
        return racunSaKogPrenose;
    }

    public void setRacunSaKogPrenose(Racun racunSaKogPrenose) {
        this.racunSaKogPrenose = racunSaKogPrenose;
    }

    public Racun getRacunaNaKojiPrenose() {
        return racunaNaKojiPrenose;
    }

    public void setRacunaNaKojiPrenose(Racun racunaNaKojiPrenose) {
        this.racunaNaKojiPrenose = racunaNaKojiPrenose;
    }

    private double provizija(double visinaTransakcije) {
        if (visinaTransakcije < 4500) {
            return 45;
        }
        return visinaTransakcije * 0.1;
    }

    public void izvrsiTransakciju(int vrednostTansakcije) {
        double suma = vrednostTansakcije + this.provizija(vrednostTansakcije);
    }
    void stampa(){
        System.out.println(this.idTranksakcije);
        System.out.println("Racun sa: " + this.racunSaKogPrenose.getPunoIme() + " " + this.racunSaKogPrenose.getBrojRacuna());
        System.out.println("Racun na: " + this.racunaNaKojiPrenose.getPunoIme() + " " + this.racunaNaKojiPrenose.getBrojRacuna());
    }
}
