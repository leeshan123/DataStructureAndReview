package javaking.mid1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate starDate = LocalDate.of(2024,1,1);
        LocalDate endDate = LocalDate.of(2024,11,21);

        Period period = Period.between(starDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(starDate, endDate);

        System.out.println("시작 날짜: " + starDate);
        System.out.println("목표 날짜: "+ endDate);
        System.out.println("남은 기간: "+ period.getYears()+"년 " + period.getMonths()+"개월 "+ period.getDays()+"일");
        System.out.println("디데이: " + daysBetween+"일 남음");

    }


}
