package d_30_05_2022.d_13_05_2022;

import com.sun.source.tree.NewArrayTree;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti
// (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju
// vrednosti elemenata iznad, ispod, sleve i sdesne strane tog elementa
// (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!
//
//U projektu kreirati paket za ovaj domaci d13_05_2022 i
// u njemu klasu Zadatak1.java i postavite tekst zadataka u komentaru a zatim
// commit-ujte promenu i push-ujte na github sa porukom “Domaci 13.05.2022 Zadatak 1”
public class zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 25; i++) {
            int randomBroj = random.nextInt(10);
            niz.add(randomBroj);
        }
        for (int i = 0; i < niz.size(); i++) {
            System.out.printf(niz.get(i) + ",");
            if (i % 5 == 4) {
                System.out.println();
            }}

        for (int i = 0; i < niz.size(); i++) {
            System.out.println("unesi poziciju");
            int p = s.nextInt();
            System.out.println("suma je");
            if(p>0){
                int suma = (p-0)+(p+1)+(p+5)+(p-5);
                System.out.println(suma);
            }


        }



        }
        }

