import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=1; i<=num; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}