public class Ogrenci {

    public int numara = 10;
    public String ad;
    public String soyad;
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>0){
            this.yas = yas;
        }else{
            System.out.println("Yaş 0'dan küçük olamaz!");
        }
    }

    public void bilgileriYazdir(){
        System.out.println("Numara: "+numara);
        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("Yaş: "+yas);
    }

}
