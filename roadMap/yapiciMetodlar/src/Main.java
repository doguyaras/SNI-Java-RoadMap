public class Main {

    int x;

    public static void main(String[] args) {

        /*Main main = new Main();
        System.out.println(main.x);*/

        Ogrenci ogrenci = new Ogrenci("Dogukan", "Yaras", 25);
        System.out.println(ogrenci.ad);
        System.out.println(ogrenci.soyad);
        System.out.println(ogrenci.yas);

        Ogrenci ogrenci2 = new Ogrenci();
        System.out.println(ogrenci2.ad);
        System.out.println(ogrenci.soyad);
        System.out.println(ogrenci2.yas);

    }

    public Main() {
        System.out.println("Yapıcı Metot çalıştı!");
        x = 20;
    }
}