import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> sozluk = new HashMap<String, String>();

        sozluk.put("Book", "Kitap");
        sozluk.put("Table", "Masa");
        sozluk.put("Computer", "Bilgisayar");
        //System.out.println(sozluk.size());
        //sozluk.remove("Table");
        //sozluk.remove("Table");
        //sozluk.clear();

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman: " + item + " Değer: " + sozluk.get(item));
        }

        //System.out.println(sozluk.size());
        //System.out.println(sozluk.get("Table"));


    }
}