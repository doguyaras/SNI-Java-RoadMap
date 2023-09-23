public class Main {
    public static void main(String[] args) {

        Kisi kisi = new Kisi("Doğukan");
        System.out.println(kisi.getIsim());

        Ogrenci ogrenci = new Ogrenci("Doğukan Yaraş",4);
        System.out.println(ogrenci.getIsim());
        System.out.println(ogrenci.getNumara());
        ogrenci.ozet();


    }
}