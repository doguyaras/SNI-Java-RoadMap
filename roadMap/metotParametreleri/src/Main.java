import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        /*
        int x = 20;
        System.out.println(x);
        main.passByValue(x);
        System.out.println(x);*/

        /*int[] sayilar = {1,2,3,4,5};
        System.out.println(Arrays.toString(sayilar));
        main.degistir(sayilar);
        System.out.println(Arrays.toString(sayilar));*/

        // main.test(5);
        main.varArgs(10,new int[] {1,2});


    }

    public void varArgs(int a,int... numbers) {
        int x = numbers[0];
        int y = numbers[1];
        System.out.println((x*a) + (y*a));
    }

    public void test(final int x) {
        // x = 10;
        System.out.println(x);
    }

    public void passByValue(int x) {
        System.out.println("PBV " + x);
        x = 10;
        System.out.println("PBV " + x);
    }

    //passByReference
    public void degistir(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = sayilar[i] * 2;
        }
    }
}