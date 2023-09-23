public class Araba extends YolcuTasimaAraci {

    private int kapiSayisi;

    public Araba(String plaka, String marka, int kapasite, int kapiSayisi) {
        super(plaka, marka, kapasite);
        this.kapiSayisi = kapiSayisi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void yazdir(){
        super.yazdir();
        System.out.println("Kapi sayisi: "+kapiSayisi);
    }
}
