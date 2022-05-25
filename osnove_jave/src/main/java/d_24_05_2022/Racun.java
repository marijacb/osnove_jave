package d_24_05_2022;

public class Racun {
    private String brojRacuna;
    private String punoIme;
    double stanje;

    public Racun(double stanje){
        this.stanje=stanje;
    }
    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getStanje() {
        return stanje;
    }
    public void menjaStanje(double prolsedjenaVrednost){
        this.stanje= this.stanje + prolsedjenaVrednost;
        if (stanje<0){
            this.stanje=0;
        }
    }public void stampa(){
        System.out.println(this.punoIme + " - " + brojRacuna);
        System.out.println("stanje na racunu je " + this.stanje + " rsd");
    }
}
