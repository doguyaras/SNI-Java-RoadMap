public class Oyuncu {

    int saglik = 100;
    static int oyuncuSayisi = 0;

    public Oyuncu(){
        oyuncuSayisi++;
    }

    void yasam(){
        saglik = 100;
    }
    void darbe(){
        saglik--;
    }

    void oyuncuSayisi(){
        System.out.println(oyuncuSayisi);
    }

}
