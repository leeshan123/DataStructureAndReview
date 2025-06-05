import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int num = Integer.parseInt(s);

        for(int i=num; i<=100; i++){
            if(i >= 90) System.out.print("A ");
            else if(i>= 80) System.out.print("B ");
            else if(i>= 70) System.out.print("C ");
            else if(i>= 60) System.out.print("D ");
            else System.out.print("F ");
        }

    }
}