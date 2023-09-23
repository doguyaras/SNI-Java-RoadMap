import matematik.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Adınız: ");
        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim + "!");*/

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3));

        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());
    }
}