import java.util.*;

public class KisiMain {

    public static void main(String[] args) {

        SortedMap<Integer, Kisi> sortedMap = new TreeMap<Integer, Kisi>();
        sortedMap.put(1, new Kisi("123", "Ali", "Can", Cinsiyet.ERKEK));
        sortedMap.put(2, new Kisi("234", "Zeynep", "Çalışkan", Cinsiyet.KADIN));
        sortedMap.put(3, new Kisi("345", "Ahmet", "Güler", Cinsiyet.ERKEK));


        System.out.println(sortedMap.size());

        Set<Map.Entry<Integer, Kisi>> entries = sortedMap.entrySet();
        Iterator<Map.Entry<Integer, Kisi>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Kisi> entry = iterator.next();
            System.out.println((entry.getKey() + " " + entry.getValue()));
        }

    }
}
