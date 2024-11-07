package review.s1;

import java.util.Scanner;

public class S08 {

    public String solution(String s){
        String answer = "";
        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c)){
                answer += c;
            }
        }

        String reverseAns = new StringBuilder(answer).reverse().toString();

        if(reverseAns.equalsIgnoreCase(answer)) return "YES";


        return "NO";
    }

    public static void main(String[] args) {
        S08 T = new S08();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        System.out.println(T.solution(s));


    }

}
