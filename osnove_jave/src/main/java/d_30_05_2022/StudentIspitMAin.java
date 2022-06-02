package d_30_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentIspitMAin {
    public static void main(String[] args) {
        ArrayList<Ispit> A = new ArrayList<Ispit>();
        Ispit mat = new Ispit("Matematika", 6, "Ivan Ivanovic");
        Ispit mat1 = new Ispit("Matematika", 9, "Ivan Ivanovic");
        Ispit mat2 = new Ispit("Matematika", 8, "Ivan Ivanovic");
        Ispit srp = new Ispit("Srpski", 7, "Jelena Ilic");
        Ispit srp1 = new Ispit("Srpski", 9, "Jelena Ilic");
        Ispit srp2 = new Ispit("Srpski", 5, "Jelena Ilic");

        Student s = new Student("234656", "Milica Ilic", "osnovne");
        s.dodajIspit(mat);
        s.dodajIspit(srp);
        s.prosek();
        Student g = new Student("124354", "Jovana Jovic", "master");
        g.dodajIspit(mat2);
        g.dodajIspit(srp2);
        g.prosek();
        Student c = new Student("12865", "Milica Milic", "diplomske");
        c.dodajIspit(mat1);
        c.dodajIspit(srp1);;
        c.prosek();

        s.stampa();
        g.stampa();
        c.stampa();

    }
}