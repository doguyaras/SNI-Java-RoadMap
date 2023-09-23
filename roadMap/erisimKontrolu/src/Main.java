import com.example.Araba;

public class Main {
    public static void main(String[] args) {

        /*Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Doğukan";
        ogrenci.soyad = "Yaraş";
        ogrenci.numara = 1 ;

        ogrenci.numarayiYazdir();

        Araba araba = new Araba();
        araba.marka = "Honda";*/

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.numara = 1;
        ogrenci.ad = "Doğukan";
        ogrenci.soyad = "Yaraş";
        ogrenci.setYas(-12);

        ogrenci.bilgileriYazdir();

    }
}