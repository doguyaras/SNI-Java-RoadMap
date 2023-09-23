import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);

        int x = 20;
        arrayList.add(x);

        int y = arrayList.get(1);

        arrayList.add(new Integer(5));

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        byte b = 10;
        byte parseByte = Byte.parseByte("12");
        System.out.println(parseByte);

        byte a = Byte.parseByte("2");
        System.out.println();

    }
}