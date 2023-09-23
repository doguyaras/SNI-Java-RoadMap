/*import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı üretilecek: ");
        int sayi = scanner.nextInt();

        int[] sayilar = new int[sayi];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = random.nextInt(100);
        }

        float toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }

        System.out.println(Arrays.toString(sayilar));
        System.out.println("Ortalama: "+(toplam/sayi));
    }
}*/
