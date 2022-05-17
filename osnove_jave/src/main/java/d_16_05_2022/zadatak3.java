package d_16_05_2022;
//Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//}
public class zadatak3 {

public static void main(String[]args){
    podaciKorisnika("1704990738557", "Marija", "Barjaktarevic", "1990", true);

        }
        static void podaciKorisnika(String jmbg, String ime, String prezime, String godRodjenja, boolean aktivan){
            System.out.println("jmbg: " + jmbg);
            System.out.println("ime: " + ime);
            System.out.println("prezime: " + prezime);
            System.out.println("godina rodjenja: " + godRodjenja);
            System.out.println("Aktivan: " + aktivan);
    }



}