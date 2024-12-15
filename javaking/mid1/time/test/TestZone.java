package javaking.mid1.time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024,1,1,9,0,9,0);
        ZonedDateTime seoul = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = ZonedDateTime.of(dateTime, ZoneId.of("Europe/London"));
        ZonedDateTime newYork = ZonedDateTime.of(dateTime, ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: "+ seoul);
        System.out.println("런던의 회의 시간: "+ london);
        System.out.println("뉴욕의 회의 시간: "+ newYork);

    }

}
