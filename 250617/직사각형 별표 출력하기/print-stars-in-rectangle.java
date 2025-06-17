import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);


        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}