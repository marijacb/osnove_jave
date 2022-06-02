package d_30_05_2022;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String punoImeProfesora;

    public Ispit(){}
    public Ispit(String nazivPredmeta, int ocena, String punoImeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.punoImeProfesora = punoImeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }
    public boolean daLiJePolozen(){
        if(this.ocena>5){
            return true;
        }
        return false;
    }
    public void stampa(){
        System.out.println("( " + nazivPredmeta + ") _ ("  + punoImeProfesora + ") - (" + ocena + ")");
    }
}
