public class Main {
    public static void main(String[] args) {

        int number = 7;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println("Bu bir mükemmel sayıdır!");
        } else {
            System.out.println("Bu bir mükemmel sayı değildir!");
        }

    }
}