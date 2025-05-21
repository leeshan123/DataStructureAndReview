import java.io.*;

public class Main {
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();         // "14 5"
        String[] parts = input.split(" ");    // ["14", "5"]

        int a = Integer.parseInt(parts[0]);   // 14
        int b = Integer.parseInt(parts[1]);   // 5

        System.out.println(a+" "+b+" "+ (a+b));
        
    }
}