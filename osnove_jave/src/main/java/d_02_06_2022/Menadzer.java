package d_02_06_2022;

public class Menadzer extends Radnik {
    public Menadzer(String punoIme) {
        super(punoIme);
    }

    @Override
    public double plataRadnika() {
        double suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            suma = suma + nizSektora.get(i).getPlata();
        }
        return suma;
    }
}
