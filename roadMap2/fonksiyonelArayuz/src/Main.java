import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        /*Matematik matematik = new Matematik() {
            @Override
            public void islem(double a, double b) {
                System.out.println(a+b);
            }
        };*/

        /*Matematik matematik = (x, y) -> System.out.println(x + y);
        matematik.islem(10, 20);

        Matematik matematik2 = (x, y) -> System.out.println(x - y);
        matematik2.islem(50,5);*/

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Bursa");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Kayseri");

        //Consumer
        //sehirler.forEach((s)-> System.out.println(s));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        };

        //Predicate'in amacı, kendisine verilen değeri bir koşul içerisinde
        //değerlendirdikten sonra boolean bir değer döndürmektir.

        Predicate<String> predicate2 = (s) -> s.startsWith("B");

        for (int i = 0; i < sehirler.size(); i++) {
            String sehir = sehirler.get(i);
            if(predicate2.test(sehir)){
                System.out.println(sehir);
            }

        }

       /* for (String sehir:sehirler){
            System.out.println(sehir);
        }*/


    }
}