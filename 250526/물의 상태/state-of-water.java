import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int temp = Integer.parseInt(br.readLine());

        if(temp < 0){
            System.out.println("ice");
        }else if(temp >= 100){
            System.out.println("vapor");
        }else {
            System.out.println("water");
        }


    }
}