package javaking.mid1.time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlustMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plustDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plustDt1 = " + plustDt1);

        LocalDateTime plustDt2 = dt.plusYears(10);
        System.out.println("plustDt2 = " + plustDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plustDt3 = dt.plus(period);
        System.out.println("plustDt3 = " + plustDt3);

    }


}
