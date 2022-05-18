package d_16_05_2022;

import java.util.Scanner;

//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /
public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("unesi n:");
        int n = s.nextInt();
        System.out.println("unesi karakter: ");
        String karakter = s.next();
        mojaMetoda(n, karakter);

    }

    static void mojaMetoda(int n, String karakter) {
        System.out.println("stampa se: ");
        for (int i = 0; i < n; i++) {

            System.out.print(karakter);
        }
    }


}
