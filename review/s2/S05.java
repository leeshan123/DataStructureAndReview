package review.s2;

import java.util.Scanner;

public class S05 {

    public int solution(int n){

        int answer = 0;

       for(int i=2; i<=n; i++){
           int count =0;

           for(int j=1; j<=i; j++){
               if(i%j==0){
                   count++;
               }

           }

           if(count == 2){
               answer++;
           }

       }


        return answer;
    }

    public static void main(String[] args) {
        S05 T = new S05();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(T.solution(n));


    }

}