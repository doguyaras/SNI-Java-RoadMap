public class Main {

    public static void main(String[] args) {

        Merhaba merhaba = () -> "Merhaba";
        System.out.println(merhaba.selam());

        Merhaba2 merhaba2 = (s) -> "Merhaba" + s;
        System.out.println(merhaba2.selam(" Ali!"));

        Topla topla = (a,b) -> a + b;
        System.out.println(topla.topla(2,5));


    }
}