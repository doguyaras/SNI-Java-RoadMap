import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {

        Vector<Kitap> vector = new Vector<Kitap>();
        vector.add(new Kitap("X",2020,new Yazar("Ali","CAN")));
        vector.add(new Kitap("Y",2019,new Yazar("Göktuğ","Çalışkan")));
        vector.add(new Kitap("Z",2000,new Yazar("Seyhan","Yıldız")));
        vector.add(new Kitap("A",2023,new Yazar("Doğukan","Yaraş")));
        vector.add(new Kitap("B",2022,new Yazar("Doğu","Yaraş")));

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        /*Iterator<Kitap> iterator = vector.iterator();
        while (iterator.hasNext()){
            Kitap next = iterator.next();
            System.out.println(next);
        }*/

        for (Kitap kitaplar:vector){
            System.out.println(kitaplar);
        }

        System.out.println("--------------------------");

        System.out.println("Tersten yazim: ");

        for (int i = vector.size() - 1; i >= 0 ; i--) {
            Kitap kitap = vector.get(i);
            System.out.println(kitap);
        }

    }
}
