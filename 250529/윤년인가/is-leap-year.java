import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if(year % 4 == 0){
            if(!(year%400 ==0) && (year%100 ==0)){
                System.out.println("false");
            }else{System.out.println("true");}
        }else {
            System.out.println("false");
        }
                        




    }
}