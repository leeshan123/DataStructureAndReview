import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        int count = 0;

        for(int i = start; i <= end; i++) {
            int divisorCount = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    divisorCount++;
                }
            }

            if(divisorCount == 3) {
                count++;
            }
        }

        System.out.println(count);
    }
}