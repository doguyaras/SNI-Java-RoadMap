public class Main {
    public static void main(String[] args) {

        /*Kalem kursunKalem = new Kalem();
        kursunKalem.marka = "A Marka";
        kursunKalem.tip = "Kurşun";
        kursunKalem.doldurulabilir = false;
        kursunKalem.silinebilir = true;

        kursunKalem.yaz("Hello World!");
        kursunKalem.sil();
        kursunKalem.tekrarDoldur();

        Kalem dolmaKalem = new Kalem();
        dolmaKalem.marka = "B Kalem";
        dolmaKalem.tip = "Dolma kalem";
        dolmaKalem.doldurulabilir = true;
        dolmaKalem.silinebilir = false;

        dolmaKalem.yaz("Java ile OOP");
        dolmaKalem.tekrarDoldur();
        dolmaKalem.sil();*/

        /*Telefon telefon = new Telefon();
        telefon.marka = "X Marka";
        telefon.model = "Y Model";
        telefon.tip = TelefonTipi.CEP;
        telefon.mobilVeri = true;
        telefon.wifi = true;

        telefon.aramaYap("3453534");
        telefon.aramayiSonlandir();
        telefon.mesajGonder("Merhaba, Nasılsın?");*/

        Kopek kangal = new Kopek();
        kangal.cins = "Sivas Kangal";
        kangal.boyut = Boyut.BUYUK;
        kangal.renk = Renk.SIYAH;
        kangal.yas = 6;

        kangal.yemekYe();
        kangal.otur();
        kangal.kos();
        kangal.uyu();

    }
}