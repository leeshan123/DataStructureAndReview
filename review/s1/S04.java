package review.s1;

import java.util.Scanner;

public class S04 {

    public void solution(int n, String[] sArr){

        String answer ="";

        for(int i=0; i<n; i++){
            for(int j=sArr[i].length()-1; j>=0; j--){
                answer += sArr[i].charAt(j);

            }
            System.out.println(answer);
            answer = "";
        }




    }

    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] sArr = new String[n];
        for(int i=0; i<n;i++) {
            sArr[i] = scan.next();
        }

        T.solution(n,sArr);


    }

}
