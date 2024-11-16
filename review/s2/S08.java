package review.s2;

import java.util.Arrays;
import java.util.Scanner;

public class S08 {

    public int[] solution(int n,int[] arr){

        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            answer[i] = arr[i];
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(answer[i] == arr[j]){
                    answer[i] = n-j;
//                    System.out.println(i);
                    break;
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        S08 T = new S08();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }


        for (int x : T.solution(n,arr)) {
            System.out.print(x+" ");
        }


    }

}