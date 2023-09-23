import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ogrenci> arrayList = new ArrayList<Ogrenci>();
        arrayList.add(new Ogrenci(1, "Ali Can", 16));
        arrayList.add(new Ogrenci(3, "Tuğrul Çalışkan", 7));
        arrayList.add(new Ogrenci(2, "Zeynep Güler", 14));
        arrayList.add(new Ogrenci(4, "Seyhan Koşar", 7));

       /* List<Ogrenci> collect = arrayList.stream()
                .filter((o)->o.getYas() > 8)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);*/

        /*Map<Integer, List<Ogrenci>> gruplama = arrayList
                .stream()
                .collect(Collectors.groupingBy(o -> o.getYas()));

        Set<Integer> keySet = gruplama.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " " + gruplama.get(key));
        }*/

        /*Double yasOrtalamasi = arrayList.stream()
                .collect(Collectors.averagingInt(Ogrenci::getYas));
        System.out.println(yasOrtalamasi);*/

        IntSummaryStatistics istatistik = arrayList.stream()
                .collect(Collectors.summarizingInt(Ogrenci::getYas));
        System.out.println(istatistik);


    }
}