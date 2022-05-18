package p_16_05_2022;

//Zadatak
//Napisati dve metode, jedna metoda sluzi za stampanje imena
// a druga sluzi za stampanje prezimena. U glavnom programu pozvati metode na izvrsenje
// tako da se 5 puta ispise ime i prezime u istom redu.
//Primer izvrsenja:
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
public class zadatak2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            stampanjeImena();
            stampanjePrezimena();
        }
    }
    static void stampanjeImena() {
        System.out.print("Marija ");

    }
    static void stampanjePrezimena() {
        System.out.println("Barjaktarevic");
    }
}

