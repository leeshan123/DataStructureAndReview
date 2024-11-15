package review.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S06_01 {

    public boolean isPrime(int num){
        if(num ==1)return false;
        for(int i=2; i<num; i++){
            if(num%i ==0) return false;
        }
        return true;
    }

    public List<Integer> solution(int n,int[] arr){

        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp >0){
                int t = tmp%10;
                res = res*10 +t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);

        }

        return answer;
    }

    public static void main(String[] args) {
        S06_01 T = new S06_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }

}