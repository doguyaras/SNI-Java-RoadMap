import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

/*        Main main = new Main();
        main.merhaba();
        System.out.println(main.topla(2,3));

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(main.topla(x,y));*/

        HesapMakinasi hesapMakinasi = new HesapMakinasi();
        float toplam = hesapMakinasi.topla(4,6);
        System.out.println(toplam);

        System.out.println(hesapMakinasi.cikar(6,2));
        System.out.println(hesapMakinasi.carp(5,7));
        System.out.println(hesapMakinasi.bol(8,2));


    }

    public static void merhaba() {
        System.out.println("Merhaba!");
    }

    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
}