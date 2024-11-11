package review.s2;

import java.util.Scanner;

public class S02 {

    public String solution(String s){
        String answer = "";

        char[] cArr = s.toCharArray();

        for(char c : cArr){
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }else answer += Character.toLowerCase(c);
        }


        return answer;
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println(T.solution(s));


    }

}
