import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int len = Integer.parseInt(s);
        String[] tokens = br.readLine().split(" ");

        
        for(int i=len-1; i>= 0; i--){
            int num = Integer.parseInt(tokens[i]);

            if(num % 2 == 0){
                System.out.print(num+" ");
            }

            if(tokens.length == 1){
                if(num % 2 == 1){
                    System.out.print(0);

                }
            }

        }


    }
}