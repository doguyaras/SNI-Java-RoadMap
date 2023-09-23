public class UnivOgrenci extends Ogrenci{
    public UnivOgrenci(int numara) {
        super(numara);
    }

    public void yazdir(){
        System.out.println("Univ Ogrenci:"+getNumara());
    }
}
