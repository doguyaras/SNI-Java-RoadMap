import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet) {
        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisi.getCinsiyet().equals(cinsiyet)) {
                System.out.println(kisi);
            }

        }
    }

    public static void yasaGoreListele(List<Kisi> kisiler, int yas) {
        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisi.getYas() >= yas) {
                System.out.println(kisi);
            }

        }
    }

    public static void yasAraliginaGoreListele(List<Kisi> kisiler, int min, int max) {
        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisi.getYas() > min && kisi.getYas() <= max) {
                System.out.println(kisi);
            }

        }
    }

    public static void kisiFiltrele(List<Kisi> kisiler, KisiFiltresi kisiFiltresi) {

        /*for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisiFiltresi.filtrele(kisi)) {
                System.out.println(kisi);
            }*/

         for(Kisi k:kisiler){
             if (kisiFiltresi.filtrele(k)){
                 System.out.println(k);
             }
         }
        }


    public static void main(String[] args) {

        Kisi kisi1 = new Kisi("Ali Can", LocalDate.parse("1990-03-23"), "ali.can@example.com", Kisi.Cinsiyet.ERKEK);
        Kisi kisi2 = new Kisi("Seyhan Çalışkan", LocalDate.parse("1998-01-02"), "seyhan@example.com", Kisi.Cinsiyet.KADIN);
        Kisi kisi3 = new Kisi("Tuğrul Yılmaz", LocalDate.parse("2013-07-04"), "tugrul@example.com", Kisi.Cinsiyet.ERKEK);

        ArrayList<Kisi> kisiler = new ArrayList<Kisi>();
        kisiler.add(kisi1);
        kisiler.add(kisi2);
        kisiler.add(kisi3);

        //cinsiyeteGoreFiltrele(kisiler, Kisi.Cinsiyet.ERKEK);
        //yasaGoreListele(kisiler, 20);
        //yasAraliginaGoreListele(kisiler,10,25);

        /*kisiFiltrele(kisiler, new KisiFiltresi() {
            @Override
            public boolean filtrele(Kisi kisi) {
                 return kisi.getYas() > 5 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
            }
        });*/

        kisiFiltrele(kisiler, (k) -> k.getYas() >= 15 && k.getCinsiyet().equals(Kisi.Cinsiyet.KADIN));


        /*System.out.println(kisi1);
        System.out.println(kisi2);
        System.out.println(kisi3);*/

    }
}