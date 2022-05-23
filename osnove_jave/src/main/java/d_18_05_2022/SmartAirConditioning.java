package d_18_05_2022;

//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu: Proizvoljno :)
//U glavnom programu kreirati minimum 2 objekta klase
// SmartAirConditioning i za svaki od njih pozvati metodu za stampu
public class SmartAirConditioning {
    public String marka;
    public double temperaturaMax;
    public double temperaturaMin;
    public String modH;
    public String modG;

    public void Stampa() {
        System.out.print("Marka klime " + marka + " moze da " + modH + " " + temperaturaMin);
        System.out.println(" i da " + modG + " " + temperaturaMax);
    }


}
