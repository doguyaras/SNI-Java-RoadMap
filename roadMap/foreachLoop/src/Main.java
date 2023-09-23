import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number : numbers) {
            System.out.println(number);
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("10 Adet sayı giriniz: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number:numbers){
            System.out.println(number);
        }
    }
}