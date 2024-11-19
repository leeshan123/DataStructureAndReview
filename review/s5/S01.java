package review.s5;

import java.util.*;

public class S01 {

    public String solution(String s){

        String answer = "YES";

        Deque<Character> stack = new ArrayDeque<>();

        for(char x : s.toCharArray()){

            if(x=='(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }

        }

        if(!stack.isEmpty()) return "NO";

        return answer;
    }



    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);

        String s = scan.next();



        System.out.println(T.solution(s));

    }

}