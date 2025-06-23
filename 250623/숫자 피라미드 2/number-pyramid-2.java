import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(count +" ");
                count++;
            }

            System.out.println();
        }

    }
}