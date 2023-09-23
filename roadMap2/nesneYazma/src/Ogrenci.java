import java.io.Serializable;

public class Ogrenci implements Serializable {

    private int numara;
    private String ad;
    private String soyad;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(int numara, String ad, String soyad, String sinif) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
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

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public boolean equals(Object obj) {
        Ogrenci ogrenci = (Ogrenci) obj;
        return this.numara == ogrenci.numara;
    }

    @Override
    public String toString() {
        return "No: " + numara + " Ad:" + ad + " Soyad: " + soyad + " Sinif: " + sinif;
    }
}
