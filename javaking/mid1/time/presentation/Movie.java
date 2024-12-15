package javaking.mid1.time.presentation;

import java.time.LocalDate;

public class Movie {

    private String korName;
    private String engName;
    private int runningTime;
    private LocalDate openDate;

    public Movie(String korName, String engName, int runningTime, LocalDate openDate) {
        this.korName = korName;
        this.engName = engName;
        this.runningTime = runningTime;
        this.openDate = openDate;
    }

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }
}
