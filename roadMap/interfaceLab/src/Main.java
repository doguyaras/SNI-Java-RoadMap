public class Main {
    public static void main(String[] args) {

        Elma[] elmalar = new Elma[10];
        elmalar[0] = new Elma(10, "Sarı");
        elmalar[1] = new Elma(2, "Sarı");
        elmalar[2] = new Elma(6, "Kirmizi");
        elmalar[3] = new Elma(7, "Sarı");
        elmalar[4] = new Elma(8, "Kirmizi");
        elmalar[5] = new Elma(9, "Sarı");
        elmalar[6] = new Elma(10, "Kirmizi");
        elmalar[7] = new Elma(5, "Kirmizi");
        elmalar[8] = new Elma(4, "Sarı");
        elmalar[9] = new Elma(2, "Sarı");

        renkFiltrele("Sarı",elmalar);

    }

    public static void renkFiltrele(String renk, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elma.getRenk().equals(renk)) {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }
        }
    }


}