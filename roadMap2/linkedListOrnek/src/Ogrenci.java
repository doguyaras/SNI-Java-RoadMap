public class Ogrenci {

    private int numara;
    private String ad;
    private String soyad;

    public Ogrenci() {
    }

    public Ogrenci(int numara, String ad, String soyad) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public int hashCode() {
        return numara;
    }

    @Override
    public boolean equals(Object o) {
        Ogrenci ogrenci = (Ogrenci) o;
        return ogrenci.numara == this.numara;
    }

    @Override
    public String toString() {
        return "Numara: " + numara + " Ad: " + ad + " Soyad: " + soyad;
    }
}
