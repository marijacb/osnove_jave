package p_16_05_2022;

import java.util.Scanner;

//4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
// za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
// U gravnom programu pozvati nekoliko puta funkciju sa razlicitim
// prosledjenim vrednostima.
public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("unesi a: ");
        int a = s.nextInt();
        System.out.println("unesi b:");
        int b = s.nextInt();
        operacija(a, b);
    }
    static void operacija(int a, int b) {
        int zbir = a + b;
        System.out.println("zbir je: " + zbir);
        int razlika = a - b;
        System.out.println("razlika je: " + razlika);
        int kolicnik = a / b;
        System.out.println("kolicnik je: " + kolicnik);
        int proizvod = a * b;
        System.out.println("proizvod je: " + proizvod);

    }
}
