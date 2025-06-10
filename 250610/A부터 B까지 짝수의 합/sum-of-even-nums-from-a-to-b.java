import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = br.readLine().split(" ");
        int num1 = Integer.parseInt(inputNum[0]);
        int num2 = Integer.parseInt(inputNum[1]);
        int sum = 0;

        for(int i=num1; i<num2; i++){
            if(i % 2 == 0){
                sum += i;
        }
    }

    System.out.println(sum);
}
}