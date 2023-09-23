import java.util.*;

public class Main {

    public static void main(String[] args) {

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(2);
        navigableSet.add(5);
        navigableSet.add(1);
        navigableSet.add(3);
        navigableSet.add(3);

        //System.out.println(navigableSet.size());

        /*Iterator<Integer> iterator = navigableSet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

        System.out.println(navigableSet.ceiling(0)); //Verilen sayıdan sonra en büyük
        System.out.println(navigableSet.floor(9)); //Verilen sayıdan sonra en küçük
        System.out.println(navigableSet.lower(2));//Verilen sayıdan küçük
        System.out.println(navigableSet.higher(4));//Verielen sayıdan büyük*/

        SortedSet<Integer> sortedSet = navigableSet.headSet(5,true);
        Iterator<Integer> iterator2 = sortedSet.iterator();

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


    }
}