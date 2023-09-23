import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /*ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(3);
        integers.add(2);
        integers.add(6);

        //integers.forEach((i) -> System.out.println(i));

        integers.forEach(System.out::println);*/

        /*ArrayList<Bisiklet> arrayList = new ArrayList<Bisiklet>();
        arrayList.add(new Bisiklet("X Marka",8));
        arrayList.add(new Bisiklet("Y Marka",3));
        arrayList.add(new Bisiklet("Z Marka",21));
        arrayList.add(new Bisiklet("Q Marka",18));

        BisikletKarsilastirici bisikletKarsilastirici = new BisikletKarsilastirici();

        Collections.sort(arrayList,bisikletKarsilastirici::compare);

        arrayList.forEach(System.out::println);*/

        List<String> markalar = new ArrayList<String>();
        markalar.add("X Marka");
        markalar.add("Y Marka");
        markalar.add("Z Marka");

        List<Bisiklet> bisikletler = markalar.stream().map(Bisiklet::new).collect(Collectors.toList());
        bisikletler.forEach(System.out::println);

    }
}