import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int num = Integer.parseInt(br.readLine());

       if(num >= 80){
        System.out.println("pass");
       }else {
        System.out.println((80-num)+" more score");
       }


    }
}