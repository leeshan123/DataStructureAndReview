import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기 위한 BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 한 줄 입력받고 공백으로 나누기
        String[] input = br.readLine().split(" ");
        
        // 각 요소를 정수로 변환
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if(a <b){
            System.out.print(1+" ");
        }else System.out.print(0+" ");

        if(a == b){
            System.out.print(1);
        }else System.out.print(0);
    }
}