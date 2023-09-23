import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {

    public enum Cinsiyet {
        ERKEK, KADIN
    }

    private String isim;
    private LocalDate dogumTarihi;
    private String emailAdresi;
    private Cinsiyet cinsiyet;

    public Kisi() {
    }

    public Kisi(String isim, LocalDate dogumTarihi, String emailAdresi, Cinsiyet cinsiyet) {
        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.emailAdresi = emailAdresi;
        this.cinsiyet = cinsiyet;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEmailAdresi() {
        return emailAdresi;
    }

    public void setEmailAdresi(String emailAdresi) {
        this.emailAdresi = emailAdresi;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return LocalDate.now().getYear() - dogumTarihi.getYear();
    }

    @Override
    public int hashCode() {
        return emailAdresi.hashCode(); //iki kişinin e-mail adresi aynıysa, bu kişiler aynıdır
    }

    @Override
    public boolean equals(Object o) {
        Kisi kisi = (Kisi) o;
        return this.emailAdresi.equals(kisi.emailAdresi);
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                ", emailAdresi='" + emailAdresi + '\'' +
                ", cinsiyet=" + cinsiyet + '\'' + ",yaş=" + getYas() +
                '}';
    }
}
