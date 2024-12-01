package presentation.accessmodifier.time;
class Time2{
    private int hour; // 우리가 생각하는 hour = 0 ~ 23사이의 값을 가져야 함.
    private int minute;
    private int second;

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {
        if (isNotValidHour(hour)) {
            System.out.println("0-23 사이의 값을 입력해주세요");
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (isNotValidMinuteOrSecond(minute)) {
            System.out.println("0-59 사이의 값을 입력해주세요");
            return;
        }
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (isNotValidMinuteOrSecond(second)) {
            System.out.println("0-59 사이의 값을 입력해주세요");
            return;
        }
        this.second = second;
    }

    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    private boolean isNotValidMinuteOrSecond(int MinuteOrSecond) {
        return MinuteOrSecond < 0 || MinuteOrSecond > 59;
    }

    public Time2(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return hour +" 시 " + minute + " 분 " + second+" 초 ";
    }
}
public class timeMain2 {
    public static void main(String[] args) {
        Time2 t = new Time2(12,35,30);
        System.out.println(t);
//        t.hour = 13;
        t.setHour(25);
        System.out.println(t);
    }


}
