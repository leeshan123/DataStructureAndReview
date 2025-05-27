import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numStr = input.split(" ");

        int num1 = Integer.parseInt(numStr[0]);
        int num2 = Integer.parseInt(numStr[1]);

        for(int i=num2; i>=num1; i--){
            System.out.print(i+" ");
        }



    }
}