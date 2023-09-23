public abstract class Oyuncu {

    private String isim;
    private int numarasi;


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }

    public abstract void sutCek();

    public abstract void pasVer();
}
