import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    //Kullanıcıdan alan değerleri linkedHashSet içerisinde unique olarak saklamak

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Çıkmak için -1 giriniz: ");
        LinkedHashSet<Integer> integers = new LinkedHashSet<Integer>();
        int i = 0;
        while ((i = scanner.nextInt()) != -1){
            integers.add(i);
        }
        System.out.println("Sayı adedi: "+integers.size());
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}