public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            throw exception;
        } finally {
            System.out.println("Program bu satıra ulaşamadı.");
        }


    }
}