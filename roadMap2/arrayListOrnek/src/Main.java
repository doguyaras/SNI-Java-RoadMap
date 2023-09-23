import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String line = null;
        while (!(line = scanner.nextLine()).equals("exit")) {
            arrayList.add(line);
        }
        /*Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }*/

        /*for (String list : arrayList) {
            System.out.println(list);
        }*/

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((i) + " " + arrayList.get(i));
        }

        System.out.println(arrayList.size());

        arrayList.remove(2);

        System.out.println(arrayList.size());
    }
}