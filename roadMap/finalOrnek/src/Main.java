public class Main {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci(1);
        System.out.println(ogrenci.getNumara());

        UnivOgrenci ogrenci2 = new UnivOgrenci(10);
        ogrenci2.yazdir();
    }
}
