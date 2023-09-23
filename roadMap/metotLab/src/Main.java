public class Main {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.isim = "Doğukan";
        ogrenci.yas = 25;

        Main main = new Main();
        main.ogrenciBilgileri(ogrenci);

        System.out.println(ogrenci.isim);

    }

    public void ogrenciBilgileri(final Ogrenci ogrenci){

        ogrenci.isim = "Muhammet";
        System.out.println(ogrenci.isim);
        System.out.println(ogrenci.yas);
    }

}