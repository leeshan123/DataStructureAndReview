import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        while(a <= b){
            if(a % 2 == 0){
                System.out.print(a+" ");
                a += 3;
            } else {
                 System.out.print(a+" ");
                 a *= 2;
            }
        }




    }
}