package review.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S07 {

    public int solution(int n,int[] arr){

        int answer = 0;
        int count = 0;

        for(int i=0; i<10; i++){
            if(arr[i] == 1){
                count++;
                answer += count;
            }else count = 0;

        }



        return answer;
    }

    public static void main(String[] args) {
        S07 T = new S07();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }

}