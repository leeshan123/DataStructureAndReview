package review.s5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S02 {

    public String solution(String s){

        StringBuilder answer = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for(char x : s.toCharArray()){
            if(x==')'){
                while (stack.pop()!='(');
            }else stack.push(x);
        }

        while (!stack.isEmpty()){
            answer.insert(0,stack.pop());
            System.out.println(answer);
        }

        return answer.toString();
    }



    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);

        String s = scan.next();



        System.out.println(T.solution(s));

    }

}