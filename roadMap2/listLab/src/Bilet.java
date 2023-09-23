import java.io.Serializable;
import java.util.Date;

public class Bilet implements Serializable {

    private int numara;
    private Date tarih;
    private float fiyat;

    public Bilet() {
    }

    public Bilet(int numara, Date tarih, float fiyat) {
        this.numara = numara;
        this.tarih = tarih;
        this.fiyat = fiyat;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public int hashCode() {
        return numara;
    }

    @Override
    public boolean equals(Object o) {
        Bilet bilet = (Bilet) o;
        return bilet.numara == this.numara;
    }

    @Override
    public String toString() {
        return "Numara: " + numara + ", Tarih: " + tarih + ", Fiyat: " + fiyat;
    }
}
