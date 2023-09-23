public class Ogrenci {

    private String kimlik;
    private String ad;
    private String soyad;
    private String sinif;

    public Ogrenci() {

    }

    public Ogrenci(String kimlik, String ad) {
        this.kimlik = kimlik;
        this.ad = ad;
    }

    public Ogrenci(String kimlik, String ad, String soyad) {
        this.kimlik = kimlik;
        this.ad = ad;
        this.soyad = soyad;
    }


    public Ogrenci(String kimlik, String ad, String soyad, String sinif) {
        this.kimlik = kimlik;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
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
}
