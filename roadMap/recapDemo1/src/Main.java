public class Main {
    public static void main(String[] args) {

        int sayi1 = 30;
        int sayi2 = 55;
        int sayi3 = 40;

        int enBuyuk;
        enBuyuk = sayi1;

        if(sayi2>enBuyuk){
            enBuyuk = sayi2;
        }if(sayi3>enBuyuk){
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: "+enBuyuk);

    }
}