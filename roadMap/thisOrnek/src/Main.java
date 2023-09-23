import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Calisan calisan = new Calisan();
        calisan.setIsim("Alican");
        calisan.setMaas(2200);
        calisan.setIseBaslamaTarihi(new Date());

        calisan.yazdir();

    }
}