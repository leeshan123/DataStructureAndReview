package presentation.accessmodifier.time;

class Time1{
    int hour; // 우리가 생각하는 hour = 0 ~ 23사이의 값을 가져야 함.
    int minute;
    int second;

    @Override
    public String toString() {
        return hour +" 시 " + minute + " 분 " + second+" 초 ";
    }
}

public class timeMain1 {
    public static void main(String[] args) {
        Time1 t = new Time1();
        t.hour = 25; // 우리의 생각과 같지 X
        t.minute = 100;
        t.second = 120;

        System.out.println(t);

    }

}
