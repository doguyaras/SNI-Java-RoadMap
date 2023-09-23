public class Ogrenci implements Comparable<Ogrenci> {

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

    public int getId() {
        return numara;
    }

    public void setId(int numara) {
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
    public boolean equals(Object object) {
        Ogrenci ogrenci = (Ogrenci) object;
        return ogrenci.numara == this.numara;
    }

    @Override
    public int hashCode() {
        return this.numara;
    }

    @Override
    public String toString() {
        return "Numara: " + numara + " Ad: " + ad + " Soyad: " + soyad + " Sınıf: " + sinif;
    }

    @Override
    public int compareTo(Ogrenci o) {
        return this.numara - o.numara;
    }
}
