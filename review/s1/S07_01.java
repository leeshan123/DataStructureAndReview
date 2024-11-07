package review.s1;

import java.util.Scanner;

public class S07_01 {

    public String solution(String s){
        String answer = "NO";
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        S07_01 T = new S07_01();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }

}
