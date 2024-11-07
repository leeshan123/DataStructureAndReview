package review.s1;

import java.util.Scanner;

public class S06 {

    public String solution(String s){
        String answer = "";
        char[] cArr = s.toCharArray();

        for(char c : cArr){
            if(!answer.contains(String.valueOf(c))){
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        S06 T = new S06();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }

}
