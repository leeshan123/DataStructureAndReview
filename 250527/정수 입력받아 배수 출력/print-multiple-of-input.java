import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<5; i++){
            System.out.print(num*(i+1)+" ");
        }

    }
}