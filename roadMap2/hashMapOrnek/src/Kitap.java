import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Kitap implements Serializable {

    private String ad;
    private Date yayinTarihi;
    private String yazar;

    public Kitap() {
    }

    public Kitap(String ad, Date yayinTarihi, String yazar) {
        this.ad = ad;
        this.yayinTarihi = yayinTarihi;
        this.yazar = yazar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Date getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(Date yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

/*    @Override
    public int hashCode() {
        return ad.hashCode() + yayinTarihi.hashCode() + yazar.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        Kitap kitap = (Kitap) object;
        return kitap.ad.equals(this.ad) && kitap.yayinTarihi.equals(this.yayinTarihi) && kitap.yazar.equals(this.yazar);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kitap kitap = (Kitap) o;
        return Objects.equals(ad, kitap.ad) && Objects.equals(yayinTarihi, kitap.yayinTarihi) && Objects.equals(yazar, kitap.yazar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ad, yayinTarihi, yazar);
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "Ad: '" + ad + '\'' +
                ", yayinTarihi: '" + yayinTarihi + '\'' +
                ", yazar: '" + yazar + '\'' +
                '}';
    }
}
