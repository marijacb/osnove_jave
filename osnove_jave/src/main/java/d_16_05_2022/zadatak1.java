package d_16_05_2022;
//Napisati metodu stampajVrednostZa10Vecu u
// kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.


import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("unesi x: ");
        int x = s.nextInt();
        stampajVrednost(x);

    }
    static void stampajVrednost (int x){
       int y = x + 10;
        System.out.println("Prosledjena vrednost je:" +y);

    }}
