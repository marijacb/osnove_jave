package d_31_05_2022_zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class OsobaMain {
    public static void main(String[] args) {
        ArrayList<Igrac> Igraci = new ArrayList<Igrac>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < Igraci.size(); i++) {
            System.out.println("Unesi ime igraca: ");
            String t = s.next();
            System.out.println("Unesi JMBG");
            String x = s.next();
            System.out.println("Unesi godinu rodjenja: ");
            int g = s.nextInt();
            System.out.println("Unesi poziciju koju igra: ");
            String p = s.next();
            System.out.println("Unesi da li je kapiten: ");
            boolean k = s.nextBoolean();

            Igrac j = new Igrac();
            j.setPunoIme(t);
            j.setJmbg(x);
            j.setGodinaRodjenja(g);
            j.setPozicija(p);
            j.setKapiten(k);


            Igraci.add(j);
        }

        for (int i = 0; i < Igraci.size(); i++) {
            Igrac jj = Igraci.get(i);
            jj.stampa();
            System.out.println(jj.getPunoIme() + " , " + jj.getJmbg() + ", "+ jj.getGodinaRodjenja()  + ", " + jj.getBrojKojiNosi()
                    + ", "+ jj.getPozicija() );
        }



    }

}