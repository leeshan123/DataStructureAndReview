import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] parts = input.split(" ");

        for(int i=parts.length-1; i>=0; i--){
            System.out.print(Integer.parseInt(parts[i])+" ");
        }


    }
}