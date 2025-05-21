import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();         // "14 5"
        String[] parts = input.split(" ");    // ["14", "5"]

        int a = Integer.parseInt(parts[0]);   // 14
        int b = Integer.parseInt(parts[1]);   // 5
        int c= Integer.parseInt(parts[2]);

        System.out.println(a+b+c);
        System.out.println((int)((double)a+b+c)/3);
        System.out.println((a+b+c)-(int)(((double)a+b+c))/3);

        
    }
}