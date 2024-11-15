package review.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S02 {

    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }

}
