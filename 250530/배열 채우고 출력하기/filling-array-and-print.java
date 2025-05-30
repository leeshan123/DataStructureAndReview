import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 표준 입력(System.in)을 BufferedReader로 감싸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] tokens = input.split(" ");



        for(int i=9; i>=0; i--){
            System.out.print(tokens[i]);
        }

    }
}