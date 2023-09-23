import java.util.Arrays;

public class Main {

    private static int x = 20;

    public static void main(String[] args) {

        // Main main = new Main();
        // main.normalMetot();

       /* staticMetot();
        System.out.println(Math.abs(x));
        System.out.println(Math.sqrt(x));

        System.out.println(max(41, 15, 75));
        System.out.println(max(2.0, 9.0, 7.0));

        System.out.println(majority(true, false, true));*/

        /*int[] x = {1, 2, 3, 4};
        int[] y = {1, 2, 3, 5};
        System.out.println(eq(x, y));
        System.out.println(cube(5));

        int[] numbers = {2,3,6,8};
        System.out.println(toplam(numbers));*/

        /*int[] sonucCiftSayilar = ciftSayilar(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(Arrays.toString(sonucCiftSayilar));*/

        int[] sayilar = {2,3};
        System.out.println(Arrays.toString(sayilar));
        degistir(sayilar);
        System.out.println(Arrays.toString(sayilar));


    }

    public static void degistir(int[] sayilar) {
        int temp = sayilar [0];
        sayilar[0] = sayilar[1];
        sayilar[1] = temp;
    }

    public static int[] ciftSayilar(int[] sayilar) {
        int[] sonuc = null;
        int adet = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                adet++;
            }
        }
        sonuc = new int[adet];
        int index = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                sonuc[index++] = sayilar[i];
            }
        }
        return sonuc;
    }


    public static int toplam(int[] x) {
        int result = 0;
        for (int sayi : x) {
            result += sayi;
        }
        return result;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static boolean eq(int[] x, int[] y) {
        boolean result = false;
        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i]) {
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public void normalMetot() {
        System.out.println(x);
    }

    public static void staticMetot() {
        System.out.println(x);
    }

    public static int max(int sayi1, int sayi2, int sayi3) {
        int max = sayi1;
        if (sayi2 > max) max = sayi2;
        if (sayi3 > max) max = sayi3;
        return max;
    }

    public static double max(double x, double y, double z) {
        double max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    public static boolean majority(boolean x, boolean y, boolean z) {
        return (x && y) || (x && z) || (y && z);
    }

}