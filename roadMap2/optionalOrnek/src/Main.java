import java.util.Optional;

public class Main {

    public static String test(){
        System.out.println("Test çalıştı.");
        return "test";
    }

    public static void main(String[] args) {

        /*Optional<String> bosNesne = Optional.empty();
        System.out.println(bosNesne.isPresent());

        String deger = "Merhaba";
        Optional<String> optional = Optional.of(deger);
        System.out.println(optional.isPresent());

        String s = null;
        //Optional<String> optional2 = Optional.of(s);
        Optional<String> optional2 = Optional.ofNullable(s);
        System.out.println(optional2.isPresent());

        String s2 = "Selam" +
                "";
        if(s2 != null) {
            System.out.println(s2.length());
        }

        Optional<String> optional3 = Optional.ofNullable(s2);
        optional3.ifPresent((x)-> System.out.println(x.length()));
*/
        /*String bosIsım = "Veli";
        String isim = Optional.ofNullable(bosIsım).orElse("Ali");
        System.out.println(isim);

        String sehir = "Ankara";
        String sehir2 = Optional.ofNullable(sehir).orElseGet(() -> "İstanbul");
        System.out.println(sehir2);*/

        String bos = "a";
        String string = Optional.ofNullable(bos).orElse(test());
        String string2 = Optional.ofNullable(bos).orElseGet(Main::test);//eğer null ise test metodunu çalıştırr

        System.out.println(string);
        System.out.println(string2);


    }
}