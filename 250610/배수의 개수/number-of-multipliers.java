import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10]; // 크기 10짜리 배열 선언
        int number3 = 0;
        int number5 = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine()); // 한 줄씩 읽어서 정수로 변환 후 배열에 저장
            if(num % 3 == 0){
                number3++;
            }

            if(num % 5 == 0){
                number5++;
            }
        }
        System.out.println(number3+" "+ number5);
    }
}