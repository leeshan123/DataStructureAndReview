package review.s1;

import java.util.Scanner;

public class S12 {

    public String solution(int n, String s){
        String answer = "";
        String[] sArr = new String[n];
        int len = s.length()/n;

        for(int i=0; i<n; i++){
            sArr[i] = s.substring(i*len,(i+1)*len);
        }

        for (String str : sArr) {
            String x = str.replace("#","1").replace("*","0");
            char c = (char)Integer.parseInt(x,2);
            answer += c;
        }




        return answer;
    }

    public static void main(String[] args) {
        S12 T = new S12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();


        System.out.println(T.solution(n,s));



    }

}
