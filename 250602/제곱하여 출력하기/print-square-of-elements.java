import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split(" ");
        int[] numbers = new int[inputs.length];

        for(int i=0; i<inputs.length; i++){
            numbers[i] = Integer.parseInt(inputs[i]);
            numbers[i] *= numbers[i];
            System.out.print(numbers[i]+" ");
            }

        
    
    }
}