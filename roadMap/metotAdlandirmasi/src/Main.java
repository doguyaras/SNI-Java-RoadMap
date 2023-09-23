public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.helloWorld();
        System.out.println(main.topla(20, 30));

    }

    private void helloWorld() {
        System.out.println("Hello world!");
    }

    private int topla(int x, int y) {
        int toplam = x + y;
        return toplam;
    }

    private float topla(float x, int y) {
        float toplam = x + y;
        return (float) toplam;
    }

    private float topla(float x, float y) {
        float toplam = x + y;
        return (float) toplam;
    }

    private int topla(byte x, byte y) {
        int toplam = x + y;
        return toplam;
    }

    }