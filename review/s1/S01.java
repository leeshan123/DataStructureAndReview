package review.s1;

import java.util.Scanner;

public class S01 {

    public int solution(String str, char c){
        int answer =0;

        char lowerC = Character.toLowerCase(c);
        String lowerStr = str.toLowerCase();

        for(char ch : lowerStr.toCharArray()){
            if(ch == lowerC) answer++;

        }


        return answer;
    }

    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        System.out.println(T.solution(str,c));


    }

}
