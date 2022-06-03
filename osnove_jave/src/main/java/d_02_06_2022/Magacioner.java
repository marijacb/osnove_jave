package d_02_06_2022;

public class Magacioner extends Radnik {
    public Magacioner(String punoIme) {
        super(punoIme);
    }

    public double brojSektora() {
        double brojSektora = 0;
        for (int i = 0; i < this.nizSektora.size(); i++) {
            brojSektora = brojSektora + 1;
        }
        return brojSektora;
    }

    private double prosecnaPlata() {
        double suma = 0;
        for (int i = 0; i < this.nizSektora.size(); i++) {
            suma = suma + nizSektora.get(i).getPlata();
        }
        return suma / brojSektora() * 0.5;
    }
    @Override
    public double plataRadnika(){
        double p = prosecnaPlata()*brojSektora();
        return p;
    }
}
