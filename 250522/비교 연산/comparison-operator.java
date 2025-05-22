import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if(a >= b){
            System.out.println(1);
        }else System.out.println(0);

               if(a > b){
            System.out.println(1);
        }else System.out.println(0);

               if(a <= b){
            System.out.println(1);
        }else System.out.println(0);

               if(a < b){
            System.out.println(1);
        }else System.out.println(0);

               if(a == b){
            System.out.println(1);
        }else System.out.println(0);

               if(a != b){
            System.out.println(1);
        }else System.out.println(0);



    }
}