import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<Integer>();

        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(20);

        integers.add(2,55);

        System.out.println("Eleman sayısı: " + integers.size());

        Iterator<Integer> iterator = integers.iterator();
        while ((iterator.hasNext())) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        System.out.println(integers.get(0));
        System.out.println(integers.get(integers.size()-1));

        integers.addFirst(33);
        System.out.println(integers.getFirst());

        integers.addLast(44);
        System.out.println(integers.getLast());

        int indexOf = integers.indexOf(33);
        System.out.println(indexOf);

        System.out.println(integers.indexOf(20));
        System.out.println(integers.lastIndexOf(20));

        integers.remove();
        integers.remove(4);
        integers.remove(33);
    }
}