package d_24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;


public class ZelenaKartonNizMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi N");
        int n = s.nextInt();
        ArrayList<ZeleniKarton> kartoni = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesi Ime i prezime studenta: ");
            String student = s.next();
            System.out.println("Unesi broj indexa");
            String index = s.next();
            System.out.println("Naziv predmeta: ");
            String predmet = s.next();
            System.out.println("Unesi ime i prezime profesora: ");
            String profesor = s.next();
            System.out.println("Unesi ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton a = new ZeleniKarton();
            a.setPunoImeStudenta(student);

            a.setBrojIndexa(index);
            a.setPunoImeProfesora(profesor);
            a.setOcena(ocena);

            kartoni.add(a);

        }
        for (int i = 0; i < kartoni.size(); i++) {
            kartoni.get(i).stampa();

        }
        double zbirOcena = 0;
        for (int i = 0; i <kartoni.size() ; i++) {
            zbirOcena = zbirOcena + kartoni.get(i).getOcena();

    }
        double prsecnaOcena = zbirOcena/n;
        System.out.println("Prosecna ocena je: " + prsecnaOcena);
}
}
