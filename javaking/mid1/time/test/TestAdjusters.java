package javaking.mid1.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        //첫날 요일
        DayOfWeek firstDayOufWeek = date.getDayOfWeek();

        //마지막날 요일
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOufWeek = " + firstDayOufWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);


    }

}
