import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] numbers = new int[10];
        numbers[0] = Integer.parseInt(input[0]);
        numbers[1] = Integer.parseInt(input[1]);

        for(int i=2; i<numbers.length; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];

            if(numbers[i] >= 10){
                numbers[i] %= 10;
            }
        }

        for(int num : numbers){
            System.out.print(num+" ");
        }


    }
}