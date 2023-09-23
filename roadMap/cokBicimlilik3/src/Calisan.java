public class Calisan {

    private String isim;
    private String gorev;
    private int maas;

    public Calisan(String isim, String gorev, int maas) {
        this.isim = isim;
        this.gorev = gorev;
        this.maas = maas;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void ozet(){
        System.out.println("İsim: "+isim);
        System.out.println("Görev: "+gorev);
        System.out.println("Maas: "+maas);
    }
}
