package review.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S06 {

    public List<Integer> solution(int n,int[] arr){

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            char[] cArr = String.valueOf(arr[i]).toCharArray();
            String s = "";
            for(int j=cArr.length-1; j>=0; j--){
                s += cArr[j];
            }
            arr[i] = Integer.valueOf(s);

        }

        for (int x : arr) {
                int count =0;

                for(int j=1; j<=x; j++){
                    if(x%j==0){
                        count++;
                    }

                }

                if(count == 2){
                    answer.add(x);
                }


        }




        return answer;
    }

    public static void main(String[] args) {
        S06 T = new S06();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }

}