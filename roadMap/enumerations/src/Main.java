import java.time.DayOfWeek;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Aylar ay = Aylar.OCAK;
        System.out.println(ay);

        ay = Aylar.EKIM;
        System.out.println(ay);

        Aylar[] values = Aylar.values();

        for(Aylar value:values){
            System.out.println(value);
        }

        Aylar valueOf = Aylar.valueOf("SUBAT");
        System.out.println(valueOf);

        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(sunday);

        DayOfWeek of = DayOfWeek.of(3);
        System.out.println(of);

        Month february = Month.FEBRUARY;
        System.out.println(february);

    }
}