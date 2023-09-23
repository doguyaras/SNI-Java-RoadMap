import java.util.*;

public class HashMapMain {

    public static void main(String[] args) {

        HashMap<Integer, Sehir> hashMap = new HashMap<Integer, Sehir>();
        hashMap.put(34, new Sehir("İstanbul", 20_000_000));
        hashMap.put(35, new Sehir("İzmir", 6_000_000));
        hashMap.put(6, new Sehir("Ankara", 8_000_000));

        System.out.println(hashMap.size());
        //System.out.println(hashMap.get(34));

        /*Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("[" + key + "]" + " " + hashMap.get(key));
        }*/

        /*Collection<Sehir> values = hashMap.values();
        Iterator<Sehir> iterator = values.iterator();
        while (iterator.hasNext()){
            Sehir next = iterator.next();
            System.out.println(next);
        }*/

        Set<Map.Entry<Integer, Sehir>> entries = hashMap.entrySet();
        Iterator<Map.Entry<Integer, Sehir>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Sehir> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
            System.out.println("----------------");
        }

    }
}
