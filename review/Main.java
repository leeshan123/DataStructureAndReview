package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: 숫자 개수 n 받기
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;

        for(int i=0; i<n-1; i++){

            if(arr[i] < arr[i+1]){
                sum += arr[i+1] - arr[i];

            }else{
                sum = 0;
            }
            max = Math.max(sum,max);

        }

        System.out.println(max);





    }
}
