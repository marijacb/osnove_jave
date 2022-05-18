package p_16_05_2022;
//7.Zadatak
//Napisati metodu koja vraca suprotno negativni
// broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11
public class zadatak7 {
    public static void main(String[] args) {
        int broj = -10;
        negativanBroj(broj);
        System.out.println("Vraca broj" + negativanBroj(broj));


    }static Integer negativanBroj (int broj){
     return (broj * (-1));
    }
}
