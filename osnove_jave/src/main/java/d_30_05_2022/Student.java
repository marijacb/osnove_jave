package d_30_05_2022;

import java.util.ArrayList;

public class Student {
    private String brojIndexa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> NizISpita;
    private Ispit ispit;
    private Ispit ocena;
    private Ispit punoImeProfesora;


    public Student() {
        this.NizISpita = new ArrayList<Ispit>();
    }

    public Student(String brojIndexa, String punoIme, String tipStudija) {
        this.brojIndexa = brojIndexa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
        this.NizISpita = new ArrayList<Ispit>();
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNizISpita() {
        return NizISpita;
    }

    public void dodajIspit(Ispit ispit) {
        this.NizISpita.add(ispit);

    }

    public double prosek() {
        int count = 0;
        double prosek = 0;
        double suma = 0;
        for (int i = 0; i < this.NizISpita.size(); i++) {
            if (this.NizISpita.get(i).daLiJePolozen()) {
                suma = suma + this.NizISpita.get(i).getOcena();
            }
        }
        for (int i = 0; i < this.NizISpita.size(); i++) {
            if (this.NizISpita.get(i).daLiJePolozen()) {
                count = count + 1;
            }
        }
        prosek = prosek + suma / count;
        return prosek;
    }

    public void stampa() {
        System.out.println("(" + this.brojIndexa + ") - (" + this.punoIme + ") - (" + this.tipStudija + " )");
        System.out.println("Predmeti su: ");
        for (int i = 0; i <this.NizISpita.size() ; i++) {
            this.NizISpita.get(i).stampa();

        }
        System.out.println("Prosecna ocena je: " + this.prosek());
    }
}
