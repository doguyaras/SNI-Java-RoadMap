public class Kamyon extends YukTasimaAraci {

    private int konteynirSayisi;

    public Kamyon(String plaka, String marka, int yukKapasitesi, int konteynirSayisi) {
        super(plaka, marka, yukKapasitesi);
        this.konteynirSayisi = konteynirSayisi;
    }

    public int getKonteynirSayisi() {
        return konteynirSayisi;
    }

    public void setKonteynirSayisi(int konteynirSayisi) {
        this.konteynirSayisi = konteynirSayisi;
    }

    public void yazdir(){
        super.yazdir();
        System.out.println("Konteynir sayisi: "+konteynirSayisi);
    }
}
