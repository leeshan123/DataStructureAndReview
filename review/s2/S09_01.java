package review.s2;

import java.util.Scanner;

public class S09_01 {

    public int solution(int n,int[][] arr){

        int max = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<n; i++){
            sum1 = sum2 =0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max,sum1);
            max = Math.max(max,sum2);
        }
        sum1=sum2=0;

        for(int i=0; i<n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        max = Math.max(max,sum1);
        max = Math.max(max,sum2);


        return max;
    }

    public static void main(String[] args) {
        S09_01 T = new S09_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));


    }

}