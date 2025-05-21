import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double num1 = Double.parseDouble(br.readLine());
        double num2 = Double.parseDouble(br.readLine());
        double num3 = Double.parseDouble(br.readLine());

        System.out.printf("%.3f\n", num1);
        System.out.printf("%.3f\n", num2);
        System.out.printf("%.3f\n", num3);

        


    }
}