package javaking.mid1.time.presentation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VoteDate {

    private LocalDateTime starTime;
    private LocalDateTime deadLineTime;

    public VoteDate(LocalDateTime starTime, LocalDate deadLineTime) {
        this.starTime = starTime;
        this.deadLineTime = deadLineTime.atTime(23,59,59);
    }

    public LocalDateTime getStarTime() {
        return starTime;
    }

    public LocalDateTime getDeadLineTime() {
        return deadLineTime;
    }
}
