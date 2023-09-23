public class Main {
    public static void main(String[] args) {

        Kisi kisi = new Kisi();
        kisi.setIsim("Doğukan Yaraş");

        System.out.println(kisi.getIsim());

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setIsim("Ali CAN");
        ogrenci.setDers("Matematik");
        System.out.println(ogrenci.getIsim());
        System.out.println(ogrenci.getDers());

        UnivOgrenci univOgrenci = new UnivOgrenci();
        univOgrenci.setIsim("Doğu Yaraş");
        univOgrenci.setDers("Bilgisayar Temelleri 101");
        univOgrenci.setKampus("AVCILAR");
        System.out.println(univOgrenci.getIsim());
        System.out.println(univOgrenci.getDers());
        System.out.println(univOgrenci.getKampus());

        System.out.println("------------------");

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setIsim("Ahmet Yilmaz");
        ogretmen.setOkul("X ilk öğretim okulu");
        System.out.println(ogretmen.getOkul());
        System.out.println(ogretmen.getIsim());

        System.out.println("------------------");

        Doktor doktor = new Doktor();
        doktor.setIsim("Emre Aydın");
        doktor.setBrans("Beyin cerrahı");
        System.out.println(doktor.getIsim());
        System.out.println(doktor.getBrans());



    }
}