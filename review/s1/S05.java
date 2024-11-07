package review.s1;

import java.util.Scanner;

public class S05 {

    public String solution(String s){
        String answer = "";
        char[] cArr = s.toCharArray();

        for(int i=0; i<cArr.length/2; i++){
            if(Character.isAlphabetic(cArr[i])){
                char tmp = cArr[i];
                cArr[i] = cArr[cArr.length-1-i];
                cArr[cArr.length-1-i] = tmp;
            }
        }

        answer = new String(cArr);

        return answer;
    }

    public static void main(String[] args) {
        S05 T = new S05();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }

}
