import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(34, "İstanbul");
        hashMap.put(35, "İzmir");
        hashMap.put(6, "Ankara");
        //hashMap.put(34,"İstanbul2");

        System.out.println(hashMap.size());
        System.out.println(hashMap.get(10));

        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.print(key + " ");
            String value = hashMap.get(key);
            System.out.println(value);
        }
    }
}