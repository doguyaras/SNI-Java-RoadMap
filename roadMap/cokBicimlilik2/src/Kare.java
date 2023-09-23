public class Kare extends Sekil{

    private int kenarUzunlugu;

    public Kare(int u){
        kenarUzunlugu = u;
    }

    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public void alan() {
        System.out.println("Kare alan: "+(Math.pow(kenarUzunlugu,2)));
    }
}
