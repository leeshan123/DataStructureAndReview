package review.s4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S04 {

    public int solution(String s1,String s2){

        int answer = 0;

        Map<Character,Integer> map = new HashMap<>();

        for(char x : s2.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int i=0; i<s2.length();i++){
            char[] cArr = s1.toCharArray();
            map.
        }



        return answer;
    }



    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();


        System.out.println(T.solution(s1,s2));

    }

}