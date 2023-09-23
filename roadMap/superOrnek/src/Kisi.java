public class Kisi {

    private String isim;

    public Kisi(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void bilgileriYazdir() {
        System.out.println("Kişi: " + isim);
    }
}
