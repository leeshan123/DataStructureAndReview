import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        if(input >= 3000){
            System.out.println("book");
        }else if(input >= 1000){
            System.out.println("mask");
        }else {
            System.out.println("no");
        }


    }
}