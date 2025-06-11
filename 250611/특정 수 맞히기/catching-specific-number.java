import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        int num = 25;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int input = Integer.parseInt(br.readLine());

            if(num == input){
                System.out.println("Good");
                break;
            }else if(num > input){
                System.out.println("Higher");               
            }else{
                System.out.println("Lower");               
            }
        }


    }
}