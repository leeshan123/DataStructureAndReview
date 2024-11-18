package review.s3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S01_01 {

    public List<Integer> solution(int n,int m,int[] arrN,int[] arrM){

        List<Integer> answer = new ArrayList<>();
        int p1=0,p2 = 0;

        while(p1 <n && p2<m){
            if(arrN[p1] < arrM[p2]) answer.add(arrN[p1++]);
            else answer.add(arrM[p2++]);
        }
        while (p1<n)answer.add(arrN[p1++]);
        while (p2<m)answer.add(arrM[p2++]);

        return answer;
    }



    public static void main(String[] args) {
        S01_01 T = new S01_01();
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