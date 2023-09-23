public class Kare {

    private int x;
    private int y;
    private int uzunluk;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else {
            System.out.println("X -1'den büyük olmalıdır!");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public void ekranaBastir(){
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
        System.out.println("Uzunluk: "+uzunluk);
    }

}
