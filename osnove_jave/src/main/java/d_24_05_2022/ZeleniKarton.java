package d_24_05_2022;

//Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
public class ZeleniKarton {
    private String punoImeStudenta;
    private String brojIndexa;
    private String nazivPredmeta;
    private String punoImeProfesora;
    private int ocena;

    ZeleniKarton() {
    }

    public ZeleniKarton(String punoImeStudenta, String brojIndexa, String nazivPredmeta, String punoImeProfesora, int ocena) {
        this.punoImeStudenta = punoImeStudenta;
        this.brojIndexa = brojIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.punoImeProfesora = punoImeProfesora;
        this.ocena = ocena;
    }

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean rezultatIspita(){
        if(ocena>5){
            System.out.println("polozen ispit");
            return true;
        }
        else {
            System.out.println("ispit nije polozen");
            return false;
        }
    }public void stampa() {
        System.out.println("(" + this.nazivPredmeta + ") - (" + this.ocena + ")");
        System.out.println("Student: " + this.punoImeStudenta + ", " + brojIndexa);
        System.out.println("Profesor: " + this.punoImeProfesora);
        System.out.println(this.rezultatIspita());
    }}