import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 5, 14, 37);
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = localDateTime.plus(4, ChronoUnit.DAYS);
        System.out.println(localDateTime2);

        LocalDate localDate = LocalDate.parse("2020-01-12");
        LocalDateTime birinci = LocalDateTime.of(localDate, LocalTime.parse("04:12"));
        LocalDateTime ikinci = LocalDateTime.of(localDate, LocalTime.parse("09:00"));
        System.out.println(birinci.isAfter(ikinci));
        System.out.println(birinci.isBefore(ikinci));

        System.out.println(ChronoUnit.HOURS.between(birinci,ikinci));

    }
}
