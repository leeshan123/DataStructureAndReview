package review.s3;

import java.util.Scanner;

public class S04 {

    public int solution(int n,int m,int[] arr){

        int answer = 0;
        int lt =0;

        int sum = 0;

        for(int rt=0; rt<n; rt++){
            sum += arr[rt];
            if(sum == m) answer++;
            while (sum >= m){
                sum -=arr[lt++];
                if(sum ==m) answer++;
            }
        }







        return answer;
    }



    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,m,arr));

    }

}