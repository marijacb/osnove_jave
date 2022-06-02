package d_31_05_2022_zadatak1;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tip;

    public Trener(String punoIme, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    @Override
    public void stampa(){
        System.out.println("Trener je: (" + this.tip + "Godine iskustva: (" + this.godineIskustva + ") ");
    }
}
