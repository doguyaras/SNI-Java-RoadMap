public class Sehir {

    private String isim;
    private long nufus;

    public Sehir() {
    }

    public Sehir(String isim, long nufus) {
        this.isim = isim;
        this.nufus = nufus;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getNufus() {
        return nufus;
    }

    public void setNufus(long nufus) {
        this.nufus = nufus;
    }

    @Override
    public int hashCode() {
        return isim.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Sehir sehir = (Sehir) o;
        return sehir.isim.equals(this.isim);
    }

    @Override
    public String toString() {
        return "İsim: '" + isim + '\'' + ", Nüfus: " + nufus;
    }
}
