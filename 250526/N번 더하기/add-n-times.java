import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int sum = a+b;

        for(int i=0; i<b; i++){
            System.out.println(sum+b*i);
        }

    }
}