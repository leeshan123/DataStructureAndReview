package javaking.mid1.time.presentation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MovieMain2 {

    public static void main(String[] args) {

        //데드라인 날짜
        LocalDate deadLineDate = LocalDate.of(2024,12,15);

        //vodeDate 객체 생성
        VoteDate voteDate = new VoteDate(LocalDateTime.now(),deadLineDate);

        LocalDateTime startDate = voteDate.getStarTime();
        LocalDateTime endDate = voteDate.getDeadLineTime();

        //각 멤버변수들의 값
        System.out.println("투표 시작 시간: "+ startDate);
        System.out.println("투표 마감 시간: "+ endDate);

        //투표 가능 시간을 알려주기 위한 값 구하기
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        long hours = ChronoUnit.HOURS.between(startDate.plusDays(days), endDate);
        long minutes = ChronoUnit.MINUTES.between(startDate.plusDays(days).plusHours(hours), endDate);

        System.out.println("투표 마감까지: " + days + "일 " + hours + "시간 " + minutes + "분 남았습니다.");

        //투표 가능한지 로직
        if(LocalDateTime.now().isBefore(endDate)){
            System.out.println("투표 가능합니다.");
        }else {
            System.out.println("투표 가능한 시간이 아닙니다.");
        }


    }

}
