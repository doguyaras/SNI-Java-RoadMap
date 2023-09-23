import java.io.Serializable;

public class Yazar implements Serializable {

    private String ad;
    private String soyad;

    public Yazar() {
    }

    public Yazar(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
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
    public boolean equals(Object o) {
        Yazar yazar = (Yazar) o;
        return yazar.ad.equals(this.ad) && yazar.soyad.equals(this.soyad);
    }

    @Override
    public int hashCode() {
        return this.ad.hashCode() + this.soyad.hashCode();
    }

    @Override
    public String toString() {
        return "Ad: " + ad + " Soyad: " + soyad;
    }
}
