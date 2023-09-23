public class Daire extends Sekil{

    private int yaricap;

    public Daire(int y){
        yaricap = y;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    public void alan(){
        System.out.println("Daire Alan: "+(Math.PI * Math.pow(yaricap,2)));
    }
}
