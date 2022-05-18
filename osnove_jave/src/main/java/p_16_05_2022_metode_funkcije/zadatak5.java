package p_16_05_2022_metode_funkcije;

import java.util.Scanner;

//Napisati metodu stampajApsolutnuVrednost,
// koja stampa apsolutnu vrednost   prosledjene vrednosti.
public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("unesi a");
        int a = s.nextInt();

        Avrednost(a);
    }
    static void Avrednost(int a){
        a = -a;
        System.out.println("Apsolutna vrednost je: " + a );
    }
}
