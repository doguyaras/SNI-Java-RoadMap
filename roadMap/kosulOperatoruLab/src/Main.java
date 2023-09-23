import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

       /* if(x>y){
            System.out.println("X y'den büyüktür.");
        }else{
            System.out.println("X y'den küçüktür.");
        }*/

        System.out.println(x>y ? "X y'den büyüktür": "X y'den küçüktür.");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(x>i ? "X i'den büyüktür.":"X i'den küçüktür.");

    }
}