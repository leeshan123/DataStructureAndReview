package review.s1;

import java.util.Scanner;

public class S09 {

    public int solution(String s){
        String answer = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        S09 T = new S09();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        System.out.println(T.solution(s));


    }

}
