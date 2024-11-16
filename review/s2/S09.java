package review.s2;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class S09 {

    public int solution(int n,int[][] arr){

        int max = 0;
        int sum = 0;

        //행
        for(int i=0; i<n;i++){
            sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[i][j];
            }
//            System.out.println(sum);
            max = Math.max(max,sum);
        }

        //열
        for(int i=0; i<n;i++){
            sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[j][i];
            }
//            System.out.println(sum);
            max = Math.max(max,sum);
        }

        sum = 0;

        //대각 왼아래
        for(int i=0; i<n; i++){
            sum += arr[i][i];
        }

        max = Math.max(max,sum);
//        System.out.println(sum);
        sum =0;

        //대각 오른쪽 위
        for(int i=0; i<n; i++){
            sum += arr[i][n-i-1];
        }
        max = Math.max(max,sum);
//        System.out.println(sum);


        return max;
    }

    public static void main(String[] args) {
        S09 T = new S09();
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