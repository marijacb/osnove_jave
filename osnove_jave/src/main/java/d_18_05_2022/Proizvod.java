package d_18_05_2022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaG;



public void Stampaj(){
    System.out.println("Naziv proizvoda " + naziv + " cena proizvoda " + cena + " tezina proizvoda " + tezinaG);
}}

