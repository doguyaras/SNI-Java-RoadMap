public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        //değişken isimlendirmeleri java'da camelCase yazılır
        String ortaMetin = "İlginizi çekebilir..";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.20;
        double dolarBugun = 18.30;

        boolean dolarDustuMu = true;

        String okYonu = "";

        if (dolarBugun<dolarDun){

            okYonu = "down.swg";
            System.out.println(okYonu);
            dolarDustuMu = false;
        }
        else if (dolarBugun == dolarDun){
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }

        System.out.println("---------------------");

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};

        for(String kredi:krediler){
            System.out.println(kredi);
        }

    }
}