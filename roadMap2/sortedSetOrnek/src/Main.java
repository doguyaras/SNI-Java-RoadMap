import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /*SortedSet<String> sortedSet = new TreeSet<String>();
        sortedSet.add("Ahmet");
        sortedSet.add("Mehmet");
        sortedSet.add("Ertuğ");
        sortedSet.add("Göktuğ");
        sortedSet.add("Tuğrul");

        Iterator<String> iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }*/

        SortedSet<Ogrenci> sortedSet = new TreeSet<>();
        sortedSet.add(new Ogrenci(5,"Ayşe"));
        sortedSet.add(new Ogrenci(2,"Ahmet"));
        sortedSet.add(new Ogrenci(3,"Emre"));
        sortedSet.add(new Ogrenci(4,"Ayşe"));

        System.out.println(sortedSet.size());

        Iterator<Ogrenci> iterator= sortedSet.iterator();
        while (iterator.hasNext()) {
            Ogrenci next =  iterator.next();
            System.out.println(next);
        }


    }
}