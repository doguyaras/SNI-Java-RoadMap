import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        /*Supplier<Urun> supplier = new Supplier<Urun>() {
            @Override
            public Urun get() {
                Urun urun = new Urun(1,"Laptop",1000);
                return urun;
            }
        };*/

        //Supplier<Urun> supplier = () -> new Urun(1, "Laptop", 1000);

        Supplier<List<Urun>> supplier = () -> {
            List<Urun> list = new ArrayList<Urun>();
            list.add(new Urun(1,"Laptop",1000));
            list.add(new Urun(2,"Telefon",600));
            list.add(new Urun(3,"Klavye",100));
            return list;
        };

        /*System.out.println(supplier.get());*/
        supplier.get().forEach((u)-> System.out.println(u));

    }
}