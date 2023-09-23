import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KitapMain {

    public static void main(String[] args) {

        HashMap<Integer,Kitap> hashMap = new HashMap<Integer,Kitap>();

        hashMap.put(2,new Kitap("Y",new Date(),"Zeynep Güler"));
        hashMap.put(3,new Kitap("Z",new Date(),"Tuğrul Dönmez"));
        hashMap.put(1,new Kitap("X",new Date(),"Ali Can"));

        System.out.println(hashMap.size());

        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key);
            System.out.println(hashMap.get(key));
            System.out.println("-------------------------");
        }
    }
}
