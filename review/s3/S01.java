package review.s3;

import java.util.Arrays;
import java.util.Scanner;

public class S01 {

    public int[] solution(int n,int m,int[] arrN,int[] arrM){


        int[] arr = new int[n+m];

        for(int i=0; i<n; i++){
            arr[i] = arrN[i];
        }
        System.out.println();

        for(int i=0; i<m;i++){
            arr[i+n] = arrM[i];
        }

        Arrays.sort(arr);


        return arr;
    }



    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arrN = new int[n];
        for(int i=0; i<n; i++){
            arrN[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arrM = new int[m];
        for(int i=0; i<m; i++){
            arrM[i] = scan.nextInt();
        }


        System.out.println();

        for(int x : T.solution(n,m,arrN,arrM)){
            System.out.print(x+" ");
        }


    }

}