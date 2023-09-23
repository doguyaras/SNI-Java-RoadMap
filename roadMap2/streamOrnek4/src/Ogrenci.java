import java.io.Serializable;
import java.util.Objects;

public class Ogrenci implements Serializable {

    private int no;
    private String isim;
    private int yas;

    public Ogrenci() {
    }

    public Ogrenci(int no, String isim, int yas) {
        this.no = no;
        this.isim = isim;
        this.yas = yas;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public boolean equals(Object object) {
        Ogrenci ogrenci = (Ogrenci) object;
        return this.no == ogrenci.no;
    }

    @Override
    public int hashCode() {
        return no;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "no=" + no +
                ", isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
