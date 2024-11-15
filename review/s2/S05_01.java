package review.s2;

import java.util.Scanner;

public class S05_01 {

    public int solution(int n){
        int count = 0;
        int[] arr = new int[n+1];

        for(int i=2; i<=n; i++){
            if(arr[i] == 0){
                count++;
                for(int j=i; j<=n; j=j+i) arr[j] =1;
            }

        }


        return count;

    }

    public static void main(String[] args) {
        S05_01 T = new S05_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(T.solution(n));


    }

}