package d_20_05_2022;

public class FacebookPost {
    private String ImeIPrezimeKoJeObjavio;
    private String ImeIPrezimeKodKoga;
    private String TekstObjave;
    private int BrojLike;
    private int BrojDeljenja;

    public FacebookPost(int BrojLike, int BrojDeljenja) {
        this.BrojLike = BrojLike;
        this.BrojDeljenja = BrojDeljenja;
    }

    public String getImeIPrezimeKoJeObjavio() {
        return ImeIPrezimeKoJeObjavio;
    }
    public void setImeIPrezimeKoJeObjavio(String imeIPrezimeKoJeObjavio){
        ImeIPrezimeKoJeObjavio=imeIPrezimeKoJeObjavio;
    }

    public String getImeIPrezimeKodKoga() {
        return ImeIPrezimeKodKoga;
    }

    public void setImeIPrezimeKodKoga(String imeIPrezimeKodKoga){
        ImeIPrezimeKodKoga=imeIPrezimeKodKoga;
    }
    public String getTekstObjave(){
        return TekstObjave;
    }
    public void  setTekstObjave(String tekstObjave){
        TekstObjave = tekstObjave;
    }
    public int getBrojLike(){
        return BrojLike;
    }

    public int getBrojDeljenja() {
        return BrojDeljenja;
    }
    public void like (){
        this.BrojLike = this.BrojLike +1;

    }public void dislike() {
        if (this.BrojLike > 0) {
        }
        this.BrojLike = this.BrojLike - 1;
    }
    public  void  share(){
        this.BrojDeljenja = this.BrojDeljenja +1;
    }
    public void print() {
        System.out.println(this.ImeIPrezimeKoJeObjavio + " >>>" + this.ImeIPrezimeKodKoga);
        System.out.println(this.TekstObjave);
        System.out.println("Likes: " + this.BrojLike + " | " + this.BrojDeljenja);
    }
}
