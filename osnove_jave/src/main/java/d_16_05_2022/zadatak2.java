package d_16_05_2022;

import java.util.Scanner;

//Napisati funkciju koja za dva jednocifrena broja koja su
// ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("unesi x: ");
        String x = s.next();
        System.out.println("unesi y");
        String y = s.next();
        novaVrednost(x,y);

    }

    static void novaVrednost(String x, String y) {
        String xy = x + y;
        System.out.println("Nova vrednost " + x + y);
    }


}
