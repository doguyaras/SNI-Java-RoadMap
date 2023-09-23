public class Daire {

    private int x;
    private int y;
    private double yaricap;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if(yaricap<0){
            throw new HataliYaricap(yaricap);
        }
        this.yaricap = yaricap;
    }

    public String toString() {
        return "X: " + x + ", Y: " + y + ", Yaricap: " + yaricap;
    }
}
