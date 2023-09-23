public class Main {
    public static void main(String[] args) {

        /*int x = 10;
        int y = 20;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(5 % 2);

        int a = 10;
        a +=2;
        System.out.println(a);*/

        int i = 10; // 00000000 00000000 00000000 00001010
        int x = 4; //  00000000 00000000 00000000 00000100
        System.out.println(~i); // 11111111 11111111 11111111 11111101

        System.out.println(i & x); // 0 & 0 = 0
                                   // 0 & 1 = 0
                                   // 1 & 0 = 0
                                   // 1 & 1 = 1

        System.out.println(i | x); // 0 & 0 = 0
                                   // 0 & 1 = 0
                                   // 1 & 0 = 0
                                   // 1 & 1 = 1

        System.out.println(x >> 1);
    }
}