import java.util.*;

public class Main {
    //Bilet satış uygulaması
    public static void main(String[] args) {

        /*Bilet bilet = new Bilet(1,new Date(),25.0f);
        Koltuk koltuk = new Koltuk(1,bilet);
        System.out.println(koltuk);*/

        Random random = new Random();
        ArrayList<Bilet> biletListesi = new ArrayList<Bilet>();
        for (int i = 0; i < 100; i++) {
            Bilet bilet = new Bilet(random.nextInt(1000), new Date(), random.nextFloat() * 100);
            biletListesi.add(bilet);
        }
        ArrayList<Koltuk> koltukListesi = new ArrayList<Koltuk>();
        Scanner scanner = new Scanner(System.in);
        int secim = 0;
        int koltukNumarasi = 0;
        System.out.print("Lütfen bir seçim yapiniz (1 Bilet Al), (0 Çıkış yap): ");
        while ((secim = scanner.nextInt()) != 0) {
            Bilet bilet = biletListesi.get(random.nextInt(biletListesi.size()));
            biletListesi.remove(bilet);
            Koltuk koltuk = new Koltuk(++koltukNumarasi, bilet);
            koltukListesi.add(koltuk);
            System.out.println(koltuk);
            System.out.println(biletListesi.size());
            System.out.print("Lütfen bir seçim yapiniz (1 Bilet Al), (0 Çıkış yap): ");

        }
        scanner.close();

        System.out.println("Satılan bilet sayısı: " + koltukListesi.size());
        Iterator<Koltuk> iterator = koltukListesi.iterator();
        while (iterator.hasNext()) {
            Koltuk next = iterator.next();
            System.out.println(next);
        }

        /*Iterator<Bilet> iterator = biletListesi.iterator();
        while (iterator.hasNext()) {
            Bilet next = iterator.next();
            System.out.println(next);
        }*/

    }
}