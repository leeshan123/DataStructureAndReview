package review.s3;

import java.util.Scanner;

public class S05 {

    public int solution(int n){

        int answer = 0;
        int sum =0;
        int m=n/2+1; //내가 놓친거
        int lt =1;

        for(int rt=1; rt<=m; rt++){
            sum += rt;
            if(sum == n) {
                System.out.println("lt: "+lt +" rt: "+ rt);
                answer++;
            }
            while (sum >= n){
                sum -= lt;
                lt++;
                if(sum == n) {
                    System.out.println("lt: "+lt +" rt: "+ rt);
                    answer++;
                }
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