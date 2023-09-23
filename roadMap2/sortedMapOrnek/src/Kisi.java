import java.io.Serializable;

public class Kisi implements Serializable {

    private String tc;
    private String ad;
    private String soyad;
    private Cinsiyet cinsiyet;

    public Kisi() {
    }

    public Kisi(String tc, String ad, String soyad, Cinsiyet cinsiyet) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
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

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public int hashCode() {
        return tc.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        Kisi kisi = (Kisi) object;
        return kisi.tc.equals(this.tc);
    }

    @Override
    public String toString() {
        return "Tc: " + tc + ", Ad: " + ad + ", Soyad: " + soyad + ", Cinsiyet: " + cinsiyet;
    }
}
