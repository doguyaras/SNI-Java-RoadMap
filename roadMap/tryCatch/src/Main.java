import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("1. sayıyı giriniz: ");
            int x = scanner.nextInt();
            System.out.print("2. sayıyı giriniz: ");
            int y = scanner.nextInt();
            int sonuc = x / y;
            System.out.println("Sonuc: " + sonuc);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getLocalizedMessage());
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            System.out.println("0'a bölünemez!");
        } catch (InputMismatchException exception) {
            System.out.println("Lütfen bir sayı giriniz!");
        } finally {
            scanner.close();
            System.out.println("Finally.");
        }
        System.out.println("Uygulama kapandı.");

    }
}