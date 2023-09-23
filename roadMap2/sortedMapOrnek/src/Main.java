import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<String, String>();

        sortedMap.put("Ev", "Home");
        sortedMap.put("Kalem", "Pencil");
        sortedMap.put("Araba", "Car");

        System.out.println(sortedMap.size());
        System.out.println(sortedMap.get("Araba"));

        Set<String> keySet = sortedMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + sortedMap.get(key));
        }
    }
}