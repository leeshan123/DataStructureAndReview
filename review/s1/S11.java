package review.s1;

import java.util.Scanner;

public class S11 {

    public String solution(String s){
        String answer = "";
        char[] cArr = s.toCharArray();
        int count =1;

        for(int i=0; i<cArr.length;i++){
            if(i == cArr.length-1){
                answer += cArr[i];
                break;
            }
            if(cArr[i]==cArr[i+1]){
                count++;
            }else {

                answer += cArr[i];
                if(count >1) answer += String.valueOf(count);
                count =1;
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        S11 T = new S11();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));



    }

}
