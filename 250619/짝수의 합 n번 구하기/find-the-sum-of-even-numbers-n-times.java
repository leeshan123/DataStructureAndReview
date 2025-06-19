import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 숫자 N을 입력받음
        int N = Integer.parseInt(br.readLine());

        // N번 반복하면서 각 줄에서 두 정수를 입력받음
        for (int i = 0; i < N; i++) {
            String line = br.readLine(); // 한 줄을 입력받고
            StringTokenizer st = new StringTokenizer(line); // 공백 기준으로 나눔

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 원하는 작업: 예를 들어 출력
            int sum = 0;
            for(int j=a; j<=b; j++){
                if(j % 2 == 0)
                sum += j;
            }
            System.out.println(sum);
        }
    }
}