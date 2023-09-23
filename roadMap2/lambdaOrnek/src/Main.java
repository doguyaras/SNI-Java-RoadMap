public class Main {

    public static void main(String[] args) {

        /*SayiOlustur sayiOlustur = new SayiOlustur() {
            @Override
            public double olustur() {
                return 15.0;
            }
        };*/

        SayiOlustur sayiOlustur = () -> 15.0;

        System.out.println(sayiOlustur.olustur());

    }
}