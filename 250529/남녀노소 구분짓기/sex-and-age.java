import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sex = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        if(sex == 0){
            if(age >= 19){
                System.out.println("MAN");
            } else System.out.println("BOY");
 
        } else if(sex == 1){
            if(age >= 19){
                System.out.println("WOMAN");
            } else System.out.println("GIRL");

        }




    }
}