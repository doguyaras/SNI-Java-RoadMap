import java.io.Serializable;
import java.util.Objects;

public class Ogrenci implements Serializable {

    private int numara;
    private String ad;
    private int notOrtalamasi;

    public Ogrenci() {
    }

    public Ogrenci(int numara, String ad, int notOrtalamasi) {
        this.numara = numara;
        this.ad = ad;
        this.notOrtalamasi = notOrtalamasi;
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

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public boolean equals(Object object) {;
        Ogrenci ogrenci = (Ogrenci) object;
        return numara == ogrenci.numara;
    }

    @Override
    public int hashCode() {
        return numara;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "numara=" + numara +
                ", ad='" + ad + '\'' +
                ", notOrtalamasi=" + notOrtalamasi +
                '}';
    }
}
