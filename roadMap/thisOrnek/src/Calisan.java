import java.util.Date;

public class Calisan {

    private String isim;
    private double maas;
    private Date iseBaslamaTarihi;

    public Calisan(String isim, double maas, Date iseBaslamaTarihi) {
        this.isim = isim;
        this.maas = maas;
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }
    public Calisan() {

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public Date getIseBaslamaTarihi() {
        return iseBaslamaTarihi;
    }

    public void setIseBaslamaTarihi(Date iseBaslamaTarihi) {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public void yazdir() {
        System.out.println("İsim: " + isim);
        System.out.println("Maas: " + maas);
        System.out.println("İse Baslama Tarihi: " + iseBaslamaTarihi);
    }
}
