public class Main {
    public static void main(String[] args) {

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }

    public static void sayiBulmaca(){
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
            mesajVer("Sayı bulundu: "+aranacak);
        }else {
            mesajVer("Sayı mevcut değil: "+aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }


}