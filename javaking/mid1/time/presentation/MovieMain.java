package javaking.mid1.time.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MovieMain {

    public static void main(String[] args) {
        Movie etenalSunshine = new Movie("이터널 션샤인","Eternal Sunshine Of The Spotless Mind",107, LocalDate.of(2024,12,18));

        //D-day를 만드는 로직
        LocalDate nowDay = LocalDate.now();
        System.out.println("nowDay = " + nowDay);
        long dayBetween = ChronoUnit.DAYS.between(nowDay,etenalSunshine.getOpenDate());
        System.out.println("D-" + dayBetween);

        //2024.12.18로 바꾸는 로직
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String formattedDate = etenalSunshine.getOpenDate().format(formatter);
        System.out.println(etenalSunshine.getOpenDate()+" -> "+ formattedDate);

        //년도만 필요하다?
        int year = etenalSunshine.getOpenDate().getYear();
        System.out.println("개봉 년도: "+ year);


    }

}
