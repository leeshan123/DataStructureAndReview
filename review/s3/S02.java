package review.s3;

import java.util.*;

public class S02 {

    public List<Integer> solution(int n,int m,int[] a,int[] b){

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            int x = a[i];
            for(int j=0; j<m; j++){
                if(x == b[j]){
                    answer.add(x);
                }
            }
        }

        Collections.sort(answer);

        return answer;
    }



    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = scan.nextInt();
        }

        for(int x : T.solution(n,m,a,b)){
            System.out.print(x+" ");
        }


    }

}