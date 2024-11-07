package review.s1;

import java.util.Scanner;

public class S07 {

    public String solution(String s){
        String answer = "YES";
        char[] cArr = s.toLowerCase().toCharArray();
        for(int i=0; i<cArr.length/2; i++){
            if(!(cArr[i] == cArr[cArr.length-1-i])){
                return "NO";
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        S07 T = new S07();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }

}
