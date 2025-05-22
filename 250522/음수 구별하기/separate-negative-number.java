import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        System.out.println(input);
        if(input < 0){
            System.out.println("minus");
        }

    }
}