package review.s2;

import java.util.Scanner;

public class S03 {

    public String solution(String s){
        String answer = "";
        String[] str = s.split(" ");
        int len = Integer.MIN_VALUE;
        for(String x : str){
            if(len < x.length()){
                answer = x;
                len = x.length();
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        S03 T = new S03();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println(T.solution(s));


    }

}
