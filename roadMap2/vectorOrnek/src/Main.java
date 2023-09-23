import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>(4);
        vector.add("Kedi");
        vector.add("Köpek");
        vector.add("Kaplan");
        vector.add("At");
        vector.add("Tavşan");

        for (int i = 0; i < vector.size(); i++) {
            String string = vector.get(i);
            System.out.println((i) + " " + string);

        }

        System.out.println(vector.capacity());

        System.out.println(vector.contains("Kedi2"));

        System.out.println(vector.indexOf("Kaplan"));

        vector.clear();
        System.out.println(vector.size());
        System.out.println(vector.capacity());

        /*for (String vectors : vector) {
            System.out.println(vectors);
        }*/
    }
}