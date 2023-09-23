public class Main {
    public static void main(String[] args) {

        int sayilar[] = new int[]{1,2,5,7,9};
        int aranacak = 8;
        boolean mevcutMu = false;

        for (int sayi:sayilar) {
            if(aranacak == sayi){
                mevcutMu = true;
                break;
            }
        }

        if(mevcutMu){
            System.out.println("Sayı bulundu!");
        }else {
            System.out.println("Sayı mevcut değil.");
        }


    }
}