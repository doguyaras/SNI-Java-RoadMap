import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    //filter -> sorted -> map

    public static void main(String[] args) {

        /*Stream.of(1, 4, 5, 6, 7)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        System.out.println("Test filter");
                        return integer > 2;
                    }
                }).anyMatch(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        System.out.println("Test anyMatch");
                        return integer == 5;
                    }
                });*/

        Stream.of("b1", "a2", "d3", "e1")
                .map((Function<String, String>) s -> {
                    System.out.println("Map");
                    return s.toUpperCase();
                })
                .filter((Predicate<String>) s -> {
                    System.out.println("Filter");
                    return s.startsWith("A");
                })
                .forEach(System.out::println);


    }
}