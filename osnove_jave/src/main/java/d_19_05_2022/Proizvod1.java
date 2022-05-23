package d_19_05_2022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu
// {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima
// vrednost povećanje za koju treba povećati cenu.
// Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
// a povratnu vrednost je cena proizvoda kada se uračuna popust.
// Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
// Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaG;
    public void Stampaj(){
        System.out.println("Naziv proizvoda je " + naziv + "cija je " +cena + " i tezina " + tezinaG);
    }
//    public void PovecajCenu(double povecanjeCene){
//        povecanjeCene = this.cena + povecanjeCene;
//        System.out.println("Naziv proizvoda je " + naziv + "cija je " +cena + " i tezina " + tezinaG);
//    }
//    public double CenaSaPopustom ( double popust){
//        if (popust> 0 && popust<100){
//        popust = cena - (cena  * popust)/100;
//        return  popust;
//    }}
//    public int Postarina(int postarina){
//        if (this.tezinaG>= 100){
//            int postarina==200;
//        }
//        else if (this.tezinaG>=101 && this.tezinaG<=500){
//            int postarina == 400;
//        }
//        else if (this.tezinaG>500){
//           int postarina == 1000;
//        }
//        return postarina;
//    }


}
