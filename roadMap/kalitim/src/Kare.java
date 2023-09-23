public class Kare extends Sekil {

    private int kenarUzunlugu;

    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public void alanHesapla() {
        System.out.println("Alan: " + (kenarUzunlugu * kenarUzunlugu));
    }
}
