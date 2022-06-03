package d_02_06_2022;

import java.util.ArrayList;

public class SektorMain {
    public static void main(String[] args) {

        Sektor k = new Sektor("Sektor 1", 40000);
        Sektor y = new Sektor("Sektor 2", 50000);

        ArrayList<Sektor> sektori = new ArrayList<Sektor>();
        sektori.add(k);
        sektori.add(y);
        Radnik Nesa = new Magacioner("Nebojsa NEdeljkovic");
        Nesa.zaposliUSektor(k);
        Nesa.plataRadnika();

        Menadzer Jovan = new Menadzer("Jovan Jovanovic");
        Jovan.zaposliUSektor(y);
        Jovan.plataRadnika();

        System.out.println("Nesa ima platu " + Nesa.plataRadnika());
        System.out.println("Jovan ima platu " + Jovan.plataRadnika());

    }
}