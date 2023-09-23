public class Main {
    public static void main(String[] args) {

        Daire daire = new Daire();
/*      daire.x = 10;
        daire.y = 20;


        System.out.println(daire.x);
        System.out.println(daire.y);
        System.out.println(daire.r);*/

        daire.r = 3.0;
        System.out.println(daire.alanHesapla());
        System.out.println(daire.cevreHesapla());

        Daire daire2 = new Daire();
        daire2.r = 30;
        System.out.println(daire2.alanHesapla());
        System.out.println(daire2.cevreHesapla());

        Daire daire3 = daire2;
        System.out.println(daire3.alanHesapla());
        System.out.println(daire3.cevreHesapla());
    }
}