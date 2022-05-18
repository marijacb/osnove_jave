package p_16_05_2022;

//8. Zadatak
//Napisati metodu koja proverava da li je trougao pravougli.
// Metoda prima stranice trougla i hipotenuzu trougla.
// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c
public class zadatak8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 6;
        if (c * c == a * a + b * b) {
            System.out.println("trougao je pravougli");

        } else {
            System.out.println("trougao nije pravougli");
        }

    }

    static Boolean pravougliTrougao(int a, int b, int c) {
        return (c * c == a * a + b * b);


    }
}
