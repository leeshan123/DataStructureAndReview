package review.s1;

import java.util.Scanner;

public class S05_01 {

    public String solution(String s){
        String answer = "";
        char[] cArr = s.toCharArray();
        int lt =0, rt = s.length()-1;
        while (lt < rt){
            if(!Character.isAlphabetic(cArr[lt])) lt++;
            else if(!Character.isAlphabetic(cArr[rt])) rt--;
            else {
                char tmp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = tmp;
                lt++;
                rt--;
            }
            answer =String.valueOf(cArr);

            return answer;

        }



        return answer;
    }

    public static void main(String[] args) {
        S05_01 T = new S05_01();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }

}
