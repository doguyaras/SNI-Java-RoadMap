import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        ogrenciler.add(new Ogrenci(1, "Ali CAN", 80));
        ogrenciler.add(new Ogrenci(2, "Seyhan Çalışkan", 90));
        ogrenciler.add(new Ogrenci(3, "Ertuğ Yılmaz", 50));
        ogrenciler.add(new Ogrenci(0, "Göktuğ Sancak", 70));

        ogrenciler.forEach((o) -> System.out.println(o));

       /* Collections.sort(ogrenciler, new Comparator<Ogrenci>() {
            @Override
            public int compare(Ogrenci o1, Ogrenci o2) {
                return o1.getNotOrtalamasi() - o2.getNotOrtalamasi();
            }
        });*/

        Collections.sort(ogrenciler,(a,b) -> b.getAd().compareTo(a.getAd()));

        System.out.println("----------------------------");
        ogrenciler.forEach((o)-> System.out.println(o));

        String a ="asd";
        a.equals("asd");


    }
}