public class Isci {

    private String isim;
    private double maas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) throws HataliDeger{
        if (isim == null || isim.trim().length() == 0) {
            throw new HataliDeger("İsim", isim);
        }
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) throws HataliDeger {
        if (maas<0){
            throw new HataliDeger("Maaş",maas);
        }
        this.maas = maas;
    }

    public String toString(){
        return "İsim: "+isim+", Maaş: "+maas;
    }
}
