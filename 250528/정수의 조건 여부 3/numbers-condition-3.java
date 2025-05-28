import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력 받기: "100 85"
        String line = br.readLine(); 
        int a = Integer.parseInt(line);

        if(a % 13 == 0 || a % 19 == 0){
            System.out.println("True");
        }else System.out.println("False");




    }
}