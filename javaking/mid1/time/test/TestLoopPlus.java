package javaking.mid1.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {

        for(int i =0; i<5; i++){
            LocalDate afterDate = LocalDate.of(2024,1,1).plusWeeks(2*i);
//            LocalDate afterDate = LocalDate.of(2024,1,1).plus(2*i, ChronoUnit.WEEKS);


        }

    }


}
