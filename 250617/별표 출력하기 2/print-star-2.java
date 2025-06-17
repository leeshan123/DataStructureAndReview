import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);


        for(int i=0; i<N; i++){
            for(int j=0; j<5-i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}