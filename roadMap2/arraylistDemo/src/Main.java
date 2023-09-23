import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList<>();


        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("İstanbul");
        //System.out.println(sayilar.size());
        //System.out.println(sayilar.get(0));
        //sayilar.set(0,100);
        //System.out.println(sayilar.get(0));

        //sayilar.remove(0);
        //sayilar.clear();
        //System.out.println(sayilar.get(0));

        for (Object eleman : sayilar) {
            System.out.println(eleman);
        }


    }
}