import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {0,1,2,3,4};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Index degerini giriniz:");
        int index = scanner.nextInt();

        try {
            System.out.println(numbers[index]);
        }catch (Exception exception){
            System.out.println("Yanlış index numarası!");
        }finally {
            scanner.close();
            System.out.println("..");
        }




    }
}