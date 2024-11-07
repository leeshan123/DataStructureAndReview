package review.s1;

import java.util.Scanner;

public class S08_01 {

    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer ="YES";


        return answer;
    }

    public static void main(String[] args) {
        S08_01 T = new S08_01();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        System.out.println(T.solution(s));


    }

}
