package LECTIA7.JavaSpecials.JavaSpecials.continut.invatare;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeAPI {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime=localDateTime.atZone(ZoneId.of("Europe/Bucharest"));
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy H:m:ss");
        System.out.println(zonedDateTime.format(dateTimeFormatter));


    }

}
