import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Arrays.asList("İstanbul", "Ankara", "Bursa", "İzmir")
                .parallelStream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        System.out.println("Test: " + Thread.currentThread().getName());
                        return true;
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        System.out.println("Apply: " + Thread.currentThread().getName());
                        return s.toUpperCase();
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println("Accept: " + Thread.currentThread().getName());
                    }
                });

    }
}