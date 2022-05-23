package d_18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning klima = new SmartAirConditioning();
        klima.marka = "samsung";
        klima.temperaturaMax = 35;
        klima.temperaturaMin = 16;
        klima.modG = "greje";
        klima.modH = "hladi";
        klima.Stampa();

        klima.marka = "LG";
        klima.temperaturaMax = 35;
        klima.temperaturaMin = 16;
        klima.modG = "greje";
        klima.modH = "hladi";
        klima.Stampa();
    }
}
