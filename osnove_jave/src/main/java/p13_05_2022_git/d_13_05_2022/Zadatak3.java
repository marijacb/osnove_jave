package d_13_05_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Napisati program koji ima niz brojeva duzine 10.
// Niz je fiksnih vrednosti (ne u nosi ih korisnik)
// a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza.
// Pre i nakon izbacivanja ispisati niz na ekranu.
// Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
//Primer izvrsenja 1:
//Niz je: 1,3,5,6,7,1,3,4,2,9
//Unesite poziciju za izbacivanje: 5
//Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Niz je: ");
        for (int i = 0; i < 10; i++) {
            int randomBroj = random.nextInt(10);
            niz.add(randomBroj);
        }
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ",");
        }
        System.out.println(" ");
        System.out.print("Unesi poziciju za izbacivanje: ");
        int pozicija = s.nextInt();
        System.out.print("Niz nakon brisanja je");
        for (int i = 0; i < niz.size(); i++) {
            niz.remove(pozicija);
            System.out.print(niz.get(i) + ",");
        }

    }
}