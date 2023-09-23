import java.util.Iterator;
import java.util.LinkedList;

public class OgrenciMain {

    public static void main(String[] args) {

        LinkedList<Ogrenci> linkedList = new LinkedList<Ogrenci>();
        linkedList.add(new Ogrenci(1, "Doğukan", "Yaraş"));
        linkedList.add(new Ogrenci(2, "Doğu", "Yaraş"));
        linkedList.add(new Ogrenci(3, "Dou", "Yaras"));

        Iterator<Ogrenci> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Ogrenci ogrenci = iterator.next();
            System.out.println(ogrenci);
        }

        System.out.println("----------------------");

        linkedList.remove(2);

        iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Ogrenci ogrenci = iterator.next();
            System.out.println(ogrenci);
        }
    }
}
