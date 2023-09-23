import java.io.Serializable;

public class Kitap implements Serializable {

    private String ad;
    private int yil;
    private Yazar yazar;

    public Kitap() {
    }

    public Kitap(String ad, int yil, Yazar yazar) {
        this.ad = ad;
        this.yil = yil;
        this.yazar = yazar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    @Override
    public boolean equals(Object o) {
        Kitap kitap = (Kitap) o;
        return this.ad.equals(kitap.ad) && this.yazar.equals(kitap.yazar);
    }

    @Override
    public String toString() {
        return "Ad: " + ad + " Yil: " + yil + " Yazar: " + yazar;
    }
}
